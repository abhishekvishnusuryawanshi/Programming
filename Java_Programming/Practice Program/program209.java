/* 
  Diagonal 
    iRow = 4
    iCol = 4
        Matrix
       11  12  13  14
       21  22  23  24
       31  32  33  34
       41  42  43  44

       Patern
      @   @   @   $
      @   @   $   @
      @   $   @   @
      $   @   @   @

*/
import java.util.Scanner;

class Pattern
{
  public void Display(int iRow , int iCol)
  {
    int i = 0 , j = 0 ;
    
    for(i = iRow ; i >= 1; i--)
    {

      for(j = 1 ; j <= iCol; j++)
      {
        if( i == j)
        {
          System.out.print("$");
        }
        else
        {
          System.out.print("@");
        }
      }
      System.out.println();
    }

  }
}

class program209
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