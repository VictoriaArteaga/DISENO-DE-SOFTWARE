package adapters;

import implementor.MusicService;
import domain.Song;
import service.PlayerEngine;

public class LocalLibraryAdapter implements MusicService {

    private PlayerEngine engine;
    private Song song;

    public LocalLibraryAdapter(PlayerEngine engine) {
        this.engine = engine;
    }

    @Override
    public void load(Song song) {
        this.song = song;
        engine.loadSong(song);
    }

    @Override
    public void play() {
        engine.play();
    }

    @Override
    public void pause() {
        engine.pause();
    }

    @Override
    public void stop() {
        engine.stop();
    }
}