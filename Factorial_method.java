class Factorial_method
{
    public static void main(String a[]) {
          int x=Integer.parseInt(a[0]);
          fact(x);
   }
   static void fact(int n)
   {
      int f=1;
      for(int i=1;i<=n;i++)
      {
          f*=i;
      }
      System.out.print("Factorial is ");
      System.out.println(f);
   }
}
