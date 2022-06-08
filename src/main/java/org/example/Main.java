/**
 * Exercise One
 * Author: Abi Kunkle
 * Date: 06/08/22
 */
package org.example;

// Broad imports
import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        ArrayList<Item> inventoryList = new ArrayList<Item>();

        // VERY LAZY ADD ITEMS. Was going to make a JSON file which would be parsed but that was not the
        // point of this exercise and would have wasted today's time
        inventoryList.add(new Item("FFA123", "Toyota", "Brake Pads for 2011 Prius C", 45.99));
        inventoryList.add(new Item("FFA124", "Toyota", "Brake Pads for 2011 Prius Standard", 45.99));
        inventoryList.add(new Item("CAI231", "OxiClean", "OxiClean Airvent CLeaner", 7.99));
        inventoryList.add(new Item("TWD612", "Traction", "Push Pull Cable Hardware Kits - H/D Truck", 3.39));
        inventoryList.add(new Item("TWD108", "Traction", "Wheel Chock - Rubber", 32.49));
        inventoryList.add(new Item("TWD051", "Traction", "Brake Shoes - Single / Bulk", 31.99));
        inventoryList.add(new Item("TWD626", "Traction", "Push Pull Cable Hardware Kits - H/D Truck", 3.39));
        inventoryList.add(new Item("BK7051", "NAPA", "Hose Clamps Standard T Bolt", 7.99));
        inventoryList.add(new Item("GAT271", "Gates", "Hydraulic Hose Hydraulic Hose Very High Pressure", 19.99));
        inventoryList.add(new Item("BK8128", "Mi-T-M", "Mi-T-M Pressure Washer, Gas Powered, Hot Water, 3500 PSI", 6689.00));

        // Filters out items that do not begin with T. Then, sorts by item price and reverses order so it is descending. Finally, print info for item
        inventoryList.stream()
                .filter(item -> item.getItemBrand().startsWith("T"))
                .sorted(Comparator.comparingDouble(Item::getItemPrice).reversed())
                .forEach(item -> System.out.println(item.returnAllInfo()));

    }
}