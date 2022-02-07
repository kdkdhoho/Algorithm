import java.util.*;

class Document {
	boolean myDoc;
	int priority;

	Document(boolean myDoc, int priority) {
		this.myDoc = myDoc;
		this.priority = priority;
	}
}

class Solution {
	public int solution(int[] priorities, int location) {
		LinkedList<Document> queue = new LinkedList<>();
		LinkedList<Document> printed = new LinkedList<>();
		int answer = 0, i;

		for (i = 0; i < priorities.length; i++) {
			if (i == location)
				queue.offer(new Document(true, priorities[i]));
			else
				queue.offer(new Document(false, priorities[i]));
		}

		while (!queue.isEmpty()) {
			Document tmp = queue.peek();

			for (i = 1; i < queue.size(); i++) {
				if (queue.get(i).priority > tmp.priority) {
					queue.offer(queue.poll());
					break;
				}
			}
			if (i == queue.size())
				printed.offer(queue.poll());
		}

		for (i = 0; i < printed.size(); i++) {
			Document tmp = printed.get(i);

			if (tmp.myDoc)
				answer = i + 1;
		}

		return answer;
	}
}