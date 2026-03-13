package UI;

import javax.swing.*;
import java.awt.*;

import domain.Song;
import abstraction.MusicPlayer;

public class SongCard extends JPanel {

    public SongCard(Song song, MusicPlayer player) {

        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel title = new JLabel(song.getTitle());
        JLabel artist = new JLabel(song.getArtist());

        JButton playButton = new JButton("Play");

        playButton.addActionListener(e ->
                player.play(song)
        );

        add(title, BorderLayout.NORTH);
        add(artist, BorderLayout.CENTER);
        add(playButton, BorderLayout.SOUTH);
    }
}