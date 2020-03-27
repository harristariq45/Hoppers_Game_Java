import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Board constructor with 25 buttons
 * 
 * used to display the map of the game with buttons
 * which have action listener implemented
 * 
 * @author Harris Bin Tariq
 * @version 1.0 
 */

public class Board implements ActionListener {

    private JFrame a;
    private JPanel content;
    private Square[][] squares = new Square[5][5]; //array for the buttons
    int greenFrogs = 0;
    int Level = 0;

    int[][][] Levels = {{{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,1,0},{1,0,1,0,1}},{{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,2,0},{1,0,1,0,1}},
                        {{1,0,1,0,1},{0,1,0,2,0},{1,0,3,0,1},{0,1,0,1,0},{1,0,1,0,1}},{{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,2,0},{1,0,1,0,1}},
                        {{1,0,2,0,1},{0,1,0,1,0},{2,0,1,0,1},{0,1,0,1,0},{3,0,1,0,1}},
                        {{1,0,1,0,1},{0,1,0,1,0},{1,0,2,0,3},{0,2,0,2,0},{1,0,1,0,1}},{{1,0,2,0,3},{0,1,0,1,0},{2,0,1,0,2},{0,1,0,1,0},{1,0,2,0,1}},
                        {{1,0,3,0,1},{0,2,0,2,0},{1,0,1,0,1},{0,2,0,2,0},{1,0,1,0,1}},{{1,0,2,0,1},{0,2,0,2,0},{1,0,3,0,2},{0,1,0,2,0},{1,0,1,0,1}},
                        {{1,0,2,0,1},{0,1,0,2,0},{2,0,1,0,1},{0,2,0,2,0},{1,0,1,0,3}},
                        {{3,0,1,0,1},{0,1,0,1,0},{1,0,2,0,1},{0,1,0,1,0},{1,0,1,0,1}},{{1,0,1,0,1},{0,1,0,1,0},{1,0,2,0,2},{0,1,0,1,0},{3,0,1,0,1}},
                        {{1,0,1,0,3},{0,2,0,1,0},{1,0,1,0,1},{0,2,0,1,0},{1,0,2,0,1}},{{1,0,2,0,1},{0,1,0,1,0},{2,0,1,0,2},{0,2,0,1,0},{1,0,3,0,2}},
                        {{2,0,2,0,1},{0,1,0,1,0},{1,0,1,0,2},{0,3,0,2,0},{1,0,1,0,1}},
                        {{1,0,1,0,3},{0,1,0,2,0},{1,0,1,0,2},{0,1,0,1,0},{1,0,1,0,1}},{{1,0,3,0,1},{0,1,0,1,0},{1,0,2,0,1},{0,2,0,2,0},{1,0,2,0,1}},
                        {{1,0,2,0,1},{0,1,0,1,0},{2,0,2,0,2},{0,2,0,2,0},{1,0,3,0,1}},{{2,0,2,0,1},{0,1,0,2,0},{3,0,1,0,1},{0,2,0,2,0},{1,0,2,0,1}},
                        {{1,0,2,0,2},{0,2,0,2,0},{1,0,1,0,2},{0,3,0,2,0},{1,0,1,0,1}},
                        {{2,0,1,0,1},{0,2,0,3,0},{1,0,2,0,1},{0,1,0,2,0},{1,0,1,0,2}},{{1,0,1,0,1},{0,2,0,2,0},{1,0,2,0,1},{0,1,0,1,0},{2,0,3,0,2}},
                        {{1,0,1,0,2},{0,2,0,2,0},{1,0,2,0,1},{0,2,0,1,0},{2,0,1,0,3}},{{1,0,2,0,1},{0,2,0,2,0},{2,0,2,0,1},{0,2,0,1,0},{1,0,1,0,3}},
                        {{1,0,1,0,1},{0,2,0,2,0},{1,0,1,0,2},{0,2,0,1,0},{2,0,1,0,3}},
                        {{3,0,2,0,1},{0,2,0,1,0},{2,0,2,0,1},{0,1,0,2,0},{1,0,1,0,1}},{{1,0,1,0,3},{0,1,0,1,0},{2,0,1,0,1},{0,2,0,1,0},{2,0,2,0,1}},
                        {{1,0,3,0,1},{0,2,0,2,0},{2,0,1,0,2},{0,1,0,1,0},{2,0,1,0,2}},{{1,0,3,0,1},{0,1,0,1,0},{1,0,2,0,1},{0,2,0,2,0},{2,0,1,0,2}},
                        {{2,0,2,0,1},{0,2,0,2,0},{2,0,1,0,1},{0,2,0,1,0},{1,0,1,0,3}},
                        {{1,0,2,0,3},{0,2,0,1,0},{1,0,2,0,1},{0,1,0,2,0},{1,0,1,0,1}},{{1,0,1,0,1},{0,2,0,1,0},{2,0,2,0,1},{0,2,0,2,0},{3,0,2,0,1}},
                        {{1,0,1,0,1},{0,1,0,1,0},{2,0,3,0,2},{0,2,0,2,0},{1,0,2,0,1}},{{1,0,2,0,1},{0,1,0,1,0},{1,0,1,0,1},{0,2,0,2,0},{2,0,2,0,3}},
                        {{2,0,1,0,2},{0,2,0,2,0},{1,0,1,0,1},{0,2,0,2,0},{1,0,1,0,3}},
                        {{1,0,2,0,1},{0,2,0,2,0},{1,0,1,0,1},{0,2,0,2,0},{2,0,1,0,3}},{{1,0,1,0,1},{0,2,0,1,0},{2,0,2,0,1},{0,1,0,2,0},{3,0,2,0,1}},
                        {{2,0,2,0,1},{0,1,0,2,0},{1,0,1,0,1},{0,2,0,1,0},{1,0,2,0,3}},{{3,0,1,0,2},{0,1,0,2,0},{2,0,2,0,1},{0,2,0,1,0},{1,0,2,0,1}},
                        {{1,0,1,0,2},{0,2,0,1,0},{2,0,2,0,1},{0,1,0,2,0},{3,0,2,0,1}}};

