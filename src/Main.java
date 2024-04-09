import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            JFrame f = new JFrame("Pacman");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(620, 620 );
            f.setVisible(true);

        PacmanBoard board = new PacmanBoard();
        f.add(board);

        PacmanGhost ghost = new PacmanGhost();

        Pacman pacman = new Pacman();

        PacmanControls controls = new PacmanControls();


            f.repaint();
    }
}