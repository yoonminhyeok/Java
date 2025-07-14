//동영상 재생기
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String arr[]=pos.split(":");
        String arr2[]=op_end.split(":");
        String arr3[]=op_start.split(":");
        String arr4[]=video_len.split(":");
        
        int posInt=Integer.parseInt(arr[0])*60+Integer.parseInt(arr[1]);
        int opEndInt=Integer.parseInt(arr2[0])*60+Integer.parseInt(arr2[1]);
        int opStartInt=Integer.parseInt(arr3[0])*60+Integer.parseInt(arr3[1]);
        int videoLen=Integer.parseInt(arr4[0])*60+Integer.parseInt(arr4[1]);
        
        if(posInt>opStartInt && posInt<opEndInt)
            posInt=opEndInt;
        
        System.out.println(posInt);
        for(int i=0; i<commands.length; i++){
            if(commands[i].equals("next")){
                if(posInt+10>videoLen)
                {
                    posInt=videoLen;
                }
                else
                    posInt+=10;
            }
            else{
                if(posInt-10<0)
                    posInt=0;
                else
                    posInt-=10;
            }
            
              if(posInt>=opStartInt && posInt<=opEndInt)
                    posInt=opEndInt;
        }
        if(posInt>=opStartInt && posInt<=opEndInt){
            return op_end;
        }
        
        if(posInt>videoLen)
            return video_len;
        
        String x=String.valueOf(posInt/60);
        String y=String.valueOf(posInt%60);
        System.out.println(x);
        
        if(x.length()==1 && y.length()==1){
            answer+="0"+String.valueOf(posInt/60)+":"+"0"+String.valueOf(posInt%60);
        }
        else if(x.length()==1 && y.length()!=1){
            answer+="0"+String.valueOf(posInt/60)+":"+String.valueOf(posInt%60);
        }
        else if(x.length()!=1 && y.length()==1){
             answer+=answer+=String.valueOf(posInt/60)+":"+"0"+String.valueOf(posInt%60);
        }
        else{
           answer+=String.valueOf(posInt/60)+":"+String.valueOf(posInt%60);
        }
      
        
        
        System.out.println(posInt);
        return answer;
    }
}