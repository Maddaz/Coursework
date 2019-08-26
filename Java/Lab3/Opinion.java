import java.awt.* ; 
import javax.swing.*;
public class Opinion extends JPanel{
	private JLabel instruction;
	private JButton yes;
	private JButton no;
	
	public Opinion(){
		instruction = new JLabel("Do you like programming?");
		yes = new JButton("YES");
		no = new JButton("No");
		
		add (instruction);
		add(yes);
		add(no);
		
		setPreferredSize(new Dimension(200,80));		
		
	}

}
