package com.example.demo.designPattern.behavioural.iterator.normalIteration;

import com.example.demo.model.MenuItem;

import java.util.List;

public class IteratorPancakeHouseMenu implements MenuIterator {

    List<MenuItem> items;
    int position = 0;

    public IteratorPancakeHouseMenu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
