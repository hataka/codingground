////////////////////////////////////////////////////////////////////////////////
// << j652a.java >>
//
//  ファイル処理（５）ファイルダンプ（１６進数）
//
//　　ファイルの内容を１６進数で表示する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j652a {

  static char ch[] = { '0','1','2','3','4','5','6','7','8','9',
                       'a','b','c','d','e','f' };
  static int c1,c2;

  public static void main(String args[]) {

    try {
      // 入力ストリームを作成。 
      FileInputStream fis = new FileInputStream(args[0]); 

      System.out.printf("       ");
      for( int i=0; i<=15; i++ ) { System.out.printf("  " + ch[i]); }
      System.out.println();
      for( int i=0; i<=6+3*16; i++ ) { System.out.printf("-"); }

      // 読込みループ。
      int c; // 読み込まれた１バイト。入出力はint型で行われる。
             // byte型は、-128～127。int型は、0～255。
      int n = 0, k = 16;
      while( (c = fis.read()) != -1 ) {
        if( k > 15 ) { 
          System.out.println();
          System.out.printf("%05x: ",n);
          k = 0;
        }
        n++; k++;
        // 整数cを上位４ビットc1、下位４ビットc2に分解。
        c1 = c/16; c2 = c%16;
        System.out.print(" " + ch[c1] + ch[c2]); 
      }

      if( k != 0 ) { System.out.println(); }

      for( int i=0; i<=6+3*16; i++ ) { System.out.printf("-"); }
      System.out.println();

      // 入力ストリームを閉じる。
      fis.close();
    } catch ( Exception e ) { } 

  }

} 
/*
<font size=5 color=blue>実行結果</font><br>

<pre>
% javac j652a.java
% java j652a j631a.txt
         0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f
-------------------------------------------------------
00000:  0c f4 0c 00
-------------------------------------------------------

% java j652a j631b.txt
         0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f
-------------------------------------------------------
00000:  31 32 0d 0a 2d 31 32 0d 0a 31 32 0d 0a 32 35 36
00010:  0d 0a
-------------------------------------------------------
*/
