import java.util.Scanner;
class Student{
    String name;
    int grade;
    double average;
}
public class LittleDatabase {
    public static void main(String[] args){
        Student[] list1 = new Student[3];
        list1[0] = new Student();
        list1[1] = new Student();
        list1[2] = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first student's name: ");
        list1[0].name = input.nextLine();
        System.out.print("Enter the first student's grade: ");
        list1[0].grade = input.nextInt();
        System.out.print("Enter the first student's average: ");
        list1[0].average = input.nextDouble();

        System.out.print("Enter the second student's name: ");
        list1[1].name = input.next();
        System.out.print("Enter the second student's grade: ");
        list1[1].grade = input.nextInt();
        System.out.print("Enter the second student's average: ");
        list1[1].average = input.nextDouble();

        System.out.print("Enter the third student's name: ");
        list1[2].name = input.next();
        System.out.print("Enter the third student's grade: ");
        list1[2].grade = input.nextInt();
        System.out.print("Enter the third student's average: ");
        list1[2].average = input.nextDouble();

        System.out.println("The names are: " + list1[0].name + " " + list1[1].name + " " + list1[2].name);
        System.out.println("The grades are: " + list1[0].grade + " " + list1[1].grade + " " + list1[2].grade);
        System.out.println("The averages are: " + list1[0].average + " " + list1[1].average + " " + list1[2].average);
    }
}

