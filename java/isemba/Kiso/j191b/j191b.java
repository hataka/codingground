// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j191b.java 
 * created : Time-stamp: <09/06/30(火) 17:07:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j191b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j191b.java >>
//
//  基礎（９）：コマンドラインから入力（整数、実数）
//
////////////////////////////////////////////////////////////////////////////////

class j191b {
  public static void main(String args[]) {

    if( args.length == 0 ) {
        args = new String[4]; 
        args[0] = "123";
        args[1] = "45678";
        args[2] = "1.2";
        args[3] = "3.4567";
    }   	
    // int型へ変換。
    System.out.print("args[0]:" + args[0]);
    int a = Integer.parseInt(args[0]);
    System.out.println("  a=" + a);

    // long型へ変換。
    System.out.print("args[1]:" + args[1]);
    long b = Long.parseLong(args[1]);
    System.out.println("  b=" + b);

    // float型へ変換。
    System.out.print("args[2]:" + args[2]);
    float c = Float.parseFloat(args[2]);
    System.out.println("  c=" + c);

    // double型へ変換。
    System.out.print("args[3]:" + args[3]);
    double d = Double.parseDouble(args[3]);
    System.out.println("  d=" + d);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j191b.java
% java j191b 123 45678 1.2 3.4567
args[0]:123  a=123
args[1]:45678  b=45678
args[2]:1.2  c=1.2
args[3]:3.4567  d=3.4567
</pre>

</body>
</html>
*/
