/*
   Suggest MobilePlan through User Requriement By Accepting Call Uasges , Data Useage amd Sms.
*/
import java.util.*;

class MobilePlan
{
    public void RecommendPlan(int Min, int GB, int SMS)
    {
        // Validate input
        if(Min < 0 || GB < 0 || SMS < 0)
        {
            System.out.println("Invalid Details");
            return;
        }

        int plan1Cost = 0;
        int plan2Cost = 0;
        int plan3Cost = 0;
        int plan4Cost = 0;

        // Plan 1
        plan1Cost = 299;

        if(Min > 300)
        {
            plan1Cost = plan1Cost + ((Min - 300) * 1);
        }

        if(GB > 2)
        {
            plan1Cost = plan1Cost + ((GB - 2) * 50);
        }

        if(SMS > 100)
        {
            plan1Cost = plan1Cost + ((SMS - 100) * 1);
        }

        // Plan 2
        plan2Cost = 399;

        if(Min > 500)
        {
            plan2Cost = plan2Cost + ((Min - 500) * 1);
        }

        if(GB > 4)
        {
            plan2Cost = plan2Cost + ((GB - 4) * 40);
        }

        if(SMS > 200)
        {
            plan2Cost = plan2Cost + ((SMS - 200) * 1);
        }

        // Plan 3
        plan3Cost = 499;

        if(Min > 800)
        {
            plan3Cost = plan3Cost + ((Min - 800) * 1);
        }

        if(GB > 6)
        {
            plan3Cost = plan3Cost + ((GB - 6) * 30);
        }

        if(SMS > 300)
        {
            plan3Cost = plan3Cost + ((SMS - 300) * 1);
        }

        // Plan 4
        plan4Cost = 599;

        if(Min > 1000)
        {
            plan4Cost = plan4Cost + ((Min - 1000) * 1);
        }

        if(GB > 10)
        {
            plan4Cost = plan4Cost + ((GB - 10) * 20);
        }

        if(SMS > 500)
        {
            plan4Cost = plan4Cost + ((SMS - 500) * 1);
        }

        // Find cheapest plan
        int minCost = plan1Cost;
        String recommendedPlan = "Plan 1";

        if(plan2Cost < minCost)
        {
            minCost = plan2Cost;
            recommendedPlan = "Plan 2";
        }

        if(plan3Cost < minCost)
        {
            minCost = plan3Cost;
            recommendedPlan = "Plan 3";
        }

        if(plan4Cost < minCost)
        {
            minCost = plan4Cost;
            recommendedPlan = "Plan 4";
        }

        // Display result
        System.out.println("Plan 1 Cost : " + plan1Cost);
        System.out.println("Plan 2 Cost : " + plan2Cost);
        System.out.println("Plan 3 Cost : " + plan3Cost);
        System.out.println("Plan 4 Cost : " + plan4Cost);

        System.out.println("Recommended Plan : " + recommendedPlan);
        System.out.println("Total Cost : " + minCost);
    }
}

class program58
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iMin = 0, iGB = 0, iSMS = 0;

        System.out.println("Enter the Call Usage in Minute : ");
        iMin = sobj.nextInt();

        System.out.println("Enter the Data Usage in GB : ");
        iGB = sobj.nextInt();

        System.out.println("Enter the SMS Count : ");
        iSMS = sobj.nextInt();

        MobilePlan mobj = new MobilePlan();

        mobj.RecommendPlan(iMin, iGB, iSMS);
    }
}
