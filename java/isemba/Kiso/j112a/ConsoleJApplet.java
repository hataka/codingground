//  -*- mode: java -*-  Time-stamp: <2009-06-17 05:33:54 kahata>
/*================================================================
 * title: 
 * file: ConsoleJApplet.java
 * created : Time-stamp: <2009-06-17 05:33:54 kahata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 * link:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description: JavaConsoleApplication 
 *================================================================*/

import javax.swing.*;          //This is the final package name.
import java.awt.*;
//import java.awt.event.*;

public class ConsoleJApplet extends JApplet {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ConsoleJApplet() {
			String txt = new j112a().outbuf;
  	 		JTextArea textArea = new JTextArea(txt,800, 600);

//  余白設定 http://www.javadrive.jp/tutorial/jtextarea/index14.html
			textArea.setMargin(new Insets(10, 10, 10, 10));

//  フォント色 http://sunjava.seesaa.net/article/53051379.html
   			textArea.setFont(new Font("MS ゴシック", Font.PLAIN, 24));
    		textArea.setForeground(new Color(0, 0, 0x88));

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
        JFrame f = new JFrame("j112a 整数演算 加算：+, 減算：-, 乗算：*, 除算：/, 剰余：%");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new j112aJApplet(false);
        applet.init();
        f.getContentPane().add(new ConsoleJApplet(), BorderLayout.CENTER);
        f.pack();
				f.setSize(800, 600);
				f.setBounds(100, 100, 640, 480);
        f.setVisible(true);
        applet.start();
    }
}
