import java.util.*;

class Pair {
    int row,col;
    Pair(int row,int col) {
        this.row = row;
        this.col = col;
    }
}
public class Board {
     public int size;
     public PlayingPiece board[][];

     Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
     } 

     public boolean addPiece(PlayingPiece piece ,int row,int col) {
        if(board[row][col] != null) return false;

        board[row][col] = piece;
        return true;
     }
     public void printBoard() {
        for(int i = 0;i < size;i++) {
            for(int j = 0;j < size;j++) {
                if (board[i][j] != null) {
                System.out.print(board[i][j].type + " |  ");
                } else {
                System.out.print("  |  ");
                 }
            }
            System.out.println();
        }
     }
     public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();  
        for(int i = 0;i < size;i++) {
            for(int j = 0;j < size;j++) {
                if(board[i][j] == null){
                    freeCells.add(new Pair(i, j));
                }
            }
        }
        return freeCells;
     }
} 
