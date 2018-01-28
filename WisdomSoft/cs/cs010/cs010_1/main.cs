// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:05 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs010/cs010_1/main.cs
 * url:  cs/cs010/cs010_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:05 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs10.html
 * description: 
 *
<XmlTreeMenu>
   <folder title="Menu" expand="true">
    <record title="ツリーデーターを開く" action="menu" command="OpenTreeDataDialog" />
    <record title="FlashProject" action="menu" path="F:\VCSharp\MDI\FlashDevelop\FlashDevelop\Bin\Debug\MDIFormData\FlashProject.xml" />
    <record title="XmlTreeMenu" action="menu" path="$(BaseDir)\SettingData\XmlTreeMenu.xml" />
    <record title="VC++2008 Sample" action="menu" path="F:\VCSharp\MDI\FlashDevelop\FlashDevelop\Bin\Debug\MDIFormData\VCPP2008_menu.xml" />
  </folder>
  <folder title="LocalSite">
    <record title="PukiWki" path="http://localhost/pukiwiki/index.php" icon="F:\icons\pukiwiki.ico" />
    <record title="FrameWork" path="http://localhost/FrameWork/FrameWork.html" />
    <record title="C# links" path="http://localhost/VCSharp/links/dir_traverse_htmllink.php" />
    <record title="pdf" action="webbrowser" path="F:\svgGraphics\hirano-lab\00svg-full09.pdf" />
  </folder>
  <folder title="WebSite">
    <record title="Google" path="http://www.google.co.jp/" icon="http://www.google.co.jp/favicon.ico" />
    <record title="yahoo" path="http://www.yahoo.co.jp/" />
    <record title="プログラミング言語資料 - SAK Streets" path="http://homepage2.nifty.com/sak/w_sak3/doc/sysbrd/sak3doc.htm" />
  </folder>
</XmlTreeMenu>
 *================================================================*/
class Test {
	static void Main() {
		ushort us = 0xA5FF;
		byte sb = (byte)us;

		System.Console.WriteLine("ushort = " + us);
		System.Console.WriteLine("byte = " + sb);
	}
}
