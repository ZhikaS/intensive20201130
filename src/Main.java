import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.awt.AWTException {
        System.out.println("Кофе-машина");

        //DONE: read this from console
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int moneyAmount = in.nextInt();

        System.out.printf("Вы внесли: %d рублей. \n", moneyAmount);
        in.close();

        int[] drinkPrices = {150, 80, 20, 50};
        String[] drinkNames = {"капучино", "эспрессо", "вода", "молоко"};

        //DONE: add canBuySomething
        boolean canBuySomething = false;
        for (int i = 0; i < drinkPrices.length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i] + " по цене " +
                        drinkPrices[i] + " р.");
                canBuySomething = true;
            }
        }
            if (canBuySomething == false) {
                System.out.println("Недостаточно средств!");
            }

        //DONE: 20201130_204424
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        //DONE: find code and get screenshot to image
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        System.out.println(image.getWidth() + "x" + image.getHeight());

        //DONE: make screenshots of code and results in console
        //  and send them to Telegram-chat with #ilovejava
    }
}