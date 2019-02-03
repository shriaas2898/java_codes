/*
*Date: 16th JAN 2018
*Author:AASTHA SHRIVASTAVA
*Description:program to Encrypt a string by replacing lowerCase alphabet with the next alphabet and leave all the characters as it is.
*/
import java.util.Scanner;
class Encrypt
{
  String doEncrypt(String orig)
  {
    int i;
    String encr="";
    for(i=0;i<orig.length();i++)
    {

       if(orig.charAt(i)>='a'&&orig.charAt(i)<='y')
       {
        encr+=(char)(orig.charAt(i)+1);
        //(char)(((int)orig.charAt(i))+1);
       }
       else
       if(orig.charAt(i)=='z')
       {
         encr+='a';
       }
       else
       {
         encr+=orig.charAt(i);
       }
    }
    return (encr);
  }
  public static void main(String[] args)
  {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter a string");
     String orig=scan.nextLine();
     Encrypt en= new Encrypt();
     System.out.println(en.doEncrypt(orig));

  }



}
