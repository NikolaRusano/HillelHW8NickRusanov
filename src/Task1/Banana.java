package Task1;

public class Banana extends Fruit{
    int calories;
    public void peelBanana(){
        System.out.println("The banana has been peeled");
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void makeJuice() {
        System.out.println("The banana juice are making now, please add some water");
    }

}
