package lca04;

import java.util.*;

public class interfaces {

    public static void main(String[] args) {
        TwoWheeler tw=new TwoWheeler();
        System.out.println(tw.totalDistance());
    }
}

interface Motorbike{
    double speed=6.9;
    double totalDistance();
}

interface Cycle{
    static double time=4.2;
}

class TwoWheeler implements Motorbike,Cycle{
    public double totalDistance() {
        return speed*time;
        //return speed*time;
    }
}