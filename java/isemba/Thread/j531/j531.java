<!--====================================================================-->
<!-- << j531.htm >>                                                     -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
//  << j531.java >>
//
//  スレッド（３）：同期（概説）
//  
//    ある操作に対して、開始から終了まで、他のスレッドにその操作をさせないように
//　　することを同期という。
//　　synchronizedメソッドやsynchronizedブロックなどを使って動機を実現する。
//　　
//  ●synchronizedメソッド
//
//　　予約語synchroizedのついたメソッドをsynchronizedメソッドという。
//
//　　  　synchronized メソッド名 { ・・・ }
//
//　　と書く。
//
//    ・スレッドがsynchronizedメソッドの実行を開始すると、メソッドが定義されて
//　　　いるクラスのオブジェクトに対してロックをかける。
//　　　すなわち、他のスレッドが同じsynchronizedメソッドを実行できなくする。
//　　　他のスレッドは、そのオブジェクトの同じsynchronizedメソッドに入れず、
//　　　待たされる。待たされるスレッドの集合をウェイトセットという。
//　　　ウェイトセットは、オブジェクトごとにある。
//　　・synchronizedメソッドの処理が終了すると、スレッドはロックをはずして
//　　　synchronizedメソッドから出る。ロックがはずされると、ウェイトセットで
//　　　待っていたスレッドが実行を開始する。
//　　　すなわち、オブジェクトに対して同時処理を禁止できる。
//  
//　●synchronizedブロック
//
//　　　 synchronized (ロックをかけるオブジェクト) {
//         ・・・
//       }
//
//　　・メソッドの一部分にsynchronized指定をし、ロックをかけることができる。
//
////////////////////////////////////////////////////////////////////////////////
</pre>

</body>
</html>
