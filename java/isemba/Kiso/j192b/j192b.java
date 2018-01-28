// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j192b.java 
 * created : Time-stamp: <09/06/30(��) 17:08:56 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j192b.htm
 * description: JavaConsoleApplication  Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j192b.java >>
//
//  ��b�i�X�j�F�L�[�{�[�h������́i���@�Q�A�������́j
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;  

class j192b {
  public static void main(String args[]) {
 
    // �L�[�{�[�h������͂��鏀���B
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // ������Ǎ��ރ��[�v�B
    while( true ) {
      try {
        System.out.print("�f�[�^����͂��ĉ������F");
        // �P�s���̓Ǎ��݁B
        String line = br.readLine();
        if( line == null ) { break; }
        // �����֕ϊ��B
        double d = Double.parseDouble(line);
        System.out.println("���̓f�[�^�F" + d);
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
% javac j192b.java
% java j192b
�f�[�^����͂��ĉ������F12.34
���̓f�[�^�F12.34
�f�[�^����͂��ĉ������F-5678.9
���̓f�[�^�F-5678.9
�f�[�^����͂��ĉ������F^Z
</pre>

</body>
</html>
*/
