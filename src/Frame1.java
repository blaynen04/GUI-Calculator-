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

	// Creates the frame 
	public Frame1() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 663);
		Calculator = new JPanel();
		Calculator.setBackground(Color.LIGHT_GRAY);
		setContentPane(Calculator);
		Calculator.setLayout(null);
		
		JPanel Results = new JPanel();
		Results.setBounds(10, 47, 462, 125);
		Results.setBackground(Color.DARK_GRAY);
		Calculator.add(Results);
		Results.setLayout(null);
		
		TextField Screen = new TextField();
		Screen.setEditable(false);
		Screen.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 35));
		Screen.setBounds(10, 10, 442, 105);
		Results.add(Screen);
		
		JPanel Body = new JPanel();
		Body.setBounds(10, 182, 462, 471);
		Body.setBackground(Color.DARK_GRAY);
		Calculator.add(Body);
		Body.setLayout(null);
		setUndecorated(true);
		
		// Attributes for "1" button 
		Button Clear = new Button("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Clear.setBackground(Color.ORANGE);
		Clear.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Clear.setBounds(10, 10, 149, 55);
		Body.add(Clear);
		
		Button Three = new Button("3");
		Three.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Three.setBackground(Color.ORANGE);
		Three.setBounds(253, 152, 80, 55);
		Body.add(Three);
		
		Button One = new Button("1");
		One.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		One.setBackground(Color.ORANGE);
		One.setBounds(10, 152, 80, 55);
		Body.add(One);
		
		Button Two = new Button("2");
		Two.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Two.setBackground(Color.ORANGE);
		Two.setBounds(131, 152, 80, 55);
		Body.add(Two);
		
		Button Division = new Button("\u00F7");
		Division.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Division.setBackground(Color.ORANGE);
		Division.setBounds(372, 81, 80, 55);
		Body.add(Division);
		
		Button Seven = new Button("7");
		Seven.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Seven.setBackground(Color.ORANGE);
		Seven.setBounds(10, 294, 80, 55);
		Body.add(Seven);
		
		Button Four = new Button("4");
		Four.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Four.setBackground(Color.ORANGE);
		Four.setBounds(10, 223, 80, 55);
		Body.add(Four);
		
		Button Five = new Button("5");
		Five.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Five.setBackground(Color.ORANGE);
		Five.setBounds(131, 223, 80, 55);
		Body.add(Five);
		
		Button Eight = new Button("8");
		Eight.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Eight.setBackground(Color.ORANGE);
		Eight.setBounds(131, 294, 80, 55);
		Body.add(Eight);
		
		Button Nine = new Button("9");
		Nine.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Nine.setBackground(Color.ORANGE);
		Nine.setBounds(253, 294, 80, 55);
		Body.add(Nine);
		
		Button Six = new Button("6");
		Six.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Six.setBackground(Color.ORANGE);
		Six.setBounds(253, 223, 80, 55);
		Body.add(Six);
		
		Button Multiplication = new Button("\u00D7");
		Multiplication.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Multiplication.setBackground(Color.ORANGE);
		Multiplication.setBounds(372, 152, 80, 55);
		Body.add(Multiplication);
		
		Button Addition = new Button("+");
		Addition.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Addition.setBackground(Color.ORANGE);
		Addition.setBounds(372, 223, 80, 55);
		Body.add(Addition);
		
		Button Point = new Button(".");
		Point.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Point.setBackground(Color.ORANGE);
		Point.setBounds(10, 366, 80, 55);
		Body.add(Point);
		
		Button Zero = new Button("0");
		Zero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Zero.setBackground(Color.ORANGE);
		Zero.setBounds(131, 366, 80, 55);
		Body.add(Zero);
		
		Button Equals = new Button("=");
		Equals.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Equals.setBackground(Color.ORANGE);
		Equals.setBounds(253, 366, 199, 68);
		Body.add(Equals);
		
		Button Subtraction = new Button("-");
		Subtraction.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Subtraction.setBackground(Color.ORANGE);
		Subtraction.setBounds(372, 295, 80, 55);
		Body.add(Subtraction);
		
		Button Sin = new Button("sin");
		Sin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Sin.setBackground(Color.ORANGE);
		Sin.setBounds(372, 10, 80, 55);
		Body.add(Sin);
		
		Button Backspace = new Button("Back");
		Backspace.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Backspace.setBackground(Color.ORANGE);
		Backspace.setBounds(181, 10, 152, 55);
		Body.add(Backspace);
		
		Button Root = new Button("\u221A");
		Root.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Root.setBackground(Color.ORANGE);
		Root.setBounds(10, 81, 80, 55);
		Body.add(Root);
		
		Button Cos = new Button("cos");
		Cos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Cos.setBackground(Color.ORANGE);
		Cos.setBounds(131, 81, 80, 55);
		Body.add(Cos);
		
		Button Tan = new Button("tan");
		Tan.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		Tan.setBackground(Color.ORANGE);
		Tan.setBounds(253, 81, 80, 55);
		Body.add(Tan);
		
		Button exitApp = new Button("X");
		exitApp.setBounds(441, 10, 31, 31);
		exitApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitApp.setForeground(Color.BLACK);
		exitApp.setBackground(Color.ORANGE);
		exitApp.setFont(new Font("Dialog", Font.PLAIN, 14));
		Calculator.add(exitApp);
		
		Button Maximize = new Button("[ ]");
		Maximize.setBounds(404, 10, 31, 31);
		Maximize.setEnabled(false);
		Maximize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Maximize.setForeground(Color.BLACK);
		Maximize.setFont(new Font("Dialog", Font.PLAIN, 14));
		Maximize.setBackground(Color.ORANGE);
		Calculator.add(Maximize);
		
		// Code for Minimize button
		Button Minimize = new Button("_");
		Minimize.setBounds(367, 10, 31, 31);
		Minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 frame = new Frame1();
				frame.setVisible(true);
				frame.setExtendedState(JFrame.ICONIFIED);
			}
		});
		Minimize.setForeground(Color.BLACK);
		Minimize.setFont(new Font("Dialog", Font.PLAIN, 14));
		Minimize.setBackground(Color.ORANGE);
		Calculator.add(Minimize);
		
		
	}
}
