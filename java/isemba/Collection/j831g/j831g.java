// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j831g.java 
 * created : Time-stamp: <09/07/02(��) 08:35:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831g.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831g.java >>
//
//  �f�[�^�\���i�R�j�F�W���iHashSet�N���X�A���񉻁j
//
//�@�@�W�����o�C�g��ɕϊ����t�@�C���ɕۑ��E��������B
//
//    ���񉻂���I�u�W�F�N�g��Serializable�C���^�[�t�F�[�X����������K�v������B
//    public class HashSet extends AbstractSet
//                         implements Set, Cloneable, Serializable
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

class j831g {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    HashSet<String> hs = new HashSet<String>();

    // �v�f��ǉ��B
    hs.add("aaa");
    hs.add("bbb");
    hs.add("ccc");
    hs.add("ddd");

    System.out.println("���ׂĂ̗v�f(���񉻑O)�F" + hs);
    System.out.println();

    try {
      // �ۑ��p�t�@�C�����B
      String f = "j831g.txt";

      // �o�̓X�g���[���̐����B
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // �W���𐮗񉻂��Aoos�ɏ������ށB
      oos.writeObject(hs);
      System.out.println("�W�����o�C�g��ɕϊ����t�@�C���̕ۑ�");
      System.out.println();

      // �o�̓X�g���[�������B
      fos.close();
      oos.close();

      // ���̓X�g���[���̍쐬�B
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // ois����I�u�W�F�N�g����́B
      HashSet g = (HashSet)ois.readObject();
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
% javac j831g.java
��: j831g.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j831g
���ׂĂ̗v�f(���񉻑O)�F[ccc, aaa, ddd, bbb]

�W�����o�C�g��ɕϊ����t�@�C���̕ۑ�

�o�C�g��̃t�@�C������W���𕜌�

���ׂĂ̗v�f(���񉻌�)�F[ccc, aaa, ddd, bbb]
</pre>

</body>
</html>
*/
