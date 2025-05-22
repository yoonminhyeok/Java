import java.util.*; //최빈값 구하기 
class Solution { 
    public int solution(int[] array) {
        int answer = 0;
        int max=0;
        for(int i=1; i<array.length; i++){
            if(array[i]>array[max])
                max=i;
        }
        
        int arr[]= new int[array[max]+1]; 
        
        for(int i=0; i<array.length; i++){
            int val=array[i];
            arr[val]+=1;
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int oftenIndex=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[oftenIndex]){
                oftenIndex=i;
            }
        }
        Arrays.sort(arr);
        if(arr[arr.length-1]==arr[arr.length-2])
            oftenIndex=-1;
        
        return  oftenIndex;
    }
}