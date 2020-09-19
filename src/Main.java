import Realty.Comparator.AreaComparator;
import Realty.Comparator.PriceComparator;
import Realty.Comparator.RoomComparator;
import Realty.House;
import Realty.Window;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    House smallHouse = new House(new Window(4, 3), 20000, 2, 60);
    House smallHouseCopy = new House(new Window(2, 3), 18000, 2, 65);
    House mediumHouse = new House(new Window(3, 3), 35000, 6, 95);
    House largeHouse = new House(new Window(3, 3), 60000, 5, 140);

    System.out.println(smallHouse.hashCode());
    System.out.println(smallHouseCopy.hashCode());
    System.out.println(smallHouse.equals(mediumHouse));

    ArrayList<House> houseList = new ArrayList<>();
    houseList.add(mediumHouse);
    houseList.add(smallHouse);
    houseList.add(smallHouseCopy);
    houseList.add(largeHouse);

    System.out.println("Sorting by area using compareTo");
    Collections.sort(houseList);
    for (House house: houseList) {
      System.out.println(house);
    }

    System.out.println("Sorting by price using PriceComparator");
    PriceComparator priceComparator = new PriceComparator();
    Collections.sort(houseList, priceComparator);
    for (House house: houseList) {
      System.out.println(house);
    }

    System.out.println("Sorting by area using AreaComparator");
    AreaComparator areaComparator = new AreaComparator();
    Collections.sort(houseList, areaComparator);
    for (House house: houseList) {
      System.out.println(house);
    }

    System.out.println("Sorting by rooms quantity using RoomComparator");
    RoomComparator roomComparator = new RoomComparator();
    Collections.sort(houseList, roomComparator);
    for (House house: houseList) {
      System.out.println(house);
    }
  }
}
