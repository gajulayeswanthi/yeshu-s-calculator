package com.yeswanthi.standaloneApp.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel result;
	private JButton bt3;
	private JTextField a;
	private JTextField b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		result = new JPanel();
		result.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(result);
		result.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yeshu's calculator");
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setForeground(new Color(128, 64, 0));
		lblNewLabel.setBounds(118, 11, 227, 31);
		result.add(lblNewLabel);
		
		JTextArea answer = new JTextArea();
		answer.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		answer.setForeground(new Color(64, 128, 128));
		answer.setBounds(52, 207, 329, 43);
		result.add(answer);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(21, 214, 24, 12);
		result.add(lblNewLabel_2);
		
		JButton bt1 = new JButton("+");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String num1=a.getText();
			 String num2=b.getText();
			 int n1=Integer.parseInt(num1);
			 int n2=Integer.parseInt(num2);
			 int res=n1+n2;
			 answer.setText("Addition: "+ res);
			}
		});
		bt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt1.setBounds(262, 53, 55, 40);
		result.add(bt1);
		
		JButton bt2 = new JButton("-");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=a.getText();
				String num2=b.getText();
				int n1=Integer.parseInt(num1);
				int n2=Integer.parseInt(num2);
				int res=n1-n2;
				answer.setText("Subtraction: " + res);
			}
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt2.setBounds(353, 53, 55, 40);
		result.add(bt2);
		
		bt3 = new JButton("*");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=a.getText();
				String num2=b.getText();
				int n1=Integer.parseInt(num1);
				int n2=Integer.parseInt(num2);
				int res=n1*n2;
				answer.setText("Multiplication: " + res);
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt3.setBounds(262, 104, 55, 40);
		result.add(bt3);
		
		JButton bt4 = new JButton("/");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=a.getText();
				String num2=b.getText();
				int n1=Integer.parseInt(num1);
				int n2=Integer.parseInt(num2);
				int res=n1 / n2;
				answer.setText("Division: " + res);
			}
		});
		bt4.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt4.setBounds(353, 104, 55, 40);
		result.add(bt4);
		
		JButton bt5 = new JButton("^");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=a.getText();
				String num2=b.getText();
				int n1=Integer.parseInt(num1);
				int n2=Integer.parseInt(num2);
				int res=(int)Math.pow(n1, n2);
				answer.setText("Square: " + res);
			}
		});
		bt5.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt5.setBounds(262, 155, 55, 43);
		result.add(bt5);
		
		JButton bt6 = new JButton("%");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=a.getText();
				String num2=b.getText();
				int n1=Integer.parseInt(num1);
				int n2=Integer.parseInt(num2);
				int res=n1%n2;
				answer.setText("Modulus: " + res);
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 16));
		bt6.setBounds(353, 155, 55, 46);
		result.add(bt6);
		
		JLabel lblNewLabel_1 = new JLabel("Num-1");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(21, 84, 72, 22);
		result.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Num-2");
		lblNewLabel_3.setForeground(new Color(255, 0, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(21, 130, 78, 22);
		result.add(lblNewLabel_3);
		
		a = new JTextField();
		a.setBounds(128, 84, 86, 31);
		result.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(128, 134, 86, 32);
		result.add(b);
		b.setColumns(10);
		
		JList list = new JList();
		list.setBounds(90, 195, 1, 1);
		result.add(list);
		
	} 
}
