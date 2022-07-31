package Lesson8;

class Product   {

    private int id;
    private String name;
    private int prise;


    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }


    public int getPrise() {
        return prise;
    }


    public int getId() {
        return id;
    }

    public Product(int id, String name, int prise) {
        this.id = id;
        this.name = name;
        this.prise = prise;
    }

    @Override
    public String toString(){
    return "product" + " " + (id + "," + name + "," + prise);
    }


}
