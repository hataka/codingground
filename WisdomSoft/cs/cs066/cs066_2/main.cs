// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:30 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs066/cs066_2/main.cs
 * url:  cs/cs066/cs066_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:30 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs66.html
 * description: 
 *
 *================================================================*/
struct Point {
	public int x , y;
	public Point(int x , int y) {
		this.x = x;
		this.y = y;		
	}
}

unsafe class Test {
	public static void Main() {
		Point pt = new Point(400 , 300);
		WritePoint(&pt);
	}
	public static void WritePoint(Point *pt) {
		System.Console.WriteLine(
			"x = " + pt->x + " : y = " + pt->y
		);
	}
}
