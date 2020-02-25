package assignment2;
import javax.swing.JOptionPane;
import java.util.Random;
public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String childName, childAge, toy, card, balloon ;

		final String programmerName = "Jamarcus Orr Williams";
		String answer = "" ;
		int age, rand ;
		double totalcost = 0;

		Toy P;

		JOptionPane.showMessageDialog(null, "Welcome to the Toy company to choose gifts for young children");

		Random  generator = new Random ();
		
		rand = generator.nextInt(10000)+1;
		
		do {
			do 
			{
				childName = JOptionPane. showInputDialog(null, "What is the childs name?");

				childAge  = JOptionPane. showInputDialog(null, "What is the childs Age?");

				age = Integer.parseInt(childAge);	



				toy = JOptionPane. showInputDialog(null, "Choose a toy: plushie, blocks or a book.");

				while (toy.equalsIgnoreCase("plushie") == false && toy.equalsIgnoreCase("blocks")== false && toy.equalsIgnoreCase("book")== false) 
				{
					JOptionPane.showMessageDialog(null, "error invalid choice");

					toy = JOptionPane. showInputDialog(null, "Choose a toy: plushie, blocks or a book.");
				}



				P = new Toy(toy,age);

				if(P.ageOK()== false )
				{

					answer = JOptionPane. showInputDialog(null, "This toy is not suitable for a child of this age would you like to cancel this toy request?");

				}

			}	while(answer.equals("yes"));






			card = JOptionPane.showInputDialog(null,"Do you want a card with the gift? Yes or No ");

			P.addCard(card);

			balloon = JOptionPane.showInputDialog(null,"Do you want a balloon with the gift? Yes or No ");

			P.addBalloon(balloon);

			JOptionPane.showMessageDialog(null,"The gift for "+ childName +  P);

			answer = JOptionPane.showInputDialog(null,"Do you want another toy? Yes or No ");

			totalcost += P.getCost();
		}
		while(answer.equals("yes"));
		
		
		JOptionPane.showMessageDialog(null, String.format("The total cost of your order is %.2f .",totalcost));
		
		JOptionPane.showMessageDialog(null, "Order Number is: "+ rand + "\n Programmer name: " + programmerName );
		
		
		
	}

}