// -*- mode: java -*- Time-stamp: <2009-06-28 20:49:54 kahata>
/*====================================================================
 * name: j252d.java 
 * created : Time-stamp: <09/06/28(��) 20:49:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252d.java >>
//
//  �N���X�i�T�j�F�C���^�[�t�F�[�X�i����I�����j
//
//�@�@�C���^�[�t�F�[�X�����^�Ƃ���ϐ���z��́A���̃C���^�[�t�F�[�X����������
//�@�@����N���X�̃I�u�W�F�N�g���w�����Ƃ��ł���B
//�@�@���̂��Ƃ𗘗p����ƁA�N���X�͈قȂ��Ă��Ă��A�����C���^�[�t�F�[�X��
//�@�@�������Ă���N���X�ɑ΂��āA�C���^�[�t�F�[�X���̃��\�b�h�𓝈�I�ɏ����ł���B
//
//�@�@�i�P�j�C���^�[�t�F�[�X(intf)�̒�`�B
//�@�@�i�Q�j�C���^�[�t�F�[�X(intf)����������N���XC1�B
//�@�@�i�R�j�C���^�[�t�F�[�X(intf)����������N���XC2�B
//�@�@�i�S�j�C���^�[�t�F�[�X�^�̔z�񏀔��B
//�@�@�i�T�j�N���X(C1)�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�U�j�N���X(C2)�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�V�j�C���^�[�t�F�[�X�����\�b�hmi�ւ̃A�N�Z�X�B
//
///////////////////////////////////////////////////////////////////////////////

interface intf { //�i�P�j
  void mi(); 
}

class C1 implements intf {
  public void mi() { //�i�Q�j
    System.out.println("�N���X(C1)�Ŏ������ꂽ�C���^�[�t�F�C�X�����\�b�h(mi)");
  }
}

class C2 implements intf { 
    public void mi() { //�i�R�j
    System.out.println("�N���X(C2)�Ŏ������ꂽ�C���^�[�t�F�C�X�����\�b�h(mi)");
  }
}

class j252d {
  public static void main(String args[]) {

    intf obj[] = new intf[4]; //�i�S�j

    // �I�u�W�F�N�g�����B
    obj[0] = new C1(); //�i�T�j
    obj[1] = new C1(); //�i�T�j
    obj[2] = new C2(); //�i�U�j
    obj[3] = new C2(); //�i�U�j

    for( int i=0; i<obj.length; i++ ) {
      System.out.print("�i�V�jobj[" + i + "].mi()�F"); obj[i].mi(); //�i�V�j
    }
  }
}
/*
���s����
% javac j252d.java
% java j252d
�i�V�jobj[0].mi()�F�N���X(C1)�Ŏ������ꂽ�C���^�[�t�F�C�X�����\�b�h(mi)
�i�V�jobj[1].mi()�F�N���X(C1)�Ŏ������ꂽ�C���^�[�t�F�C�X�����\�b�h(mi)
�i�V�jobj[2].mi()�F�N���X(C2)�Ŏ������ꂽ�C���^�[�t�F�C�X�����\�b�h(mi)
�i�V�jobj[3].mi()�F�N���X(C2)�Ŏ������ꂽ�C���^�[�t�F�C�X�����\�b�h(mi)
*/
