/*
    Write a Java application that accepts the name of a text file
    and performs analysis on its contents.
*/

import java.io.*;
import java.util.*;

class program114
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String Fname = sobj.nextLine();

        File fobj = new File(Fname);

        if(!fobj.exists())
        {
            System.out.println("File does not exist");
            return;
        }

        int iChar = 0;
        int iWord = 0;
        int iLine = 0;
        int iUpper = 0;
        int iLower = 0;
        int iDigit = 0;
        int iSpace = 0;

        try
        {
            FileInputStream fi = new FileInputStream(fobj);

            int iRet;
            boolean bFlag = false;

            while((iRet = fi.read()) != -1)
            {
                char ch = (char)iRet;

                iChar++;

                if(ch == '\n')
                {
                    iLine++;
                }

                if(Character.isUpperCase(ch))
                {
                    iUpper++;
                }

                if(Character.isLowerCase(ch))
                {
                    iLower++;
                }

                if(Character.isDigit(ch))
                {
                    iDigit++;
                }

                if(ch == ' ')
                {
                    iSpace++;
                }

                if(Character.isWhitespace(ch))
                {
                    bFlag = false;
                }
                else
                {
                    if(bFlag == false)
                    {
                        iWord++;
                        bFlag = true;
                    }
                }
            }

            fi.close();

            if(iChar > 0 && iLine == 0)
            {
                iLine = 1;
            }

            System.out.println();
            System.out.println("Characters : " + iChar);
            System.out.println("Words      : " + iWord);
            System.out.println("Lines      : " + iLine);
            System.out.println("Uppercase  : " + iUpper);
            System.out.println("Lowercase  : " + iLower);
            System.out.println("Digits     : " + iDigit);
            System.out.println("Spaces     : " + iSpace);
        }
        catch(Exception e)
        {
            System.out.println("Unable to read file");
        }
    }
}
