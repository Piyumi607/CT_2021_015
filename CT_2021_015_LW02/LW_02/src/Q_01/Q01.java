package Q_01;
public class Q01 {
    public static void main(String[] args) {
      int A=10;
      int B=20;
      int C=30;
      int X=40;
      int Y=50;
      int r=7;

      double result1=Math.sqrt(Math.pow(B,2)+4*A*C);
      double result2=Math.sqrt(X+4*Math.pow(Y,3));
      double result3=Math.cbrt(X*Y);
      double area=Math.PI*Math.pow(r,2);

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(area);
    }
}
