// -*- mode: java -*- Time-stamp: <2009-06-19 11:21:54 kahata>
/*====================================================================
 * name: j831b.java 
 * created : Time-stamp: <09/06/19(金) 11:19:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j831b.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j831b.java >>
//
//  データ構造（３）：集合（HashSetクラス、反復子　J2SE1.4までの機能）
//
//　　集合のすべての要素をたどる。
//　　得られる要素の順番は制御できない。
//
//　●HashSetクラスのメソッド
//　　public Iterator iterator()
//　　　機能：集合の反復子を取得する。
//
//　●Iteratorインターフェースのメソッド
//　　public boolean hasNext()
//      機能：つぎの要素がある場合true、その他false。
//　　public Object next()
//      機能：つぎの要素を取得する。
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j831b {

  public static void main(String args[]) {

    // 空の集合を作成。
    HashSet<String> hs = new HashSet<String>();

    // 要素の追加。
    hs.add("A");
    hs.add("B");
    hs.add("C");

    // すべての要素をたどる。
    System.out.println("すべての要素");
    Iterator ih;
    ih = hs.iterator();
    while( ih.hasNext() ) {
      System.out.println(ih.next());
    }
    System.out.println();

    // 要素の追加。
    hs.add("D");
    hs.add("E");

    // すべての要素をたどる。
    System.out.println("すべての要素");
    ih = hs.iterator();
    while( ih.hasNext() ) {
      System.out.println(ih.next());
    }
  }
}
/*
実行結果
% javac j831b.java
注: j831b.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831b
すべての要素
A
C
B

すべての要素
D
A
C
B
E
*/
