import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Board {

    JFrame a;
    JPanel content;
    Square[] squares = new Square[25];
    
    public Board(){
        a = new JFrame();   
        content = new JPanel();
        content.setLayout(new GridLayout(5,5));
        a.setContentPane(content);

        a.setTitle("HopperGame");
        a.setSize(500,500);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 25; i++){

        if(i%2==0)
            {
            squares[i] = new SquareW ();
            content.add(squares[i].getbutton());
            }

        if(i%2==1)
            {
            setIcon
            squares[i] = new SquareL ();
            content.add(squares[i].getbutton());
            }

        }

        a.setVisible(true);

    }

    public static void main(String[] args) {
        Board b=new Board();    
    }

}