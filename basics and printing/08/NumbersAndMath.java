class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );
		
		// Uses math to print the number of hens and roosters 
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );

		System.out.println( "Now I will count the eggs:" );
		
		// Uses math functions to calculate the number of eggs
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );

		System.out.println( "Is it true that 3.0 + 2.0 < 5.0 - 7.0?" );
		
		// uses math functions to print out whether the statement is true or false
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
		
		// prints out what each equation works out to
		System.out.println( "What is 3.0 + 2.0? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5.0 - 7.0? " + ( 5.0 - 7.0 ) );

		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		// Determines how 5 relates to -2
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}

