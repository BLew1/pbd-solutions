public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
	
	//There are 100 cars
        cars = 100;
	//There is space for 4 people in each car
        space_in_a_car = 4.0;
	//There are 30 total drivers
        drivers = 30;
	//There are 90 passengers
        passengers = 90;
	//Use math to determine the cars that aren't being driven
        cars_not_driven = cars - drivers;
	//Determines the number of cars that are driven
        cars_driven = drivers;
	//Determines the total amount of people that ride
        carpool_capacity = cars_driven * space_in_a_car;
	//Determines number of peopel per car
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
