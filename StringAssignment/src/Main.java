import com.natwest.stringtask.FruitJuice;

public class Main {
    public static void main(String[] args) {
        FruitJuice fruitJuice = new FruitJuice(1, "Orange", "Bottle", 500, 2.5f);
        fruitJuice.discount();
        fruitJuice.display();

        fruitJuice.input();
        fruitJuice.discount();
        fruitJuice.display();


    }
}