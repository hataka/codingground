// -*- mode: java -*- Time-stamp: <2009-07-02 17:33:46 kahata>
/*====================================================================
 * name: j851g.java 
 * created : Time-stamp: <09/07/02(��) 17:32:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851g.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851g.java >>
//
//  �f�[�^�\���i�T�j�F�W���iHashMap�N���X�A���񉻁j
//
//�@�@�W�����o�C�g��ɕϊ����t�@�C���ɕۑ��E��������B
//
//    ���񉻂���I�u�W�F�N�g��Serializable�C���^�[�t�F�[�X����������K�v������B
//    public class HashMap extends AbstractMap
//                         implements Map, Cloneable, Serializable
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

class j851g {

  public static void main(String args[]) {

    // ��̃}�b�v���쐬�B
    HashMap<String,String> hm = new HashMap<String,String>();

    // �v�f��ǉ��B
    hm.put("A","Airplane");
    hm.put("B","Bus");
    hm.put("C","Cap");
    hm.put("D","Desk");

    System.out.println("���ׂĂ̗v�f(���񉻑O)�F" + hm);
    System.out.println();

    try {
      // �ۑ��p�t�@�C�����B
      String f = "j851g.txt";

      // �o�̓X�g���[���̐����B
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // �W���𐮗񉻂��Aoos�ɏ������ށB
      oos.writeObject(hm);
      System.out.println("�W�����o�C�g��ɕϊ����t�@�C���̕ۑ�");
      System.out.println();

      // �o�̓X�g���[�������B
      fos.close();
      oos.close();

      // ���̓X�g���[���̍쐬�B
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // ois����I�u�W�F�N�g����́B
      HashMap g = (HashMap)ois.readObject();
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
% javac j851g.java
��:j851g.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j851g
���ׂĂ̗v�f(���񉻑O)�F{D=Desk, A=Airplane, C=Cap, B=Bus}

�W�����o�C�g��ɕϊ����t�@�C���̕ۑ�

�o�C�g��̃t�@�C������W���𕜌�

���ׂĂ̗v�f(���񉻌�)�F{D=Desk, A=Airplane, C=Cap, B=Bus}

</pre>

</body>
</html>
*/
