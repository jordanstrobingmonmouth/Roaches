import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class RoachSimulation {
	
	public static void main(String []args) {
		DecimalFormat decFormat = new DecimalFormat("0");
		
		RoachPopulation bugs = new RoachPopulation(10);
		System.out.println("We start with: " + bugs.getRoaches());
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		String input = JOptionPane.showInputDialog("Enter spray percentage:");
		double spraypct = Double.parseDouble(input);
		bugs.spray(spraypct);
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Remaining: " + decFormat.format(bugs.getRoaches()));
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		input = JOptionPane.showInputDialog("Enter spray percentage:");
		spraypct = Double.parseDouble(input);
		bugs.spray(spraypct);
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Remaining: " + decFormat.format(bugs.getRoaches()));
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		input = JOptionPane.showInputDialog("Enter spray percentage:");
		spraypct = Double.parseDouble(input);
		bugs.spray(spraypct);
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Remaining: " + decFormat.format(bugs.getRoaches()));
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		input = JOptionPane.showInputDialog("Enter spray percentage:");
		spraypct = Double.parseDouble(input);
		bugs.spray(spraypct);
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Remaining: " + decFormat.format(bugs.getRoaches()));
	}

}
