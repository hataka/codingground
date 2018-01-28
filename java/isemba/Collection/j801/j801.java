// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j801.java 
 * created : Time-stamp: <09/07/01(水) 11:04:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j801.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j801.java >>
//
//  データ構造（０）：概説
//
//　●コレクション
//
//　　・コレクションは要素の集まりを意味する。
//　　・コレクションには、リスト(List)、集合(Set)、マップ(Map)などのデータ構造
//　　　（要素を保存する仕組み）がある。
//
//　　　リスト：重複を許す要素の集まり。
//　　　　　　　要素の追加・削除、インデックスで要素にアクセスする操作などが
//　　　　　　　できる。
//　　　集合　：重複を許さない要素の集まり。
//　　　　　　　要素の追加・削除、包含判定などができる。
//　　　マップ：キーと値から構成される組の集まり。
//　　　　　　　組の追加・削除、キーで値にアクセスする操作などができる。
//
//　●コレクション・フレームワーク
//
//　　・コレクション・フレームワークは、3つのインタフェース(java.util.List, 
//      java.util.Set, java.util.Map)と、その実装クラスで構成されている。
//　　　なお、ListとSetはCollectionインタフェースを継承する。
//
//        public interface Collection
//        public interface List extends Collection
//        public interface Set extends Collection
//        public interface Map
//
//　　・java.util.Listインタフェース：要素にインデックスでアクセスするメソッド
//　　　　　　　　　　　　　　　　　　などを宣言する。
//　　　java.util.Setインタフェース ：集合の操作を行うメソッドを宣言する。
//　　　java.util.Mapインタフェース ：キーと値の組をキーでアクセスするメソッド
//　　　　　　　　　　　　　　　　　　などを宣言する。
//
//　　・リストを実装するクラス： ArrayList, LinkedList
//      集合を実装するクラス　： HashSet, TreeSet
//      マップを実装するクラス： HashMap, TreeMap
//
//         public class ArrayList extends AbstractList
//                       implements List, RandomAccess, Cloneable, Serializable
//         public class LinkedList extends AbstractSequentialList
//                                 implements List, Cloneable, Serializable
//         public class HashSet extends AbstractSet
//                              implements Set, Cloneable, Serializable
//         public class TreeSet extends AbstractSet
//                              implements SortedSet, Cloneable, Serializable
//         public class HashMap extends AbstractMap
//                              implements Map, Cloneable, Serializable
//         public class TreeMap extends AbstractMap
//                              implements SortedMap, Cloneable, Serializable
//
//　　・これらのクラスは、同期化されていないので、複数のスレッドがこれらのクラス
//　　　にアクセスし構造を変更する場合(要素の追加、削除など)には、同期化する
//      必要がある。
//　　　同期化するには、２つの方法がある。
//　　　(1)これらのクラスを含む別のオブジェクトがあれば、そのオブジェクトで同期
//　　　　　をとる。
//　　　(2)Collections.synchronizedListメソッドなどを使って、スレッドに対して
//　　　　 安全なコレクションを作成する。
//
// 　      List list = Collections.synchronizedList(new ArrayList(...));
//
//　　　　 ただし、安全なコレクションに反復子を使って繰り返し処理を行う場合、
//　　　　 つぎのように自前で同期処理の記述をする必要がある。 
//
//         synchronized(list) {
//           Iterator it = list.iterator();
//           while( it.hasNext() ) { ... }
//         }
//
////////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
