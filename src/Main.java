import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = ran.nextInt(1,10);
            System.out.println(num[i]);
        }
        System.out.println(massiv(num));


    }
    public static int massiv(int[] a){
        int sum  = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0){
            }
            sum+=a[i];
        }return sum;
    }
}