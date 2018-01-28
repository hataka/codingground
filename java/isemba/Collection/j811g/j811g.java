// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811g.java 
 * created : Time-stamp: <09/06/18(��) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811g.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811g.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iArrayList�N���X�A���񉻁j
//
//�@�@���X�g���o�C�g��ɕϊ����t�@�C���ɕۑ��E��������B
//
//    ���񉻂���I�u�W�F�N�g��Serializable�C���^�[�t�F�[�X����������K�v������B
//    public class ArrayList extends AbstractList
//                       implements List, RandomAccess, Cloneable, Serializable
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

class j811g {

  public static void main(String args[]) {

    // ��̃��X�g�𐶐��B
    ArrayList<String> a = new ArrayList<String>();

    // �v�f��ǉ��B
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    a.add("ddd");

    System.out.println("���ׂĂ̗v�f(���񉻑O)�F" + a);
    System.out.println();

    try {
      // �ۑ��p�t�@�C�����B
      String f = "j811g.dat";

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
      ArrayList<String> b = (ArrayList<String>)ois.readObject();
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
% javac j811g.java
��: j811g.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j811g
���ׂĂ̗v�f(���񉻑O)�F[aaa, bbb, ccc, ddd]

���X�g���o�C�g��ɕϊ����t�@�C���̕ۑ�

�o�C�g��̃t�@�C�����烊�X�g�𕜌�

���ׂĂ̗v�f(���񉻌�)�F[aaa, bbb, ccc, ddd]
*/
