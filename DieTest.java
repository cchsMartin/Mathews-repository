import java.util.Random;


public class DieTest {
	
	public static void main(String[] args) {
		Random random = new Random();	// RNG
		
		
		int sides = random.nextInt(95) + 5; //calculates the number of sides for each die
		int sides2 = random.nextInt(95) + 5;
		
		Die Die1 = new Die(sides, 1);// creates the first die object
		Die Die2 = new Die(sides2, 2);// creates the second die object
		
		Die1.NumSides(1);// prints the first dies number of sides
		int Die1roll = Die1.roll(sides, 1);//sets the first dies rolled value
		Die2.NumSides(2);//  prints the second dies number of sides
		int Die2roll = Die2.roll(sides2,2);//sets the seconds dies rolled value
		
		Die1.printroll(Die1roll, Die2roll);//prints the rolls of the dice
		Die2.total(Die1roll, Die2roll);// prints the total number

	}

}
