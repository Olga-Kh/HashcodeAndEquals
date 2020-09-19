package Realty;

import java.util.Objects;

public class House implements Comparable<House> {

  public Window window;

  public int price;
  public int rooms;
  public int area;

  public House(Window window, int price, int rooms, int area) {
    this.window = window;
    this.price = price;
    this.rooms = rooms;
    this.area = area;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof House)) return false;
    House house = (House) o;
    return price == house.price &&
            rooms == house.rooms &&
            area == house.area;
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, rooms, area);
  }


  @Override
  public String toString() {
    return "House{" +
            "window=" + window +
            ", price=" + price +
            ", rooms=" + rooms +
            ", area=" + area +
            '}';
  }

  @Override
  public int compareTo(House o) {
    return this.area - o.area;
  }
}
