import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * this class is used to create a level screen  
 * 
 * level screen with 40 buttons is made which will help
 * users to select the exact level they want to play
 * action listener is also implemeted.
 * 
 * @author Harris Bin Tariq
 * @version 1.0 
 */

public class LevelScreen implements ActionListener
{
    JFrame b;
    JPanel levelButtons;
    JButton [][] levelSquares = new JButton[4][10];

    /**
     * constructor for the level screen which sets the layout,
     * number of buttons, the title and the size
     */

    public LevelScreen(){
    
    b = new JFrame();   
    levelButtons = new JPanel();
    levelButtons.setLayout(new GridLayout(4,10));
    b.setContentPane(levelButtons);
    b.setTitle("Please pick level");
    b.setSize(1000,400);
    b.setResizable(false);
    b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int y = 1;

    for(int x = 0; x < 4; x++)
    {
        for (int z = 0 ; z<10 ; z++)
        {   
            LevelSquare sq = new LevelSquare();
            levelSquares[x][z] = sq.getLevelButton();
            levelSquares[x][z].setText("Level "+y);
            y++;
            levelButtons.add(levelSquares[x][z]);
            levelSquares[x][z].addActionListener(this);
        }       
        b.setVisible(true);
    }
}

    @Override

    /**
     * this method will detect which button has the user clicked on 
     * and will create the board according to the level picked by
     * the user.
     */
    public void actionPerformed(ActionEvent e)
    {
        int y=1;
        int Level = 0;
        for(int x = 0; x < 4; x++)
        {
            for (int z = 0 ; z<10 ; z++)
            {
                if(e.getSource() == levelSquares[x][z])
                {
                    if(levelSquares[x][z].getText().equals("Level "+ y))
                    {
                        b.dispose();
                        new Board(Level);
                    }
                }
                y++;
                Level++;
            }
        }
    }

    public static void main(String[] args){
        LevelScreen a = new LevelScreen();    
    }
}

//System.out.println("x =  " + x + " z = " + z);