import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class RoachSimulation {
	
	public static void main(String []args) {
		DecimalFormat decFormat = new DecimalFormat("0.00");
		
		RoachPopulation bugs = new RoachPopulation(10);
		System.out.println("We start with: " + bugs.getRoaches());
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		String input = JOptionPane.showInputDialog("Enter spray percentage:");
		double spraypct = Double.parseDouble(input);
		bugs.spray(spraypct);
		double kill = 20.3*spraypct;
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Killed: " + decFormat.format(kill));
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		String input2 = JOptionPane.showInputDialog("Enter spray percentage:");
		double spraypct2 = Double.parseDouble(input2);
		bugs.spray(spraypct2);
		double kill2 = 20.3*spraypct2;
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Killed: " + decFormat.format(kill2));
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		String input3 = JOptionPane.showInputDialog("Enter spray percentage:");
		double spraypct3 = Double.parseDouble(input3);
		bugs.spray(spraypct3);
		double kill3 = 20.3*spraypct3;
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Killed: " + decFormat.format(kill3));
		
		bugs.breed();
		System.out.printf("After breeding, there are:  %3.0f %n", bugs.getRoaches());
		
		String input4 = JOptionPane.showInputDialog("Enter spray percentage:");
		double spraypct4 = Double.parseDouble(input4);
		bugs.spray(spraypct4);
		double kill4 = 20.3*spraypct4;
		System.out.printf("After spraying we have:  %3.0f %n", bugs.getRoaches());
		JOptionPane.showMessageDialog(null, "Killed: " + decFormat.format(kill4));
		
	}

}
