////////////////////////////////////////////////////////////////////////////////
// << j642b.java >>
//
//  ファイル処理（４）Scannerクラス（ファイルから整数を入力）
//
//    ファイルから、整数をひとつずつ入力し、コンソールへ出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642b {

  public static void main(String args[]) {

    try {
      // ファイルを指定し開く。
      Scanner f = new Scanner(new File("j642b.txt"));
      // ファイルから整数を１個入力しコンソールへ出力。
      while( f.hasNextInt() ) {
        int n = f.nextInt();
        System.out.println("整数：" + n);
      }
    } catch( Exception e ) { }

  }

} 
/*
<font size=5 color=blue>実行結果</font>

<pre>
% type j642b.txt
123
0
-123

% javac j642b.java
% java j642b
整数：123
整数：0
整数：-123
*/
