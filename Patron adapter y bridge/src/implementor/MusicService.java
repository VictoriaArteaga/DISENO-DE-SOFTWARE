package implementor;

import domain.Song;

public interface MusicService {

    void load(Song song);

    void play();

    void pause();

    void stop();
}