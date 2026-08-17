/*
Accept marks, attendance percentage and family income from the user. Check the scholarship eligibility based on marks, attendance and income.
*/
import java.util.Scanner;

class Scholarship
{
    public void Checklist(int Mark , int Atend , int Income)
    {
        if((Mark < 0 || Mark > 100 )||
           (Atend < 0 || Atend >100)|| 
           (Income <= 0))
          {
            System.out.println("Enter Vaild Details");
            return;
          }

        if(Mark < 80)
        {
            System.out.println("Scholarship Rejected: <Marks Condition not satisfied >");
        }

        else if(Atend < 75)
        {
            System.out.println("Scholarship Rejected: <Attendance Condition not satisfied >");
        }

        else if(Income > 300000)
        {
            System.out.println("Scholarship Rejected: <Financial Condition not satisfied >");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }
}

class program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Marks in Percentage : ");
        int iMarks = sobj.nextInt();

        System.out.println("Enter Your Attendance in Percentage : ");
        int iAtend = sobj.nextInt();

        System.out.println("Enter Family Income : ");
        int iIncome = sobj.nextInt();

        Scholarship obj = new Scholarship();

        obj.Checklist(iMarks, iAtend, iIncome);

    }
}  
