import ClassesMiddleware.ThreadC1C2;
import ClassesMiddleware.ThreadC2C1;

public class Main {
    public static void main(String[] args) {

        ThreadC1C2 c1_c2 = new ThreadC1C2();
        c1_c2.start();

        ThreadC2C1 c2_c1 = new ThreadC2C1();
        c2_c1.start();
    }
}