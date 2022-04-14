
/** 
*   Name: Xuan, Christina
*   Date: 02/25/2022
*
*   Description: 
*   A program which creats two human objects and demonstrate using the accessors/mutators successfully
*/

import java.util.*;
import java.io.*;

public class HumanTest {
    public static void main(String[] args) throws IOException {

        // initalizes each Human object
        Human xuan = new Human("Xuan", 50, 1, "Bronze II", 1);
        Human christina = new Human("Christina", 46.3, 40, "Unranked", 0);

        // demonstrate using the methods
        String xuanRank = xuan.getRank();
        System.out.println("Xuan's league rank is " + xuanRank + " he doesn't play alot");

        double christinaEnergy = christina.getEnergy();
        System.out.println("Christina's energy level is " + christinaEnergy + "%");

        // uses the sleep mutator and get the new energy level, then prints it out
        int sleepTime = 3;
        christina.sleep(sleepTime);
        christinaEnergy = christina.getEnergy();
        System.out
                .println("After " + sleepTime + " hours of sleep, Christina's energy is now " + christinaEnergy + "%");

        // using the changeRank mutator to change human xuan rank
        xuan.changeRank("Challenger");
        System.out.println("Xuan's new league rank is " + xuan.getRank());

        // using the changeOwnedCats mutator to change number of cats christina owns
        christina.changeOwnedCats(2);
        System.out.println("Christina now has " + christina.getCats() + " cats");

        System.out.println();

        // creates the string variables for each person using the toString method
        String xuanAttributes = xuan.toString();
        String christinaAttributes = christina.toString();

        // prints both person's attributes
        System.out.println(xuanAttributes);
        System.out.println(christinaAttributes);
    }
}