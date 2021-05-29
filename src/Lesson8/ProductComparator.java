package Lesson8;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
//        example 1 with native Integer method
//        return Integer.compare(o1.getPrise(), o2.getPrise());

//        example with Casting int to Integer
//        return ((Integer)o1.getPrise()).compareTo(o2.getPrise());

//        Custom example
        if (o1.getPrise() > o2.getPrise()) {
            return 1;
        } else if (o1.getPrise() < o2.getPrise()) {
            return -1;
        } else {
            return 0;
        }
    }
}
