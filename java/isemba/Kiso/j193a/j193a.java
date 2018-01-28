// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j193a.java 
 * created : Time-stamp: <09/06/30(��) 17:10:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j193a.htm
 * description: JavaConsoleApplication  Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j193a.java >>
//
//  ��b�i�X�j�F�L�[�{�[�h������́i���@�Q�A��������́j
//
//�@��hasNextLine()���\�b�h
//�@�@nextLine()�����s�\�̏ꍇtrue�A���s�s�\�̏ꍇfalse�B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;  

class j193a {
  public static void main(String args[]) {
 
    // �L�[�{�[�h������͂��鏀���B
    Scanner sc = new Scanner(System.in);

    // �������Ǎ��ރ��[�v�B
    try {
      while( sc.hasNextLine() ) {
        String s = sc.nextLine();
        System.out.println("���̓f�[�^�F" + s);
      }
    } catch (Exception e) {
      System.out.println(e);
    } 
  } 
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j193a.java
% java j193a
abcd efg
���̓f�[�^�Fabcd efg
123456789 ABCD
���̓f�[�^�F123456789 ABCD
^Z
</pre>

</body>
</html>
*/
