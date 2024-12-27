import java.util.*;

public class Game {
    public Scanner sc = new Scanner(System.in);
    Deque<Player> players;
    Board gameboard;

    Game() {
        initalizeGame();
    }

    public void initalizeGame() {
        players = new LinkedList<>();
        PieceX cp = new PieceX();
        Player player1 = new Player("Player1", cp);

        PieceO co = new PieceO();
        Player player2 = new Player("Player2",co);

        players.add(player1);
        players.add(player2);

        gameboard = new Board(3);
    }
    public String startGame() {
        boolean nowinner = true;
        while(nowinner) {
             Player playerTurn = players.removeFirst();
             gameboard.printBoard();
             List<Pair> freeCells = gameboard.getFreeCells();
             if(freeCells.isEmpty()) {
                nowinner = false;
                continue;
             }

             System.out.println("Player: "+playerTurn.Name+" Enter Row and Column");

             int inputRow = sc.nextInt();
             int inputCol = sc.nextInt();
             boolean pieceAdded = gameboard.addPiece(playerTurn.piece, inputRow, inputCol);
             if(!pieceAdded)  {
                System.out.println("Incorrect Position Try Again");
                players.add(playerTurn);
                continue;
             }
             players.addLast(playerTurn);
             boolean winner = isWinner(playerTurn.piece.type,inputRow,inputCol);
             if(winner) {
                return playerTurn.Name;
             }
        }

        return "Tie";
    }
    public boolean isWinner(PieceType pieceType, int row,int col) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonal = true;
        boolean antidiagonal = true;

        for(int i = 0;i < gameboard.size;i++) {
            if(gameboard.board[row][i] == null || gameboard.board[row][i].type != pieceType) {
                rowMatch = false;
            }
        }
        for(int i = 0;i < gameboard.size;i++) {
            if(gameboard.board[i][col] == null || gameboard.board[i][col].type != pieceType) {
                colMatch = false;
            }
        }
        for(int i = 0,j = 0;i < gameboard.size;i++,j++) {
            if(gameboard.board[i][j] == null || gameboard.board[i][j].type != pieceType) {
                diagonal = false;
            }
        }
        for(int i = 0,j = gameboard.size - 1;i < gameboard.size;i++,j--) {
            if(gameboard.board[i][j] == null || gameboard.board[i][j].type != pieceType) {
                antidiagonal = false;
            }
        }
        return rowMatch || colMatch || antidiagonal || diagonal;
    }
}
