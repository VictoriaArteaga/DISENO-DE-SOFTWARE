package UI;

import javax.swing.*;
import java.awt.*;
import domain.Song;
import abstraction.MusicPlayer;

public class MainWindow extends JFrame {

    public MainWindow(MusicPlayer player) {

        setTitle("Reproductor de música");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topBar = new JPanel();
        topBar.setBackground(new Color(233,60,120));
        topBar.setPreferredSize(new Dimension(900,60));

        JLabel logo = new JLabel("Tu Música");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Arial",Font.BOLD,20));

        topBar.add(logo);

        add(topBar, BorderLayout.NORTH);

        JPanel songsPanel = new JPanel();
        songsPanel.setLayout(new GridLayout(2,3,10,10));

        Song s1 = new Song("Song One","Rock Band",120);
        Song s2 = new Song("Song Two","Singer",150);
        Song s3 = new Song("Song Three","Girl Band",180);

        songsPanel.add(new SongCard(s1,player));
        songsPanel.add(new SongCard(s2,player));
        songsPanel.add(new SongCard(s3,player));

        add(songsPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}