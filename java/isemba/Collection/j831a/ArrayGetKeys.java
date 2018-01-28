// -*- mode: java -*- Time-stamp: <2009-06-18 18:10:49 kahata>
/*====================================================================
 * name: ArrayGetKeys.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://iwamode.net/tips/_0200array/array_arraygetkeys.html
 * description:
 * ====================================================================*/
import java.util.Hashtable;
import java.util.Enumeration;

public class ArrayGetKeys {
  public static void main(String[] args) {
    //連想配列(ハッシュテーブル)の作成
    Hashtable map = new Hashtable();
    map.put("apple", "red");
    map.put("banana", "yellow");
    map.put("melon", "green");
    map.put("grape", "purple");
    map.put("peach", "pink");
    //連想配列のキーのリスト取得する
    Enumeration enum = map.keys();
    int i = 0;
    while(enum.hasMoreElements()) {
      String key = (String)enum.nextElement();
      System.out.println(i + "番目 : " + key);
      i++;
    }
  }
} 
