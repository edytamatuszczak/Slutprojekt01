import java.awt.*;
import javax.swing.JPanel;

public class PacmanBoard extends JPanel {
    private final int WIDTH = 23; // Antal kolumner
    private final int HEIGHT = 22; // Antal rader
    private final int CELL_SIZE = 26; // Storlek på varje cell

    private int[][] board; // Tvådimensionell array för att representera spelplanen

    public PacmanBoard() {
        board = new int[WIDTH][HEIGHT];
        //alla celler är tomma från början
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                board[i][j] = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Rita ut spelplanen
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                // Rita en rektangel för varje cell
                if (board[i][j] == 0) {
                    g.setColor(Color.WHITE); // Tom cell
                } else {
                    g.setColor(Color.BLACK); // Upptagen cell
                }
                g.fillRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.GRAY);
                g.drawRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }
}
