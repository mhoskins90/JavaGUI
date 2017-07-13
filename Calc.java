import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Calc{
	JFrame frame = new JFrame();
	Container frameContentPane = frame.getContentPane();
	GridBagConstraints frameConstraint = new GridBagConstraints();
	GridBagLayout layoutType1 = new GridBagLayout();
	
	public Calc(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(900, 600);
	frame.setLocationRelativeTo(null);//CENTER

	frameContentPane.setLayout(layoutType1);
	frameContentPane.setBackground(Color.BLACK);

	JLabel titleLabel = new JLabel("<html><font color=\"#ffffff\">Calculator</font></html>");
	titleLabel.setFont(titleLabel.getFont().deriveFont(64.0f));
	frameContentPane.add(titleLabel);//----------------------ADD
	
	frameConstraint.insets = new Insets(0, 0, 0, 0);//TOP | LEFT | BOTTOM | RIGHT

	JPanel buttonPanel = new JPanel();
	buttonPanel.setMinimumSize(new Dimension(400,450));
	buttonPanel.setPreferredSize(new Dimension(400,450));
	buttonPanel.setMaximumSize(new Dimension(400,450));

	JPanel answerRow = new JPanel();
	JLabel answer = new JLabel("---");
	answer.setFont(answer.getFont().deriveFont(48.0f));
	answerRow.setBackground(Color.WHITE);
	answerRow.setMinimumSize(new Dimension(400,70));
	answerRow.setPreferredSize(new Dimension(400, 70));
	answerRow.setMaximumSize(new Dimension(400,70));
	
	answerRow.add(answer);
	buttonPanel.add(answerRow);//---------------------------ADD

	JPanel topRow = new JPanel();
	topRow.setLayout(new GridLayout(0,4));
	topRow.setBackground(Color.GRAY);
	topRow.setMinimumSize(new Dimension(400,32));
	topRow.setPreferredSize(new Dimension(400, 32));
	topRow.setMaximumSize(new Dimension(400,32));
	JButton seven = new JButton("7");
	seven.setMinimumSize(new Dimension(80,25));
	seven.setPreferredSize(new Dimension(80,25));
	seven.setMaximumSize(new Dimension(80,25));
	seven.setFocusPainted(false);
	seven.setFont(seven.getFont().deriveFont(18.0f));
	JButton eight = new JButton("8");
	eight.setMinimumSize(new Dimension(80,25));
	eight.setPreferredSize(new Dimension(80,25));
	eight.setMaximumSize(new Dimension(80,25));
	eight.setFocusPainted(false);
	eight.setFont(eight.getFont().deriveFont(18.0f));
	JButton nine = new JButton("9");
	nine.setMinimumSize(new Dimension(80,25));
	nine.setPreferredSize(new Dimension(80,25));
	nine.setMaximumSize(new Dimension(80,25));
	nine.setFocusPainted(false);
	nine.setFont(nine.getFont().deriveFont(18.0f));
	JButton division = new JButton("/");
	division.setMinimumSize(new Dimension(80,25));
	division.setPreferredSize(new Dimension(80,25));
	division.setMaximumSize(new Dimension(80,25));
	division.setFocusPainted(false);
	division.setFont(division.getFont().deriveFont(18.0f));

	topRow.add(seven);
	topRow.add(eight);
	topRow.add(nine);
	topRow.add(division);

	//ACTIONS
	seven.addActionListener(new ActionListener(){//----------------7
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("7");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"7");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	eight.addActionListener(new ActionListener(){//----------------8
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("8");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"8");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	nine.addActionListener(new ActionListener(){//----------------9
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("9");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"9");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	division.addActionListener(new ActionListener(){//----------------Division
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("/");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"/");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER	

	JPanel topMiddleRow = new JPanel();
	topMiddleRow.setLayout(new GridLayout(0,4));
	topMiddleRow.setBackground(Color.GRAY);
	topMiddleRow.setMinimumSize(new Dimension(400,32));
	topMiddleRow.setPreferredSize(new Dimension(400, 32));
	topMiddleRow.setMaximumSize(new Dimension(400,32));
	JButton four = new JButton("4");
	four.setMinimumSize(new Dimension(80,25));
	four.setPreferredSize(new Dimension(80,25));
	four.setMaximumSize(new Dimension(80,25));
	four.setFocusPainted(false);
	four.setFont(four.getFont().deriveFont(18.0f));
	JButton five = new JButton("5");
	five.setMinimumSize(new Dimension(80,25));
	five.setPreferredSize(new Dimension(80,25));
	five.setMaximumSize(new Dimension(80,25));
	five.setFocusPainted(false);
	five.setFont(five.getFont().deriveFont(18.0f));
	JButton six = new JButton("6");
	six.setMinimumSize(new Dimension(80,25));
	six.setPreferredSize(new Dimension(80,25));
	six.setMaximumSize(new Dimension(80,25));
	six.setFocusPainted(false);
	six.setFont(six.getFont().deriveFont(18.0f));
	JButton multiply = new JButton("*");
	multiply.setMinimumSize(new Dimension(80,25));
	multiply.setPreferredSize(new Dimension(80,25));
	multiply.setMaximumSize(new Dimension(80,25));
	multiply.setFocusPainted(false);
	multiply.setFont(multiply.getFont().deriveFont(18.0f));

	topMiddleRow.add(four);
	topMiddleRow.add(five);
	topMiddleRow.add(six);
	topMiddleRow.add(multiply);

	//ACTIONS
	four.addActionListener(new ActionListener(){//----------------4
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("4");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"4");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	five.addActionListener(new ActionListener(){//----------------5
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("5");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"5");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	six.addActionListener(new ActionListener(){//----------------6
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("6");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"6");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	multiply.addActionListener(new ActionListener(){//----------------Multiply
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("*");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"*");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER	

	JPanel topBottomRow = new JPanel();
	topBottomRow.setLayout(new GridLayout(0,4));
	topBottomRow.setBackground(Color.GRAY);
	topBottomRow.setMinimumSize(new Dimension(400,32));
	topBottomRow.setPreferredSize(new Dimension(400, 32));
	topBottomRow.setMaximumSize(new Dimension(400,32));
	JButton one = new JButton("1");
	one.setMinimumSize(new Dimension(80,25));
	one.setPreferredSize(new Dimension(80,25));
	one.setMaximumSize(new Dimension(80,25));
	one.setFocusPainted(false);
	one.setFont(one.getFont().deriveFont(18.0f));
	JButton two = new JButton("2");
	two.setMinimumSize(new Dimension(80,25));
	two.setPreferredSize(new Dimension(80,25));
	two.setMaximumSize(new Dimension(80,25));
	two.setFocusPainted(false);
	two.setFont(two.getFont().deriveFont(18.0f));
	JButton three = new JButton("3");
	three.setMinimumSize(new Dimension(80,25));
	three.setPreferredSize(new Dimension(80,25));
	three.setMaximumSize(new Dimension(80,25));
	three.setFocusPainted(false);
	three.setFont(three.getFont().deriveFont(18.0f));
	JButton minus = new JButton("-");
	minus.setMinimumSize(new Dimension(80,25));
	minus.setPreferredSize(new Dimension(80,25));
	minus.setMaximumSize(new Dimension(80,25));
	minus.setFocusPainted(false);
	minus.setFont(minus.getFont().deriveFont(18.0f));

	topBottomRow.add(one);
	topBottomRow.add(two);
	topBottomRow.add(three);
	topBottomRow.add(minus);

	//ACTIONS
	one.addActionListener(new ActionListener(){//----------------1
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("1");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"1");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	two.addActionListener(new ActionListener(){//----------------2
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("2");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"2");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	minus.addActionListener(new ActionListener(){//----------------Minus
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("-");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"-");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	division.addActionListener(new ActionListener(){//----------------Division
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("/");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"/");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER	

	JPanel bottomRow = new JPanel();
	bottomRow.setLayout(new GridLayout(0,4));
	bottomRow.setBackground(Color.GRAY);
	bottomRow.setMinimumSize(new Dimension(400,32));
	bottomRow.setPreferredSize(new Dimension(400, 32));
	bottomRow.setMaximumSize(new Dimension(400,32));
	JButton zero = new JButton("0");
	zero.setMinimumSize(new Dimension(80,25));
	zero.setPreferredSize(new Dimension(80,25));
	zero.setMaximumSize(new Dimension(80,25));
	zero.setFocusPainted(false);
	zero.setFont(zero.getFont().deriveFont(18.0f));
	JButton period = new JButton(".");
	period.setMinimumSize(new Dimension(80,25));
	period.setPreferredSize(new Dimension(80,25));
	period.setMaximumSize(new Dimension(80,25));
	period.setFocusPainted(false);
	period.setFont(period.getFont().deriveFont(18.0f));
	JButton equals = new JButton("=");
	equals.setMinimumSize(new Dimension(80,25));
	equals.setPreferredSize(new Dimension(80,25));
	equals.setMaximumSize(new Dimension(80,25));
	equals.setFocusPainted(false);
	equals.setFont(equals.getFont().deriveFont(18.0f));
	JButton plus = new JButton("+");
	plus.setMinimumSize(new Dimension(80,25));
	plus.setPreferredSize(new Dimension(80,25));
	plus.setMaximumSize(new Dimension(80,25));
	plus.setFocusPainted(false);
	plus.setFont(plus.getFont().deriveFont(18.0f));

	bottomRow.add(zero);
	bottomRow.add(period);
	bottomRow.add(equals);
	bottomRow.add(plus);

	//ACTIONS
	zero.addActionListener(new ActionListener(){//----------------0
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("0");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"0");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	period.addActionListener(new ActionListener(){//----------------period
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText(".");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+".");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	equals.addActionListener(new ActionListener(){//----------------=
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("=");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"=");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER

	plus.addActionListener(new ActionListener(){//----------------Plus
		public void actionPerformed(ActionEvent e){
			try{
				if (answer.getText().equals("---")){
					answer.setText("+");
				}else{
					System.out.println(answer.getText());
					answer.setText(answer.getText()+"+");
				}
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER	

	JButton clear = new JButton("CLEAR");
	clear.setMinimumSize(new Dimension(180,25));
	clear.setPreferredSize(new Dimension(180,25));
	clear.setMaximumSize(new Dimension(180,25));
	clear.setFocusPainted(false);
	clear.setFont(clear.getFont().deriveFont(18.0f));


	//buttonPanel.setLayout();
	buttonPanel.add(topRow);//----------------------------ADD
	buttonPanel.add(topMiddleRow);//----------------------ADD
	buttonPanel.add(topBottomRow);//----------------------ADD
	buttonPanel.add(bottomRow);//-------------------------ADD
	buttonPanel.add(clear);//-----------------------------ADD

	clear.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try{
				answer.setText("---");
			}
			catch(Exception error){
				System.out.println(error);
			}
		}//END ACTION PERFORMED
	});//END ACTION LISTENER
	
	frameConstraint.gridy = 1;
	
	frameContentPane.add(buttonPanel, frameConstraint);//----------------------ADD

	}//CONSTRUCTION END

	public void setFrameVisibility(Boolean need){
		frame.setVisible(need);
	}




	public static void main(String[] args){
		Calc calculatorProgram = new Calc();

		calculatorProgram.setFrameVisibility(true);
	
	}//END MAIN

}//END CALC