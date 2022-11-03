package src.com.javatraining.tasks.week04.task_001415;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // implement Requirements 1-4 here
        for (Apartment apartment : apartments) {
            if (apartment instanceof OneRoomApt) {
                ((OneRoomApt) apartment).clean1Room();
            } else if (apartment instanceof TwoRoomApt) {
                ((TwoRoomApt) apartment).clean2Rooms();
            } else if (apartment instanceof ThreeRoomApt) {
                ((ThreeRoomApt) apartment).clean3Rooms();
            } else {
                System.out.println("Hm, don't know what to do with this apartment!");
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
