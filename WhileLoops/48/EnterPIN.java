import java.util.Scanner;

class EnterPIN{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("Enter your PIN: ");
        int entry = input.nextInt();
        
        while (entry != pin){
            System.out.println("INCORRECT PIN TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = input.nextInt();
        }
        
        System.out.println("PIN ACCEPTED, YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}
