class Solution { //영어가 싫어요 
    public long solution(String numbers) {
        String answer="";
        String result="";
        for(int i=0 ;i<numbers.length(); i++){
            
            answer+=Character.toString(numbers.charAt(i));
            if(answer.equals("zero")){
               result+="0";
                answer="";
            }
            else if(answer.equals("one")){
               result+="1";
                answer="";
            }
            else if(answer.equals("two")){
                result+="2";
                answer="";
            }
            else if(answer.equals("two")){
                result+="2";
                answer="";
            }
            else if(answer.equals("three")){
                result+="3";
                answer="";
            }
            else if(answer.equals("four")){
                result+="4";
                answer="";
            }
            else if(answer.equals("five")){
                result+="5";
                answer="";
            }
            else if(answer.equals("six")){
                result+="6";
                answer="";
            }
            else if(answer.equals("seven")){
                result+="7";
                answer="";
            }
            else if(answer.equals("eight")){
               result+="8";
                answer="";
            }
            else if(answer.equals("nine")){
               result+="9";
                answer="";
            }
    
              
        }
       
        long a=Long.parseLong(result);
        return a;
    }
}