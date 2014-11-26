/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test_files;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jim.J.Perry
 */
public class ButtonMenuSample extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton hello;
    JLabel status;
    JTextField input;
    int countClick = 0;
    public ButtonMenuSample(){
        createInterface();
        addButton();
        addLabel();
        addInput();
        setVisible (true);
    }

    private void createInterface(){
        setLayout(null);
        setTitle("FlatLand 0.1");
        setBounds(0,0, 500, 300);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
    }
    private void addLabel(){
        status = new JLabel ("The button has not been clicked.");
        status.setBounds(20, 75, 300, 20);
        add(status);
    }
        private void addInput(){
        input = new JTextField (".");
        input.setBounds(20, 55, 300, 20);
        add(input);
    }
    private void addButton(){
        hello = new JButton ("Hello");
        hello.setBounds(20, 100, 300, 20);
        hello.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(hello.getText().equals("Hello")){
                            hello.setText("Goodbye");
                            
                        }
                        int n =0;
                        try{
                            n=Integer.parseInt(input.getText());
                        }
                        catch(NumberFormatException ex){
                            status.setText("Please input an integer number.");
                        }
                      // status.setText ("The button has been clicked "+(++countClick)+" times."+input.getText()); 
                       System.out.println("The input was "+n+", and if I add 1 the answer is "+(n+1));
                    }
                }
        );
        add(hello);
    }
    public static void main(String[] args) {
        new ButtonMenuSample();
    }
}
