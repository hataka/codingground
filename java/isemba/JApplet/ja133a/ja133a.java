//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 18:16:59 hata>
/*================================================================
 * プログラム名: ja133a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja133a.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja133a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ツリー、配置）
//
//　　ツリーを作成する。
//
//　●ツリー作成手順
//　　（手順１）ノードの作成
//　　（手順２）親子関係の設定
//　　（手順３）ツリーの作成
//
//　●DefaultMutableTreeNodeクラス
//    ツリーのノードを作成するクラス。
//
//　●DefaultMutableTreeNodeクラスのコンストラクタ
//　　DefaultMutableTreeNode(Object obj)
//　　　機能：オブジェクトobjをもつノードを作成する。
//
//　●DefaultMutableTreeNodeクラスのメソッド
//　　void add(MutableTreeNode node)
//　　　機能：ノードnodeを子として追加する。
//
//　●JTreeクラス
//    ツリーを作成するクラス。
//
//　●JTreeクラスのコンストラクタ
//　　JTree(TreeNode root)
//　　　機能：ルートrootをもつツリーを作成する。
//
////////////////////////////////////////////////////////////////////////////////

// <applet code=ja133a width=320 height=240 ></applet>

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.tree.*;

public class ja133a extends JApplet {

  public void init() {
    // アプレットからコンテントペインを取得。
    Container c = this.getContentPane();

    // 手順１：ノードの作成。
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("日本");
    DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("茨城県");
    DefaultMutableTreeNode n11 = new DefaultMutableTreeNode("水戸市");
    DefaultMutableTreeNode n12 = new DefaultMutableTreeNode("日立市");
    DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("福島県");
    DefaultMutableTreeNode n21 = new DefaultMutableTreeNode("いわき市");

    // 手順２：親子関係の設定。
    root.add(n1);
    n1.add(n11);
    n1.add(n12);
    root.add(n2);
    n2.add(n21);

    // 手順３：ツリーの作成。
    JTree tree = new JTree(root);
    // ツリーをコンテンツペイン内に追加。
    c.add(tree);
  }
}
