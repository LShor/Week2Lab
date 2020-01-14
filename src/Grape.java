public class Grape extends Fruit {

    public String name = "Grape";
    public boolean isForSale = true;
    public static String salesCat = "individual produce";

    public Grape() {
        super("Fruit");
    }

    public static String getSalesCat() {
        return salesCat;
    }

public class Grape {
}
