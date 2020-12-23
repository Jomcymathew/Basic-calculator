import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorCliked=false;
	String oldValue;
	String newValue;
	String option;
	String addValue;
	
	
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton,eightbutton,ninebutton,fourbutton,fivebutton,clearbutton,multiplicationbutton;
	JButton sixbutton,onebutton,twobutton,threebutton,zerobutton,decimalbutton,divisonbutton;
	JButton equalbutton,minusbutton,plusbutton;
	
	//FRAME CREATION
	
	
	Calculator(){
		jf=new JFrame("Calculator");
		jf.setSize(500,450);
		jf.setLayout(null);
		jf.setLocation(250,150);
		
		//FRAME CREATION
		
		displaylabel=new JLabel();
		displaylabel.setFont(displaylabel.getFont().deriveFont(100));
		
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setBounds(20,30,450,50);
		displaylabel.setBackground(Color.PINK);
		displaylabel.setOpaque(true);
		displaylabel.setForeground(Color.black);
		jf.add(displaylabel);
		
		//BUTTON SETTING
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(40,100,70,60);
		sevenbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(125,100,70,60);
		eightbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(210,100,70,60);
		ninebutton.setFont(new Font("Arial", Font. PLAIN, 30));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(40,180,70,60);
		fourbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(125,180,70,60);
		fivebutton.setFont(new Font("Arial", Font. PLAIN, 30));
		fivebutton.addActionListener(this);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(210,180,70,60);
		sixbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(40,260,70,60);
		onebutton.setFont(new Font("Arial", Font. PLAIN, 30));
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(125,260,70,60);
		twobutton.setFont(new Font("Arial", Font. PLAIN, 30));
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(210,260,70,60);
		threebutton.setFont(new Font("Arial", Font. PLAIN, 30));
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(125,340,70,60);
		zerobutton.setFont(new Font("Arial", Font. PLAIN, 30));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
		decimalbutton=new JButton(".");
		decimalbutton.setBounds(210,340,70,60);
		decimalbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		decimalbutton.addActionListener(this);
		jf.add(decimalbutton);
		
		clearbutton=new JButton("CLR");
		clearbutton.setBounds(40,340,70,60);
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		divisonbutton=new JButton("/");
		divisonbutton.setBounds(400,100,70,60);
		divisonbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		divisonbutton.addActionListener(this);
		jf.add(divisonbutton);
		
		multiplicationbutton=new JButton("X");
		multiplicationbutton.setBounds(400,180,70,60);
		multiplicationbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		multiplicationbutton.addActionListener(this);
		jf.add(multiplicationbutton);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(300,180,70,60);
		equalbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		equalbutton.addActionListener(this);
		jf.add(equalbutton);
		
		minusbutton=new JButton("-");
		minusbutton.setBounds(400,260,70,60);
		minusbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		minusbutton.addActionListener(this);
		jf.add(minusbutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(400,340,70,60);
		plusbutton.setFont(new Font("Arial", Font. PLAIN, 30));
		plusbutton.addActionListener(this);
		jf.add(plusbutton);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			if(isOperatorCliked) {
				displaylabel.setText("7");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightbutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("8");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"8");
			}
		}
		else if(e.getSource()==ninebutton) {
			if(isOperatorCliked) {
				displaylabel.setText("9");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"9");
			}
		}
		else if(e.getSource()==fourbutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("4");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"4");
			}
		}
		else if(e.getSource()==fivebutton) {
			if(isOperatorCliked) {
				displaylabel.setText("5");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixbutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("6");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"6");
			}
		}
		else if(e.getSource()==onebutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("1");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"1");
			}
		}
		else if(e.getSource()==twobutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("2");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"2");
			}
		}
		else if(e.getSource()==threebutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("3");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"3");
			}
		}
		else if(e.getSource()==zerobutton) {
			
			if(isOperatorCliked) {
				displaylabel.setText("0");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"0");
			}
		}
		else if(e.getSource()==decimalbutton) {
			if(isOperatorCliked) {
				displaylabel.setText(".");
				isOperatorCliked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+".");
			}
		}
		else if(e.getSource()==clearbutton) {
			
			displaylabel.setText("");	
		}
		
		// ARITHMETIC OPERATIONS 
		
		
		else if(e.getSource()==plusbutton) {
			option="plus";
			isOperatorCliked=true;
			oldValue=displaylabel.getText();

		}
		else if(e.getSource()==minusbutton) {
			option="minus";
			isOperatorCliked=true;
			oldValue=displaylabel.getText();
		}
		else if(e.getSource()==multiplicationbutton) {
			option="multiply";
			isOperatorCliked=true;
			oldValue=displaylabel.getText();
		}
		else if(e.getSource()==divisonbutton) {
			option="division";
			isOperatorCliked=true;
			oldValue=displaylabel.getText();
		}
		
		//Result
		
		else if(e.getSource()==equalbutton) {

			newValue=displaylabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			if(option=="plus") {
			sum(oldValueF,newValueF);
			}
			else if (option=="minus") {
				sub(oldValueF,newValueF);
			}
			else if(option=="multiply") {
				mul(oldValueF,newValueF);
			}
			else if(option=="division") {
				div(oldValueF,newValueF);
			}
			
		}
		
	}
		void sum(float num1,float num2) {
		float result=num1+num2;
		displaylabel.setText(result+"");
		oldValue=null;
		newValue=null;
		isOperatorCliked=true;
		oldValue=displaylabel.getText();
		}
		void sub(float num1,float num2) {
		float result=num1-num2;
		displaylabel.setText(result+"");
		oldValue=null;
		newValue=null;
		isOperatorCliked=true;
		oldValue=displaylabel.getText();
		}
		void mul(float num1,float num2) {
		float result=num1*num2;
		displaylabel.setText(result+"");
		oldValue=null;
		newValue=null;
		isOperatorCliked=true;
		oldValue=displaylabel.getText();
		}
		void div(float num1,float num2) {
		float result=num1/num2;
		displaylabel.setText(result+"");
		oldValue=null;
		newValue=null;
		isOperatorCliked=true;
		oldValue=displaylabel.getText();
		}
}
