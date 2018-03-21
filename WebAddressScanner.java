import java.net.URL;
import java.util.Scanner;

class Addresses {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddressScanner {
    public static void main(String[] args) throws Exception {
        URL addressFile = new URL("https://mrgallo.github.io/problem-files/163/fake-addresses.txt");
        Scanner scan = new Scanner(addressFile.openStream());

        Addresses address1 = new Addresses();
        address1.street = scan.nextLine();
        address1.city   = scan.nextLine();
        address1.state  = scan.next();
        address1.zip    = scan.nextInt();
        scan.skip("\n");

        Addresses address2 = new Addresses();
        address2.street = scan.nextLine();
        address2.city   = scan.nextLine();
        address2.state  = scan.next();
        address2.zip    = scan.nextInt();
        scan.skip("\n");

        Addresses address3 = new Addresses();
        address3.street = scan.nextLine();
        address3.city   = scan.nextLine();
        address3.state  = scan.next();
        address3.zip    = scan.nextInt();
        scan.skip("\n");

        Addresses address4 = new Addresses();
        address4.street = scan.nextLine();
        address4.city   = scan.nextLine();
        address4.state  = scan.next();
        address4.zip    = scan.nextInt();
        scan.skip("\n");

        Addresses address5 = new Addresses();
        address5.street = scan.nextLine();
        address5.city   = scan.nextLine();
        address5.state  = scan.next();
        address5.zip    = scan.nextInt();
        scan.skip("\n");

        Addresses address6 = new Addresses();
        address6.street = scan.nextLine();
        address6.city   = scan.nextLine();
        address6.state  = scan.next();
        address6.zip    = scan.nextInt();
        scan.skip("\n");
        scan.close();

        System.out.println(address1.street + ", " + address1.city + ", " + address1.state + "  " + address1.zip);
        System.out.println(address2.street + ", " + address2.city + ", " + address2.state + "  " + address2.zip);
        System.out.println(address3.street + ", " + address3.city + ", " + address3.state + "  " + address3.zip);
        System.out.println(address4.street + ", " + address4.city + ", " + address4.state + "  " + address4.zip);
        System.out.println(address5.street + ", " + address5.city + ", " + address5.state + "  " + address5.zip);
        System.out.println(address6.street + ", " + address6.city + ", " + address6.state + "  " + address6.zip);

    }
}
