 public class Slashformat extends Letterprinter
{

public String getrowC(char c, int i)
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
public  String getrowA(char c, int i)
{
String y="";
switch(i)
{
case 1:y="- - - - - - -";break;
case 2:y="| | - - - - - ";break;
case 3:y="| |          ";break;
case 4:y="| |          ";break;
case 5:y="| |          ";break;
case 6:y="| |          ";break;
case 7:y="| - - - - - -";break;
case 8:y="|- - - - - - -";break;
}
return(y);
}
public  String getrowH(char c,int i)
{
String y="";
switch(i)
{
case 1:y="*  *        *  *";break;
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
public  String getrowN(char c,int i)
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
 
 
