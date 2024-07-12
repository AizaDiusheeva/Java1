package HomeWorkfour;

public class Random {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801); // Генерация случайного числа в диапазоне от 0 до 28800 включительно
        System.out.println("Осталось секунд: " + n);

        // Перевод секунд в полные часы
        int hours = n / 3600;

        // Вывод соответствующего сообщения в зависимости от количества оставшихся часов
        if (hours > 1) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }

    private int nextInt(int i) {
return 3720;
    }
}


