import javax.swing.*;
import java.awt.* ;

public class Square{

    //private JButton a; 
    private JButton w;
    private int state;
   // private JButton l;

    public Square( int x, int y, int state){   
        w = new JButton(); 
        setIcon(state);

    }

    // public LvlButtons( int i, int j){   
    //     l = new JButton(); 

    // }
    
    public void setIcon (int p) {

        if (p==0) {
            ImageIcon water = new ImageIcon("water.png");
            w.setIcon(water);
            state = p;
        }

        else if (p==1) { 
            ImageIcon LilyPad = new ImageIcon("LilyPad.png");
            w.setIcon(LilyPad);
            state = p;
        }

        else if (p==2) {
            ImageIcon GreenFrog = new ImageIcon("GreenFrog.png");
            w.setIcon(GreenFrog);
            state = p;
        }

        else if (p==3) {
            ImageIcon RedFrog = new ImageIcon("RedFrog.png");
            w.setIcon(RedFrog);
            state = p;
        }

        else if (p==4) {
            ImageIcon GreenFrog2 = new ImageIcon("GreenFrog2.png");
            w.setIcon(GreenFrog2);
            state = p;
        }

        else if (p==5) {
            ImageIcon RedFrog2 = new ImageIcon("RedFrog2.png");
            w.setIcon(RedFrog2);
            state = p;
        }
        


    }

    public int getState() {
        return state;
    } 

    // public int getLevel () {
    //     return levelByUser; 
    // }

    public void setLevel (int Level) {
    
    }


    public JButton getbutton(){
        return w;
    }


    public void moveTo (Square moveSquare){
        moveSquare.setIcon(this.state);
        this.setIcon(1);
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

