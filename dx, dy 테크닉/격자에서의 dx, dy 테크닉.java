// 출처: https://www.codetree.ai/missions/5/problems/place-more-than-3-ones/submissions

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 동 서 남 북
        int[] dRow = {0, 0, 1, -1};
        int[] dCol = {1, -1, 0, 0};

        int answer = 0;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                int cnt = 0;
                
                for(int i = 0; i < 4; i++) {
                    int next_row = row + dRow[i];
                    int next_col = col + dCol[i];

                    if(next_row < 0 || next_row >= n || next_col < 0 || next_col >= n) {
                        continue;
                    }

                    if(arr[next_row][next_col] == 1) {
                        cnt++;
                    }
                }

                if(cnt >= 3) {
                    answer++;
                }
            }
        }

        System.out.print(answer);
    }
}
