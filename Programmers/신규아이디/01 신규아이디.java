import java.util.*;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		String[] input = new_id.split("");
		ArrayList<String> data = new ArrayList<>(Arrays.asList(input));
		ArrayList<String> tmp = new ArrayList<>();

		// 1단계. 대문자를 소문자로
		for (String s : data) {
			char c = s.charAt(0);

			if ('A' <= c && c <= 'Z')
				c = (char) (c + 32);

			data.set(data.indexOf(s), Character.toString(c));
		}

		// 2단계. 해당 문자 제외한 모든 문자 제거
		for (String s : data) {
			char c = s.charAt(0);

			if (('a' <= c && c <= 'z') || c == '-' || c == '_' || c == '.' || ('0' <= c && c <= '9'))
				continue;
			else
				tmp.add(Character.toString(c));
		}
		data.removeAll(tmp);

		// 3단계. 마침표 2개 이상 -> 1개로 치환
		for (int i = 0; i < data.size() - 1; i++) {
			char target = data.get(i).charAt(0);
			char next = data.get(i + 1).charAt(0);

			if (target == '.' && next == '.') {
				data.remove(i + 1);
				i--;
			}
		}

		// 4단계. 마침표가 처음이나 끝에 있다면 제거
		if (data.get(0).charAt(0) == '.')
			data.remove(0);
		if (data.size() > 0)
			if (data.get(data.size() - 1).charAt(0) == '.')
				data.remove(data.size() - 1);

		// 5단계. 빈 문자열이라면 "a" 대입
		if (data.size() == 0)
			data.add("a");

		// 6단계. 길이가 16자 이상이면, 첫 15개의 문자 제외한 나머지 문자 제거. 제거 후 마침표가 끝에 위치한다면 제거
		if (data.size() >= 16) {
			while (data.size() >= 16)
				data.remove(15);
		}
		if (data.get(data.size() - 1).charAt(0) == '.')
			data.remove(data.size() - 1);

		// 7단계. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 추가
		if (data.size() <= 2) {
			String s = data.get(data.size() - 1);

			while (data.size() < 3) {
				data.add(s);
			}
		}

		answer = String.join("", data);
		return answer;
	}
}