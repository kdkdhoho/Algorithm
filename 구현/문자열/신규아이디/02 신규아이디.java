class Solution {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase(); // 1

        temp = temp.replaceAll("[^-_.a-z0-9]",""); // 2
        temp = temp.replaceAll("[.]{2,}","."); // 3
        temp = temp.replaceAll("^[.]|[.]$",""); // 4
        
        if(temp.equals("")) // 5
            temp += "a";
        
        if(temp.length() >= 16){ // 6
            temp = temp.substring(0,15);
            temp = temp.replaceAll("^[.]|[.]$","");
        }
        
        if(temp.length() <= 2) //  7
            while(temp.length() < 3)
                temp += temp.charAt(temp.length() - 1);

        answer = temp;
        return answer;
    }
}