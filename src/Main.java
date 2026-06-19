import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Date today = new Date();
        Random random = new Random();
        int num = random.nextInt(1000);
        System.out.println(today);
        System.out.println(num);
    }
}

