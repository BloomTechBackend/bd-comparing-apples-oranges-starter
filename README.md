# Set Up
1. Clone this project to your machine using `git clone <project url>`
2. Open project in `Intellij`. Gradle should build your project automatically.

# BD 7.2 - Comparing Apples to Oranges

This lesson teaches us more about comparing objects in java. 
In order to compare objects of the same type, the class needs to implement Comparable. This is perfect if there is a natural way to compare one instance to another. Simply override the compareTo method and implement an algorithm to compare this to that. 
But if we need a different way to sort, we have to have a separate class which implements Comparator. In the comparator class, we override the compare method, which takes two objects as parameters and tells java which one is greater than the other or if they are equal to each other.
Either of these methods allows us to compare objects. Additionally java allows us to  leverage that ability to be able to sort a collection of objects.

## Project Overview

You will modify the Apple class to implement Comparable by adding a compareTo method. This is giving java instructions on how to compare one apple to another.
Next, you will create a separate FruitComparator class with a compare method which will compare any two objects to each other as long as both are Fruits.
