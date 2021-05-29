package Task3;

import java.util.Scanner;

public abstract class Phone {
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        System.out.println("Input phone number please");
        Scanner scanner = new Scanner(System.in);
        phoneNumber = scanner.next();
        this.phoneNumber = phoneNumber;
    }

    public void dialNumber(){
        System.out.println("The telephone number " + getPhoneNumber() + " is dialing...");

    }
    public void operationalSystem(){};
    public void chargeInterface(){};
    public void appStore(){};


}
