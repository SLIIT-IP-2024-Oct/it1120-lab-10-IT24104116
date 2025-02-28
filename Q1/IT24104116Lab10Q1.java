import java.util.Scanner;

public class IT24104116Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mark (0-100): ");
        int mark = scanner.nextInt();


        assert (mark >= 0 && mark <= 100): "Invalid Mark";
        System.out.println("Mark is Validated");

        String grade;
        
       
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C"; 
        } else if (mark >= 40) {
            grade = "D"; 
        } else {
            grade = "F";         
	}

        
        assert validateGrade(mark, grade) : "Incorrect Grade Assigned";
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static boolean validateGrade(int mark, String grade) {
        if (mark >= 75 && grade.equals("A")) return true;
        if (mark >= 60 && grade.equals("B")) return true;
        if (mark >= 50 && grade.equals("C")) return true;        
	if (mark >= 40 && grade.equals("D")) return true;
        if (mark < 40 && grade.equals("F")) return true;
        return false; 
    }
}	
	
	