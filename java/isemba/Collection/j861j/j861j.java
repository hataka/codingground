// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861j.java 
 * created : Time-stamp: <09/07/02(��) 17:54:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861j.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861j.java >>
//
//  �f�[�^�\���i�U�j�F�}�b�v�iTreeMap�N���X�A���s���ԁj
//
//�@�@����̎��s���Ԃ𑪒肷��B
//
//�@��java.lang.System�N���X
//�@�@�Epublic final class System extends Object
//�@�@�ESystem�N���X�ɂ͗L�p�ȃN���X�t�B�[���h����у��\�b�h������B
//�@�@�E�I�u�W�F�N�g���쐬�ł��Ȃ��B 
//
//�@��System�N���X�̃��\�b�h
//�@  public static long currentTimeMillis()
//�@�@�@�@�\�F���ݎ����Ƌ��萢�E���� UTC 1970�N1��1���ߑO0���Ƃ̍����~���b��
//�@�@�@�@�@�@�Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j861j {

  public static void main(String args[]) {

//  int n = Integer.parseInt(args[0]); // args[0]:�J��Ԃ��񐔁B
    int n = 10000;

    System.out.println("�J��Ԃ��񐔁F"+n);

    // ��̃}�b�v���쐬�B
    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

    // �v�f�̒ǉ����ԁB
    long t0 = System.currentTimeMillis();
    for( int i=1; i<=n; i++ ) { tm.put(new Integer(i),new Integer(i)); }
    long t1 = System.currentTimeMillis();
    double mt = (t1-t0)/(double)n;
    System.out.println("�ǉ�����(put   )�̕��ώ��s���ԁF" + mt + "�~���b");

    // �v�f�̍폜���ԁB
    t0 = System.currentTimeMillis();
    for( int i=1; i<=n; i++ ) { tm.remove(new Integer(i)); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("�폜����(remove)�̕��ώ��s���ԁF" + mt + "�~���b");
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j861j.java
��:j861j.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j861j 10000
�J��Ԃ��񐔁F10000
�ǉ�����(put   )�̕��ώ��s���ԁF0.0030�~���b
�폜����(remove)�̕��ώ��s���ԁF0.0020�~���b
</pre>

</body>
</html>
*/