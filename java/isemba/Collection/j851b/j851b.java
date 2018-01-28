// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j851b.java 
 * created : Time-stamp: <09/07/02(��) 17:10:29 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851b.java >>
//
//  �f�[�^�\���i�T�j�F�}�b�v�iHashMap�N���X�A�����q�@J2SE1.4�܂ł̋@�\�j
//
//�@�@�}�b�v�Ɋ܂܂��L�[�ƒl�̑g�����ׂĂ��ǂ�B
//�@�@�L�[�ƒl�̑g�̏����͂��̂Ǖω�����B
//
//�@��java.util.Map�C���^�[�t�F�[�X   
//�@�@�Epublic interface Map
//�@�@�E�}�b�v�ɂ́A����̃L�[�𕡐��o�^���邱�Ƃ͂ł��Ȃ��B
//�@�@�@�e�L�[�ɂ́A1 �̒l���Ή��Â�����B
//
//�@��Map�C���^�[�t�F�[�X�̃��\�b�h
//    public Set keySet()
//�@�@�@�@�\�F�}�b�v�Ɋ܂܂�Ă���L�[�̏W����Ԃ��B�L�[�̏W���̓}�b�v�ƘA������
//�@�@�@�@�@�@����̂ŁA�}�b�v�ɑ΂���ύX�̓L�[�̏W���ɔ��f����A�܂��A�L�[��
//�@�@�@�@�@�@�W���ɑ΂���ύX�̓}�b�v�ɔ��f�����B
//�@�@�@�@�@�@���������āA�L�[�̏W���ɑ΂��锽���̏������Ƀ}�b�v���ύX���ꂽ�ꍇ�A
//�@�@�@�@�@�@�����̌��ʂ͕ۏ؂���Ȃ��B
//
//�@��java.util.Set�C���^�t�F�[�X
//�@�@�Epublic interface Set extends Collection
//�@�@�E�v�f�̏d���������Ȃ��W���̃��\�b�h��錾����B
//
//�@��Set�C���^�t�F�[�X�̃��\�b�h
//    public Iterator iterator()
//�@�@�@�@�\�F�W�����̗v�f�ɂ��Ă̔����q��Ԃ��B
//�@�@�@�@�@�@�W���ɏ�������`����Ă��Ȃ��ꍇ�A���̂ǈقȂ��������ŗv�f��
//�@�@�@�@�@�@�Ԃ����B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j851b {

  public static void main(String args[]) {

    // ��̃}�b�v���쐬�B
    HashMap<String, String> hm = new HashMap<String, String>();

    // �L�[�ƒl�̑g��ǉ��B
    hm.put("C","Car");
    hm.put("A","Airplane");
    hm.put("B","Book"); hm.put("B","Bird"); // �L�[���d�������ꍇ�A�㏑�������B

    // �L�[�ƒl�̂��ׂĂ̑g�����ǂ�B
    System.out.println("�L�[�ƒl�̂��ׂĂ̑g"); 
    Set s = (Set)(hm.keySet());
    Iterator is = s.iterator();
    while( is.hasNext() ) {
      Object key = is.next();
      System.out.println("�L�[�F" + key + "�@�l�F" + hm.get(key));
    }
    System.out.println();

    // �L�[�ƒl�̑g��ǉ��B
    hm.put("D","Car"); // �قȂ�L�[�������l�������Ă��悢�B

    // �L�[�ƒl�̑g�����ׂĂ��ǂ�B�O��ƈقȂ鏇�ɂ��ǂ���B
    System.out.println("�L�[�ƒl�̂��ׂĂ̑g(�O��ƈقȂ鏇�ɂ��ǂ���)"); 
    Set t = (Set)(hm.keySet());
    // �}�b�v�ɑ΂���ύX�̓L�[�̏W���ɔ��f�����B
    hm.put("E","Earth");
    // �L�[�̏W���ɑ΂���ύX�̓}�b�v�ɔ��f�����B
    t.remove("A");
    Iterator it = t.iterator();
    // �����ɁA�}�b�v�ւ̒ǉ�(hm.put("F","Fire"))�������ƃG���[�ɂȂ�B
    while( it.hasNext() ) {
      Object key = it.next();
      System.out.println("�L�[�F" + key + "�@�l�F" + hm.get(key));
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j851b.java
��:j851b.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j851b
�L�[�ƒl�̂��ׂĂ̑g
�L�[�FA�@�l�FAirplane
�L�[�FC�@�l�FCar
�L�[�FB�@�l�FBird

�L�[�ƒl�̂��ׂĂ̑g(�O��ƈقȂ鏇�ɂ��ǂ���)
�L�[�FD�@�l�FCar
�L�[�FC�@�l�FCar
�L�[�FB�@�l�FBird
�L�[�FE�@�l�FEarth
</pre>

</body>
</html>
*/
