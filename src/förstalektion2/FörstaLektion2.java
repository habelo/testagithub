package f�rstalektion2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class F�rstaLektion2 extends JFrame{
	public static void main(String[] args) {
		F�rstaLektion2 start = new F�rstaLektion2();
		
	}
	public F�rstaLektion2(){
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		

		setLayout(new GridLayout(3, 2));
		this.add(new JLabel("Namn:"));
		this.add(t1);
		this.add(new JLabel("Vikt:"));
		this.add(t2);
		this.add(new JLabel("L�ngd:"));
		this.add(t3);
		
		String namn= t1.getText();
		String vikt= t2.getText();
		String l�ngd= t3.getText();
		
		
		this.setSize(500,100);
		this.setLocation(200, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		System.out.println("hej"+namn);
	}
	//hejsan svejsan
}
