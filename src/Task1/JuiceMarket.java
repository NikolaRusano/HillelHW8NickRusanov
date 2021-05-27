package Task1;



import java.util.Scanner;

public class JuiceMarket extends Fruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();
        Lemon lemon = new Lemon();
        apple.setCalories(52);
        banana.setCalories(89);
        orange.setCalories(47);
        lemon.setCalories(29);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Input juice which do you like:\n" +
                    "1 - apple 2 - banana  3 - orange  4 - lemon\n" +
                    "5 - mix all  0 - exit;");
            choice = scanner.nextInt();
            if (choice == 1) {
                apple.removeSeeds();
                apple.cutFruit();
                apple.makeJuice();
                System.out.println("The juice contain " + apple.getCalories() + " calories. Enjoy!");
            } else if (choice == 2) {
                banana.peelBanana();
                banana.makeJuice();
                System.out.println("The juice contain " + banana.getCalories() + " calories. Enjoy!");
            } else if (choice == 3) {
                orange.peelOrange();
                orange.cutFruit();
                orange.makeJuice();
                System.out.println("The juice contain " + orange.getCalories() + " calories. Enjoy!");
            } else if (choice == 4) {
                lemon.peelLemon();
                lemon.cutFruit();
                orange.makeJuice();
                System.out.println("The juice contain " + lemon.getCalories() + " calories. Enjoy!");
            } else if (choice == 5) {
                apple.removeSeeds();
                banana.peelBanana();
                orange.peelOrange();
                lemon.peelLemon();
                apple.cutFruit();
                orange.cutFruit();
                lemon.cutFruit();
                JuiceMarket juiceMarket = new JuiceMarket();
                juiceMarket.makeJuice();
                System.out.println("The juice contain " + (apple.getCalories()+banana.getCalories()+orange.getCalories()+
                        lemon.getCalories()) + " calories. Enjoy!");
            }


        }while (choice != 0) ;
    }
        @Override
        public void makeJuice() {
            System.out.println("The multifruit juice are making now");
        }
}
