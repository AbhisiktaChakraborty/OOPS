import java.util.Scanner;

class Stack{

  int arr[];
  int top;

  Stack(int max_size){
    arr = new int [max_size];
    top=-1;
    System.out.println("Value:"+top);
  }

  void push(int n,int max_size)
  {
    if(top==max_size-1){
          System.out.println("Overload");
    }
    else{
      top+=1;
      arr[top]=n;
      System.out.println("Element inserted"+top);
    }
  }

  void pop(){
    if(top==-1){
      System.out.println("Empty Stack");
    }
    else{
      top--;
    }
  }
  void top_display(){
    if(top==-1){
      System.out.println("Empty Stack");
    }
    else{
      System.out.println("Elemnet at the top of stack is " + arr[top]);
    }
  }
  void display(){
    if(top==-1){
      System.out.println("Empty Stack");
    }
    else{
      for(int i:arr){
        System.out.println(i);
      }
    }
  }

}

class StackMain{
  public static void main(String[] args) {
    int ch;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter maximum size of array");
    int max_size = sc.nextInt();
       Stack st = new Stack(max_size);
    System.out.println("STACK");
    System.out.println("Stack Operations");
    System.out.println("1.Push Element");
    System.out.println("2.Pop Element");
    System.out.println("3.Show element at the top of stack");
    System.out.println("4.Display the entire stack");
    while(true){

      System.out.println("Enter choice");
      ch = sc.nextInt();


      switch(ch){
        case 1: System.out.println("Enter element");
              int n = sc.nextInt();
              st.push(n,max_size);
              break;
        case 2: st.pop();
                break;
        case 3: st.top_display();
                break;
        case 4: st.display();
                break;
        default: System.out.println("Wrong input");
      }

    }

  }
}
