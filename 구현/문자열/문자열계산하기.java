class Solution {
    public int solution(String my_string) {
        String[] datas = my_string.split(" ");

        int answer = Integer.parseInt(datas[0]);
        for (int i = 1; i <= datas.length - 2; i += 2) {
            if (datas[i].equals("+")) {
                answer += Integer.parseInt(datas[i+1]);
                continue;
            }

            answer -= Integer.parseInt(datas[i+1]);
        }

        return answer;
    }
}