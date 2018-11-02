import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class QuizGUI implements ActionListener {
	int correctCount = 0;
	//JLabel answer;
	JFrame frame;
	QuizGUI(){
		frame = new JFrame("Quiz");
		JPanel mainPanel = new JPanel();
		
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		frame.setSize(500,500);
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		JLabel q1 = new JLabel("1.What programming language is this code written in ? ");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		JRadioButton [] op = new JRadioButton[4];
		op[0] = new JRadioButton("C++");
		op[1] = new JRadioButton("JAVA");
		op[2] = new JRadioButton("Python");
		op[3] = new JRadioButton("JavaScript");
		
		for(int i = 0; i < 4; i++) {
			op[i].addActionListener(this);
			op[i].setActionCommand("JAVA");
		}
			
		
		ButtonGroup bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
			bG.add(op[i]);
			panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		//////////////////////////////
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("2.What is comparable?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("Method");
		op[1] = new JRadioButton("Class");
		op[2] = new JRadioButton("Interface");
		op[3] = new JRadioButton("Identifier");
		
		for(int i = 0; i < 4; i++) {
			op[i].addActionListener(this);
			op[i].setActionCommand("Interface");
			
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
			bG.add(op[i]);
			panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		////////////////////////////
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("3.MouseAdapter is the adapter class of ? ");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("MouseListener");
		op[1] = new JRadioButton("MouseMotionListener");
		op[2] = new JRadioButton("MouseSelectionListener");
		op[3] = new JRadioButton("None of these");
		
		for(int i = 0; i < 4; i++) {
			op[i].setActionCommand("MouseListener");
			op[i].addActionListener(this);
		}
			
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
			bG.add(op[i]);
			panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		//////////////////////////
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("4.When does method overloading determined? ");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("Run time");
		op[1] = new JRadioButton("Coding time");
		op[2] = new JRadioButton("Execution time");
		op[3] = new JRadioButton("Compile time");
		
		for(int i = 0; i < 4; i++) {
			op[i].addActionListener(this);
			op[i].setActionCommand("Compile time");
			
		}
			
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
			bG.add(op[i]);
			panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		//////////////////////////////
				
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("5.What is the process of defining a method in a subclass having same name & type signature as a method in its superclass?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("Method Overloading");
		op[1] = new JRadioButton("Method Overriding");
		op[2] = new JRadioButton("Method Hiding");
		op[3] = new JRadioButton("Method Binding");
		
		for(int i = 0; i < 4; i++) {
		op[i].addActionListener(this);
		op[i].setActionCommand("Method Overriding");
		
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
		bG.add(op[i]);
		panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		////////////////////////////
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("6.Which of these keywords can be used to prevent Method overriding?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("static");
		op[1] = new JRadioButton("private");
		op[2] = new JRadioButton("final");
		op[3] = new JRadioButton("volatile");
		
		for(int i = 0; i < 4; i++) {
			op[i].addActionListener(this);
			op[i].setActionCommand("final");	
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
		bG.add(op[i]);
		panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		////////////////////////////
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("7.Which of these method of class String is used to extract a single character from a String object?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("charAt()");
		op[1] = new JRadioButton("CHARAT()");
		op[2] = new JRadioButton("CharAt()");
		op[3] = new JRadioButton("character()");
		
		for(int i = 0; i < 4; i++) {
		op[i].addActionListener(this);
		op[i].setActionCommand("charAt()");
		
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
		bG.add(op[i]);
		panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		////////////////////////////

		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("8.Thread priority in Java is?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("int");
		op[1] = new JRadioButton("float");
		op[2] = new JRadioButton("boolean");
		op[3] = new JRadioButton("double");
		
		for(int i = 0; i < 4; i++) {
		op[i].addActionListener(this);
		op[i].setActionCommand("int");
		
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
		bG.add(op[i]);
		panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		////////////////////////////

		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("9.What requires less resources?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("Process");
		op[1] = new JRadioButton("Thread");
		op[2] = new JRadioButton("Both same");
		op[3] = new JRadioButton("None");
		
		for(int i = 0; i < 4; i++) {
		op[i].addActionListener(this);
		op[i].setActionCommand("Thread");
		
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
		bG.add(op[i]);
		panel.add(op[i]);
		}
		mainPanel.add(panel);
		//frame.add(panel);
		
		////////////////////////////
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		q1 = new JLabel("10.If a class inheriting an abstract class does not define all of its function then it will be known as?");
		q1.setFont(new Font("Arial Unicode MS", Font.BOLD,14));
		op = new JRadioButton[4];
		op[0] = new JRadioButton("simple");
		op[1] = new JRadioButton("abstract");
		op[2] = new JRadioButton("interface");
		op[3] = new JRadioButton("static");
		
		for(int i = 0; i < 4; i++) {
		op[i].addActionListener(this);
		op[i].setActionCommand("abstract");
		
		}
		
		
		bG = new ButtonGroup();
		
		panel.add(q1);
		
		for(int i=0; i < 4; i++) {
		bG.add(op[i]);
		panel.add(op[i]);
		}
		
		//frame.add(panel);
		mainPanel.add(panel);
		////////////////////////////
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton submit =  new JButton("Submit");
		JButton cancel = new JButton("Cancel");
		submit.setActionCommand("Submit");
		submit.addActionListener(this);
		cancel.addActionListener(this);
		panel.add(submit);
		panel.add(cancel);
		
		mainPanel.add(panel);
		
		JScrollPane scrollPane = new JScrollPane(mainPanel,   ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPane.setPreferredSize(new Dimension(600, 600));
		
		frame.add(scrollPane);
		
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Submit")) {
			JOptionPane.showMessageDialog(null,"Correct answers : "+correctCount );
			JButton submit = (JButton)e.getSource();
			submit.setEnabled(false);
			return;
		}
		else if(e.getActionCommand().equals("Cancel")) {
			frame.dispose();
			return;
		}
		JRadioButton btn = (JRadioButton)e.getSource();
		if(e.getActionCommand().equals(btn.getText()) && btn.isSelected()) {
				correctCount++;
		}
	
	}
	public static void main(String [] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e) {
			//i won't handle it;)
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new QuizGUI();
			}
		});
		
	}
	

}
