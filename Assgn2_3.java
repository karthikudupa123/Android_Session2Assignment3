import java.util.Scanner;
class Assgn2_3
{
public static void main(String[] args) 
{
int n, c, k, space = 1,l=97;
char ch[]=new char[100];
  for(int i=1;i<=26;i++)
  {
   ch[i]=(char)l;
   l++;
  }
  n=3;

  space = n - 1;



  for (k = 1; k<=n; k++)
  {
    for (c = 1; c<=space; c++)
      System.out.print(" ");

      space--;

     
    
    for (c = 1; c<= k; c++)
    {
      System.out.print(ch[c]);
      
    }
    int v=k-1;
    
    for(c=k;c>1;c--)
    {
      
      System.out.print(ch[v]);
      v--;
    }
    System.out.print("\n");
  }
 
  space = 1;
 
  for (k = n-1; k>1; k--)
  {
    for (c = 1; c<= space; c++)
      System.out.print(" ");
 
    space++;
 
    for (c = 1 ; c<=k; c++)
    {
      System.out.print(ch[c]);

    }
    int h=k-1;
    for(int p=h;p>0;p--)
    {
      System.out.print(ch[p]);
    }
    

 
    System.out.println("");
  }
    for(int i=1;i<n;i++)
    {
      System.out.print(" ");
    }
    System.out.println(ch[1]);

  
}
}
