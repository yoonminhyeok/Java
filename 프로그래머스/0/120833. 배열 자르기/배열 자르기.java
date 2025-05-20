import java.util.*; //배열 자르기
class Solution {
 public   List<Integer> solution(int[] numbers, int num1, int num2) {
       List<Integer> answer = new ArrayList<Integer>();
       for(int i=0; i<numbers.length; i++){
           answer.add(numbers[i]);
       }
       List<Integer> result =answer.subList(num1,num2+1);
       return result;
    }
}