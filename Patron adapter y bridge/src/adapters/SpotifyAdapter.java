package adapters;

import implementor.MusicService;
import domain.Song;
import service.PlayerEngine;
import external.SpotifyAPI;

public class SpotifyAdapter implements MusicService {

    private SpotifyAPI spotify;
    private PlayerEngine engine;
    private Song song;

    public SpotifyAdapter(SpotifyAPI spotify, PlayerEngine engine) {
        this.spotify = spotify;
        this.engine = engine;
    }

    @Override
    public void load(Song song) {
        this.song = song;
        spotify.connect();
        engine.loadSong(song);
    }

    @Override
    public void play() {
        spotify.stream(song.getTitle());
        engine.play();
    }

    @Override
    public void pause() {
        spotify.pauseStream();
        engine.pause();
    }

    @Override
    public void stop() {
        spotify.stopStream();
        engine.stop();
    }
}