//36. Valid Sudoku
import java.util.*;
public class ValidSudoku {
    public static boolean isValid(char[][] board){
        Set <String> seen = new HashSet<>();
        for(int row=1; row<9; row++){
            for(int col=1; col<9; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                int num = board[row][col];
                String rowKey = num + " in row " + row;
                String colKey = num + " in column " + col;

                int box = (row / 3) * 3 + (col / 3);
                String boxKey = num + " in box " + box;

                if(!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)){
                    return false;
                }
            }
        }
        return true;
    }
}
