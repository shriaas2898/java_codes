import java.util.Scanner;
class Number
{
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    char []num;
    int vow=0,con=0,index;
    System.out.println("Enter number in words");
    num=scan.nextLine().toLowerCase().toCharArray();
    for(index=0;index<num.length;index++)
    {
      if (Character.isLetter(num[index]))
      {
        if(num[index]=='a'||num[index]=='e'||num[index]=='i'||num[index]=='o'||num[index]=='u')
          vow++;
        else
         con++;
      }

      }
      System.out.println("No. of vowels: "+vow+" No. of consonants: "+con);
  }

}
