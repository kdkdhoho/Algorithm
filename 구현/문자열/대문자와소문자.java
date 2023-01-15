class Solution {
    public String solution(String my_string) {
        char[] alphabets = my_string.toCharArray();

        for (int i = 0; i < alphabets.length; i++) {
            char alphabet = alphabets[i];
            if (Character.isLowerCase(alphabet)) {
                alphabets[i] = Character.toUpperCase(alphabet);
                continue;
            }
            alphabets[i] = Character.toLowerCase(alphabet);
        }

        return new String(alphabets);
    }
}