class Solution { //가까운 수 
    public int solution(int[] array, int n) {
        int answer = 0;
        int arr[]= new int[array.length];
        
        for(int i=0; i<array.length; i++){
            arr[i]=Math.abs(array[i]-n);
            System.out.println(arr[i]);
        }
        int minIndex=0;
        for(int i=1; i<arr.length; i++){
             if(arr[minIndex]>arr[i])
                 minIndex=i;
             if(arr[minIndex]==arr[i])
             {
                 if(array[minIndex]>array[i])
                     minIndex=i;
             }
        }
        answer=array[minIndex];
        return answer;
        
    }
}