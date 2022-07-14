// https://school.programmers.co.kr/learn/courses/30/lessons/12904

/*
 * 처음에 완전탐색으로 풀었음
 * 시간초과 문제로 투 포인터 사용. -> 시간은 ok
 * 일부 케이스에서 계속된 오류 -> "부분 문자열"을 간과
 * 부분 문자열이므로 모든 경우를 고려해야 함. -> 2중 for문 + char[]으로 substr의 절반까지 확인하는 방법으로 시간단축
 * 효율성 2번에서 자꾸 틀림 -> if(answer >= (i-j+1)) break; 추가해주어 해결
 */

class Solution {
    int answer = 0;

    public int solution(String s) {
        char[] arr = s.toCharArray();
        int k;

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                if (answer >= (i - j + 1))
                    break;

                int tmp = 0;

                for (k = j; k <= (j + i) / 2; k++) {
                    if (arr[k] != arr[i - tmp])
                        break;

                    tmp++;
                }

                if (k > (j + i) / 2)
                    answer = Math.max(answer, (i - j + 1));
            }
        }

        return answer;
    }
}
