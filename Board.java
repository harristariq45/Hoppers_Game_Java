import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;

// public class levelScreen (){  
//     public choselevel(){
//     JFrame b;
//     JPanel levelButtons;

//     b = new JFrame();   
//     levelButtons = new JPanel();
//     levelButtons.setLayout(new GridLayout(4,10));
//     b.setContentPane(levelButtons);

//     b.setTitle("Please pick level");
//     b.setSize(750,750);
//     b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




//     b.setVisible(true);
//     }
// }



public class Board implements ActionListener {

    JFrame a;
    JPanel content;
    Square[][] squares = new Square[5][5];
    //LevelSquare [][] levelSquares = newblic void LevelSquares[4][10];
    int greenFrogs = 1;

    
    int[][][] Levels = {{{1,0,2,0,1},{0,1,0,2,0},{2,0,1,0,1},{0,2,0,2,0},{1,0,1,0,3}},{{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,2,0},{1,0,1,0,1}}};
    // int[][][] L2 = {{1,0,1,0,3},{0,1,0,1,0},{1,0,1,0,2},{0,1,0,1,0},{1,0,1,0,1}};
    // int[][] L3 = {{1,0,1,0,1},{0,1,0,2,0},{1,0,3,0,1},{0,1,0,1,0},{1,0,1,0,1}};
    // int[][] L4 = {{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,2,0},{1,0,1,0,1}};
    // int[][] L10 = {{1,0,2,0,1},{0,1,0,2,0},{2,0,1,0,1},{0,2,0,2,0},{1,0,1,0,3}};

    Square first;
    Square second;

    int Levelpicked; 

    int currentX1;
    int currentY1;
    int currentX2;
    int currentY2;


//     0 = Water, 1= LillyPad, 2 = Green frog, 3 = Red frog
//     4 = Green frog2, 5 = Red frog2

// JFrame b;
// JPanel levelButtons;
// LevelSquare [][] levelSquares = new LevelSquare[4][10];

// public LevelScreen(){

// b = new JFrame();   
// levelButtons = new JPanel();
// levelButtons.setLayout(new GridLayout(4,10));
// b.setContentPane(levelButtons);

// b.setTitle("Please pick level");
// b.setSize(750,750);
// b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// for(int x = 0; x < 4; x++)
//     {
//         for (int z = 0 ; z < 10 ; z++)
//         {
//             levelSquares[x][z] = new LevelSquare (x,z);
//             levelButtons.add(levelSquares[x][z].getLevelButton());
//             levelSquares[x][z].getLevelButton().addActionListener(this);
//             System.out.println("x= " + x + "z= " + z);
//         }
//     }


// b.setVisible(true);


// public void actionPerformed (ActionEvent e){
    
// }

// public static void main(String[] args){
//     LevelScreen a = new LevelScreen();    
    //}


    public Board(int LevelNumber){

        a = new JFrame();   
        content = new JPanel();
        content.setLayout(new GridLayout(5,5));
        a.setContentPane(content);

        a.setTitle("HopperGame");
        a.setSize(750,750);
        a.setResizable(false);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // System.out.println("Type the level you want to play i.e. l1 - l40."); 
        // Scanner levelScanner  = new Scanner(System.in);
        // System.out.println(levelScanner.nextLine());  

        for(int i = 0; i < 5; i++)
        {

            for (int j = 0 ; j<5 ; j++)
            {
                squares[i][j] = new Square (i, j, Levels [LevelNumber][i][j]);
                content.add(squares[i][j].getbutton());
                squares[i][j].getbutton().addActionListener(this);
            }

        }

        a.setVisible(true);

        first = null;
        second = null;

    }




