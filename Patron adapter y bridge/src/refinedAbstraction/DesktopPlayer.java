package refinedAbstraction;

import abstraction.MusicPlayer;
import implementor.MusicService;
import domain.Song;

public class DesktopPlayer extends MusicPlayer {

    public DesktopPlayer(MusicService service) {
        super(service);
    }

    @Override
    public void play(Song song) {
        service.load(song);
        service.play();
    }

    @Override
    public void pause() {
        service.pause();
    }

    @Override
    public void stop() {
        service.stop();
    }
}