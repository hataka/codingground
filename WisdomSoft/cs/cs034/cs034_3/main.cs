// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:15 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs034/cs034_3/main.cs
 * url:  cs/cs034/cs034_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:15 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs34.html
 * description: 
 *
 *================================================================*/
.method private hidebysig static void  Main() cil managed
{
  .entrypoint
  // Code size       25 (0x19)
  .maxstack  2
  .locals (class Kitty V_0,
           string V_1)
  IL_0000:  newobj     instance void Kitty::.ctor()
  IL_0005:  stloc.0
  IL_0006:  ldloc.0
  IL_0007:  ldstr      "Kitty on your lap"
  IL_000c:  callvirt   instance void Kitty::set_StrName(string)
  IL_0011:  ldloc.0
  IL_0012:  callvirt   instance string Kitty::get_StrName()
  IL_0017:  stloc.1
  IL_0018:  ret
} // end of method Test::Main