    public void actionPerformed (ActionEvent e)
    { 
        int RemoveX = 0;
        int RemoveY = 0;

        for ( int i=0 ; i< 5 ; i++)
        {
            for (int j= 0 ; j<5 ; j++)
            {   
                    
                if(squares[i][j].getbutton() == (JButton)e.getSource())
                {

                    if (first == null && (squares[i][j].getState() == 2 || squares[i][j].getState() == 3)) 
                    { 
                        first = squares[i][j];
                        System.out.println("first = X: " + i + " Y: " + j);
                        currentX1 = i ; 
                        currentY1 = j ;
                        System.out.println("first = currentX1: " + currentX1 + " currentY1: " + currentY1);
                        
                    }
                    else if (second == null && first != null && squares[i][j].getState() == 1 )
                    {
                        second = squares [i][j]; 
                        System.out.println("second = X: " + i + " Y: " + j);
                        currentX2 = i ; 
                        currentY2 = j ;
                        System.out.println("second = currentX2: " + currentX2 + " currentY2: " + currentY2);
                        System.out.println("first = currentX1: " + currentX1 + " currentY1: " + currentY1);

                        // System.out.println("X1/X2" + currentX1/currentX2 + "Y1/Y2:" + currentY1/currentY2);


                        if(moveIsValid())
                        {
                            first.moveTo(second); 
                            first = null;
                            second = null;

                            RemoveX = (currentX2 + currentX1)/2;
                            RemoveY = (currentY2 +currentY1)/2;

                            System.out.println("RemoveX: " + RemoveX + "RemoveY:   " + RemoveY);
                        }

                        else
                        {
                            second = null;
                            System.out.println("Invalid move");

                        }

                        if (squares[RemoveX][RemoveY].getState() == 2)
                        {
                            squares[RemoveX][RemoveY].setIcon(1);
                            System.out.println("green frog Removed");
                        }

                        // if(squares[RemoveX][RemoveY].getState() == 1){
                        // break;
                        // }
                            

                    }
                        

                    else if(squares[i][j].getState() == 2 || squares[i][j].getState() == 3)
                    {
                        break;
                    }


                        // currentX1 = null; 
                        // currentY1 = null; 
                        // currentX2 = null; 
                        // currentY2 = null; 

                        //System.out.println("square found");

                        if (squares[i][j].getState() == 2){
                            squares[i][j].setIcon(4);
                            System.out.println("green frog clicked");
                        
                        }

                        else if (squares[i][j].getState() == 4)
                        {
                            squares[i][j].setIcon(2);
                            System.out.println("green frog click reversed");
                            first = null;
                        }

                        if (squares[i][j].getState() == 3)
                        {
                            squares[i][j].setIcon(5);
                            System.out.println("red frog clicked");
                        }

                        else if (squares[i][j].getState() == 5)
                        {
                            squares[i][j].setIcon(3);
                            System.out.println("red frog click reversed");
                            first = null;
                        }

                    

                

                    //currentX = i;

                    //diagonal

                    //sideways

                    //vertical

                }

            
            }

            if (greenFrogs == 0)
            {
                JOptionPane.showMessageDialog(null,
                "You won ",
                "All green frogs killed",
                JOptionPane.PLAIN_MESSAGE);
                break;

            }
        }


        greenFrogs = 0;
        for ( int i=0 ; i< 5 ; i++)
        {
            for (int j= 0 ; j<5 ; j++)
            { 
                if (squares[i][j].getState() == 2 || squares[i][j].getState() == 3)
                { 
                    greenFrogs++;
                    // //break;
                }
                

            }
            
            
            
        }
        
            
        System.out.println("GreenFrogs = " + greenFrogs);

        

        System.out.println("                                     ");

        
    }

    public boolean moveIsValid(){
    return true;
    }

    public void moveTo( Square moveSquare){
        

    }

    

    


    


    // public static void main(String[] args){
    //     Board b=new Board();    
    // }

}

// content.add(squares[i].getbutton());
// squares[i] = new SquareL ();
// content.add(squares[i].getbutton());
//System.out.println("button works");


// if (((JButton)e.getSource()). ){
        //     squares[i][j].setIcon(5);
        // }
        // if (e.getSource() == w){
        //     e.setIcon(4);
        // }