// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j192.java 
 * created : Time-stamp: <09/06/30(火) 17:07:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j192.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j192.java >>
//
//  基礎（９）：キーボードから入力（方法１）
//
//　●キーボードから入力するための設定
//
//    ・java.ioパッケージを指定。
//      import java.io.*; 
//
//    ・入力文字ストリームの設定。
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//　　○キーボードから文字列入力
//
//　　　・１行文の読込み。
//     　 String line = br.readLine();
//
//　　　この結果、変数lineに１行分のテキストデータが格納される。
//　  　データの終わり(WindowsではCtrl-z,UNIXではCtrl-d)は、変数lineにnullが
//    　代入される。
//
//　　○キーボードから整数入力
//
//      　String line = br.readLine();
//     　 int i = Integer.parseInt(line); // 整数へ変換。
//
//　　○キーボードから実数入力
//
//      　String line = br.readLine();
//      　double d = Double.parseDouble(line); // 実数へ変換。
//
////////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
