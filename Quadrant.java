class Quadrant{
  public static void main(String s[]){
    int n=s.length;
    int x=Integer.parseInt(s[0]);
    int y=Integer.parseInt(s[1]);
    if(x>0 && y>0)  System.out.println("Quadrant I");
    else if(x<0 && y>0)  System.out.println("Quadrant II");
    else if(x<0 && y<0)  System.out.println("Quadrant III");
    else if(x>0 && y<0)  System.out.println("Quadrant IV");
    else if(x==0) System.out.println("Y Axis");
    else if(y==0) System.out.println("X Axis");
    else System.out.println("Origin");

  }
}
