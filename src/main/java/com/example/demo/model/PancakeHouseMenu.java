package com.example.demo.model;

import com.example.demo.designPattern.behavioural.iterator.normalIteration.IteratorPancakeHouseMenu;
import com.example.demo.designPattern.behavioural.iterator.normalIteration.MenuIterator;
import com.example.demo.designPattern.behavioural.iterator.refined.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    // other menu methods here

    public MenuIterator createIterator(){
        return new IteratorPancakeHouseMenu(menuItems);
    }

    public Iterator<MenuItem> refinedIterator(){
        return menuItems.iterator();
    }

}
