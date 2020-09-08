import Realty.House;
import Realty.Window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
  public static void main(String[] args) {
    System.out.println("ololo");

    House smallHouse = new House(new Window(4, 3), 20000, 2, 60);
    House smallHouseCopy = new House(new Window(2, 3), 20000, 2, 60);
    House mediumHouse = new House(new Window(3, 3), 35000, 4, 95);
    House largeHouse = new House(new Window(3, 3), 60000, 6, 140);

    /*System.out.println(smallHouse.hashCode());
    System.out.println(smallHouseCopy.hashCode());
    System.out.println(smallHouse.equals(mediumHouse));*/

    ArrayList<House> houseList = new ArrayList<>();
    houseList.add(mediumHouse);
    houseList.add(smallHouse);
    houseList.add(smallHouseCopy);
    houseList.add(largeHouse);

    Collections.sort(houseList);

    for (House house: houseList) {
      System.out.println(house);
    }

  }
}
