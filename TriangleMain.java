import java.util.Scanner;
import java.lang.Float;

class Triangle{
  int base,height;

  Triangle(int b,int h){
    base=b;
    height=h;
  }

  double getArea(){
    double area = 0.5 * base * height;
    System.out.println("Area = " + area);
    return area;
  }

  void display(){
    System.out.println("Base = " + base);
    System.out.println("Height = " + height);
    getArea();
  }
  void comp(Triangle tr1,Triangle tr2){
    if (tr1.getArea()==tr2.getArea()){
      System.out.println("Equal");
    }
    else{
      System.out.println("Not Equal");
    }
  }

}

class TriangleMain{
  public static void main(String[] args) {
    System.out.println("Triangle");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base and height");
    Triangle tr = new Triangle(0,0);
    int b,h;
    b = sc.nextInt();
    h = sc.nextInt();
    Triangle tr1 = new Triangle(b,h);
    System.out.println("Enter base and height");
    b = sc.nextInt();
    h = sc.nextInt();
    Triangle tr2 = new Triangle(b,h);
    while(true){
      System.out.println("Enter choice");
      int ch = sc.nextInt();
      switch(ch)
      {
        case 1: tr1.getArea();break;
        case 2: tr1.display();break;
        case 3: tr2.getArea();break;
        case 4: tr2.display();break;
        case 5: tr.comp(tr1,tr2);
      }


    }

  }
}
