import java.util.ArrayList;

public class QueenPuzzle {
    private String[][] grid;
    private int queenXPos;
    private int queenYPos;
    private ArrayList<Integer> notAvailRows;
    private ArrayList<Integer> notAvailCols;
    private ArrayList<String> otherNotAvail;
    public QueenPuzzle(int size){
        grid = new String[size][size];
        queenXPos = 0;
        queenYPos = 0;
        notAvailRows = new ArrayList<>(size);
        notAvailCols = new ArrayList<>(size);

    }
    public void placeQueen(){
        if(rowAvailabilityCheck() && colAvailabilityCheck()) {
            grid[queenXPos][queenYPos] = "Q";
            int tempRow = queenXPos;
            int tempCol = queenYPos;
            while(tempRow+1 < grid.length && tempCol+1 < grid[0].length){
                otherNotAvail.add(queenXPos+queenYPos+"");
            }
            notAvailRows.add(queenXPos);
            queenXPos++;
            notAvailCols.add(queenYPos);
            queenYPos++;

        }
    }
    private boolean rowAvailabilityCheck(){
        for(int x: notAvailRows) if (x == queenXPos) return true;
        return false;
    }
    private boolean colAvailabilityCheck(){
        for(int x: notAvailCols) if (x == queenYPos) return true;
        return false;
    }

    public String[][] getGrid() {
        return grid;
    }

    public int getQueenXPos() {
        return queenXPos;
    }

    public int getQueenYPos() {
        return queenYPos;
    }

    public ArrayList<Integer> getNotAvailRows() {
        return notAvailRows;
    }

    public ArrayList<Integer> getNotAvailCols() {
        return notAvailCols;
    }

    public ArrayList<String> getOtherNotAvail() {
        return otherNotAvail;
    }
}