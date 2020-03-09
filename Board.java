import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Board {

    JFrame a;
    JPanel content;
    
    
    public Board(){
    a = new JFrame();   
    content=new JPanel();
    content.setLayout(new BorderLayout());
    a.setContentPane(content);
    a.setVisible(true);
    a.setTitle("HopperGame");
    a.setSize(500,500);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    }

    public static void main(String[] args) {
        Board b=new Board();    
    }

}