import java.util.Scanner;
class Student{
    String name;
    int grade;
    double average;
}
public class BasicRecords {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first student's name: ");
        student1.name = input.nextLine();
        System.out.print("Enter the first student's grade: ");
        student1.grade = input.nextInt();
        System.out.print("Enter the first student's average: ");
        student1.average = input.nextDouble();

        System.out.print("Enter the second student's name: ");
        student2.name = input.next();
        System.out.print("Enter the second student's grade: ");
        student2.grade = input.nextInt();
        System.out.print("Enter the second student's average: ");
        student2.average = input.nextDouble();

        System.out.print("Enter the third student's name: ");
        student3.name = input.next();
        System.out.print("Enter the third student's grade: ");
        student3.grade = input.nextInt();
        System.out.print("Enter the third student's average: ");
        student3.average = input.nextDouble();

        System.out.println("The names are: " + student1.name + " " + student2.name + " " + student3.name);
        System.out.println("The grades are: " + student1.grade + " " + student2.grade + " " + student3.grade);
        System.out.println("The averages are: " + student1.average + " " + student2.average + " " +student3.average);
    }
}
