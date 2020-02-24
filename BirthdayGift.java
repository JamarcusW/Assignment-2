import javax.swing.JOptionPane;

public class BirthdayGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String childName, childAge, toy ;


		int age;

		Toy P;

		JOptionPane.showMessageDialog(null, "Welcome to the Toy company to choose gifts for young children");

		do 
		{
		childName = JOptionPane. showInputDialog(null, "What is the childs name?");

		childAge  = JOptionPane. showInputDialog(null, "What is the childs Age?");

		age = Integer.parseInt(childAge);	


		boolean valid;
		toy = JOptionPane. showInputDialog(null, "Choose a toy: plushie, blocks or a book.");

		while (toy.equalsIgnoreCase("plushie") == false && toy.equalsIgnoreCase("blocks")== false && toy.equalsIgnoreCase("book")== false) 
		{
			JOptionPane.showMessageDialog(null, "error invalid choice");

			toy = JOptionPane. showInputDialog(null, "Choose a toy: plushie, blocks or a book.");
		}
		
		String answer;
		
		P = new Toy(toy,age);
		if(P.ageOK()== false )
		{
			
		answer = JOptionPane. showInputDialog(null, "This toy is not suitable for a child of this age would you like to continue?");
			
		}
			
		}
		
		while(.equals("yes"));
			JOptionPane.showMessageDialog(null, "The child name is "+ childName +", and their age is " + age +".");



	}

}
