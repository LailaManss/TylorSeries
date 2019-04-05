import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (1==1) {
            System.out.println("Give number");
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            System.out.println("Give n");
            int n = sc.nextInt();
            System.out.println("result with Tylor series " + new SinCalculatedWithTylor().calc(x, n));
            System.out.println("result with Libs " + new SinFromLlibs().calc(x));
        }
    }


}
