package com.example.demo.designPattern.behavioural.iterator.refined;

import com.example.demo.model.DinerMenu;
import com.example.demo.model.PancakeHouseMenu;

public class MenuTestDrive {
        public static void main(String args[]) {
            Menu pancakeHouseMenu = new PancakeHouseMenu();
            Menu dinerMenu = new DinerMenu();
            Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
            waitress.printMenu();
        }
    }
