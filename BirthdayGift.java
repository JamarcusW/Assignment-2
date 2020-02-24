import javax.swing.JOptionPane;

public class BirthdayGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String childName, childAge, toy ;
		
		
		int age;
		
		Toy P;
		
		 JOptionPane.showMessageDialog(null, "Welcome to the Toy company to choose gifts for young children");
		 
		childName = JOptionPane. showInputDialog(null, "What is the childs name?");
		 
		childAge  = JOptionPane. showInputDialog(null, "What is the childs Age?");
		 
		age = Integer.parseInt(childAge);	
		
		
		
		int valid;
		do {
			
			
			toy = JOptionPane. showInputDialog(null, "Choose a toy: plushie, blocks or a book.");
			
			if (toy != "plushie" || toy != "book" || toy != "blocks") 
			{
				valid = 1;
			}
			else 
			{
				valid = 2;
			}
			
		}
		 
		while (valid == 1);
		
		P = new Toy(toy,age);
		 
		
		JOptionPane.showMessageDialog(null, "The child name is "+ childName +", and their age is " + age +".");
		 
		 

	}

}
