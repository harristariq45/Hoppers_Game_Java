import javax.swing.*; 
import java.awt.* ;

public class Square{

    JButton w;
    JButton l;

    public Square(){   
        w = new JButton(); 
        ImageIcon water = new ImageIcon("water.png");
        w.setIcon(water);

    }

    public LilyPad(){   
        l = new JButton(); 
        ImageIcon LilyPad = new ImageIcon("Lilypad.png");
        l.setIcon(LilyPad);

    }
    




    public void seticonL (){ 
        ImageIcon lilypad = new ImageIcon("LilyPad.png");  
        b.setIcon(lilypad);
    }



    public JButton getbutton(){
        return b;
    }


}


