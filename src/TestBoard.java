
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */
public class TestBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameBoard board = new GameBoard();

        board.putPiece(2, 3, Color.BLUE);
        board.putPiece(1, 1, Color.RED);

   
        
    }
}
