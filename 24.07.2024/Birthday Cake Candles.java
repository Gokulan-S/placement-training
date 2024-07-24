#  https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

import java.util.*;

class Result{
    public static void FindMax(int n,int arr[]){
        int max=0,count=0;
        
        for(int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for(int num:arr){
            if(num==max){
                count++;
            }
        }
        System.out.println(count);
    }
}

public class Solution{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        Result.FindMax(n,arr);
    }
}
