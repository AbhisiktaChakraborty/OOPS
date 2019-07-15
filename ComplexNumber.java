class Complex{
 int real,imaginary;


 void add(Complex c1,Complex c2)
 {
   int x,y;
   x=c1.real + c2.real;
   y=c1.imaginary + c2.imaginary;
   System.out.println("Addition");
   System.out.println(x);
   System.out.println(y);
 }

 void sub(Complex c1,Complex c2)
 {
   int x,y;
   x=c1.real - c2.real;
   y=c1.imaginary - c2.imaginary;
   System.out.println("Subtraction");
   System.out.println(x);
   System.out.println(y);
 }

 void mult(Complex c1,Complex c2)
 {
   int a,b,c,d;
   a=c1.real;b=c1.imaginary;c=c2.real;d=c2.imaginary;
   int x,y;x=a*c-b*d;y=b*c+a*d;
   System.out.println("Multiplication");
   System.out.println(x);
   System.out.println(y);
 }

}

class ComplexNumber{
  public static void main(String a[]) {

    Complex c1 = new Complex();
    c1.real = 1;
    c1.imaginary = 2;

    Complex c2 = new Complex();
    c2.real = 3;
    c2.imaginary = 4;

    Complex c = new Complex();

    c.add(c1,c2);
    c.sub(c1,c2);
    c.mult(c1,c2);


  }

}
