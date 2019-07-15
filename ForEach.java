class ForEach{
  public static void main(String a[]){
    int n=a.length,temp;
    int x[] = new int [n];
    for(int i=0;i<n;i++)
    {
        x[i]=Integer.parseInt(a[i]);
    }

    for(int i:x){
      System.out.println(i);
    }
  }
}
