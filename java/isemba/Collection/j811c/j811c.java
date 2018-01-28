// -*- mode: java -*- Time-stamp: <2009-06-18 13:34:49 kahata>
/*====================================================================
 * name: j811c.java 
 * created : Time-stamp: <09/06/18(��) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811c.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811c.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iArrayList�N���X�A���������E���s��@J2SE1.4�܂ł̋@�\�j
//
//�@�@ArrayList�N���X�̓X���b�h�ɑ΂��Ĉ��S�łȂ��B
//�@�@�����̃X���b�h��ArrayList�I�u�W�F�N�g�ɓ����ɃA�N�Z�X���A
//�@�@�v�f�̒ǉ���폜���s�Ȃ����Ƃ��A���ʂ��ۏ؂���Ȃ����Ƃ��m�F����B
//
//    ���X�g�ɑ΂���1000�̗v�f�̒ǉ��E�폜��n��J��Ԃ��X���b�hm�����s�����āA
//�@�@�Ō�Ƀ��X�g����ɂȂ邩�ǂ������ׂ�B
//�@�@�������Ƃ�Ă���΋󃊃X�g�������邪�A���s����΁A��łȂ����X�g��
//�@�@�����邩�A��~���Ȃ��Ȃ�B
//
//�@��java.util.List�C���^�[�t�F�[�X�̃��\�b�h
//    public boolean remove(Object obj)
//�@�@�@�@�\�F���X�g���ōŏ��Ɍ��o���ꂽ�v�fobj�폜����B
//�@�@�@�@�@�@���X�g���v�fobj��ێ����Ă���ꍇtrue�B 
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  ArrayList<Integer> a;
  int n;
  ARThread(ArrayList<Integer> a, int n) { // �R���X�g���N�^�B 
    this.a = a; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + a.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { a.add(new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { a.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + a.size());
  }
}

class j811c {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//    int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
	int m = 2;
	int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�łȂ���̃��X�g���쐬�B
    ArrayList<Integer> a = new ArrayList<Integer>();

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(a,n); arth[i].start();
    }

    // ���X�g�����̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("���X�g�F" + a.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
���s����
% javac j811c.java
��: j811c.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j811c 2 100
m = 2
n = 100
Thread-0�F�����J�n 0
Thread-1�F�����J�n 0
Thread-0�F�����I�� 24
Thread-1�F�����I�� 5
���X�g�F5
*/
