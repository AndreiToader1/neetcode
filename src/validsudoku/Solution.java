package validsudoku;

public class Solution {
    private static final int BOARD_SIZE = 9;
    private static final int SUB_BOX_SIZE = 3;
    private final short[][] lineFrequency;
    private final short[][] columnsFrequency;
    private final short[][] subBoxesFrequency;

    public Solution() {
        lineFrequency = new short[BOARD_SIZE][BOARD_SIZE];
        columnsFrequency = new short[BOARD_SIZE][BOARD_SIZE];
        subBoxesFrequency = new short[BOARD_SIZE][BOARD_SIZE];
    }
    public boolean isValidSudoku(char[][] board) {
        for (int line = 0; line < BOARD_SIZE; line++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (board[line][column] == '.') {
                    continue;
                }

                var cellValue = Character.getNumericValue(board[line][column]);
                lineFrequency[line][cellValue-1]++;
                columnsFrequency[column][cellValue-1]++;

                int subBoxFrequencyIndex = line/ SUB_BOX_SIZE * SUB_BOX_SIZE  + column / SUB_BOX_SIZE ;
                subBoxesFrequency[subBoxFrequencyIndex][cellValue-1]++;
            }
        }
        return isValidFrequency(lineFrequency) && isValidFrequency(columnsFrequency) && isValidFrequency(subBoxesFrequency);
    }

    private static boolean isValidFrequency(short[][] frequencyBoard) {
        for (int line = 0; line < BOARD_SIZE; line++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (frequencyBoard[line][column] > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
