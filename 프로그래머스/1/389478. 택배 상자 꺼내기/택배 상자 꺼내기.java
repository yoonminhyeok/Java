class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int number=n;
        int k=1;   
        int xindex=0;
        int yindex=0;
        int count=1;
        while(number%w!=0){
            number+=1;
            
        }
        
        int arr[][]= new int [number/w][w];
        
        for(int i=0; i<number/w; i++){
            if(i%2==0){
            for(int j=0; j<w; j++){
                arr[i][j]=k++;
            }
            }
            else{
               for(int j=w-1; j>=0; j--){
                    arr[i][j]=k++;
                }
             }
        }
        
        for(int i=0; i<number/w; i++){
            for(int j=0; j<w; j++){
               System.out.print(arr[i][j]+" ");
               if(arr[i][j]==num){
                   yindex=i;
                   xindex=j;
                   
               }
            }
            System.out.println();
        }        
         System.out.println(yindex);
         System.out.println(xindex);
        
        for(int i=yindex+1; i<number/w; i++){
            if(arr[i][xindex]<=n){
                System.out.println(arr[i][xindex]);
                count++;
            }

        }
        
        

        return count;
    }
}