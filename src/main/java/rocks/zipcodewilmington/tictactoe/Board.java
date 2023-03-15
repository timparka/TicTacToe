package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix; //store the input matrix as an instance variable of the Board class
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++){
            if (matrix[i][0] == 'X' && matrix[i][1] == 'X' && matrix[i][2] == 'X'){
                return true;
            } else if ('X' == (matrix[0][i]) && 'X' == (matrix[1][i]) && 'X' == (matrix[2][i])) {
                return true;
            } else if ('X' == (matrix[0][0]) && 'X' == (matrix[1][1]) && 'X' == (matrix[2][2])) {
                return true;
            } else if ('X' == (matrix[0][2]) && 'X' == (matrix[1][1]) && 'X' == (matrix[2][0])) {
                return true;
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++){
            if (matrix[i][0] == 'O' && matrix[i][1] == 'O' && matrix[i][2] == 'O'){
                return true;
            } else if ('O' == (matrix[0][i]) && 'O' == (matrix[1][i]) && 'O' == (matrix[2][i])) {
                return true;
            } else if ('O' == (matrix[0][0]) && 'O' == (matrix[1][1]) && 'O' == (matrix[2][2])) {
                return true;
            } else if ('O' == (matrix[0][2]) && 'O' == (matrix[1][1]) && 'O' == (matrix[2][0])) {
                return true;
            }
        }
        return false;
    }

    public Boolean isTie() {
        if (this.getWinner() == "") {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (this.isInFavorOfO() == true){
            return "O";
        }else if (this.isInFavorOfX() == true){
            return "X";
        }else {
            return "";
        }
    }

}
