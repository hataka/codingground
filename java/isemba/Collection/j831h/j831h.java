// -*- mode: java -*- Time-stamp: <2009-07-02 08:46:40 kahata>
/*====================================================================
 * name: j831h.java 
 * created : Time-stamp: <09/07/02(木) 08:43:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831h.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831h.java >>
//
//  データ構造（３）：リスト（HashSetクラス、集合と配列の相互変換）
//
//　　集合と配列の相互変換を行う。
//　　配列から集合への変換はリストを介して行う。
//
//　●HashSetクラスのコンストラクタ
//    public HashSet(Collection c)
//　　　機能：コレクションcの要素を格納する集合を作成する。
//
//　●HashSetクラスのメソッド
//    public Object[] toArray(Object[] s)
//　　　機能：リスト内に保存されてる順序と同じ順序で要素が格納されている配列s
//　　　　　　を返す。返される配列sの型は指定された配列の型になる。
//
//　●java.util.Arraysクラス
//　　・Arraysクラスを使って、配列のソートや検索を行うことができる。
//　　・Arraysクラスのメソッドは、クラスメソッドなので、オブジェクトを作成せずに
//　　　使うことができる。
//
//　○Arraysクラスのメソッド
//    static List asList(Object[] a)
//　　　機能：配列aからリストを返す。このリストのサイズの変更はできない。
//　　　　　　したがって、要素の追加・削除はできないが、変更はできる。
//　　　　　　また、リストへの変更は、そのまま配列に書き込まれる。
//
///////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j831h {
  public static void main(String args[]) {

    // 空の集合を作成。
    HashSet<String> hs = new HashSet<String>();

    // 要素を追加。
    hs.add("ddd");
    hs.add("aaa");
    hs.add("eee");
    hs.add("ccc");
    hs.add("bbb");

    // 集合の表示。
    System.out.println("集合：" + hs);
    System.out.println();

    // 集合から配列への変換と表示。
    String s[] = new String[hs.size()];
    hs.toArray(s);
    System.out.println("集合から配列への変換後の配列");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // 配列からリストへ変換。
    List<String> a = (List<String>)Arrays.asList(s);
    System.out.println("配列からリストへの変換後のリスト");
    for( int i=0; i<a.size(); i++ ) { System.out.print(" " + a.get(i)); }
    System.out.println(); System.out.println();

    // リストから集合へ変換。
    HashSet<String> g = new HashSet<String>(a);
    System.out.println("リストから集合への変換後の集合：" + g);

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j831h.java
注: j831h.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831h
集合：[ccc, aaa, eee, ddd, bbb]

集合から配列への変換後の配列
 ccc aaa eee ddd bbb

配列からリストへの変換後のリスト
 ccc aaa eee ddd bbb

リストから集合への変換後の集合：[ccc, aaa, eee, ddd, bbb]
</pre>

</body>
</html>
*/
