import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        List<Double> inclinations = new ArrayList<>();

        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double inclination = calculateInclination(dots[i], dots[j]);

                if (inclinations.contains(inclination)) {
                    return 1;
                }
                inclinations.add(inclination);
            }
        }

        return 0;
    }

    private double calculateInclination(int[] dot1, int[] dot2) {
        return Math.abs(dot2[1] - dot1[1]) / (double)Math.abs(dot2[0] - dot1[0]);
    }
}