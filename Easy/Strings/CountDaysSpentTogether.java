//2409. Count Days Spent Together
public class CountDaysSpentTogether {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int aStart = dayNumber(arriveAlice, months);
        int aEnd = dayNumber(leaveAlice, months);
        int bStart = dayNumber(arriveBob, months);
        int bEnd = dayNumber(leaveBob, months);

        int start = Math.max(aStart, bStart);
        int end = Math.min(aEnd, bEnd);

        return Math.max(0, end - start + 1);
    }

    private int dayNumber(String date, int[] months) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;
        
        for (int i = 0; i < month - 1; i++) {
            total += months[i];
        }

        return total;
    }
}
