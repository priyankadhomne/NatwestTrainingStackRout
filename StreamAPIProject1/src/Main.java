import com.natwest.stramproject.Wrestler;
import com.natwest.stramproject.WrestlerImplementation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wrestler>arrayList = new ArrayList<>();
        arrayList.add(new Wrestler(1,"Mit",150,7.1,36));
        arrayList.add(new Wrestler(2,"Radhika",250,8.1,38));
        arrayList.add(new Wrestler(3,"Shalini",200,6.9,27));
        arrayList.add(new Wrestler(4,"Badal",120,9.1,25));

        WrestlerImplementation wrestlerImplementation = new WrestlerImplementation();
        System.out.println("---------------Count The Wrestler---------------------");
        System.out.println(wrestlerImplementation.countAllWrestler(arrayList));
        System.out.println("--------------Count the wrestler Whose Weight greater than 200----------------------");
        System.out.println(wrestlerImplementation.countOfAllWrestlerWhoseWeightIsGreaterThan200(arrayList));
        System.out.println("------------List of Wrestler in Descending order Based on height------------------------");
        System.out.println(wrestlerImplementation.displayAllTheWrestlerBasedOnHeightInDescendingOrder(arrayList));
        System.out.println("-------------List of wrestler in Ascending order based on weight is greater than 150-----------------------");
        System.out.println(wrestlerImplementation.displayAllWrestlerNameInAscendingWhoseWeightIsGreaterThan150(arrayList));
        System.out.println("-----------List of wrestler Based on height in descending order-------------------------");
        System.out.println(wrestlerImplementation.displayAllTheWrestlerBasedOnHeightInDescendingOrder(arrayList));
    }
}