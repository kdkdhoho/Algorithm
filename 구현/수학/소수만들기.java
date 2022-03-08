// https://programmers.co.kr/learn/courses/30/lessons/12977

class Solution {
	public int solution(int[] nums) {
		int result = 0;
		int count = 0;

		// nums중 3개 고르기
		int a, b, c;
		for (int i = 0; i < nums.length - 2; i++) {
			a = nums[i];
			for (int j = i + 1; j < nums.length - 1; j++) {
				b = nums[j];
				for (int k = j + 1; k < nums.length; k++) {
					c = nums[k];

					// 소수 판별
					int sum = a + b + c;
					if (isPrimeNumber(sum))
						result++;
				}
			}
		}

		return result;
	}

	public boolean isPrimeNumber(int x) {
		for (int i = 2; i < Math.sqrt(x); i++)
			if (x % i == 0)
				return false;

		return true;
	}
}