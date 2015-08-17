import Mypack.*;
class Printgivenstring
{
public static String rowbuilder(int i,String s, Letterprinter printformat)
{
int l,j;
char c; 
String x="";
String rowstring;
l=s.length( );
Charformat q=new Charformat();
for(j=0;j<l;j++)
{
c=s.charAt(j);
rowstring=q.getcharrow(c,i,printformat);
x=x+"     "+rowstring;

}
return(x);
}
public static void main(String args[])
{
String r; 
int i;
String s=args[0];
LetterPrinter printFormat ; 
if(args[0]="")
{
printFormat  = new LetterFormat();
}
for(i=1;i<9;i++)
{
r=rowbuilder(i,s,printformat);
System.out.println(r);
}
}
}

