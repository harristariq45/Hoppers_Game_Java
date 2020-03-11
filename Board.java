import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Board implements ActionListener {

    JFrame a;
    JPanel content;
    Square[] squares = new Square[25];
    
    public Board(){
        a = new JFrame();   
        content = new JPanel();
        content.setLayout(new GridLayout(5,5));
        a.setContentPane(content);

        a.setTitle("HopperGame");
        a.setSize(750,750);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 25; i++){

            squares[i] = new Square ();
            content.add(squares[i].getbutton());

        if(i%2==0){
                squares[i].setIcon(1);
            }

        if( i== 6 || i== 8 || i== 12 || i== 20 || i== 24){
            squares[i].setIcon(2);
        }

        if( i== 22 ){
            squares[i].setIcon(3);
        }


        }

        a.setVisible(true);

    }

    public static void main(String[] args){
        Board b=new Board();    
    }

}

// content.add(squares[i].getbutton());
// squares[i] = new SquareL ();
// content.add(squares[i].getbutton());
    