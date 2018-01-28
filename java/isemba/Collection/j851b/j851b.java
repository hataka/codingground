// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j851b.java 
 * created : Time-stamp: <09/07/02(木) 17:10:29 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851b.java >>
//
//  データ構造（５）：マップ（HashMapクラス、反復子　J2SE1.4までの機能）
//
//　　マップに含まれるキーと値の組をすべてたどる。
//　　キーと値の組の順序はそのつど変化する。
//
//　●java.util.Mapインターフェース   
//　　・public interface Map
//　　・マップには、同一のキーを複数登録することはできない。
//　　　各キーには、1 つの値が対応づけられる。
//
//　○Mapインターフェースのメソッド
//    public Set keySet()
//　　　機能：マップに含まれているキーの集合を返す。キーの集合はマップと連動して
//　　　　　　いるので、マップに対する変更はキーの集合に反映され、また、キーの
//　　　　　　集合に対する変更はマップに反映される。
//　　　　　　したがって、キーの集合に対する反復の処理中にマップが変更された場合、
//　　　　　　反復の結果は保証されない。
//
//　●java.util.Setインタフェース
//　　・public interface Set extends Collection
//　　・要素の重複を許さない集合のメソッドを宣言する。
//
//　○Setインタフェースのメソッド
//    public Iterator iterator()
//　　　機能：集合内の要素についての反復子を返す。
//　　　　　　集合に順序が定義されていない場合、そのつど異なった順序で要素が
//　　　　　　返される。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j851b {

  public static void main(String args[]) {

    // 空のマップを作成。
    HashMap<String, String> hm = new HashMap<String, String>();

    // キーと値の組を追加。
    hm.put("C","Car");
    hm.put("A","Airplane");
    hm.put("B","Book"); hm.put("B","Bird"); // キーが重複した場合、上書きされる。

    // キーと値のすべての組をたどる。
    System.out.println("キーと値のすべての組"); 
    Set s = (Set)(hm.keySet());
    Iterator is = s.iterator();
    while( is.hasNext() ) {
      Object key = is.next();
      System.out.println("キー：" + key + "　値：" + hm.get(key));
    }
    System.out.println();

    // キーと値の組を追加。
    hm.put("D","Car"); // 異なるキーが同じ値を持ってもよい。

    // キーと値の組をすべてたどる。前回と異なる順にたどられる。
    System.out.println("キーと値のすべての組(前回と異なる順にたどられる)"); 
    Set t = (Set)(hm.keySet());
    // マップに対する変更はキーの集合に反映される。
    hm.put("E","Earth");
    // キーの集合に対する変更はマップに反映される。
    t.remove("A");
    Iterator it = t.iterator();
    // ここに、マップへの追加(hm.put("F","Fire"))を書くとエラーになる。
    while( it.hasNext() ) {
      Object key = it.next();
      System.out.println("キー：" + key + "　値：" + hm.get(key));
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j851b.java
注:j851b.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j851b
キーと値のすべての組
キー：A　値：Airplane
キー：C　値：Car
キー：B　値：Bird

キーと値のすべての組(前回と異なる順にたどられる)
キー：D　値：Car
キー：C　値：Car
キー：B　値：Bird
キー：E　値：Earth
</pre>

</body>
</html>
*/
