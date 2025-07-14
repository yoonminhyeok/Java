//유연근무제
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int check=0;
        int count=0;
        int changeday=startday-1;
        
        for(int i=0; i<schedules.length; i++){
            schedules[i]+=10;
            changeday=startday-1;
            check=0;
            int hund=schedules[i]/100;
            int ten=schedules[i]%100/10;
            int one=schedules[i]%100%10;
            if(ten>=6){
                hund+=1;
                ten=0;
                schedules[i]=hund*100+ten*10+one;

            }
            
            if(changeday==0){
            for(int j=0; j<7; j++){
                if(j!=5 && j!=6){
                if(timelogs[i][changeday]<=schedules[i]){
                    System.out.print(timelogs[i][changeday]+" ");
                    check++;
                }
                    changeday++;
                }
                }
            }
             else {
                count = 0;
                while (count < 7) {
                     int weekday = (startday + count - 1) % 7 + 1;

                     if (weekday != 6 && weekday != 7) {
                     if (timelogs[i][count] <= schedules[i]) {
                         System.out.print(timelogs[i][count] + " ");
                         check++;
                }
        }

        count++;
    }
}


            System.out.println();
            if(check==5)
                answer++;
        }
        
        return answer;
    }
}