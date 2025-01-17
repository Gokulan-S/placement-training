#  https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

import java.io.*;
import java.util.*;

class Result {
  

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        
        for (int grade : grades) {
            if (grade >= 38) {
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
                if (nextMultipleOfFive - grade < 3) {
                    roundedGrades.add(nextMultipleOfFive);
                } else {
                    roundedGrades.add(grade);
                }
            } else {
                roundedGrades.add(grade);
            }
        }
        
        return roundedGrades;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
