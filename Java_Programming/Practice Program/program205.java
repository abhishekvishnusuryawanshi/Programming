/* 
    ASCI value through

    iRow = 4
    iCol = 4
                      Matrix
    a   b   c   d    11  12  13  14
    a   b   c   d    21  22  23  24
    a   b   c   d    31  32  33  34
    a   b   c   d    41  42  43  44

*/
import java.util.Scanner;

class Pattern
{
  public void Display(int iRow , int iCol)
  {
    int i = 0 , j = 0 ;
    char ch = '\0';

    for(i  = 1 ; i<=iRow; i++)
    {
      for(j = 1, ch = 97 ; j <= iCol; j++,ch++)
      {
        System.out.print(ch+"\t");
      }
      System.out.println();
    }

  }
}

class program204
{
  public static void main(String A[]) 
  {
    Scanner sobj = new Scanner(System.in);

    int iValue1 = 0 ;
    int iValue2 = 0 ;

    System.out.println("Enter Number of Rows:");
    iValue1 = sobj.nextInt();

    System.out.println("Enter Number of Columns:");
    iValue2 = sobj.nextInt();

    Pattern pobj = new Pattern();

    pobj.Display(iValue1,iValue2);
  }
}