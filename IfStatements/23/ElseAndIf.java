class ElseAndIf {
    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        if (cars > people) {
            System.out.println("We should take the cars.");
        } else if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }
        //by removing the else in the "else if" part, if will print out the else part because the second if statement isnt satisfied. 
        
        
        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }
        
        
        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }
        //the else if and else statements tell the code what to do if the conditions for the if statement aren't satisfied.
        
    }
}
