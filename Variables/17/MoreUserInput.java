import java.util.Scanner;

class MoreUserInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the following information so I can sell it for a profit!");
        
        System.out.print("First name: ");
        String firstName = input.next();
        
        System.out.print("Last name: ");
        String lastName = input.next();
        
        System.out.print("Grade(9-12): ");
        int grade = Integer.parseInt(input.next());
        
        System.out.print("Student ID: ");
        int studentID = Integer.parseInt(input.next());
        
        System.out.print("Login: ");
        String login = input.next();
        
        System.out.print("Average: ");
        double average = Double.parseDouble(input.next());
        
        System.out.println("Your information: ");
        System.out.println("    Login: " + login);
        System.out.println("    ID:    " + studentID);
        System.out.println("    Name:  " + lastName + ", " + firstName);
        System.out.println("    Avg:   " + average);
        System.out.println("    Grade: " + grade);
    }
}
        
        
