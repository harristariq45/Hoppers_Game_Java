import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Board implements ActionListener {

    JFrame a;
    JPanel content;
    Square[][] squares = new Square[5][5];
    int[][] level1 = {{1,0,1,0,1},{0,2,0,2,0},{1,0,2,0,1},{0,1,0,1,0},{2,0,3,0,2}};
    
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
            squares[i][j] = new Square (i, j, level1[i][j]);
            content.add(squares[i][j].getbutton());
            }

           //if(i < 5 || j < 5){squares[i][j].setIcon(1);}

            // if( i== 6 || i== 8 || i== 12 || i== 20 || i== 24){squares[i].setIcon(2);}

            // if( i== 22 ){ squares[i].setIcon(3); }

           // squares[i][j].getbutton().addActionListener(this);

        }





        a.setVisible(true);

    }

    public void actionPerformed (ActionEvent e/*, JButton w*/)
    {
        
        for ( int i=0 ; i< 5 ; i++)
        {
            for (int j= 0 ; j<5 ; j++)
            {
                if(squares[i][j].getbutton() == (JButton)e.getSource())
                {
                    System.out.println("sqaure found");

                    if (squares[i][j].getState() == 2){
                        squares[i][j].setIcon(4);
                        System.out.println("green frog clicked");
                    }

                    if (squares[i][j].getState() == 3){
                        squares[i][j].setIcon(5);
                        System.out.println("red frog clicked");
                    }


                }
            
            }
        }
    }

        // if (((JButton)e.getSource()). ){
        //     squares[i][j].setIcon(5);
        // }
        // if (e.getSource() == w){
        //     e.setIcon(4);
        // }
    


    public static void main(String[] args){
        Board b=new Board();    
    }

}

// content.add(squares[i].getbutton());
// squares[i] = new SquareL ();
// content.add(squares[i].getbutton());
//System.out.println("button works");