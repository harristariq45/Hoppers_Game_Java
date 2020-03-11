import javax.swing.*; 
import java.awt.* ;

public class Square{

    JButton a; 
    JButton w;
    JButton l;
    JButton GF;
    JButton RF;

    
    
    public void setIcon (int i) {
        if (i==0) {
            w = new JButton(); 
            ImageIcon water = new ImageIcon("water.png");
            w.setIcon(water);

        }

        else if (i==1) { 
            l = new JButton(); 
            ImageIcon LilyPad = new ImageIcon("LilyPad.png");
            l.setIcon(LilyPad);
        }

        else if (i==2) {
            GF = new JButton(); 
            ImageIcon GreenFrog = new ImageIcon("GreenFrog.png");
            GF.setIcon(GreenFrog);
        }

        else if (i==3) {
            RF = new JButton(); 
            ImageIcon RedFrog = new ImageIcon("RedFrog.png");
            RF.setIcon(RedFrog);
        }
    }

    public JButton getbutton(){
        return a;
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

