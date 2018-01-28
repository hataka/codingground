//  -*- mode: java -*-  Time-stamp: <2009-06-17 05:11:25 kahata>
/*================================================================
 * title: 
 * file: ConsoleJApplet.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 * link:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j112a.java >>
//
//  基礎（２）：演算
//
//  ●整数演算
//    加算：+, 減算：-, 乗算：*, 除算：/, 剰余：%
//
////////////////////////////////////////////////////////////////////

import javax.swing.*;          //This is the final package name.
import java.awt.*;

public class j112aJApplet extends JApplet {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public j112aJApplet() {
			String txt = new j112a().outbuf;
  	 	JTextArea textArea = new JTextArea(txt,800, 600);

//  余白設定 http://www.javadrive.jp/tutorial/jtextarea/index14.html
			textArea.setMargin(new Insets(10, 10, 10, 10));
			textArea.setEditable(false);
        	getContentPane().add(textArea, BorderLayout.CENTER);
//  フォント色 http://sunjava.seesaa.net/article/53051379.html
   	textArea.setFont(new Font("MS ゴシック", Font.PLAIN, 24));
		textArea.setForeground(new Color(0, 0, 0x88));
	}

    //Hack to avoid ugly message about system event access check.
    public j112aJApplet(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

    public static void main(String args[]) {
        JFrame f = new JFrame("j112a");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/*
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
*/
        JApplet applet = new j112aJApplet(false);
        applet.init();
        f.getContentPane().add(new j112aJApplet(), BorderLayout.CENTER);
        f.pack();
        f.setSize(800, 600);
    	//f.setBounds(100, 100, 640, 480);
        f.setVisible(true);
        applet.start();
    }
}
