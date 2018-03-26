import java.util.Scanner;
class Student{
    String name;
    int grade;
    double average;
}
public class LittleDatabase {
    public static void main(String[] args){
        Student[] list1 = new Student[3];
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
        list1[0] = student1;

        System.out.print("Enter the second student's name: ");
        student2.name = input.next();
        System.out.print("Enter the second student's grade: ");
        student2.grade = input.nextInt();
        System.out.print("Enter the second student's average: ");
        student2.average = input.nextDouble();
        list1[1] = student2;

        System.out.print("Enter the third student's name: ");
        student3.name = input.next();
        System.out.print("Enter the third student's grade: ");
        student3.grade = input.nextInt();
        System.out.print("Enter the third student's average: ");
        student3.average = input.nextDouble();
        list1[2] = student3;

        System.out.println("The names are: " + list1[0].name + " " + list1[1].name + " " + list1[2].name);
        System.out.println("The grades are: " + list1[0].grade + " " + list1[1].grade + " " + list1[2].grade);
        System.out.println("The averages are: " + list1[0].average + " " + list1[1].average + " " + list1[2].average);
    }
}
