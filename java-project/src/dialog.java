import javax.swing.JOptionPane;

public class dialog
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer: "));
	
		JOptionPane.showMessageDialog(null, "Sum is: " + (a+b));
	}
}
