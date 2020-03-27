import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LevelScreen implements ActionListener{
    JFrame b;
    JPanel levelButtons;
    JButton [][] levelSquares = new JButton[4][10];


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
                //System.out.println("x =  " + x + " z = " + z);
            }
        }
        b.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int y=1;
        int Level = 0;
        for(int x = 0; x < 4; x++)
        {
            //System.out.println("first loop");
            for (int z = 0 ; z<10 ; z++)
            {
                if(e.getSource() == levelSquares[x][z])
                {
                System.out.println("third loop");

                    if(levelSquares[x][z].getText().equals("Level "+ y))
                    {
                        System.out.println("fourth loop y =" + y);
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