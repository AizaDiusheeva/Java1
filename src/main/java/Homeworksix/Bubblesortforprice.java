package Homeworksix;

public class Bubblesortforprice {
    public static void main(Cars[] carsArray) {
        int n = carsArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (carsArray[j].price > carsArray[j + 1].price) {
                    Cars temp = carsArray[j];
                    carsArray[j] = carsArray[j + 1];
                    carsArray[j + 1] = temp;
                }
            }
        }
    }
}

public static void main(Cars[] carsArray) {
            int n = carsArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (carsArray[j].models.compareTo(carsArray[j + 1].models) > 0) {
                    // Меняем местами элементы
                    Cars temp = carsArray[j];
                    carsArray[j] = carsArray[j + 1];
                    carsArray[j + 1] = temp;
                }
            }
        }
    }

public static void printCarsArray(Cars[] carsArray) {
    for (Cars car : carsArray) {
        System.out.println(car);
    }
}


















