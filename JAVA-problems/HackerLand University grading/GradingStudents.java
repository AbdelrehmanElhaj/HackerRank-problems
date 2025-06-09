import java.util.*;

public class GradingStudents {

    public static List<Integer> roundGrades(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 38) {
                result.add(grade); // No rounding for failing grades
            } else {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    result.add(nextMultipleOf5); // Round up
                } else {
                    result.add(grade); // No rounding
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample input
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        // Apply rounding policy
        List<Integer> roundedGrades = roundGrades(grades);

        // Output results
        for (int grade : roundedGrades) {
            System.out.println(grade);
        }
    }
}
