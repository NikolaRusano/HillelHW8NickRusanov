package Task1;

public class Orange extends Fruit{
    int calories;
    public void peelBanana(){
        System.out.println("The orange has been peeled");
    }
    public void cutFruit(){
        System.out.println("The orange were cut");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void makeJuice() {
        System.out.println("The orange juice are making now");;
    }
}
