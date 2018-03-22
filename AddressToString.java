import java.net.URL;
import java.util.Scanner;

class Address4 {
    String street;
    String city;
    String state;
    int zip;

    // to String allows for java to understand how to display the address
    public String toString() {
        return (this.street + ", " + this.city + ",  " + this.state + " " + this.zip);
    }
}

public class AddressToString {
    public static void main(String[] args) throws Exception {
        URL addressFile = new URL("https://mrgallo.github.io/problem-files/163/fake-addresses.txt");
        Scanner scan = new Scanner(addressFile.openStream());

        Address4[] addressBook = new Address4[5];
        for (int i = 0; i < 5; i++) {
            addressBook[i] = new Address4();
            addressBook[i].street = scan.nextLine();
            addressBook[i].city   = scan.nextLine();
            addressBook[i].state  = scan.next();
            addressBook[i].zip    = scan.nextInt();
            scan.skip("\n");
        }
        scan.close();

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + addressBook[i]);
        }
    }
}