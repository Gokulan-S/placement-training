#  https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

import java.util.*;
import java.io.*;
import java.math.*;

class Result{
    public static void MinMaxSum(int arr[]){
        
        long minsum=Long.MAX_VALUE;
        long maxsum=Long.MIN_VALUE;
        
        for(int j=0;j<5;j++){
            long sum=0;
            for(int k=0;k<5;k++){
                
                if(j==k){
                    continue;
                }
                sum+=arr[k];
                
            }
            if(minsum>sum){
                minsum=sum;
            }
            if(maxsum<sum){
                maxsum=sum;
            }
        }
        System.out.println(minsum+" "+maxsum);
    }
}

public class Solution{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        Result.MinMaxSum(arr);
        
    }
}
