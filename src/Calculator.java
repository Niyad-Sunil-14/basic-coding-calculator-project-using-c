import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	boolean isOperatorClicked =false;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton equalButton;
	JButton zeroButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	double num1=0,num2=0,result=0;
	char operator;
	
	
	public Calculator() {
		jf=new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(800,760);
		jf.setLocation(360,40);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(43, 50, 700, 60);
		jf.add(displayLabel);
		displayLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.BLACK);
		displayLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		displayLabel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(4.0f)));
		

		sevenButton=new JButton("7");
		sevenButton.setBounds(70, 150, 100, 100);
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		sevenButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		eightButton=new JButton("8");
		eightButton.setBounds(220, 150, 100, 100);
		jf.add(eightButton);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		eightButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		nineButton=new JButton("9");
		nineButton.setBounds(370, 150, 100, 100);
		jf.add(nineButton);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		nineButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		fourButton=new JButton("4");
		fourButton.setBounds(70, 280, 100, 100);
		jf.add(fourButton);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		fourButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(220, 280, 100, 100);
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		fiveButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		sixButton=new JButton("6");
		sixButton.setBounds(370, 280, 100, 100);
		jf.add(sixButton);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		sixButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		oneButton=new JButton("1");
		oneButton.setBounds(70, 410, 100, 100);
		jf.add(oneButton);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		oneButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		twoButton=new JButton("2");
		twoButton.setBounds(220, 410, 100, 100);
		jf.add(twoButton);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		twoButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		threeButton=new JButton("3");
		threeButton.setBounds(370, 410, 100, 100);
		jf.add(threeButton);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		threeButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(220, 540, 100, 100);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		zeroButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		dotButton=new JButton(".");
		dotButton.setBounds(70, 540, 100, 100);
		jf.add(dotButton);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		dotButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		equalButton=new JButton("=");
		equalButton.setBounds(370, 540, 100, 100);
		jf.add(equalButton);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		equalButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		divButton=new JButton("/");
		divButton.setBounds(520, 150, 100, 100);
		jf.add(divButton);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		divButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		mulButton=new JButton("x");
		mulButton.setBounds(520, 280, 100, 100);
		jf.add(mulButton);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		mulButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		minusButton=new JButton("-");
		minusButton.setBounds(520, 410, 100, 100);
		jf.add(minusButton);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		minusButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		plusButton=new JButton("+");
		plusButton.setBounds(520, 540, 100, 100);
		jf.add(plusButton);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 30));
		plusButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(650, 565, 80,50);
		jf.add(clearButton);
		clearButton.addActionListener(this);
		clearButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	}
public static void main(String args[]) {
	new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenButton)
	{
		if(isOperatorClicked) {
		displayLabel.setText("7");
		isOperatorClicked=false;
	}
		else {
			displayLabel.setText(displayLabel.getText()+"7");
		}
	}
	else if(e.getSource()==eightButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
	}
	else if(e.getSource()==nineButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
	}
	else if(e.getSource()==fourButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
	}
	else if(e.getSource()==fiveButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
	}
	else if(e.getSource()==sixButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
	}
	else if(e.getSource()==oneButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
	}
	else if(e.getSource()==twoButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
	}
	else if(e.getSource()==threeButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
	}
	else if(e.getSource()==zeroButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
	}
	else if(e.getSource()==dotButton)
	{
		if(isOperatorClicked) {
			displayLabel.setText(".");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+".");
			}
	}
	else if(e.getSource()==equalButton)
	{
		num2=Double.parseDouble(displayLabel.getText());
		
		switch(operator) {
		case'+':result=num1+num2;
		break;
		
		case'-':result=num1-num2;
		break;
		case'/':result=num1/num2;
		break;
		case'*':result=num1*num2;
		break;
		}
		displayLabel.setText(String.valueOf(result));
		num1=result;
	}
	else if(e.getSource()==divButton)
	{
		num1=Double.parseDouble(displayLabel.getText());
		operator='/';
		displayLabel.setText("");
	}
	else if(e.getSource()==mulButton)
	{
		num1=Double.parseDouble(displayLabel.getText());
		operator='*';
		displayLabel.setText("");
	}
	else if(e.getSource()==minusButton)
	{
		num1=Double.parseDouble(displayLabel.getText());
		operator='-';
		displayLabel.setText("");
	}
	else if(e.getSource()==plusButton)
	{
		num1=Double.parseDouble(displayLabel.getText());
		operator='+';
		displayLabel.setText("");
	}
	else if(e.getSource()==clearButton)
	{
		displayLabel.setText("");
	}
}
}









