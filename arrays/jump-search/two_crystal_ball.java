public class two_crystal_ball {
    public static void main(String[] args) {

        // boolean[] breaks = { true, true, true, true, true, true, true, false, false,
        // false, false, false };

        // boolean[] breaks = { true, true, true, true, false }; // Length = 5

        boolean[] breaks = { true, true, true, true, true, true, false }; // Length = 7
        int answer = findBreak(breaks);
        System.out.println(answer);

    }

    public static int findBreak(boolean[] breaks) {
        int jumpLength = (int) Math.sqrt(breaks.length);
        int i = 0;
        while (i < breaks.length && breaks[i]) {
            i += jumpLength;
        }
        int safe = Math.max(0, i - jumpLength);

        for (int j = safe; j <= i; j++) {
            if (!breaks[j])
                return j;
        }
        return -1;
    }
}
