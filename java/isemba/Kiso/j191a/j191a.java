// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j191a.java 
 * created : Time-stamp: <09/06/30(��) 17:06:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j191a.htm
 * description: JavaConsoleApplication  Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j191a.java >>
//
//  ��b�i�X�j�F�R�}���h���C�����當�������
//
//�@�@�R�}���h���C��������͂��ꂽ�����́AString�^�z��args[]�Ɋi�[����Ă����B
//
//      % java �N���X�� �����P �����Q �����R
//        args[0]=�����P�@args[1]=�����Q�@args[2]=�����R
//
//    ���̕��@�Ńv���O�����Ƀf�[�^����͂ł���B�K�v�Ȃ當���񂩂瑼�̌^��
//    �ϊ�����΂悢�B
//
//�@���z��̒���
//�@�@�z��.length �͔z��̒�����\���B
//
////////////////////////////////////////////////////////////////////////////////

class j191a {
  public static void main(String args[]) {

    // �����̕\���B
    if( args.length > 0 ) {
      for( int i=0; i<args.length; i++ ) {
        System.out.println("args[" + i + "]:" + args[i]);
      }
    } else {
      System.out.println("����������܂���");
    }
  }
}
/*
</pre> 

<font size=5 color=blue>���s����</font>

<pre>
% javac j191a.java

% java j191a abc 123 ���{��
args[0]:abc
args[1]:123
args[2]:���{��
</pre>

</body>
</html>
*/
