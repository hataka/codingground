////////////////////////////////////////////////////////////////////////////////
// << j642b.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�t�@�C�����琮������́j
//
//    �t�@�C������A�������ЂƂ����͂��A�R���\�[���֏o�͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642b {

  public static void main(String args[]) {

    try {
      // �t�@�C�����w�肵�J���B
      Scanner f = new Scanner(new File("j642b.txt"));
      // �t�@�C�����琮�����P���͂��R���\�[���֏o�́B
      while( f.hasNextInt() ) {
        int n = f.nextInt();
        System.out.println("�����F" + n);
      }
    } catch( Exception e ) { }

  }

} 
/*
<font size=5 color=blue>���s����</font>

<pre>
% type j642b.txt
123
0
-123

% javac j642b.java
% java j642b
�����F123
�����F0
�����F-123
*/
