class Solution { //로그인 성공?
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int id=-1;
        int pw=-1;
        
        for(int i=0; i<db.length; i++){
            id=-1;
            pw=-1;
            for(int j=0; j<2; j++){
                if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1]))
                {
                    return "login";
                }
                if(!id_pw[0].equals(db[i][0]))
                {   
                    if(!answer.equals("wrong pw"))
                        answer="fail";
                }
                else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1]))
                    answer="wrong pw";
            }
        }
        return answer;
    }
}