package TicTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {

    Deque<Player> players;
    Board board;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        PieceX pieceX = new PieceX();
        PieceO pieceO = new PieceO();
        Player player1 = new Player("Player1", pieceX);
        Player player2 = new Player("Player2", pieceO);
        players = new ArrayDeque<>();
        players.addFirst(player1);
        players.addFirst(player2);

        board = new Board(3);

    }

    public void startGame(){
        boolean isWinner = true;
        Scanner sc = new Scanner(System.in);
        while (isWinner){
            Player playingPlayer = players.pollFirst();
            board.printBoard();

            System.out.println("Enter the position");

            String input = sc.next();
            String[] arr = input.split(",");
            int row = Integer.parseInt(arr[0]);
            int col = Integer.parseInt(arr[1]);

            boolean tie = board.checkTie();
            if(tie){
                isWinner = false;
                continue;
            }
            boolean free = board.isFree(row,col, playingPlayer.playingPiece.pieceType);
            if(!free){
                players.addFirst(playingPlayer);
                System.out.println("This position is not free, Try Again !");
                continue;
            }
            boolean checkWin = board.checkWinner(playingPlayer.playingPiece.pieceType);
            if(checkWin){
                System.out.println("Player "+ playingPlayer.name + " has won");
                board.printBoard();
                return;
            }
            players.addLast(playingPlayer);


        }
        System.out.println("game Tie !");

    }
}