    //     0 = Water, 1= LillyPad, 2 = Green frog, 3 = Red frog
    //     4 = Green frog2, 5 = Red frog2
    // all of the levels, 3D array used.

    Square first, second;
    // for movement, to save the coordinates of the squares selected

    private int currentX1=0, currentY1=0, currentX2=0, currentY2=0;
    // to help with legal moves and elimination calculation

    private int RemoveX = 0, RemoveY=0; // for elimination calculation

    private int distX=0, distY=0; // for legal moves calculation

    /**
     * main programming for the board contructor which sets the size 
     * 
     * 
     * @param LevelNumber loads the boards according to the 
     *                    level picked by the user in the 
     *                    level screen.
     */

    public Board(int LevelNumber)
    {
        a = new JFrame();   
        content = new JPanel();
        content.setLayout(new GridLayout(5,5));
        a.setContentPane(content);
        Level = LevelNumber; 
        a.setTitle("HopperGame");
        a.setSize(750,750);
        a.setResizable(false);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 5; i++)
        {
            for (int j = 0 ; j<5 ; j++)
            {
                squares[i][j] = new Square (i, j, Levels[LevelNumber][i][j]);
                content.add(squares[i][j].getbutton());
                squares[i][j].getbutton().addActionListener(this);
            }
        }
        a.setVisible(true);

        first = null;
        second = null;
    }

    /**
     * actionperformed class to program what the clicks will do
     * and some of the valid moves are also coded in this method.
     * 
     */
    public void actionPerformed (ActionEvent e)
    { 
        for ( int i=0 ; i< 5 ; i++)
        {
            for (int j= 0 ; j<5 ; j++)
            {   
                
                if(squares[i][j].getbutton() == (JButton)e.getSource())
                {

                    if(first == null && (squares[i][j].getState() == 2 || squares[i][j].getState() == 3)) 
                    { 
                        first = squares[i][j];
                        currentX1 = i ; 
                        currentY1 = j ;                       
                    }
                    else if(second == null && first != null && squares[i][j].getState() == 1 )
                    {
                        second = squares [i][j]; 
                        currentX2 = i; 
                        currentY2 = j;

                        if(moveIsValid())
                        {
                            first.moveTo(second); 
                            CheckGreenFrogs();
                            first = null;
                            second = null;
                        }

                        else
                        {
                            second = null;
                            System.out.println("Invalid move");

                        }
                        
                    }
                        
                    else if(squares[i][j].getState() == 2 || squares[i][j].getState() == 3)
                    {
                        break;
                    }

                    if (squares[i][j].getState() == 2){
                        squares[i][j].setIcon(4);                   
                    }

                    else if(squares[i][j].getState() == 4)
                    {
                        squares[i][j].setIcon(2);
                        first = null;
                    }

                    if(squares[i][j].getState() == 3)
                    {
                        squares[i][j].setIcon(5);
                    }

                    else if(squares[i][j].getState() == 5)
                    {
                        squares[i][j].setIcon(3);
                        first = null;
                    }
                }
            }
        }
    }

    /**
     * 
     * this method is to check if how many green frogs are left
     * and if green frogs = 0 then the level has been won
     * game then moves to the next level.
     * if level 40 won then game will take the user back to
     * the level screen.
     * 
     */

    public void CheckGreenFrogs()
    {
        for( int i=0 ; i< 5 ; i++)
        {
            for(int j= 0 ; j<5 ; j++)
            { 
                if(squares[i][j].getState() == 2 || squares[i][j].getState() == 3)
                    { 
                        greenFrogs++;
                    }
            }
        }
        if (greenFrogs == 0)
        {   
            JOptionPane.showMessageDialog(null,
            "You won ",
            "All green frogs killed",
            JOptionPane.PLAIN_MESSAGE);
            a.dispose();
            Level++;

            // if (Level < 40)
            // {
            //     new Board(Level);
            // }

            // if (Level > 40)
            // {
            //     new LevelScreen();
            // }
            greenFrogs = 0;
        }
    }

    /**
     * This method is to look out for some of the valid moves 
     * 
     * @return if move is valid then true is returned and move is carried out 
     * but if move is invalid then false is returned
     * and move is not carried out. 
     */

    public boolean moveIsValid()
    {
        
        RemoveX = (currentX2 + currentX1)/2;
        RemoveY = (currentY2 +currentY1)/2;
        distX = Math.abs(currentX2 - currentX1);
        distY = Math.abs(currentY2 - currentY1);

        if((distX == 2 || distY==2 || distX ==4 || distY == 4) && !(distX == 4 && distY == 4))
        {   
            if (squares[RemoveX][RemoveY].getState() == 2)
            {
            squares[RemoveX][RemoveY].setIcon(1);
            return true;
            }
        
        }
        return false;
    }
}

// public void moveTo( Square moveSquare){
    // }

    // public static void main(String[] args){
    //     Board b=new Board();    
    // }