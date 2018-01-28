// -*- mode: java -*- Time-stamp: <2009-07-02 09:21:25 kahata>
/*====================================================================
 * name: j841b.java 
 * created : Time-stamp: <09/07/02(木) 09:13:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841b.java >>
//
//  データ構造（４）：集合（TreeSetクラス、反復子　J2SE1.4までの機能）
//
//　　反復子を使って、集合のすべての要素をたどる。
//
//    昇順の場合：Iteratorインターフェースを使う。
//　　降順の場合：IteratorインターフェースとComparatorインターフェースを使う。
//
//      Comparatorインターフェースを使うとたどる順序を変更できる。
//
//  ●TreeSetクラスのコンストラクタ
//　　public TreeSet()
//      機能：要素の自然順序付けにしたがう空の集合を作成する。
//　　public TreeSet(Comparator c)
//      機能：コンパレータcによる順序づけにしたがう空の集合を作成する。
//
//  ●TreeSetクラスのメソッド
//　　public Iterator iterator()
//      機能：反復子を取得する。
//
//　●Iteratorインターフェースのメソッド
//　　public boolean hasNext()
//      機能：つぎの要素がある場合true、その他false。
//　　public Object next()
//      機能：つぎの要素を取得する。
//
//　●Comparatorインターフェースのメソッド
//　　public int compare(Object obj1, Object obj2)
//      機能：obj1がobj2より小さいとき、-1
//            obj1とobj2が等しいとき、0
//            obj1がobj2より大きいとき、1
//　　　　　　このメソッドをオーバーライドして順序を変更できる。
//
//  ●Stringクラスのメソッド
//　　public int compareTo(String s)
//      機能：文字列を辞書式に比較する。
//            s1.compareTo(s2) s1,s2は文字列
//　　　　　　s1がs2より辞書式に前にある場合は、結果は負の整数
//　　　　　　s1がs2と等しい場合は、結果は0
//　　　　　　s1がs2より辞書式に後にある場合は、結果は正の整数
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class decorder implements Comparator<String> {
  public int compare(String obj1, String obj2) {
    int c = obj1.compareTo(obj2);
    return -c;
  }
} 

class j841b {

  public static void main(String args[]) {

    // 空の集合を作成。
    TreeSet<String> ts = new TreeSet<String>();

    // 要素を追加。
    ts.add("C"); 
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("D");

    // すべての要素を昇順にたどる。
    System.out.println("すべての要素をたどる（昇順）");
    Iterator it = ts.iterator();
    while( it.hasNext() ) {
      System.out.println(it.next());
    }
    System.out.println();

    // 空の集合を生成。
    TreeSet<String> tsdec = new TreeSet<String>(new decorder());

    // 要素を追加。
    tsdec.add("C");
    tsdec.add("A");
    tsdec.add("B");
    tsdec.add("E");
    tsdec.add("D"); 

    // すべての要素を降順にたどる。
    System.out.println("すべての要素をたどる（降順）");
    Iterator is = tsdec.iterator();
    while( is.hasNext() ) {
      System.out.println(is.next());
    }

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j841b.java
注:j841b.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j841b
すべての要素をたどる（昇順）
A
B
C
D
E

すべての要素をたどる（降順）
E
D
C
B
A
</pre>

</body>
</html>
*/
