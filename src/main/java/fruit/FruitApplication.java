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
        System.out.println();

    }

    public static void applesToOranges() {
        List<Fruit> basketOfFruit = new ArrayList<>();
        basketOfFruit.add(new Banana(4, 59));
        basketOfFruit.add(new Orange(4, 345));
        basketOfFruit.add(new Apple(AppleType.FUJI, 157, 299));
        basketOfFruit.add(new Banana(4, 59));
        basketOfFruit.add(new Orange(5, 345));
        basketOfFruit.add(new Apple(AppleType.GRANNY_SMITH, 161, 299));
        basketOfFruit.add(new Banana(5, 79));
        basketOfFruit.add(new Apple(AppleType.GRANNY_SMITH, 150, 299));
        basketOfFruit.add(new Orange(5, 345));

        System.out.println("Unsorted Fruit Basket");
        for (Fruit fruit : basketOfFruit) {
            System.out.println(fruit.getClass() + " = " + fruit.getWeightInOunces() + ", " + fruit.getPriceInCents() + "¢");
        }
        System.out.println();


    }
}