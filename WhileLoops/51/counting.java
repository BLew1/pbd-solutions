import java.util.Scanner;

class counting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a message and I'll displlay it five times.");
        System.out.print("Message: ");
        String message = input.nextLine();
        
        int n = 0;
        while (n < 5){
            System.out.println((n+1) + ". " + message);
            n++;
        }
    }
}
