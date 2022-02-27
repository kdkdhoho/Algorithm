import java.util.*;

class Solution {
    Map<String, Integer> playsTotalAmount = new HashMap<>();
    List<Integer> idxList = new ArrayList<>();
    List<Integer> answerList = new ArrayList<>();
    
    int maxAmount = 0; String maxGenre;
    
    public int[] solution(String[] genres, int[] plays) {
        // 장르 별 재생 수 총합 집계
        for(int i = 0; i < genres.length; i++) {
            if(!playsTotalAmount.containsKey(genres[i]))
                playsTotalAmount.put(genres[i], plays[i]);
            else
                playsTotalAmount.put(genres[i], playsTotalAmount.get(genres[i]) + plays[i]);
        }
        
        int n = playsTotalAmount.size();
        for(int i = 0; i < n; i++) {
            // 가장 많이 들은 genre 선정
            playsTotalAmount.forEach((k, v) -> {
                if(v > maxAmount) {
                    maxAmount = v;
                    maxGenre = k;
                }
            });
            playsTotalAmount.remove(maxGenre);
            
            // 해당 장르의 곡의 인덱스 추출
            for(int j = 0; j < genres.length; j++) {
                if(genres[j].equals(maxGenre))
                    idxList.add(j);
            }
            
            // 추출한 인덱스 중 가장 높은 plays와 두 번째로 높은 plays 추출
            for(int j = 0; j < 2; j++) {
                int maxPlays = 0; int maxIdx = -1;
                
                for(int k = 0; k < idxList.size(); k++) {
                    if(plays[idxList.get(k)] > maxPlays) {
                        maxPlays = plays[idxList.get(k)];
                        maxIdx = idxList.get(k);
                    }
                }
                
                if(maxIdx == -1)
                    break;
                
                answerList.add(maxIdx); // 가장 높은 plays 추출
                
                plays[maxIdx] = -1;
                idxList.remove((Integer)maxIdx);
            }
            
            maxAmount = 0;
            idxList.clear();
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = answerList.get(i);
        return answer;
    }
}