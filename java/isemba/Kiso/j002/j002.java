//  -*- mode: java -*-  Time-stamp: <2009-06-16 20:49:36 kahata>
/*================================================================
 * title: 
 * file: j002.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j002.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j002.java >>
//
//　●Javaの開発環境（Javeのプログラムを作成して実行できるようにしたもの）
//　　JavaSE（JDKともいう）のインストール
//        JavaSE: Java Standard Edition
//        JDK: Java SE Development Kit
//
//　（１）JavaSEをダウンロードする。
//　　　　(a)Webページ：http://java.sun.com/javase/6/download.htmlに 
//           Webブラウザでアクセスし、最新のバージョンを指定する。
//　　　   　ここでは、「JDK 6 Update 13」項目を選び、JDKの「ダウンロード」
//　　　　　 ボタンをクリックする。    
//　　　　(b)Webページが切り替わる。
//　　　　　 「Platform」項目の▼をクリックし、windowsを選択する。
//           「I agree to the Java SE Development Kit 6 License Agreement」
//　　　　　　項目にチェックを入れる。
//　　　　　　「Continue」ボタンをクリックする。
//　　　　(c)Webページが切り替わる。
//           「jdk-6u13-windows-i586-p.exe」をクリックする。
//            ダウンロードが始まるので、デスクトップに保存する。
//　　　　(d)ダウンロードが終了すると、デスクトップに、ファイル
//           (jdk-6u13-windows-i586-p.exe)を示すアイコンが表示される。
//
//　（２）ファイル(jdk-6u13-windows-i586-p.exe)を示すアイコンをダブル
//　　　　クリックする。インストールが始まるので、指示に従って進めていく。
//　　　　インストール先は任意でよいので、インストール先のディレクトリの
//　　　　問い合わせには、d:\jdk-6u13としておく。
//
//　（３）インストールしたJavaが起動するように環境設定を行う。
//　　　　(a)「スタート」ボタンをクリックする。
//        (b)「コントロールパネル」を選択しクリックする。
//　　　　(c)「パフォーマンスとメンテナンス」をリックする。
//　　　　(d)「システム」をクリックする。
//        (e)「詳細設定」タブをクリックする。
//　      (f)「環境変数」ボタンをクリックする。
//        (g)システム環境変数のPath変数に d:\jdk-6u13\bin を追加する。
//　　　   　d:\jdk-6u13は、Javaをインストールしたディレクトリである。
//
//　（４）Javaプログラムのコンパイル・実行は、コマンドプロンプトで行う。
//　　　　cdコマンドを使って、Javaプログラムのあるディレクトリに移動する。
//
//　（５）インストールしたJavaのバージョンの確認
//        % java -version 
//        java version "1.6.0_13"
//        Java(TM) SE Runtime Environment (build 1.6.0_13-b03)
//        Java HotSpot(TM) Client VM (build 11.3-b02, mixed mode, sharing)
//
////////////////////////////////////////////////////////////////////
