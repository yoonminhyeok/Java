//개인정보 수집 유효기간
import java.util.*;
class Solution {
    public List solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        String tmp[]=today.split("\\.");
        int start1=Integer.parseInt(tmp[0]);
        int start2=Integer.parseInt(tmp[1]);
        int start3=Integer.parseInt(tmp[2]);
        
       for(int i=0; i<privacies.length; i++) {
        
           String arr[]= privacies[i].split(" ");
           String type=arr[1];
           
           for(int j=0; j<terms.length; j++) {
               String arr2[] =terms[j].split(" ");
              int month=Integer.parseInt(arr2[1]); 
               if(type.equals(arr2[0])){
                  String tmp2[] =arr[0].split("\\.");
                  
                  int num1=Integer.parseInt(tmp2[0]);
                  int num2=Integer.parseInt(tmp2[1]);
                  int num3=Integer.parseInt(tmp2[2]);
                   System.out.println(num1+"년"+num2+"월"+num3+"일");
                   num2+=month;
                   num3-=1;
                   
                   if(num2>=13){
                       num1+= (num2-1)/12;
                       num2 = (num2-1)%12+1;
                   }
                   
                   if(num3==0){
                       num3=28;
                       num2-=1;
                   }
                   if(num2==0)
                   {
                       num2=12;
                       num1-=1;
                       
                   }
                     System.out.println(num1+"년"+num2+"월"+num3+"일");
                   
                   if(start1>num1)
                       answer.add(i+1);
                   else  if(start1==num1) {
                       if(start2>num2)
                           answer.add(i+1);
                       else if(start2==num2){
                            if(start3>num3)
                            {   answer.add(i+1);
                                System.out.println(1);
                            }
                          
                       }
                   }
                   
               }
           }
       
        }
        return answer;
    }
}

