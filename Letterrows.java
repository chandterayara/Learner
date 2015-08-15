package Mypack;
public class Letterrows
{
public static String getcharrow(char c,int i)
{
String p="";
switch(c)
{
case 'c':p=getrowC( c,i );break;
case 'a':p=getrowA( c,i);break;
case 'h':p=getrowH(c,i);break;
case 'n':p=getrowN(c,i);break;
}
return(p);
}
public static String getrowA( char c,int i)
{
String y="";
switch(i)
{

case 1:y="   __  _  ";break;
case 2:y=" /  _`  | ";break;
case 3:y="|  ( |  |    ";break;
case 4:y="    _        ";break;
case 5:y=" \\     |  ";break;
case 6:y="   __ __ ";break;
case 7:y="            ";break;
case 8:y="            ";break;

}
return(y);
}

public static String getrowH(char c,int i)
{
String t="";
switch(i)
{
case 1:t="*  *        *  *";break;
case 2:t="*  *        *  *";break;
case 3:t="*  *        *  *";break;
case 4:t="*  *        *  *";break;
case 5:t="*  *  *  *  *  *";break;
case 6:t="*  *  *  *  *  *";break;
case 7:t="*  *        *  *";break;
case 8:t="*  *        *  *";break;
}
return(t);
}

public static String getrowN(char c,int i)
{
String m="";
switch(i)
{
case 1:m="*  *          *  *";break;  
case 2:m="*     *       *  *";break;
case 3:m="*  *    *     *  *";break;
case 4:m="*  *  *   *   *  *";break;
case 5:m="*  *    *   * *  *";break;
case 6:m="*  *      *   *  *";break;
case 7:m="*  *        *    *";break;
case 8:m="*  *          *  *";break;
}
return(m);
}
public static String getrowC( char c,int i)
{
String z="";
switch(i)
{
case 1:z="* * * * *";break;



case 2:z="* * * * *";break;


case 3:z="* *      ";break;


case 4:z="* *      ";break;



case 5:z="* *      ";break;


case 6:z="* *      ";break;
case 7:z="* * * * *";break;
case 8:z="* * * * *";break;
}
return(z);
}
}
