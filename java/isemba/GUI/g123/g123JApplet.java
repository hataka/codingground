/*
/*
 * @(#)g123JApplet.java	1.10 05/11/17
 */


import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.border.*;
import javax.swing.colorchooser.*;
import javax.swing.filechooser.*;
import javax.accessibility.*;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;
import java.io.*;
import java.applet.*;
import java.net.*;

/**
 * 
 *
 * @version 1.10 11/17/05
 * @author Jeff Dinkins
 */

public class g123JApplet extends JApplet {
    public void init() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new g123(), BorderLayout.CENTER);
//        setContentPane(new g123());
    }

    public URL getURL(String filename) {
        URL codeBase = this.getCodeBase();
        URL url = null;
	
        try {
            url = new URL(codeBase, filename);
	    System.out.println(url);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Error: badly specified URL");
            return null;
        }

        return url;
    }

	 public URL getURL(URL codeBase, String filename) {
        URL url = null;
        try {
            url = new URL(codeBase, filename);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Couldn't create image: badly specified URL");
            return null;
        }
        return url;
   }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Swing2JApplet: g123");
         frame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
        JApplet applet = new g123JApplet();
        applet.init();
        frame.setContentPane(new g123());
         frame.pack();
         // フレームの大きさを設定。
         frame.setSize(300,200);
         // フレームの表示。
         frame.setVisible(true);
        applet.start();
    }
}
