class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddress {
    public static void main(String[] args) throws Exception {

        Address disneyLand = new Address();
        disneyLand.street = "1313 Disneyland Dr";
        disneyLand.city   = "Anaheim";
        disneyLand.state  = "California";
        disneyLand.zip    = 92802;

        System.out.println(disneyLand.street + ", " + disneyLand.city + ", " + disneyLand.state + "  " + disneyLand.zip);

        Address home = new Address();
        home.street = "1 Main Street";
        home.city = "Markham";
        home.state = "Ontario";
        home.zip = 12345;

        System.out.println(home.street + ", " + home.city + ", " + home.state + ", " + home.zip);

        Address address3 = new Address();
        address3.street = "street3";
        address3.city = "city3";
        address3.state = "state3";
        address3.zip = 33333;

        System.out.println(address3.street + ", " + address3.city + ", " + address3.state + ", " + address3.zip);
    }
}