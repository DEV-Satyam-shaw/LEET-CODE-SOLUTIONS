class Solution {
    // Days in each month for a non-leap year
    private static final int[] DAYS_IN_MONTHS = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startA = toDayOfYear(arriveAlice);
        int endA = toDayOfYear(leaveAlice);
        int startB = toDayOfYear(arriveBob);
        int endB = toDayOfYear(leaveBob);

        // Find the intersection interval: [max(start), min(end)]
        int overlapStart = Math.max(startA, startB);
        int overlapEnd = Math.min(endA, endB);

        // If overlapStart <= overlapEnd, they intersect
        if (overlapStart <= overlapEnd) {
            return overlapEnd - overlapStart + 1;
        }

        return 0;
    }

    private int toDayOfYear(String date) {
        // "MM-DD"
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += DAYS_IN_MONTHS[i];
        }

        return totalDays;
    }
}