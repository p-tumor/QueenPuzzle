import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QueenPuzzle q = new QueenPuzzle(4);
        q.placeQueen();
        System.out.println(Arrays.deepToString(q.getGrid()));
        System.out.println(q.getQueenXPos());
        System.out.println(q.getQueenYPos());
        System.out.println(q.getNotAvailRows().toString());
        System.out.println(q.getNotAvailCols().toString());
        System.out.println(q.getOtherNotAvail().toString());
    }
}
