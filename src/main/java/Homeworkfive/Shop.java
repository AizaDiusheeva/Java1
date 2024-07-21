package Homeworkfive;

public class Shop {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        System.out.println("Я могу купить еду =" + canBuy(isEdekaOpen, isReweOpen));
    }

    public static boolean canBuy(boolean Market , boolean Market2) {
        return Market || Market2;}
}


