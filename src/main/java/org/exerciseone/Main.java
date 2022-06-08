/**
 * Exercise One
 * Author: Abi Kunkle
 * Date: 06/08/22
 */
package org.exerciseone;

// Broad imports
import java.util.*;

public class Main {
    static ArrayList<Item> inventoryList = new ArrayList<>();

    /**
     * filterLetter = single character to sort alphabetically by
     * Filters out items that do not begin with T.
     * Then, sorts by item price and reverses order so it is in descending.
     * Finally, print info for item
     */
    static String filterLetter;
    private static void streamFilter() {
        inventoryList.stream()
                .filter(item -> item.getItemBrand().startsWith(filterLetter))
                .sorted(Comparator.comparingDouble(Item::getItemPrice).reversed())
                .forEach(item -> System.out.println(item.returnAllInfo()));
    }
    public static void main(String[] args) {
        // Take the user's input as the alphabetical filter
        System.out.println("User can filter alphabetically by brand. \nEnter a SINGLE LETTER to filter alphabetically by:");
        Scanner keyboard = new Scanner(System.in);          // Take the user's input
        filterLetter = keyboard.next().toUpperCase();       // make case insensitive

        // VERY LAZY ADD ITEMS. Was going to make a JSON file which would be parsed but that was not the
        // point of this exercise and would have wasted today's time.
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



        streamFilter();



        //filterClass.streamFilterBrand();

    }



}

//        if(filterSelect == '1'){        // If user selected 1, then filter by item ID
//                System.out.println("Enter letter to filter by: ");
//                String filterLetter = keyboard.nextLine();
//                inventoryList.stream()
//                .filter(item -> item.getItemBrand().startsWith(filterLetter))
//                .sorted(Comparator.comparingDouble(Item::getItemPrice).reversed())
//                .forEach(item -> System.out.println(item.returnAllInfo()));
//                }