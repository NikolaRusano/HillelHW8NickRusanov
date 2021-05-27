package Task2;

import java.util.Scanner;

public class TasteTester {

    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Select type of the cake:\n" +
                    "1 - Birthday cake;  2 - Wedding Cake\n 0 - exit");
            choise = scanner.nextInt();
            if (choise == 1){
                System.out.println("What taste do you prefer birthday cake:");
                birthdayCake.setTaste(scanner.nextLine());
                System.out.println("What price  do you prefer birthday cake:");
                birthdayCake.setPrice(scanner.nextDouble());
                System.out.println("What quantity of candles do you want:");
                birthdayCake.setCandles(scanner.nextInt());
                System.out.println("Your birthday cake is:\n" +
                        "taste - " + birthdayCake.getCandles() +
                        "\n price: " + birthdayCake.getPrice() +
                        "\n with " + birthdayCake.getCandles() + " candles");
            }if (choise == 2){
                System.out.println("What taste do you prefer wedding cake:");
                weddingCake.setTaste(scanner.nextLine());
                System.out.println("What price  do you prefer wedding cake:");
                weddingCake.setPrice(scanner.nextDouble());
                System.out.println("What quantity of tiers do you want:");
                weddingCake.setTiers(scanner.nextInt());
                System.out.println("Your wedding cake is:\n" +
                        "taste - " + weddingCake.getTaste() +
                        "\n price: " + weddingCake.getPrice() +
                        "\n with " + weddingCake.getTiers() + " tiers");
            }


        }while (choise != 0);



    }
}
