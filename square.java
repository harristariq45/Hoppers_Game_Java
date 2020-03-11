import javax.swing.*; 
import java.awt.* ;

public class Square{

    JButton a; 
    JButton w;

    public Square(){   
        w = new JButton(); 
        ImageIcon water = new ImageIcon("water.png");
        w.setIcon(water);

    }
    
    public void setIcon (int i) {
        if (i==0) {
            ImageIcon water = new ImageIcon("water.png");
            w.setIcon(water);
        }

        else if (i==1) { 
            ImageIcon LilyPad = new ImageIcon("LilyPad.png");
            w.setIcon(LilyPad);
        }

        else if (i==2) {
            ImageIcon GreenFrog = new ImageIcon("GreenFrog.png");
            w.setIcon(GreenFrog);
        }

        else if (i==3) {
            ImageIcon RedFrog = new ImageIcon("RedFrog.png");
            w.setIcon(RedFrog);
        }
    }


    

    public JButton getbutton(){
        return w;
    }


}
// public SquareW(){   
//         w = new JButton(); 
//         ImageIcon water = new ImageIcon("water.png");
//         w.setIcon(water);

//     }

//     public SquareL(){   
//         l = new JButton(); 
//         ImageIcon LilyPad = new ImageIcon("Lilypad.png");
//         l.setIcon(LilyPad);
//     }

