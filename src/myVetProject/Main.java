package myVetProject;

import java.util.ArrayList;
import myVetProject.animals.cat;

public class Main {

    private static ArrayList<cat> myCatList = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here

        //String petID, String name, int age, String breed, double weight, char sex
        cat myNewCat = new cat("897fdgu4", "Fudge", 10, "mixed", 3.0, 'm');

        cat myOtherCat = new cat("98ysdfgn", "Poppy", 9, "mixed", 5.0, 'f');

        myCatList.add(myNewCat);
        myCatList.add(myOtherCat);

        System.out.println(myNewCat.getName());
        System.out.println(myOtherCat.getName());

        System.out.println(myCatList.get(0));
    }
}
