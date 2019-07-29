import java.util.Scanner;

class ArrayExample{
    int arr[];
    Scanner sc = new Scanner(System.in);

    void init(int n){

        arr = new int[n];
        for (int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
    }

    void insert(int pos,int val){
      int x[] = new int [arr.length +1];
      for(int i=0;i<pos;i++){
        if(i<=pos-1){
          x[i]=arr[i];
        }
      }
      x[pos]=val;
      for(int i=pos+1;i<x.length-1;i++){
        x[i]=arr[i-1];
      }
      arr = x;
    }
    void delete(int pos){
      int x[] = new int [arr.length-1];
      for(int i = 0;i<pos;i++){
        x[i]=arr[i];
      }
      for(int i=pos;i<x.length;i++){
        System.out.println("A = " + arr[i+1]);
        x[i]=arr[i+1];
        System.out.println("B = " + x[i]);
      }
      arr=x;
    }
    void display(){
      for(int i:arr){
        System.out.println(i);
        }
      }
}

class ArrayMain{

  public static void main(String[] args) {
    //System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);
    ArrayExample array = new ArrayExample();

    while(true){
      int ch = sc.nextInt();
      int pos,val;
      switch(ch)
      {
        case 1:System.out.println("Enter max size of array");
        int max_size = sc.nextInt();
        array.init(max_size);
        break;
        case 2:
            System.out.println("Enter position and value");
            pos = sc.nextInt();
            val = sc.nextInt();
            array.insert(pos,val);
            break;
        case 3: System.out.println("Enter position");
                pos = sc.nextInt();
                array.delete(pos);
                break;
        case 4: array.display();
      }

    }

  }

}
