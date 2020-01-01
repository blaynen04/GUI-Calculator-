import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Label;

public class Frame1 extends JFrame {

	private JPanel Calculator;

	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		double number, answer, preResult;
		int formulaIndex;
		private JTextField Screen;
		private JTextField FormulaBar;
		
		// Method for all arithmetic operations 
		public void arithmetic_operation() {
			switch (formulaIndex)
			{	
				// Addition
				case 1:
					preResult = Double.parseDouble(Screen.getText());
					answer = number + Double.parseDouble(Screen.getText());
					Screen.setText(Double.toString(answer));
					FormulaBar.setText(number + " + " + preResult);
					break;
				
				// Subtraction
				case 2:
					preResult = Double.parseDouble(Screen.getText());
					answer = number - Double.parseDouble(Screen.getText());
					Screen.setText(Double.toString(answer));
					FormulaBar.setText(number + " - " + preResult);
					break;
					
				// Multiplication
				case 3:
					preResult = Double.parseDouble(Screen.getText());
					answer = number * Double.parseDouble(Screen.getText());
					Screen.setText(Double.toString(answer));
					FormulaBar.setText(number + " x " + preResult);
					break;
					
				// Division
				case 4:
					preResult = Double.parseDouble(Screen.getText());
					answer = number / Double.parseDouble(Screen.getText());
					Screen.setText(Double.toString(answer));
					FormulaBar.setText(number + " / " + preResult);
					break;
				
				// Sine
				case 5:
					number = Double.parseDouble(Screen.getText());
					answer = Math.sin(Math.toRadians(Double.parseDouble(Screen.getText())));
					Screen.setText(Double.toString(answer));
					FormulaBar.setText("sin " + number);
					break;
				
				// Cosine
				case 6:
					number = Double.parseDouble(Screen.getText());
					answer = Math.cos(Math.toRadians(Double.parseDouble(Screen.getText())));
					Screen.setText(Double.toString(answer));
					FormulaBar.setText("cos " + number);
					break;
				
				// Tangent
				case 7:
					number = Double.parseDouble(Screen.getText());
					answer = Math.tan(Math.toRadians(Double.parseDouble(Screen.getText())));
					Screen.setText(Double.toString(answer));
					FormulaBar.setText("tan " + number);
					break;
				
				// Square root
				case 8:
					number = Double.parseDouble(Screen.getText());
					answer = Math.sqrt(number);
					Screen.setText(Double.toString(answer));
					FormulaBar.setText("\u221A" + number);
					break;
				
				// Default decision if none of the above cases are met
				default: 
					String valueAsIs = Screen.getText();
					Screen.setText(valueAsIs);
					FormulaBar.setText(valueAsIs + " = ");
					break;
			}
		}
		
