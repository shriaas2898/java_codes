/*
Author: AASTHA Shrivastava
Date: 5th JAN 2018
Description: files contains program which takes an 4 digit number from the user1 and gives another user 8 tries to guess the number.
*/
import java.util.Scanner;
class GuessNumber
{
public static void main(String[] args)
  {
    int correct,i,j;

    String randno="0",used;
    //Integer.toString((int)(Math.random()*10000))
    Scanner scan = new Scanner(System.in);
    while(Integer.parseInt(randno)<1000||Integer.parseInt(randno)>9999)
      {
        System.out.println("Enter a 4 digit number to guess");
        randno=scan.next();
    }

    char [] guess;
    for (j=0;j<8;j++)
      { System.out.println("-------------chances left:"+(8-j)+"------------------------");
        used="";
        correct=0;
        System.out.println("Enter a 4 digit number");
        guess=scan.next().toCharArray();
        for( i=0;i<4;i++)
        {
        if(randno.indexOf(guess[i])!=-1)
          {

            correct++;
            if(used.indexOf(guess[i])==-1)
              used+=guess[i];
            }

          }
          if(correct==4)
          {
            System.out.println("congratulations!");
            break;
          }
          else
          {
            System.out.println("you got "+used.length()+" digit(s) right, better luck next time!");
          }

        }
  }
}
