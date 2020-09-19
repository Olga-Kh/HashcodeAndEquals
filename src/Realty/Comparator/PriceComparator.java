package Realty.Comparator;

import Realty.House;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {
  @Override
  public int compare(House o1, House o2) {
    return o1.price - o2.price;
  }
}
