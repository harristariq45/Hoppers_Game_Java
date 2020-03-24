import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LevelScreen{  

    JFrame b;
    JPanel levelButtons;
    LevelSquare [][] levelSquares = new LevelSquare[4][10];

    public LevelScreen(){
    
    b = new JFrame();   
    levelButtons = new JPanel();
    levelButtons.setLayout(new GridLayout(4,10));
    b.setContentPane(levelButtons);

    b.setTitle("Please pick level");
    b.setSize(750,750);
    b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    for(int i = 0; i < 4; i++)
        {
            for (int j = 0 ; j<10 ; j++)
            {
                levelSquares[i][j] = new LevelSquare (i,j);
                levelButtons.add(levelSquares[i][j].getLevelButton());
                //lvlButtons[i][j].getbutton().addActionListener(this);
            }
        }


    b.setVisible(true);
    }



    public static void main(String[] args){
        LevelScreen a = new LevelScreen();    
    }
}