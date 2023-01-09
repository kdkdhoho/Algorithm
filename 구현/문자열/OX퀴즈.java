import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();

        for(String sentense : quiz) {
            List<String> seperatedSentense = seperate(sentense);
            if (comparate(seperatedSentense)) {
                answer.add("O");
                continue;
            }
            answer.add("X");
        }
        return answer.toArray(new String[answer.size()]);
    }

    private List<String> seperate(String sentense) {
        List<String> result = new ArrayList<>();

        while(sentense.indexOf(" ") != -1) {
            int spaceIdx = sentense.indexOf(" ");

            result.add(sentense.substring(0, spaceIdx));
            sentense = sentense.substring(spaceIdx + 1);
        }
        result.add(sentense);

        return result;
    }

    private boolean comparate(List<String> sentense) {
        int operand1 = Integer.parseInt(sentense.get(0));
        char operator = sentense.get(1).charAt(0);
        int operand2 = Integer.parseInt(sentense.get(2));
        int result = Integer.parseInt(sentense.get(4));

        if (calculate(operand1, operand2, operator) == result) {
            return true;
        }
        return false;
    }

    private int calculate(int op1, int op2, char op) {
        if (op == '+') {
            return op1 + op2;
        }
        return op1 - op2;
    }
}