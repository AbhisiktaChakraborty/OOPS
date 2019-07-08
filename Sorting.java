class Sorting
{
    public static void main(String a[]) {
      int n=a.length,temp;
      int x[] = new int [n];
      for(int i=0;i<n;i++)
      {
          x[i]=Integer.parseInt(a[i]);
      }
      for(int i=0;i<n;i++)
      {
        for(int j=1;j<n;j++)
        {
          if(x[j-1]>x[j])
          {
            temp=x[j-1];
            x[j-1]=x[j];
            x[j]=temp;
          }
        }
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(x[i]);
      }
    }
}
