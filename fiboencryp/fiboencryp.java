import java.util.Scanner;
class Encrypted
{
  public static void main(String[] args)
   {
     int i,fibo[]=new int[26];
     String orig,encr="";
     Scanner scan=new Scanner(System.in);
     fibo[0]=1;
     fibo[1]=2;
     for( i=2;i<26;i++)
     {
       fibo[i]=fibo[i-1]+fibo[i-2];
     }
     System.out.println("Enter a string");
     orig=scan.nextLine();
     for(i=0;i<orig.length();i++)
     {
       if((int)orig.charAt(i)>=65&&(int)orig.charAt(i)<=90)
       { 
         encr+=(fibo[((int)orig.charAt(i))-65]);
       }
       else
        if(orig.charAt(i)>='a'&&orig.charAt(i)<='z')
        {
         encr+=(fibo[((int)orig.charAt(i))-97]);
        }
        else
        {
          encr+=orig.charAt(i);
        }
     }
     System.out.println("Encrypted text is:"+encr);

  }
}
