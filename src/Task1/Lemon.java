package Task1;

public class Lemon extends Fruit{
    int calories;
    public void peelBanana(){
        System.out.println("The lemon has been peeled");
    }
    public void cutFruit(){
        System.out.println("The lemon were cut");
    }



    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void makeJuice() {
        System.out.println("The lemon juice are making now");;
    }
}
