// -*- mode: java -*- Time-stamp: <2009-06-19 11:29:47 kahata>
/*====================================================================
 * name: j821g.java 
 * created : Time-stamp: <09/06/19(��) 11:26:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j821g.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j821g.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iLinkedList�N���X�A���񉻁j
//
//�@�@���X�g���o�C�g��ɕϊ����t�@�C���ɕۑ��E��������B
//
//    ���񉻂���I�u�W�F�N�g��Serializable�C���^�[�t�F�[�X����������K�v������B
//    public class LinkedList extends AbstractSequentialList
//                            implements List, Cloneable, Serializable

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
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;
import java.io.*;

class j821g {

  public static void main(String args[]) {

    // ��̃��X�g�𐶐��B
    LinkedList<String> a = new LinkedList<String>();

    // �v�f��ǉ��B
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    a.add("ddd");

    System.out.println("���ׂĂ̗v�f(���񉻑O)�F" + a);
    System.out.println();

    try {
      // �ۑ��p�t�@�C�����B
      String f = "j821g.dat";

      // �o�̓X�g���[���̐����B
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // ���X�g�𐮗񉻂��Aoos�ɏ������ށB
      oos.writeObject(a);
      System.out.println("���X�g���o�C�g��ɕϊ����t�@�C���̕ۑ�");
      System.out.println();

      // �o�̓X�g���[�������B
      fos.close();
      oos.close();

      // ���̓X�g���[���̍쐬�B
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // ois����I�u�W�F�N�g����́B
      LinkedList b = (LinkedList)ois.readObject();
      System.out.println("�o�C�g��̃t�@�C�����烊�X�g�𕜌�");
      System.out.println();

      // �I�u�W�F�N�g�̊m�F�B
      System.out.println("���ׂĂ̗v�f(���񉻌�)�F" + b);

      // ���̓X�g���[�������B
      fis.close();
      ois.close();

    } catch ( Exception e ) { 
      System.out.println(e);
    }
  }
}
/*
���s����
% javac j821g.java
��: j821g.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j821g
���ׂĂ̗v�f(���񉻑O)�F[aaa, bbb, ccc, ddd]

���X�g���o�C�g��ɕϊ����t�@�C���̕ۑ�

�o�C�g��̃t�@�C�����烊�X�g�𕜌�

���ׂĂ̗v�f(���񉻌�)�F[aaa, bbb, ccc, ddd]
*/
