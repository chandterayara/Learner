class Poloformat extends Letterprinter
{
public String getrowH(char c, int i)
{
String t="";
switch(i)
{

case 1:t="@  @        @  @";break;
case 2:t="@  @        @  @";break;
case 3:t="@  @        @  @";break;
case 4:t="@  @  @  @  @  @";break;
case 5:t="@  @  @  @  @  @";break;
case 6:t="@  @        @  @";break;
case 7:t="@  @        @  @";break;
case 8:t="@  @        @  @";break;
}
return(t);
}
 public String getrowA( char c,int i)
{
String t="";
switch(i)
{
case 1:t="@  @  @  @  @  @";break;
case 2:t="@  @  @  @  @  @";break;
case 3:t="@  @        @  @";break;
case 4:t="@  @        @  @";break;
case 5:t="@  @  @  @  @  @";break;
case 6:t="@  @  @  @  @  @";break;
case 7:t="@  @        @  @";break;
case 8:t="@  @        @  @";break;
}
return(t);
}
public String getrowN(char c,int i)
{
String m="";
switch(i)
{
case 1:m="@  @          @  @";break;  
case 2:m="@     @       @  @";break;
case 3:m="@  @    @     @  @";break;
case 4:m="@  @  @   @   @  @";break;
case 5:m="@  @    @   @ @  @";break;
case 6:m="@  @      @   @  @";break;
case 7:m="@  @        @    @";break;
case 8:m="@  @         @   @";break;
}
return(m);
}
public String getrowC( char c,int i)
{
String z="";
switch(i)
{
case 1:z="@ @ @ @ @";break;
case 2:z="@ @ @ @ @";break;

case 3:z="@ @      ";break;
case 4:z="@ @      ";break;
case 5:z="@ @      ";break;
case 6:z="@ @      ";break;
case 7:z="@ @ @ @ @";break;
case 8:z="@ @ @ @ @";break;
}
return(z);
}
}
