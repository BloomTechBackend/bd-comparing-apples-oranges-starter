package fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitApplication {
    public static void main(String[] args) {
        // Here's where we compare apples
        applesToApples();
        // Here's where we compare apples and oranges
        applesToOranges();
    }

    public static void applesToApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(AppleType.GRANNY_SMITH, 161, 299));
        apples.add(new Apple(AppleType.RED_DELICIOUS, 154, 249));
        apples.add(new Apple(AppleType.GRANNY_SMITH, 135, 315));
        apples.add(new Apple(AppleType.PINK_LADY, 210, 325));
        // apple sale
        apples.add(new Apple(AppleType.FUJI, 157, 299));
        apples.add(new Apple(AppleType.RED_DELICIOUS, 189, 299));
        apples.add(new Apple(AppleType.PINK_LADY, 140, 299));
        apples.add(new Apple(AppleType.GRANNY_SMITH, 150, 299));
        apples.add(new Apple(AppleType.FUJI, 188, 299));
        apples.add(new Apple(AppleType.FUJI, 150, 299));

        System.out.println("Unsorted Apples");
        for (Apple apple : apples) {
            System.out.println("apple = " + apple.getType()+" "+apple.getWeightInGrams()+" grams");
        }
    }

    public static void applesToOranges() {

    }
}