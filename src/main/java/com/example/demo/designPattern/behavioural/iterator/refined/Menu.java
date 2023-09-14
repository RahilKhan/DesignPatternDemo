package com.example.demo.designPattern.behavioural.iterator.refined;

import com.example.demo.model.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> refinedIterator();
}
