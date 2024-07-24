#  https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

import java.util.*;
class Result{
    public static void Staircase(int n){
        int space=n-1,hash=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<hash;k++){
                System.out.print("#");
            }
            System.out.println();
            space--;
            hash++;
        }

    }
}


public class Solution{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Result.Staircase(n);
    }
}
