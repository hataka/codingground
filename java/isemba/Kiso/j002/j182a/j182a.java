// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j182a.java 
 * created : Time-stamp: <09/06/30(��) 17:03:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j182a.htm
 * description: JavaConsoleApplication  Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j182a.java >>
//
//  ��b�i�W�j�F�s�^�S���X���i�f�p�ȉ�@)
//
//�@�@a*a + b*b = c*c (1<=a<=b<=c, c*c<=n)�𖞂����s�^�S���X���̌������߂�B
//
//               n      n�ȉ��̃s�^�S���X��
//             10**3             11
//             10**4             52
//             10**5            220
//
////////////////////////////////////////////////////////////////////////////////

class j182a {
  public static void main(String args[]) {

    int n = 100000; 
    int count = 0; // �s�^�S���X���̌��B
    int w;

    for( int c=1; c*c<=n; c++ ) { 
      for( int b=1; b<=c; b++ ) {
        for( int a=1; a<=b; a++ ) {
          w = a*a + b*b;
          if( w == c*c ) { count++; }
          if( w >= c*c ) { break; }
        }
      }
    }

    System.out.println(n + "�ȉ��̃s�^�S���X����" + count + "����܂�");
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j182a.java

% java j182a
100000�ȉ��̃s�^�S���X����220����܂�
</pre>

</body>
</html>
*/
