// https://programmers.co.kr/learn/courses/30/lessons/42583

import java.util.*;
import java.io.*;

public class Truck {
	private int time = 1;
	private int weight;

	Truck(int weight) {
		this.weight = weight;
	}

	void addTime() {
		this.time += 1;
	}

	int getTime() {
		return this.time;
	}

	int getWeight() {
		return this.weight;
	}
}

class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		LinkedList<Truck> deque = new LinkedList<>();
		int index = 0;

		while (index != truck_weights.length) {
			// 다리 위 모든 트럭 시간 +1
			addTime(deque);

			// 다리 위 트럭 건넜는지 확인
			for (int j = 0; j < deque.size(); j++) {
				if (deque.get(j).getTime() > bridge_length)
					deque.remove(j);
			}

			// 트럭 투입
			if (getTotalWeight(deque) + truck_weights[index] <= weight) {
				deque.offer(new Truck(truck_weights[index]));
				index++;
			}

			answer++;
		}

		answer += bridge_length;
		return answer;
	}

	int getTotalWeight(LinkedList<Truck> deque) {
		int sum = 0;

		for (int i = 0; i < deque.size(); i++)
			sum += deque.get(i).getWeight();

		return sum;
	}

	void addTime(LinkedList<Truck> deque) {
		for (int i = 0; i < deque.size(); i++)
			deque.get(i).addTime();
	}
}