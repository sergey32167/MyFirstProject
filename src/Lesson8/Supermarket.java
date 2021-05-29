package Lesson8;

import java.util.*;

class Supermarket {

    private List<Product> productList;

    public Supermarket() {
        this.productList = new ArrayList<Product>();
    }

    public void addproduct(Product product) {
        productList.add(product);
    }

    public void showproducts() {
        System.out.println("---------------List Products-----------------------");
        for (Product p : productList) {
            System.out.println(p.toString());
        }
        System.out.println("---------------------------------------------------");
    }

    public void showSortedProductsByPrize() {
        List<Product> productListCopy = new ArrayList<>(productList);
        ProductComparator comparator = new ProductComparator();
        productListCopy.sort(comparator);
        System.out.println("---------------List Products-----------------------");
        for (Product p : productListCopy) {
            System.out.println(p.toString());
        }
        System.out.println("---------------------------------------------------");
    }

    public void editById(int id) {
        Scanner scan = new Scanner(System.in);
        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println("Found product: " + p.toString());
                System.out.println("Enter new name: ");
                String newName = scan.nextLine();
                p.setName(newName);
                System.out.println("Enter new price: ");
                int newprice = scan.nextInt();
                p.setPrise(newprice);
            }
        }
        scan.close();
    }

    public void showSortedProductsByAdd() {
        for (int i = productList.size() - 1; i >= 0; i--) {
            System.out.println(productList.get(i));
        }
    }

    public void removeById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                productList.remove(p);
                break;
            }
        }
    }

    public List<Product> getProductList() {
        return productList;
    }


}