	public Frame1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/img/Logo.png")));
		setResizable(false);
	
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 653);
		Calculator = new JPanel();
		Calculator.setBackground(Color.LIGHT_GRAY);
		setContentPane(Calculator);
		Calculator.setLayout(null);
		
		JPanel Results = new JPanel();
		Results.setBounds(10, 10, 462, 125);
		Results.setBackground(Color.DARK_GRAY);
		Calculator.add(Results);
		Results.setLayout(null);
		
		Screen = new JTextField();
		Screen.setEditable(false);
		Screen.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 35));
		Screen.setBounds(10, 42, 442, 73);
		Results.add(Screen);
		Screen.setColumns(10);
		
		FormulaBar = new JTextField();
		FormulaBar.setForeground(Color.RED);
		FormulaBar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		FormulaBar.setHorizontalAlignment(SwingConstants.RIGHT);
		FormulaBar.setEditable(false);
		FormulaBar.setBounds(10, 10, 442, 22);
		Results.add(FormulaBar);
		FormulaBar.setColumns(10);
		
		JPanel Body = new JPanel();
		Body.setBounds(10, 145, 462, 453);
		Body.setBackground(Color.DARK_GRAY);
		Calculator.add(Body);
		Body.setLayout(null);
		setUndecorated(false);
		
		
		
		// Code for clear button
		Button Clear = new Button("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText("");
				FormulaBar.setText("");
			}
		});
		Clear.setBackground(Color.ORANGE);
		Clear.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Clear.setBounds(10, 10, 149, 55);
		Body.add(Clear);
		
		Button Three = new Button("3");
		Three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "3");
			}
		});
		Three.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Three.setBackground(Color.ORANGE);
		Three.setBounds(253, 152, 80, 55);
		Body.add(Three);
		
		Button One = new Button("1");
		One.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "1");
			}
		});
		One.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		One.setBackground(Color.ORANGE);
		One.setBounds(10, 152, 80, 55);
		Body.add(One);
		
		Button Two = new Button("2");
		Two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "2");
			}
		});
		Two.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Two.setBackground(Color.ORANGE);
		Two.setBounds(131, 152, 80, 55);
		Body.add(Two);
		
		Button Division = new Button("\u00F7");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Screen.getText());
				formulaIndex = 4;
				Screen.setText("");
				FormulaBar.setText(number + " / ");
			}
		});
		Division.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Division.setBackground(Color.ORANGE);
		Division.setBounds(372, 81, 80, 55);
		Body.add(Division);
		
		Button Seven = new Button("7");
		Seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "7");
			}
		});
		Seven.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Seven.setBackground(Color.ORANGE);
		Seven.setBounds(10, 294, 80, 55);
		Body.add(Seven);
		
		Button Four = new Button("4");
		Four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "4");
			}
		});
		Four.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Four.setBackground(Color.ORANGE);
		Four.setBounds(10, 223, 80, 55);
		Body.add(Four);
		
		Button Five = new Button("5");
		Five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "5");
			}
		});
		Five.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Five.setBackground(Color.ORANGE);
		Five.setBounds(131, 223, 80, 55);
		Body.add(Five);
		
		Button Eight = new Button("8");
		Eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "8");
			}
		});
		Eight.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Eight.setBackground(Color.ORANGE);
		Eight.setBounds(131, 294, 80, 55);
		Body.add(Eight);
		
		Button Nine = new Button("9");
		Nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "9");
			}
		});
		Nine.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Nine.setBackground(Color.ORANGE);
		Nine.setBounds(253, 294, 80, 55);
		Body.add(Nine);
		
		Button Six = new Button("6");
		Six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "6");
			}
		});
		Six.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Six.setBackground(Color.ORANGE);
		Six.setBounds(253, 223, 80, 55);
		Body.add(Six);
		
		Button Multiplication = new Button("\u00D7");
		Multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Screen.getText());
				formulaIndex = 3;
				Screen.setText("");
				FormulaBar.setText(number + " x ");
			}
		});
		Multiplication.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Multiplication.setBackground(Color.ORANGE);
		Multiplication.setBounds(372, 152, 80, 55);
		Body.add(Multiplication);
		
		Button Addition = new Button("+");
		Addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Screen.getText());
				formulaIndex = 1;
				Screen.setText("");
				FormulaBar.setText(number + " + ");
				
			}
		});
		Addition.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Addition.setBackground(Color.ORANGE);
		Addition.setBounds(372, 223, 80, 55);
		Body.add(Addition);
		
		Button Point = new Button(".");
		Point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + ".");
			}
		});
		Point.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Point.setBackground(Color.ORANGE);
		Point.setBounds(10, 366, 80, 55);
		Body.add(Point);
		
		Button Zero = new Button("0");
		Zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(Screen.getText() + "0");
			}
		});
		Zero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Zero.setBackground(Color.ORANGE);
		Zero.setBounds(131, 366, 80, 55);
		Body.add(Zero);
		
		Button Equals = new Button("=");
		Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				// FormulaBar.setText("");
			}
		});
		Equals.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Equals.setBackground(Color.ORANGE);
		Equals.setBounds(253, 366, 199, 68);
		Body.add(Equals);
		
		Button Subtraction = new Button("-");
		Subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Screen.getText());
				formulaIndex = 2;
				Screen.setText("");
				FormulaBar.setText(number + " - ");
			}
		});
		Subtraction.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Subtraction.setBackground(Color.ORANGE);
		Subtraction.setBounds(372, 295, 80, 55);
		Body.add(Subtraction);
		
		// Code for sin button
		Button Sin = new Button("sin");
		Sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaIndex = 5;
				FormulaBar.setText("sin ");
			}
		});
		Sin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Sin.setBackground(Color.ORANGE);
		Sin.setBounds(372, 10, 80, 55);
		Body.add(Sin);
		
		// Code for backspace button
		Button Backspace = new Button("Back");
		Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length = Screen.getText().length();
				int number = Screen.getText().length() - 1;
				String store;
				
				if (length > 0)
				{
					StringBuilder backspace = new StringBuilder(Screen.getText());	// Create String Builder to store current text in Screen
					backspace.deleteCharAt(number);	
					store = backspace.toString();	
					Screen.setText(store);	// Displays backspaced string on screen
				}
			}
		});
		Backspace.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Backspace.setBackground(Color.ORANGE);
		Backspace.setBounds(181, 10, 152, 55);
		Body.add(Backspace);
		
		Button Root = new Button("\u221A");
		Root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaIndex = 8;
				FormulaBar.setText("\u221A");
			}
		});
		Root.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Root.setBackground(Color.ORANGE);
		Root.setBounds(10, 81, 80, 55);
		Body.add(Root);
		
		Button Cos = new Button("cos");
		Cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaIndex = 6;
				FormulaBar.setText("cos ");
			}
		});
		Cos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Cos.setBackground(Color.ORANGE);
		Cos.setBounds(131, 81, 80, 55);
		Body.add(Cos);
		
		Button Tan = new Button("tan");
		Tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaIndex = 7;
				FormulaBar.setText("tan ");
			}
		});
		Tan.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Tan.setBackground(Color.ORANGE);
		Tan.setBounds(253, 81, 80, 55);
		Body.add(Tan);
	}
}
