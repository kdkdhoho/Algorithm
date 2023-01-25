class Solution {
    public int solution(String[] spell, String[] dic) {
        int targetCount = spell.length;
        int count = 0;

        for (String word : dic) {
            for (String alphabet : spell) {
                if (!word.contains(alphabet)) {
                    break;
                }
                count++;
            }

            if (count == targetCount) {
                return 1;
            }
            count = 0;
        }
        return 2;
    }
}