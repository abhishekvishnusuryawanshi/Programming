/*  
    iRow = 4
    iCol = 4
        Matrix
       11  12  13  14
       21  22  23  24
       31  32  33  34
       41  42  43  44

       Patern
      %   %   %   %   %   %
      %                   %
      %                   %
      %                   %
      %                   %
      %   %   %   %   %   %
    
*/
import java.util.Scanner;

class Pattern
{
  public void Display(int iRow , int iCol)
  {
    int i = 0 , j = 0 ;

    //Filter for Diagonal Pattern
    if(iRow != iCol)
    {
      System.out.println("Invaild Parameter");
      System.out.println("Number of rows and column Should be Same");
      return;
    }
    
    for(i = 1 ; i <= iRow; i++)
    {

      for(j = 1 ; j <= iCol; j++)
      {
        if( (j == 1) || (j == iCol)|| (i == 1) || (i == iRow))
        {
          System.out.print("%\t");
        }
        else
        {
          System.out.print(" \t");
        }
      }
 
      System.out.println();
    }  
  }

}

class program216
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