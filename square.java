import javax.swing.*;
import java.awt.* ;

/**
 * class for buttons on the Board class 
 * 
 * this class will have the code to set the repective
 * icons on the buttons 
 * 
 * 
 * @author Harris Bin Tariq
 * @version 1.0 
 */

public class Square{
 
    private JButton w;
    private int state;
/**
 * 
 * @param x the xcoordinate
 * @param y the ycoordinate
 * @param state  state is the icon which is displayed on the button
 *               0 = Water, 1= LillyPad, 2 = Green frog, 3 = Red frog
 *               4 = Green frog2, 5 = Red frog2
 */
    public Square( int x, int y, int state){   
        w = new JButton(); 
        setIcon(state);
    }

    /**
     * this method is to set icon
     * @param p is ued to set the state of the button 
     *          setting the state will help the button
     *          to be recognised later on
     */
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
    /**
    * method to return the state so that the icon can be recognised 
    * and the information used accordingly 
    * @return 0 = Water, 1= LillyPad, 2 = Green frog, 3 = Red frog,
    *         4 = Green frog2, 5 = Red frog2       
    */
    public int getState() {
        return state;
    } 

    public JButton getbutton(){
        return w;
    }

    /**
     * this method is so that the information of the square
     * selected can be used to change icons as need 
     * @param moveSquare this method takes the square selected 
     *                   as a parameter and when moved sets the 
     *                   icon as an empty lilypad. 
     */

    public void moveTo (Square moveSquare){
        moveSquare.setIcon(this.state);
        this.setIcon(1);
    }

}
