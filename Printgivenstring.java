import Mypack.*;
class Printgivenstring
{
public static String rowbuilder(int i,String s, Letterformat newformat)
{
int l,j;
char c; 
String x="";
String rowstring;
l=s.length( );
Letterrows q=new Letterrows();
for(j=0;j<l;j++)
{
c=s.charAt(j);
rowstring=q.getcharrow(c,i);
x=x+"     "+rowstring;

}
return(x);
}
public static void main(String args[])
{
String r; 
int i;
String s=args[0];
for(i=1;i<9;i++)
{
r=rowbuilder(i,s,newformat);
System.out.println(r);
}
}
}

