class Printgivenstring
{
  public static String rowbuilder(int i,String s, Letterprinter printformat)
  {
    int l,j;
    char c; 
    String x="";
    String rowstring;
    l=s.length( );
    for(j=0;j<l;j++)
    {
      c=s.charAt(j);
      rowstring = printformat.getcharrow(c,i,printformat);
      x=x+"     "+rowstring;
    }
    return(x);
  }
public static void main(String args[])
{
String r; 
int i;
String s=args[0];
Letterprinter printformat; 
if(args[1]=="Myfont")
{
  printformat  = new Slashformat();
} else {
  printformat  = new Charformat();
  printformat.setprintcharacter(args[1]);
}
for(i=1;i<9;i++)
{
r=rowbuilder(i,s,printformat);
System.out.println(r);
}
}
}

