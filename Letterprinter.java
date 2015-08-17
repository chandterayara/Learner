abstract class Letterprinter
{
  public static String getcharrow(char c,int i,Letterprinter printformat)
  {
    String p="";
    switch(c)
    {
      case 'c':p=getrowC( c,i,printformat );break;
      case 'a':p=getrowA( c,i,printformat);break;
      case 'h':p=getrowH(c,i,printformat);break;
      case 'n':p=getrowN(c,i,printformat);break;
    }
    return(p);
  }
  abstract String getrowC(char c, int i,LetterPrinter printformat);
  abstract String getrowA(char c, int i,LetterPrinter printformat);
  abstract String getrowH(char c, int i,LetterPrinter printformat);
  abstract String getrowN(char c, int i,LetterPrinter printformat);
}
