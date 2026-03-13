package UI;

import javax.swing.*;
import java.awt.*;
import abstraction.MusicPlayer;

public class PlayerControls extends JPanel {

    public PlayerControls(MusicPlayer player) {

        setLayout(new FlowLayout());

        JButton play = new JButton("Play");
        JButton pause = new JButton("Pause");
        JButton stop = new JButton("Stop");

        pause.addActionListener(e -> player.pause());
        stop.addActionListener(e -> player.stop());

        add(play);
        add(pause);
        add(stop);
    }
}