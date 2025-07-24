//과일 장사
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int arr [] = new int[m];
        int arrIndex=m-1;
        Arrays.sort(score);
        
     
   
        for(int i=score.length-1; i>=0; i-=m){
            arrIndex=m-1;
            if(i-m+1<0){
                break;
            }
           
            for(int j=i; j>i-m; j--) {
                arr[arrIndex]=score[j];
                if(arrIndex-1<0)
                    break;
                else
                    arrIndex-=1;
                
            }
            answer+=arr[0]*m*1;
           
           
        }
        
        return answer;
    }
}

//k는 최상품의 사과 점수  1~k
//m은 한 상자에 담는 사과 갯수
// 사과 중 가장 낮은 점수가p (1 ≤ p ≤ k)점인 경우, 한 상자의 가격은 p * m
//  가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산