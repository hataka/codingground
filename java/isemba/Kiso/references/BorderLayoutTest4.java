import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutTest4 extends JFrame{

  public static void main(String[] args){
    BorderLayoutTest4 frame = new BorderLayoutTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20, 20, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  BorderLayoutTest4(){
    JButton button1 = new JButton("CENTER");
    JButton button2 = new JButton("PAGE_START");
    JButton button3 = new JButton("PAGE_END");
    JButton button4 = new JButton("LINE_START");
    JButton button5 = new JButton("LINE_END");

    BorderLayout layout = new BorderLayout();
    layout.setVgap(20);
    layout.setHgap(20);
    setLayout(layout);

    getContentPane().add(button1, BorderLayout.CENTER);
    getContentPane().add(button2, BorderLayout.PAGE_START);
    getContentPane().add(button3, BorderLayout.PAGE_END);
    getContentPane().add(button4, BorderLayout.LINE_START);
    getContentPane().add(button5, BorderLayout.LINE_END);
  }
}