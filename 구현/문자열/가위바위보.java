class Solution {
    private final String SCISSORS = "2";
    private final String ROCK = "0";
    private final String PAPER = "5";

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            String substring = rsp.substring(i, i + 1);
            answer.append(rsp(substring));
        }
        return answer.toString();
    }


    private String rsp(String other) {
        if (other.equals(SCISSORS)) {
            return ROCK;
        }
        if (other.equals(ROCK)) {
            return PAPER;
        }
        return SCISSORS;
    }
}