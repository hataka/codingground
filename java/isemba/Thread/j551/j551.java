<!--====================================================================-->
<!-- << j551.htm >>                                                     -->
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
//  << j551.java >>
//
//  スレッド（５）：スレッド間通信（概説）
//
//　　waitメソッド、notifyメソッド、notifyAllメソッドを使って、
//　　複数スレッド間で、待ち合わせなど実行順序の調整などを行うことができる。
//
//　　例えば、あるスレッドは、他のスレッドの実行終了を待ち合わせるために
//　　待機状態に入る。
//　　他のスレッドは、終了時に、あるスレッドに通知を送る。
//　　あるスレッドは、通知を受け取ると、実行を再開する。
//
//  ●Objectクラスのメソッド
//
//    public final void wait() throws InterruptedException
//      機能：synchronized指定されたメソッド内から呼び出される必要がある。
//　　　　　　すなわち、waitが実行されるときには、オブジェクトにロックが
//　　　　　　かけられている。waitが実行されると、現在のスレッドは、オブジェクト
//　　　　　　の待機セットに入れられる。
//　　　　　　waitの実行で、一時停止状態になったスレッドは、他のスレッドで
//　　　　　　実行されたnotifyメソッドまたはnotifyAllメソッドによって実行が
//　　　　　　再開される。再開後、直ちにオブジェクトにロックをかける。
//　　　　　　再開開始点は、wait以降の処理からである。
//
//  　public final void notify()
//      機能：synchronized指定されたメソッド内から呼び出される必要がある。
//　　　　　　すなわち、notifyが実行されるときには、オブジェクトにロックが
//　　　　　　かけられている。
//　　　　　　あるオブジェクトに対してnotifyが実行されると、そのオブジェクトの
//　　　　　　待機セットに含まれるスレッドのひとつを実行可能状態にする。
//　　　　　　そして、notifyを実行したスレッドがそのオブジェクトのロックを
//　　　　　　解放した時点で、実行可能状態になったスレッドは実行を再開する。
//
//  　public final void notifyAll()
//      機能：synchronized指定されたメソッド内から呼び出される必要がある。
//　　　　　　すなわち、notifyAllが実行されるときには、オブジェクトにロックが
//　　　　　　かけられている。
//　　　　　　あるオブジェクトに対してnotifyAllが実行されると、そのオブジェクト
//            の待機セットに含まれるすべてのスレッドを実行可能状態にする。
//　　　　　　そして、notifyAllを実行したスレッドがそのオブジェクトのロックを
//　　　　　　解放した時点で、実行可能状態になったスレッドは実行を再開する。
//
////////////////////////////////////////////////////////////////////////////////
</pre>

</body>
</html>
