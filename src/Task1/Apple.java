package Task1;

public class Apple extends Fruit{
    int calories;
    public void removeSeeds(){
        System.out.println("The seeds were removed from the apple");
    }
    public void cutFruit(){
        System.out.println("The apple were cut");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void makeJuice() {
        System.out.println("The apple juice are making now");;
    }
}
