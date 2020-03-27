import javax.swing.*;
import java.awt.* ;

/**
 * class for buttons on the levelScreen class
 * 
 * this contains the necessary method to get the buttons
 * working , so that the user can select the buttons 
 * on the level screen to load the correct level
 * 
 * @author Harris Bin Tariq
 * @version 1.0 
 */

public class LevelSquare{
    private JButton l;

    public LevelSquare(){   
        l = new JButton(); 
    }

    public JButton getLevelButton(){
        return l;
    }

}