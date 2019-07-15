class InsertionSort{
  public static void main(String a[]){

    int n=a.length,temp;
    int arr[] = new int [n];
    for(int i=0;i<n;i++)
    {
        arr[i]=Integer.parseInt(a[i]);
    }
    insertionSort(arr,n);
}

    static void insertionSort(int arr[], int n){

      int i, key, j;
      for (i = 1; i < n; i++)
      {
          key = arr[i];
          j = i - 1;
          while (j >= 0 && arr[j] > key)
          {
              arr[j + 1] = arr[j];
              j = j - 1;
          }
          arr[j + 1] = key;
      }
      for(i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
    }
}
