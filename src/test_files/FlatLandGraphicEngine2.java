package test_files;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class FlatLandGraphicEngine2 extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Critter2> cb;  
    public FlatLandGraphicEngine2(){
        createInterface();
        cb= new ArrayList<Critter2>(); 
        setVisible (true);
    }

    private void createInterface(){
        setLayout(null);
        setTitle("FlatLand 0.1");
        setBounds(0,0, 300, 300);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
    }

   public void paint(Graphics g){  
       g.setColor(Color.BLACK);
       g.fillRect(0, 0, 300, 300);  
       if(cb==null){
           return;
       }
 
       for (Critter2 n : cb){
          n.draw(g);
       }
   }
   
   public void add(Critter2 c){
       cb.add(c);
   }

}
