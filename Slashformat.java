 public class Slashformat
{

public static string getrowC(char c, int i)
{
string y="";
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
public static string getrowA(char c, int i)
{
string y="";
switch(i)
{
case 1:y="- - - - - - -":break;
case 2:y="| | - - - - - ";break;
case 3:y="| |          ";break;
case 4:y="| |          ";break;
case 5:y="| |          ";break;
case 6:y="| |          ";break;
case 7:y="| - - - - - -":break;
case 8:y="|- - - - - - -":break;
}
return(y);
}
public static String getrowH(char c,int i)
{
String y="";
switch(i)
{
ase 1:y="*  *        *  *";break;
case 2:y="*  *        *  *";break;
case 3:y="*  *        *  *";break;
case 4:y="*  *        *  *";break;
case 5:y="*  *  *  *  *  *";break;
case 6:y="*  *  *  *  *  *";break;
case 7:y="*  *        *  *";break;
case 8:y="*  *        *  *";break;
}
return(y);
}
public static String getrowN(char c,int i)
{
String y="";
switch(i)
{
case 1:y="*  *          *  *";break;  
case 2:y="*     *       *  *";break;
case 3:y="*  *    *     *  *";break;
case 4:y="*  *  *   *   *  *";break;
case 5:y="*  *    *   * *  *";break;
case 6:y="*  *      *   *  *";break;
case 7:y="*  *        *    *";break;
case 8:y="*  *          *  *";break;
}
return(y);
}
}
 
 
