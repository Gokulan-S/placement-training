#  https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

import java.io.*;
import java.text.*;
import java.util.*;

class Result {



    public static String timeConversion(String s) {
        
        String period = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 2);
        
        
        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        String minute = timeParts[1];
        String second = timeParts[2];
        
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0; 
            }
        } else { 
            if (hour != 12) {
                hour += 12; 
            }
        }

        
        String hourFormatted = String.format("%02d", hour);
        return hourFormatted + ":" + minute + ":" + second;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
