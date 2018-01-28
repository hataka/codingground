//  -*- mode: java -*-  Time-stamp: <2009-06-17 19:56:29 kahata>
/*================================================================
 * title: 
 * file: j142s.java
 * created : Time-stamp: <09/06/16(��) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j142.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j142.java >>
//
//  ��b�i�S�j�F����iswitch���j
//
//  ��switch��
//
//      switch( �� ) {
//        case �萔�P:
//          �����P;
//          break;
//        case �萔�Q:
//          �����Q;
//          break;
//        default:
//          �����R;
//          break;
//      } 
//      
//      �E���̌v�Z���ʂ��萔�P�ɓ������ꍇ�A�����P�����s�����B
//      �E���̌v�Z���ʂ��萔�Q�ɓ������ꍇ�A�����Q�����s�����B
//      �E���̑��̏ꍇ�A�����R�����s�����B
//      �E���Ȃ킿�A���̌v�Z���ʂɂ��A�����P�C�����Q�A�����R�̂����ꂩ�ЂƂ�
//�@�@�@�@���������s�����B
//
////////////////////////////////////////////////////////////////////

import java.lang.String;

class j142s {
  StringBuffer outbuf = new StringBuffer(256);   //(1)
  public j142s() {
    int i;
    // switch���̓���m�F�B
    i = 1;
    outbuf.append(String.format("i = " + i+"\n"));
    switch( i ) { 
      case 1:           
        outbuf.append(String.format("�����P")); break;
      case 2:           
        outbuf.append(String.format("�����Q")); break;
      default:           
        outbuf.append(String.format("�����R")); break;
    } 
    outbuf.append(String.format("\n\n"));

    // switch���̓���m�F�B
    i = 2;
    outbuf.append(String.format("i = " + i+"\n"));
    switch( i ) { 
      case 1: outbuf.append(String.format("�����P")); break;
      case 2: outbuf.append(String.format("�����Q")); break;
      default: outbuf.append(String.format("�����R")); break;
    } 
    outbuf.append(String.format("\n\n"));

    // switch���̓���m�F�B
    i = 3;
    outbuf.append(String.format("i = " + i +"\n"));
    switch( i ) { 
      case 1: outbuf.append(String.format("�����P")); break;
      case 2: outbuf.append(String.format("�����Q")); break;
      default: outbuf.append(String.format("�����R")); break;
    } 
  }

  public static void main(String args[]) {
		StringBuffer txt = new j142s().outbuf;
		System.out.println(txt);
 }
}
/*
���s����

% javac j142.java
% java j142
i = 1
�����P

i = 2
�����Q

i = 3
�����R
*/
