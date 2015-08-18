abstract class Letterprinter
{
  public static String getcharrow(char c,int i,Letterprinter printformat)
  {
    String p="";
    switch(c)
    {
      case 'c':p=printformat.getrowC( c,i);break;
      case 'a':p=printformat.getrowA( c,i);break;
      case 'h':p=printformat.getrowH(c,i);break;
      case 'n':p=printformat.getrowN(c,i);break;
    }
    return(p);
  }
  abstract String getrowC(char c, int i);
  abstract String getrowA(char c, int i);
  abstract String getrowH(char c, int i);
  abstract String getrowN(char c, int i);
}
