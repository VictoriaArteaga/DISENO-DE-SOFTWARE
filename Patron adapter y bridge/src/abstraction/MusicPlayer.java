package abstraction;

import implementor.MusicService;
import domain.Song;

public abstract class MusicPlayer {

    protected MusicService service;

    public MusicPlayer(MusicService service) {
        this.service = service;
    }

    public abstract void play(Song song);

    public abstract void pause();

    public abstract void stop();
}