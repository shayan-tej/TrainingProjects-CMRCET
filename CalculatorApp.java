import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
 
public class CalculatorApp extends JFrame implements ActionListener { 
	static JFrame f;
   	static JTextField l;
   	String string0, string1, string2;

   	CalculatorApp() {
       	string0 = string1 = string2 = "";
	}

   	public static void main(String args[]) {
		f = new JFrame("Calculator");

        try {
        	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       	} catch (Exception e) {
        	System.err.println(e.getMessage());
		}

       	CalculatorApp c = new CalculatorApp();

       	l = new JTextField(19);
       	l.setEditable(false);

       	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSubs, buttonDivide, buttonMulti, be, beq, beq1;

       	button0 = new JButton("0");
       	button0.setPreferredSize( new Dimension (40,30));
		button1 = new JButton("1");
		button1.setPreferredSize( new Dimension (40,30));
		button2 = new JButton("2");
		button2.setPreferredSize( new Dimension (40,30));
		button3 = new JButton("3");
		button3.setPreferredSize( new Dimension (40,30));
		button4 = new JButton("4");
		button4.setPreferredSize( new Dimension (40,30));
		button5 = new JButton("5");
		button5.setPreferredSize( new Dimension (40,30));
		button6 = new JButton("6");
		button6.setPreferredSize( new Dimension (40,30));
		button7 = new JButton("7");
		button7.setPreferredSize( new Dimension (40,30));
		button8 = new JButton("8");
		button8.setPreferredSize( new Dimension (40,30));
		button9 = new JButton("9");
		button9.setPreferredSize( new Dimension (40,30));

		beq1 = new JButton("=");
		beq1.setPreferredSize( new Dimension (40,30));

		buttonAdd = new JButton("+");
		buttonAdd.setPreferredSize( new Dimension (40,30));
		buttonSubs = new JButton("-");
		buttonSubs.setPreferredSize( new Dimension (40,30));
		buttonDivide = new JButton("/");
		buttonDivide.setPreferredSize( new Dimension (40,30));
		buttonMulti = new JButton("*");
		buttonMulti.setPreferredSize( new Dimension (40,30));
		beq = new JButton("C");
		beq.setPreferredSize( new Dimension (40,30));

		be = new JButton(".");
		be.setPreferredSize( new Dimension (40,30));

		JPanel p = new JPanel();

		buttonMulti.addActionListener(c);
		buttonDivide.addActionListener(c);
		buttonSubs.addActionListener(c);
		buttonAdd.addActionListener(c);
		button9.addActionListener(c);
		button8.addActionListener(c);
		button7.addActionListener(c);
		button6.addActionListener(c);
		button5.addActionListener(c);
		button4.addActionListener(c);
		button3.addActionListener(c);
		button2.addActionListener(c);
		button1.addActionListener(c);
		button0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);

		p.add(l);
		p.add(buttonAdd);
		p.add(button1);
		p.add(button2);
		p.add(button3);
		p.add(buttonSubs);
		p.add(button4);
		p.add(button5);
		p.add(button6);
		p.add(buttonMulti);
		p.add(button7);
		p.add(button8);
		p.add(button9);
		p.add(buttonDivide);
		p.add(be);
		p.add(button0);
		p.add(beq);
		p.add(beq1);

		p.setBackground(Color.white);

		f.add(p);

		f.setSize(220, 250);
		f.show();
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();

		if ((str.charAt(0) >= '0' && str.charAt(0) <= '9') || str.charAt(0) == '.') {
			if (!string1.equals(""))
				string2 = string2 + str;
			else
				string0 = string0 + str;

			l.setText(string0 + string1 + string2);
		} else if (str.charAt(0) == 'C') {
			string0 = string1 = string2 = "";
			l.setText(string0 + string1 + string2);
		} else if (str.charAt(0) == '=') {
			double ans;
			if (string1.equals("+"))
				ans = (Double.parseDouble(string0) + Double.parseDouble(string2));
			else if (string1.equals("-"))
				ans = (Double.parseDouble(string0) - Double.parseDouble(string2));
			else if (string1.equals("/"))
				ans = (Double.parseDouble(string0) / Double.parseDouble(string2));
			else
				ans = (Double.parseDouble(string0) * Double.parseDouble(string2));

			l.setText(string0 + string1 + string2 + "=" + ans);
	
			string0 = Double.toString(ans);

			string1 = string2 = "";
		} else {
			if (string1.equals("") || string2.equals(""))
				string1 = str;
			else {
				double ans;
				if (string1.equals("+"))
					ans = (Double.parseDouble(string0) + Double.parseDouble(string2));
				else if (string1.equals("-"))
					ans = (Double.parseDouble(string0) - Double.parseDouble(string2));
				else if (string1.equals("/"))
					ans = (Double.parseDouble(string0) / Double.parseDouble(string2));
				else
					ans = (Double.parseDouble(string0) * Double.parseDouble(string2));

				string0 = Double.toString(ans);
				string1 = str;
				string2 = "";
			}
			l.setText(string0 + string1 + string2);
		}
	}
}