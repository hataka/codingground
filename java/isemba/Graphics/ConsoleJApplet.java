//  -*- mode: java -*-  Time-stamp: <2009-06-17 15:43:43 kahata>
/*================================================================
 * name: ConsoleJApplet.java
 * created : Time-stamp: <2009-06-17 05:33:54 kahata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 * link:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description:
 *================================================================*/

import javax.swing.*;          //This is the final package name.
import java.awt.*;
import java.awt.event.*;

public class ConsoleJApplet extends JApplet {
   public ConsoleJApplet() {
			String txt = new Dr01_2s().outbuf.toString();
//			StringBuffer txt = new DR01_2s.outbuf;
  	 		JTextArea textArea = new JTextArea(txt,80, 25);

//  余白設定 http://www.javadrive.jp/tutorial/jtextarea/index14.html
			textArea.setMargin(new Insets(10, 10, 10, 10));

//  フォント色 http://sunjava.seesaa.net/article/53051379.html
  			textArea.setFont(new Font("Dialog", Font.PLAIN, 12));
 //			textArea.setFont(new Font("FixedSys", Font.PLAIN, 12));
    		textArea.setForeground(new Color(0, 0, 0x88));

			JScrollPane scrollPane = new JScrollPane(textArea); 
			textArea.setEditable(false);
        	getContentPane().add(textArea, BorderLayout.CENTER);
    }

    //Hack to avoid ugly message about system event access check.
    public ConsoleJApplet(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

    public static void main(String args[]) {
        JFrame f = new JFrame("Dr01_2 Ｐａｓｃａｌの三角形");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new ConsoleJApplet(false);
        applet.init();
        f.getContentPane().add(new ConsoleJApplet(), BorderLayout.CENTER);
        f.pack();
//      f.setSize(640, 480);
    	f.setBounds(100, 100, 400,280);
        f.setVisible(true);
        applet.start();
    }
}
