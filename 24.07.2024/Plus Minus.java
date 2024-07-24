#  https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

import java.util.*;
import java.text.DecimalFormat;

class Result{
    
    public static void PlusMinus(int n,int[]arr){
        int plus=0,minus=0,zero=0;
        
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                minus++;
            }else if(arr[j]>0){
                plus++;
            }else{
                zero++;
            }
            
        }
        
        double positive_ratio=(double)plus/n;
        double negative_ratio=(double)minus/n;
        double zero_ratio=(double)zero/n;
        
        DecimalFormat df=new DecimalFormat("#.######");
        System.out.println(df.format(positive_ratio));
        System.out.println(df.format(negative_ratio));
        System.out.println(df.format(zero_ratio));
    }
}


public class Solution{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        Result.PlusMinus(n,arr);
    }
}
