// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821b.java 
 * created : Time-stamp: <09/06/30(火) 12:57:55 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821b.java >>
//
//  データ構造（２）：リスト（LinkedListクラス、反復子　J2SE1.4までの機能）
//
//　　リストのすべての要素をたどる。
//
//    ２つの方法を示す。
//　　　方法１：位置を指定して表示する方法
//　　　　　　　順方向、逆方向の処理ができるが、効率は悪い。
//　　　方法２：反復子を使う方法
//              反復子(リスト内の要素を適切な順序で取り出す)を使って、
//　　　　　　　順方向、逆方向の処理ができる。
//                                
//　　　反復子はListIteratorインターフェースで実現する。
//
//　●java.util.ListIeratorインターフェース
//    ・public interface ListIterator extends Iterator
//
//　○ListIeratorインターフェースのメソッド
//　　public boolean hasNext()
//      機能：順方向に要素がある場合true。
//　　public boolean hasPrevious()
//      機能：逆方向に要素がある場合true。
//　　public Object next()
//      機能：次の要素を取得する。
//　　public Object previous()
//      機能：直前の要素を取得する。
//
//　○LinkedListクラスのメソッド
//　　public ListIterator listIterator(int i)
//      機能：位置iを始点とするリスト反復子を取得する。
//　　public Object get(int i)
//　　　機能：このリストの位置iの要素を取り出す。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j821b {

  public static void main(String args[]) {

    // 空のリストを作成。
    LinkedList<String> a = new LinkedList<String>();

    // 要素の追加。
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    a.add("ddd");

    // リストのすべての要素をたどる(方法１：順方向)。
    System.out.print("方法１(順方向)："); 
    for( int i=0; i<a.size(); i++ ) {
      System.out.print(" [" + i + "]" + (String)a.get(i));
    }   
    System.out.println(); 

    // リストのすべての要素をたどる(方法１：逆方向)。
    System.out.print("方法１(逆方向)："); 
    for( int i=a.size()-1; i>=0; i-- ) {
      System.out.print(" [" + i + "]" + (String)a.get(i));
    }   
    System.out.println(); 

    // リストのすべての要素をたどる(方法２：順方向)。
    ListIterator li = a.listIterator(0);
    System.out.print("方法２(順方向)："); 
    while( li.hasNext() ) {
      System.out.print(" " + li.next()); 
    }   
    System.out.println();

    // リストのすべての要素をたどる(方法２：逆方向)。
    ListIterator lj = a.listIterator(a.size());
    System.out.print("方法２(逆方向)："); 
    while( lj.hasPrevious() ) {
      System.out.print(" " + lj.previous()); 
    }   
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br>

<pre>
% javac j821b.java
注: j821b.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j821b
方法１(順方向)： [0]aaa [1]bbb [2]ccc [3]ddd
方法１(逆方向)： [3]ddd [2]ccc [1]bbb [0]aaa
方法２(順方向)： aaa bbb ccc ddd
方法２(逆方向)： ddd ccc bbb aaa
</pre>

</body>
</html>
*/
