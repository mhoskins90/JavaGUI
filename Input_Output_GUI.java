import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Input_Output_GUI{

		Input_Output_GUI(){//CONTRUCTION
			JFrame frame = new JFrame("GUI");

			//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//NOT NEEDED
			
			Container contentPaneContainer = frame.getContentPane();
			JPanel mainPane = new JPanel();

			JPanel textPane = new JPanel();
			JPanel inputPane = new JPanel();
			JPanel outputPane = new JPanel();
			JPanel buttonPane = new JPanel();

			//BG COLORS
			frame.setBackground(Color.BLACK);
			contentPaneContainer.setBackground(Color.BLACK);
			mainPane.setBackground(Color.BLACK);
			textPane.setBackground(Color.BLACK);
			inputPane.setBackground(Color.BLACK);
			outputPane.setBackground(Color.BLACK);
			buttonPane.setBackground(Color.BLACK);

			JButton closeButton = new JButton("EXIT NOW");
			JButton submitButton = new JButton("SUBMIT");


			JLabel nameFieldLabel= new JLabel("<html><font color=\"#a4e2ff\">Name</font></html>");
			JTextField nameField = new JTextField();

			JLabel numberFieldLabel= new JLabel("<html><font color=\"#a4e2ff\">Number</font></html>");
			JTextField numberField = new JTextField();

			JLabel emailFieldLabel= new JLabel("<html><font color=\"#a4e2ff\">Email</font></html>");
			JTextField emailField = new JTextField();

			JLabel addressFieldLabel= new JLabel("<html><font color=\"#a4e2ff\">Address</font></html>");
			JTextField addressField = new JTextField();

			mainPane.setLayout(new GridBagLayout());

			System.out.println("Setting up Program...");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(900, 600);//Width, height
			frame.setLocationRelativeTo(null);
			
			frame.setLayout(new GridBagLayout());

			GridBagConstraints frameConstraint = new GridBagConstraints();
			frameConstraint.gridx = 0;
			frameConstraint.gridy = 0;
			
			JLabel topLabel = new JLabel("<html><font color=\"#a2ffa9\">Matt's GUI!</font></html>");
			topLabel.setFont(topLabel.getFont().deriveFont(64.0f));
			//frameConstraint.insets = new Insets(0, 0, 35, 0);

			mainPane.add(topLabel, frameConstraint);//----------------------------------
			frameConstraint.insets = new Insets(0, 0, 0, 0);//RESET

			nameField.setMinimumSize(new Dimension(500,50));
			nameField.setPreferredSize(new Dimension(500,50));

			numberField.setMinimumSize(new Dimension(500,50));
			numberField.setPreferredSize(new Dimension(500,50));

			emailField.setMinimumSize(new Dimension(500,50));
			emailField.setPreferredSize(new Dimension(500,50));

			addressField.setMinimumSize(new Dimension(500,50));
			addressField.setPreferredSize(new Dimension(500,50));
			

			frameConstraint.insets = new Insets(5, 0, 5, 0);

			frameConstraint.gridy = 1;
			frameConstraint.insets = new Insets(5, 0, 5, 464);
			mainPane.add(nameFieldLabel, frameConstraint);//---------------------------
			frameConstraint.insets = new Insets(5, 0, 5, 0);
			frameConstraint.gridy = 2;
			mainPane.add(nameField, frameConstraint);//--------------------------------

			frameConstraint.insets = new Insets(5, 0, 5, 0);

			frameConstraint.gridy = 3;
			frameConstraint.insets = new Insets(5, 0, 5, 450);
			mainPane.add(numberFieldLabel, frameConstraint);//-------------------------
			frameConstraint.insets = new Insets(5, 0, 5, 0);
			frameConstraint.gridy = 4;
			mainPane.add(numberField, frameConstraint);//------------------------------

			frameConstraint.insets = new Insets(5, 0, 5, 0);

			frameConstraint.gridy = 5;
			frameConstraint.insets = new Insets(5, 0, 5, 465);
			mainPane.add(emailFieldLabel, frameConstraint);//--------------------------
			frameConstraint.insets = new Insets(5, 0, 5, 0);
			frameConstraint.gridy = 6;
			mainPane.add(emailField, frameConstraint);//-------------------------------

			frameConstraint.insets = new Insets(5, 0, 5, 0);

			frameConstraint.gridy = 7;
			frameConstraint.insets = new Insets(5, 0, 5, 450);
			mainPane.add(addressFieldLabel, frameConstraint);//------------------------
			frameConstraint.insets = new Insets(5, 0, 5, 0);
			frameConstraint.gridy = 8;
			mainPane.add(addressField, frameConstraint);//-----------------------------

			frameConstraint.insets = new Insets(0, 0, 0, 0);//RESET

			JLabel outputTITLE = new JLabel("<html><font color=\"#a2ffa9\">--OUTPUT--</font></html>");
			//<html><font color=\"#ffffff\">Name:</font> <html><font color=\"#fff\">Start</font></html>
			JLabel outputName = new JLabel("<html><font color=\"#ffffff\">Name:</font> <html><font color=\"#ffb9b9\">Start</font></html>");
			JLabel outputNumber = new JLabel("<html><font color=\"#ffffff\">Number:</font> <html><font color=\"#ffb9b9\">Start</font></html>");
			JLabel outputEmail = new JLabel("<html><font color=\"#ffffff\">Email:</font> <html><font color=\"#ffb9b9\">Start</font></html>");
			JLabel outputAddress = new JLabel("<html><font color=\"#ffffff\">Address:</font> <html><font color=\"#ffb9b9\">Start</font></html>");

			outputPane.setLayout(new GridBagLayout());
			GridBagConstraints outputConstraint = new GridBagConstraints();
			outputConstraint.gridx = 0;
			outputConstraint.gridy = 0;
			outputPane.add(outputTITLE, outputConstraint);
			outputConstraint.gridy = 1;
			outputPane.add(outputName, outputConstraint);
			outputConstraint.gridy = 2;
			outputPane.add(outputNumber, outputConstraint);
			outputConstraint.gridy = 3;
			outputPane.add(outputEmail, outputConstraint);
			outputConstraint.gridy = 4;
			outputPane.add(outputAddress, outputConstraint);

			frameConstraint.gridx = 0;
			frameConstraint.gridy = 9;
			mainPane.add(outputPane, frameConstraint);

			submitButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
					String gathered_name = nameField.getText();
					if (gathered_name.equals("")){gathered_name = "<html><font color=\"#ffb9b9\">Start</font></html>";}
					String gathered_number = numberField.getText();
					if (gathered_number.equals("")){gathered_number = "<html><font color=\"#ffb9b9\">Start</font></html>";}
					String gathered_email = emailField.getText();
					if (gathered_email.equals("")){gathered_email = "<html><font color=\"#ffb9b9\">Start</font></html>";}
					String gathered_address = addressField.getText();
					if (gathered_address.equals("")){gathered_address = "<html><font color=\"#ffb9b9\">Start</font></html>";}
					outputName.setText("<html><font color=\"#ffffff\">Name:</font> <html><font color=\"#a2ffa9\">"+gathered_name+"</font></html>");
					
					outputNumber.setText("<html><font color=\"#ffffff\">Number:</font> <html><font color=\"#a2ffa9\">"+gathered_number+"</font></html>");
				
					outputEmail.setText("<html><font color=\"#ffffff\">Email:</font> <html><font color=\"#a2ffa9\">"+gathered_email+"</font></html>");
					
					outputAddress.setText("<html><font color=\"#ffffff\">Address:</font> <html><font color=\"#a2ffa9\">"+gathered_address+"</font></html>");
					
					outputPane.setLayout(new GridBagLayout());
					GridBagConstraints outputConstraint = new GridBagConstraints();
					outputConstraint.gridx = 0;
					outputConstraint.gridy = 0;
					outputPane.add(outputTITLE, outputConstraint);
					outputConstraint.gridy = 1;
					outputPane.add(outputName, outputConstraint);
					outputConstraint.gridy = 2;
					outputPane.add(outputNumber, outputConstraint);
					outputConstraint.gridy = 3;
					outputPane.add(outputEmail, outputConstraint);
					outputConstraint.gridy = 4;
					outputPane.add(outputAddress, outputConstraint);
					
				}//END ACTION
			});

			closeButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("Closing Program...");
					try{
					java.lang.Thread.sleep(100);
					}
					catch(Exception error){
						System.out.println("Error in timeout");
					}
					System.exit(0);
				}
			});

			frameConstraint.gridy = 10;
			buttonPane.add(submitButton);
			buttonPane.add(closeButton);


			mainPane.add(buttonPane, frameConstraint);
			
			JPanel spacer = new JPanel();
			spacer.setBackground(Color.BLACK);
			spacer.setOpaque(true);
			frameConstraint.gridy = 11;
			mainPane.add(spacer, frameConstraint);

			contentPaneContainer.add(mainPane);
		
			frame.setVisible(true);

		}//END CONSTRUCTION


	public static void main(String[] args){
		
		JFrame_Setup program = new JFrame_Setup();
	
	}//END MAIN METHOD

}//END CLASS



