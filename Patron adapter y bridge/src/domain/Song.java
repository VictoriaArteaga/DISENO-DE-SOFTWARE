package domain;

public class Song {

    private String title;
    private String artist;
    private int duration;
    private int currentTime;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.currentTime = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void updateProgress(int seconds) {
        currentTime = Math.min(duration, currentTime + seconds);
    }

    public void reset() {
        currentTime = 0;
    }
}