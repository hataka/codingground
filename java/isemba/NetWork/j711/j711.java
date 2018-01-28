// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j711.java 
 * created : Time-stamp: <09/07/03(��) 09:00:29 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j711.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j711.java >>
//
//  �l�b�g���[�N�i�P�j�FURL�N���X�ɂ��URL�̃`�F�b�N
//
//�@�@��������URL(Uniform Resource Locator)���w�肵�āA�L�����ǂ������ׂ�B
//�@�@�L���łȂ��Ƃ���O�����o�����B
//�@�@URL�́A�l�b�g���[�N��̏�񎑌��̈ʒu�𐳊m�Ɏ����B
//
//�@��URL�N���X�̃R���X�g���N�^
//    public URL(String s) throws MalformedURLException
//      �@�\�FURL s����URL�I�u�W�F�N�g���쐬�B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;

class j711 {
  public static void main(String args[]) {

    try { 
      URL url1 = new URL("http://www.ibaraki.ac.jp/index.html");
      System.out.println(url1);

      URL url2 = new URL("ftp://ftp.ibaraki.ac.jp/");
      System.out.println(url2);

      URL url3 = new URL("mailto://vega.cis.ibaraki.ac.jp/");
      System.out.println(url3);

      URL url4 = new URL("xyz://sava.cis.ibaraki.ac.jp/");
      System.out.println(url4);

    } catch( MalformedURLException e ) {
      System.out.println(e); 
    } 
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j711.java
% java j711
http://www.ibaraki.ac.jp/index.html/
ftp://ftp.ibaraki.ac.jp/
mailto://vega.cis.ibaraki.ac.jp/
java.net.MalformedURLException: unknown protocol: xyz
</pre>

</body>
</html>
*/
