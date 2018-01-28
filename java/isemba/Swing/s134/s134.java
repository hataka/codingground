////////////////////////////////////////////////////////////////////////////////
// << s134.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（ツリー）
//
//　●ツリーの作成手順
//　　（手順１）ノードの作成
//　　（手順２）親子関係の設定
//　　（手順３）ツリーの作成
//
//　●javax.swing.tree.DefaultMutableTreeNodeクラス
//    ツリーのノードを作成するクラス。
//
//　●DefaultMutableTreeNodeクラスのコンストラクタ
//　　public DefaultMutableTreeNode(Object obj)
//　　　機能：オブジェクトobjで初期化されたツリーノードを作成する。
//            このツリーノードは子を持つことができる。 
//
//　●DefaultMutableTreeNodeクラスのメソッド
//　　public void add(MutableTreeNode node)
//　　　機能：nodeをその親から削除し、このノードの子にする。 
//
//　●javax.swing.JTreeクラス
//    ツリーを作成するクラス。
//
//　●JTreeクラスのコンストラクタ
//　　JTree(TreeNode root)
//　　　機能：ルートrootをもつツリーを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.tree.*;

class s134 extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s134(String t) {  

    super(t);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // (手順１)ノードの作成。
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("日本");
    DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("茨城県");
    DefaultMutableTreeNode n11 = new DefaultMutableTreeNode("水戸市");
    DefaultMutableTreeNode n12 = new DefaultMutableTreeNode("日立市");
    DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("福島県");
    DefaultMutableTreeNode n21 = new DefaultMutableTreeNode("いわき市");

    // (手順２)親子関係の設定。
    root.add(n1);
      n1.add(n11);
      n1.add(n12);
      n1.add(n21); // 間違った設定。
    root.add(n2);
      n2.add(n21); // 訂正。

    // (手順３)ツリーの作成。
    JTree tree = new JTree(root);

    // ツリーをコンテンツペイン内に追加。
    c.add(tree);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s134 f = new s134("ツリーのフレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
