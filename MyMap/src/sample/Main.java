package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

    }

    public static void main(String[] args) {
        //launch(args);
        MyMap<String, Integer> map = new MyHashMap<>();
        map.put("Smith", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);
        map.put("Smith", 65);
        System.out.println("Entries in map: " + map);
        System.out.println("The age for Lewis is " +
                map.get("Lewis"));
        System.out.println("Is Smith in the map? " +
                map.containsKey("Smith"));
        System.out.println("Is age 33 in the map? " +
                map.containsValue(33));
        map.remove("Smith");
        System.out.println("Entries in map: " + map);
        map.clear();
        System.out.println("Entries in map: " + map);

        System.out.println();
        System.out.println("MYSET EXERCİSE:");
        // Create a MyHashSet
        MySet<String> set = new MyHashSet<>();
        set.add("Smith");
        set.add("Anderson");
        set.add("Lewis");
        set.add("Cook");
        set.add("Smith");

        System.out.println("Elements in set: " + set);
        System.out.println("Number of elements in set: " + set.size());
        System.out.println("Is Smith in set? " + set.contains("Smith"));

        set.remove("Smith");
        System.out.println("Names in set in uppercase are ");
        for (String s: set)
            System.out.print(s.toUpperCase() + " ");

        set.clear();
        System.out.println("\nElements in set: " + set);

    }
}
