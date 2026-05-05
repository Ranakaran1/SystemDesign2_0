package TicTacToe;

public class Board {
    int size;
    PlayingPiece[][] cells;
    int count;

    public Board(int size) {
        this.size = size;
        cells = new PlayingPiece[size][size];
        count=0;
    }


    public void printBoard() {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(cells[i][j]==null){
                    System.out.print(" ");
                }else {
                    System.out.print(cells[i][j].getPieceType());
                }
                System.out.print(j==size-1 ? " " :"| ");
            }
            System.out.println();
        }
    }

    public boolean isFree(int row, int col, PieceType pieceType) {
        if(cells[row][col]!=null){
            return false;
        }
        cells[row][col] = new PlayingPiece(pieceType);
        count++;
        return true;
    }

    public boolean checkTie() {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(cells[i][j]==null){
                    return false;
                }
            }
        }
        return true;


    }

    public boolean checkWinner(PieceType pieceType) {
        int countMainDiag = 0;
        int countAntiDiag = 0;
        for(int i=0;i<size;i++){
            int countRow = 0;
            int countCol = 0;
            for(int j=0;j<size;j++){

                if(cells[i][j]!=null &&  cells[i][j].pieceType == pieceType){
                    countRow++;
                }
                if(cells[j][i]!=null && cells[j][i].pieceType == pieceType){
                    countCol++;
                }
            }
            if(countRow==size || countCol==size){
                return true;
            }
            if(cells[i][i]!=null &&  cells[i][i].pieceType == pieceType){
                countMainDiag++;
            }
            if(cells[i][size-i-1]!=null &&cells[i][size-i-1].pieceType == pieceType){
                countAntiDiag++;
            }

        }
        if(countMainDiag==size || countAntiDiag==size){
            return true;
        }
        return false;
    }
}
