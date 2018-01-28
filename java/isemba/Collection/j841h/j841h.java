// -*- mode: java -*- Time-stamp: <2009-07-02 16:53:46 kahata>
/*====================================================================
 * name: j841h.java 
 * created : Time-stamp: <09/07/02(木) 16:52:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841h.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841h.java >>
//
//  データ構造（４）：集合（TreeSetクラス、集合と配列の相互変換）
//
//　　集合と配列の相互変換を行う。
//　　配列から集合への変換はリストを介して行う。
//
//　●TreeSetクラスのコンストラクタ
//    public TreeSet(Collection c)
//　　　機能：コレクションcの要素の自然な順序づけにしたがう集合を作成する。
//
//　●TreeSetクラスのメソッド
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

public class j841h {

  public static void main(String args[]) {

    // 空の集合を作成。
    TreeSet<String> ts = new TreeSet<String>();

    // 要素を追加。
    ts.add("ddd");
    ts.add("aaa");
    ts.add("eee");
    ts.add("ccc");
    ts.add("bbb");

    // 集合の表示。
    System.out.println("集合：" + ts);
    System.out.println();

    // 集合から配列への変換と表示。
    String s[] = new String[ts.size()];
    ts.toArray(s);
    System.out.println("集合から配列への変換後の配列");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // 配列からリストへ変換。
    List<String> a = (List<String>)Arrays.asList(s);
    System.out.println("配列からリストへの変換後のリスト");
    for( int i=0; i<a.size(); i++ ) { System.out.print(" " + a.get(i)); }
    System.out.println(); System.out.println();

    // リストから集合へ変換。
    TreeSet<String> g = new TreeSet<String>(a);
    System.out.println("リストから集合への変換後の集合：" + g);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j841h.java
注:j841h.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j841h
集合：[aaa, bbb, ccc, ddd, eee]

集合から配列への変換後の配列
 aaa bbb ccc ddd eee

配列からリストへの変換後のリスト
 aaa bbb ccc ddd eee

リストから集合への変換後の集合：[aaa, bbb, ccc, ddd, eee]
</pre>

</body>
</html>
*/
