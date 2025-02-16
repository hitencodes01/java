class Car{
    String model;
    int year;
    int price;

    void getModel(){
        System.out.printf("you have %s Car\n",model);
    }
    void getYear(){
        System.out.printf("%d facelift\n",year);
    }
    void getPrice(){
        System.out.printf("around %d Lakhs\n",price);
    }
}
class Tata extends Car{
    void getDetails(){
        getModel();
        getYear();
        getPrice();
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Tata safari = new Tata();
        safari.model = "safari";
        safari.year = 2024;
        safari.price = 20;
        safari.getDetails();
    }
}