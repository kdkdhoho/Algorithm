import java.util.*;

class Solution {
	
	static int testCount;
	static int n;
	static int m;
	static int count = 0;
	static final int MAX_ROW = 300;
	static final int MAX_COL = 300;
	
	static int[][] board;
	static int[][] tmpBoard;
	static List<Integer> datas = new ArrayList<>();
	static List<Integer> answers = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 자료구조 입력
		testCount = sc.nextInt();
		for(int test = 0; test < testCount; test++) {
			m = sc.nextInt();
			n = sc.nextInt();
			
			board = new int[m][m];
			tmpBoard = new int[m][m];
			
			for(int i = 0; i < n; i++) {
				int row = sc.nextInt() - 1;
				int col = sc.nextInt() - 1;
				
				board[row][col]++;
				tmpBoard[row][col]++;
			}
			
			// 모든 로봇이 한 칸에 모이기 위한 최소 명령 횟수 구하는 알고리즘
			combineNorthWest();
			datas.add(count);
			count = 0;
			
			copyArr(board, tmpBoard);
			
			combineNorthEast();
			datas.add(count);
			count = 0;
			
			// datas내의 값 비교해서 최소값을 answers에 넣고, datas 비우기
			answers.add(getMin());
			datas.clear();
		}
		
		// 테스트 케이스와 해당 테스트 케이스의 정답 출력
		for(int i = 1; i <= answers.size(); i++) {
			System.out.printf("#%d %d\n", i, answers.get(i-1));
		}
		
		sc.close();
	}
	
	private static void copyArr(int[][] dest, int[][] src) {
		for(int row = 0; row < m; row++) {
			for(int col = 0; col < m; col++) {
				dest[row][col] = src[row][col];
			}
		}
	}
	
	// 좌측상단에 모으는 함수
	private static void combineNorthWest() {
		// 모두 상단에 모으기
		for(int repeat = 1; repeat < m; repeat++) {
			if (isRemainBottom()) {
				moveUp();
			}
		}
		
		// 모두 좌측으로 옮기기
		for(int repeat = 1; repeat < m; repeat++) {
			if (isRemainRight()) {
				moveLeft();
			}
		}
	}
	
	// 우측상단에 모으는 함수
	public static void combineNorthEast() {
		// 모두 상단으로 모으기
		for(int repeat = 1; repeat < m; repeat++) {
			if (isRemainBottom()) {
				moveUp();
			}
		}
		
		// 모두 우측으로 옮기기
		for(int repeat = 1; repeat < m; repeat++) {
			if (isRemainLeft()) {
				moveRight();
			}
		}
	}
	
	public static boolean isRemainBottom() {
		for (int row = 1; row < m; row++) {
			for (int col = 0; col < m; col++) {
				if (board[row][col] >= 1) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean isRemainRight() {
		for(int row = 0; row < m; row++) {
			for(int col = 1; col < m; col++) {
				if (board[row][col] >= 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isRemainLeft() {
		for(int row = 0; row < m; row++) {
			for(int col = 0; col < m-1; col++) {
				if (board[row][col] >= 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void moveUp() {
		count++;
		for(int row = 0; row < m; row++) {
			for(int col = 0; col < m; col++) {
				if(board[row][col] >= 1) {
					if(canGo(row, col, "U")) {
						board[row-1][col] += board[row][col];
						board[row][col] = 0;
					}
				}
			}
		}
	}
	
	public static void moveLeft() {
		count++;
		for(int row = 0; row < m; row++) {
			for(int col = 0; col < m; col++) {
				if(board[row][col] >= 1) {
					if(canGo(row, col, "L")) {
						board[row][col - 1] += board[row][col];
						board[row][col] = 0;						
					}
				}
			}
		}
	}
	
	public static void moveRight() {
		count++;
		for(int row = 0; row < m; row++) {
			for(int col = m-1; col >= 0; col--) {
				if(board[row][col] >= 1) {
					if(canGo(row, col, "R")) {
						board[row][col+1] += board[row][col];
						board[row][col] = 0;						
					}
				}
				
			}
		}
	}
	
	private static boolean canGo(int row, int col, String direction) {
		if(direction.equals("U")) {
			int nextRow = row - 1;d
			
			if(0 <= nextRow && nextRow < m && 0 <= col && col < m) {
				return true;
			}
			return false;
		}
		
		if(direction.equals("L")) {
			int nextCol = col - 1;
			if(0 <= row && row < m && 0 <= nextCol && nextCol < m) {
				return true;
			}
			return false;
		}
		
		if(direction.equals("R")) {
			int nextCol = col + 1;
			if(0 <= row && row < m && 0 <= nextCol && nextCol < m) {
				return true;
			}
			return false;
		}
		
		return false;
	}
	
	public static int getMin() {
		Collections.sort(datas);
		return datas.get(0);
	}
}
