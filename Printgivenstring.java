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
String u=args[1];
if(args[1].equals("Myfont"))
{
  printformat  = new Slashformat();
} else if(args[1].equals("polo") 
{
  Poloformat format1=new poloformat();
  printformat=format1;
}
else
{
  Charformat format  = new Charformat();
  printformat=format;
  printformat.setprintcharacter(args[1]);
}
for(i=1;i<9;i++)
{
r=rowbuilder(i,s,printformat);
System.out.println(r);
}
}
}

