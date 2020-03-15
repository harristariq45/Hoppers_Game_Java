import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Board implements ActionListener {

    JFrame a;
    JPanel content;
    Square[][] squares = new Square[5][5];
    //int[][] level1 = {{1,0,1,0,1},{0,2,0,2,0},{1,0,2,0,1},{0,1,0,1,0},{2,0,3,0,2}};
    
    int[][] l1 = {{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,1,0},{1,0,1,0,1}};
    int[][] l2 = {{1,0,1,0,3},{0,1,0,1,0},{1,0,1,0,2},{0,1,0,1,0},{1,0,1,0,1}};
    int[][] l3 = {{1,0,1,0,1},{0,1,0,2,0},{1,0,3,0,1},{0,1,0,1,0},{1,0,1,0,1}};
    int[][] l4 = {{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,2,0},{1,0,1,0,1}};

    Square first;
    Square second;

    int Levelpicked; 

    public void level (int[][] level){
        
        int[][] l1 = {{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,1,0},{1,0,1,0,1}};
        int[][] l2 = {{1,0,1,0,3},{0,1,0,1,0},{1,0,1,0,2},{0,1,0,1,0},{1,0,1,0,1}};
        int[][] l3 = {{1,0,1,0,1},{0,1,0,2,0},{1,0,3,0,1},{0,1,0,1,0},{1,0,1,0,1}};
        int[][] l4 = {{3,0,1,0,1},{0,2,0,1,0},{1,0,1,0,1},{0,1,0,2,0},{1,0,1,0,1}};
    }
//     0 = Water, 1= LillyPad, 2 = Green frog, 3 = Red frog

//     4 = Green frog2, 5 = Red frog2

    
    public Board(){
        a = new JFrame();   
        content = new JPanel();
        content.setLayout(new GridLayout(5,5));
        a.setContentPane(content);

        a.setTitle("HopperGame");
        a.setSize(750,750);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 5; i++)
        {


            for (int j = 0 ; j<5 ; j++)
            {
            squares[i][j] = new Square (i, j, l4 [i][j]);
            content.add(squares[i][j].getbutton());
            squares[i][j].getbutton().addActionListener(this);
            }

            //if(i < 5 || j < 5){squares[i][j].setIcon(1);}

            // if( i== 6 || i== 8 || i== 12 || i== 20 || i== 24){squares[i].setIcon(2);}

            // if( i== 22 ){ squares[i].setIcon(3); }

           

        }

        a.setVisible(true);

        first = null;
        second = null;

    }

    public void actionPerformed (ActionEvent e)
    { 
        for ( int i=0 ; i< 5 ; i++)
        {
            for (int j= 0 ; j<5 ; j++)
            {
                if(squares[i][j].getbutton() == (JButton)e.getSource())
                {

                    if (first == null && (squares[i][j].getState() == 2 || squares[i][j].getState() == 3)) { 
                        first = squares[i][j];
                        System.out.println("first = X: " + i + " Y: " + j);
                        
                    }
                    else if (second == null && first != null && squares[i][j].getState() == 1){
                        second = squares [i][j]; 
                        System.out.println("second = X: " + i + " Y: " + j);

                        if(moveIsValid()){
                            first.moveTo(second); 
                            first = null;
                            second = null;
                        }else{
                            second = null;
                            System.out.println("Invalid move");

                        }
                    }else if(squares[i][j].getState() == 2 || squares[i][j].getState() == 3){
                        break;
                    }

                    //System.out.println("square found");

                    if (squares[i][j].getState() == 2){
                        squares[i][j].setIcon(4);
                        System.out.println("green frog clicked");
                        
                    }

                    else if (squares[i][j].getState() == 4){
                        squares[i][j].setIcon(2);
                        System.out.println("green frog click reversed");
                        first = null;
                    }

                    if (squares[i][j].getState() == 3){
                        squares[i][j].setIcon(5);
                        System.out.println("red frog clicked");
                    }

                    else if (squares[i][j].getState() == 5){
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
        }
    }

    public boolean moveIsValid(){
        return true;
    }

    public void moveTo( Square moveSquare){
        

    }




      
    


    public static void main(String[] args){
        Board b=new Board();    
    }

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