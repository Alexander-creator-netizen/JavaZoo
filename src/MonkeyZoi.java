import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MonkeyZoi extends AnimalMonkeys {

    public MonkeyZoi(String nameAnimal) {
        super(nameAnimal);
    }

    String itemOne = "Наручные часы";
    String itemTwo = "Платок";
    String itemThree = "Кольцо";
    String itemFour = "Банан";
    String itemFive = "Очки";

    private ArrayList <String> stolenItems = new ArrayList<>(Arrays.asList(itemOne, itemTwo, itemThree, itemFour, itemFive));

    public String randomItem (ArrayList <String> stolenItem) {
        Random random = new Random();
        String randomItem = stolenItem.get(random.nextInt(5));
        return randomItem;
    }

    public ArrayList getStolenItems() {
        return stolenItems;
    }

    public void setStolenItems(ArrayList <String> stolenItems) {
        this.stolenItems = stolenItems;
    }

}
