package external;

public class SpotifyAPI {

    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Connected to Spotify service");
    }

    public void stream(String track) {

        if(!connected){
            System.out.println("Spotify not connected");
            return;
        }

        System.out.println("Streaming track from Spotify: " + track);
    }

    public void pauseStream() {
        System.out.println("Spotify playback paused");
    }

    public void stopStream() {
        System.out.println("Spotify playback stopped");
    }
}