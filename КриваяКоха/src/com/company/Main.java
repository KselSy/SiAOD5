package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        KochSnowFlake kochSnowFlake = new KochSnowFlake();
        kochSnowFlake.setPreferredSize(new Dimension(600,450));
        kochSnowFlake.creatAndShowGUI();
    }
}
