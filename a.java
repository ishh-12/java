import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price of pen");
        float pen=sc.nextFloat();
        System.out.println("enter the price of pencil");
        float pencil=sc.nextFloat();
        System.out.println("enter the price of eraser");
        float eraser=sc.nextFloat();
        float bill=pen+pencil+eraser;
        bill=bill*0.18f;
        System.out.println("total bill(with 18% gst):"+bill);
        sc.close();
    }
}
