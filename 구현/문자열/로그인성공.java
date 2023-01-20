class Solution {
    private static final String LOGIN_SUCCESS = "login";
    private static final String WRONG_PW = "wrong pw";
    private static final String CANT_FIND_ID = "fail";
    private static final int INDEX_ID = 0;
    private static final int INDEX_PW = 1;

    public String solution(String[] id_pw, String[][] db) {
        String try_id = id_pw[INDEX_ID];
        String try_pw = id_pw[INDEX_PW];

        return login(try_id, try_pw, db);
    }

    private String login(String try_id, String try_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            String savedId = db[i][INDEX_ID];
            String savedPw = db[i][INDEX_PW];

            if (savedId.equals(try_id)) {
                if (savedPw.equals(try_pw)) {
                    return LOGIN_SUCCESS;
                }
                return WRONG_PW;
            }
        }
        return CANT_FIND_ID;
    }
}