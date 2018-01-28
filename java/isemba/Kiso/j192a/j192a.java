// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j192a.java 
 * created : Time-stamp: <09/06/30(��) 17:08:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j192a.htm
 * description: JavaConsoleApplication  Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j192a.java >>
//
//  ��b�i�X�j�F�L�[�{�[�h������́i���@�P�A�������́j
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;  

class j192a {
  public static void main(String args[]) {
 
    // �L�[�{�[�h������͂��鏀���B
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // ������Ǎ��ރ��[�v�B
    String line;
    while( true ) {
      try {
        System.out.print("�f�[�^����͂��ĉ������F");
        // �P�s���̓Ǎ��݁B
        line = br.readLine();
        if( line == null ) { break; }
        // �����֕ϊ��B
        int i = Integer.parseInt(line);
        System.out.println("���̓f�[�^�F" + i);
      } catch (Exception e) {
        System.out.println(e);
      } 
    } 
  } 
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j192a.java
% java j192a
�f�[�^����͂��ĉ������F12
���̓f�[�^�F12
�f�[�^����͂��ĉ������F345
���̓f�[�^�F345
�f�[�^����͂��ĉ������F^Z
</pre>

</body>
</html>
*/
