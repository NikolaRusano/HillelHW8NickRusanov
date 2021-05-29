package Task3;

import java.util.Scanner;

public class SmartPhoneTester {
    public static void main(String[] args) {
        IOSSmartphone iosSmartphone = new IOSSmartphone();
        AndroidSmartphone androidSmartphone = new AndroidSmartphone();

        int choise;
        do {
            System.out.println("Please input: 1 - IOS data \n2 - Android data\n 0 - exit");
            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            if(choise == 1){
                String phoneNumIO;
                //phoneNumIO = scanner.next();
                iosSmartphone.setPhoneNumber();
                iosSmartphone.dialNumber();
                iosSmartphone.operationalSystem();
                System.out.println("For charge device plug in charge wire");
                iosSmartphone.chargeInterface();
                iosSmartphone.appStore();
            }if(choise == 2){
                String phoneNumAndr;
                /*phoneNumAndr = scanner.next();*/
                androidSmartphone.setPhoneNumber();
                androidSmartphone.dialNumber();
                androidSmartphone.operationalSystem();
                System.out.println("For charge device plug in charge wire");
                androidSmartphone.chargeInterface();
                androidSmartphone.appStore();
            }
        }while (choise != 0);
    }
}
