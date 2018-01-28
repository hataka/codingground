// -*- mode: java -*- Time-stamp: <2009-06-18 13:20:56 kahata>
/*====================================================================
 * name: j811b.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811b.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811b.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、反復子　J2SE1.4までの機能）
//
//　　リストのすべての要素をたどる。
//
//    ２つの方法がある。
//　　(方法１)インデックスを使う。
//　　(方法２)反復子を使う。
//
//　●java.util.Listインタフェース
//　　・public interface List extends Collection
//    ・リスト内の要素をインデックスでアクセスする操作などが宣言されている。
//
//　○Listインタフェースのメソッド
//    public Iterator iterator()
//    　機能：リスト内の要素を適切な順序ですべて取り出す反復子を返す。
//
//　●java.util.Iteratorインターフェース
//    ・public interface Iterator
//　　・コレクションの反復子である。反復子を使って一連の要素を1 つずつ生成する。
//
//　○Iteratorインターフェースのメソッド
//　　public boolean hasNext()
//      機能：つぎの要素がある場合true、その他false。
//　　public Object next()
//      機能：つぎの要素を取得する。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j811b {

  public static void main(String args[]) {

    // 空のリストを作成。
    ArrayList<String> a = new ArrayList<String>();

    // 要素の追加。
    a.add("aaa");
    a.add("ccc");
    a.add("bbb"); a.add("bbb");

    // 方法１：すべての要素をたどる。
    System.out.println("方法１：インデックスを使う");
    for( int i=0; i<a.size(); i++ ) {
      System.out.println((String)a.get(i));
    }
    System.out.println();

    // 方法２：すべての要素をたどる。
    System.out.println("方法２：反復子を使う");
    Iterator ia = a.iterator();
    while( ia.hasNext() ) {
      System.out.println((String)ia.next());
    }
  }
}
/*
実行結果
% javac j811b.java
注: j811b.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811b
方法１：インデックスを使う
aaa
ccc
bbb
bbb

方法２：反復子を使う
aaa
ccc
bbb
bbb
*/
