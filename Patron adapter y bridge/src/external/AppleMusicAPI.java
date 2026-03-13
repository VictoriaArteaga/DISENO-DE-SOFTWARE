package external;

public class AppleMusicAPI {

    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Connected to Apple Music");
    }

    public void playTrack(String track) {

        if(!connected){
            System.out.println("Apple Music not connected");
            return;
        }

        System.out.println("Playing track on Apple Music: " + track);
    }

    public void pauseTrack() {
        System.out.println("Apple Music paused");
    }

    public void stopTrack() {
        System.out.println("Apple Music stopped");
    }
}