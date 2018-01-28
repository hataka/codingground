// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j841g.java 
 * created : Time-stamp: <09/07/02(��) 16:48:36 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841g.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841g.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�A���񉻁j
//
//�@�@�W�����o�C�g��ɕϊ����t�@�C���ɕۑ��E��������B
//
//    ���񉻂���I�u�W�F�N�g��Serializable�C���^�[�t�F�[�X����������K�v������B
//    public class TreeSet extends AbstractSet
//                         implements SortedSet, Cloneable, Serializable
//
//�@��java.io.ObjectOutputStream�N���X
//
//�@��ObjectOutputStream�N���X�̃R���X�g���N�^
//�@�@ObjectOutputStream(OutputStream os)
//      �@�\�FOutputStream os�ɏ�������ObjectOutputStream�𐶐�����B
//�@�@
//�@��ObjectOutputStream�N���X�̃��\�b�h
//�@�@void writeObject(Object obj)
//      �@�\�F�I�u�W�F�N�gobj��ObjectOutputStream�ɏ������ށB
//
//�@��java.io.ObjectIntputStream�N���X
//
//�@��ObjectIntputStream�N���X�̃R���X�g���N�^
//�@�@ObjectInputStream(InputStream is)
//      �@�\�FInputStream is����ObjectInputStream�𐶐�����B
//�@�@
//�@��ObjectInputStream�N���X�̃��\�b�h
//�@�@Object readObject()
//      �@�\�FObjectInputStream����I�u�W�F�N�g��ǂݍ��ށB
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;
import java.io.*;

class j841g {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    TreeSet<String> ts = new TreeSet<String>();

    // �v�f��ǉ��B
    ts.add("aaa");
    ts.add("bbb");
    ts.add("ccc");
    ts.add("ddd");

    System.out.println("���ׂĂ̗v�f(���񉻑O)�F" + ts);
    System.out.println();

    try {
      // �ۑ��p�t�@�C�����B
      String f = "j841g.txt";

      // �o�̓X�g���[���̐����B
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // �W���𐮗񉻂��Aoos�ɏ������ށB
      oos.writeObject(ts);
      System.out.println("�W�����o�C�g��ɕϊ����t�@�C���̕ۑ�");
      System.out.println();

      // �o�̓X�g���[�������B
      fos.close();
      oos.close();

      // ���̓X�g���[���̍쐬�B
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // ois����I�u�W�F�N�g����́B
      TreeSet g = (TreeSet)ois.readObject();
      System.out.println("�o�C�g��̃t�@�C������W���𕜌�");
      System.out.println();

      // �I�u�W�F�N�g�̊m�F�B
      System.out.println("���ׂĂ̗v�f(���񉻌�)�F" + g);

      // ���̓X�g���[�������B
      fis.close();
      ois.close();

    } catch ( Exception e ) { 
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j841g.java
��:j841g.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841g
���ׂĂ̗v�f(���񉻑O)�F[aaa, bbb, ccc, ddd]

�W�����o�C�g��ɕϊ����t�@�C���̕ۑ�

�o�C�g��̃t�@�C������W���𕜌�

���ׂĂ̗v�f(���񉻌�)�F[aaa, bbb, ccc, ddd]
</pre>

</body>
</html>
*/
