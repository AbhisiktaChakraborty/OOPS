import java.util.Scanner;
class ScannerExample
{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //out is an object of PrintStream
    // System.in is how to refer the input buffer
    //in is a static member of System class
    //in is an object of InputStream

    //int n=s.nextInt(); //converts to binary value and then saves as integer value
    //double d =s.nextDouble();
    //s.nextLine();
    //String str = s.nextLine();

      int arr[] = new int [10];
      for (int i=0;i<3;i++){
        arr[i]=s.nextInt();
      }

      for (int i:arr){
        System.out.println(i);
      }

    //System.out.println(n);
    //String ss1=s.next();
    /*char c = s.next().charAt(0); //s.next() is a string
    System.out.println(n);
    System.out.println(d);
    System.out.println(str);
  System.out.println(c);
    // charAt() is a method of String class takes index as argumnet and returns char at index
    //nextLine() includes space
    //next() does not include space*/
  }
}
