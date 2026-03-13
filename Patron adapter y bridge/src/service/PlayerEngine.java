package service;

import domain.Song;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class PlayerEngine {

    private Song currentSong;
    private Timer timer;
    private boolean playing;
    private JProgressBar progressBar;

    public PlayerEngine(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public void loadSong(Song song) {
        stop();
        currentSong = song;
        progressBar.setMaximum(song.getDuration());
        progressBar.setValue(0);
    }

    public void play() {

        if (currentSong == null) return;

        playing = true;

        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (!playing) return;

                currentSong.updateProgress(1);

                SwingUtilities.invokeLater(() ->
                        progressBar.setValue(currentSong.getCurrentTime())
                );

                if (currentSong.getCurrentTime() >= currentSong.getDuration()) {
                    stop();
                }
            }
        }, 0, 1000);
    }

    public void pause() {
        playing = false;
    }

    public void stop() {

        playing = false;

        if (timer != null)
            timer.cancel();

        if (currentSong != null)
            currentSong.reset();

        if (progressBar != null)
            progressBar.setValue(0);
    }
}