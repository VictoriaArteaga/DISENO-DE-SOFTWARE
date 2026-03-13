package adapters;

import implementor.MusicService;
import domain.Song;
import service.PlayerEngine;
import external.AppleMusicAPI;

public class AppleMusicAdapter implements MusicService {

    private AppleMusicAPI apple;
    private PlayerEngine engine;
    private Song song;

    public AppleMusicAdapter(AppleMusicAPI apple, PlayerEngine engine) {
        this.apple = apple;
        this.engine = engine;
    }

    @Override
    public void load(Song song) {
        this.song = song;
        apple.connect();
        engine.loadSong(song);
    }

    @Override
    public void play() {
        apple.playTrack(song.getTitle());
        engine.play();
    }

    @Override
    public void pause() {
        apple.pauseTrack();
        engine.pause();
    }

    @Override
    public void stop() {
        apple.stopTrack();
        engine.stop();
    }
}