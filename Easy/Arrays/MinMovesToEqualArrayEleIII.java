//3736. Minimum Moves to Equal Array Elements III

public class MinMovesToEqualArrayEleIII {
    public int minMoves(int[] nums) {
        int max = 0;
        int moves = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        for (int num : nums) {
            moves += max - num;
        }

        return moves;
    }
}
