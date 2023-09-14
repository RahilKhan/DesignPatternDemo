package com.example.demo.designPattern.behavioural.iterator.normalIteration;

import com.example.demo.model.DinerMenu;
import com.example.demo.model.PancakeHouseMenu;

public class MenuTestDrive {
        public static void main(String args[]) {
            PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
            DinerMenu dinerMenu = new DinerMenu();
            Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
            waitress.printMenu();
        }
    }
