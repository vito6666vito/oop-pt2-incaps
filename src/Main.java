import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car[] auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия",
                "manual", "sedan", "а256пр", 5, false, null);
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 3, "Черный", 2020, "Германия",
                "auto", "sedan", "т321ро", 5, true, new Car.Key(true, false));
        auto[2] = new Car("BMW", "Z8", 3, "Черный", 2021, "Германия",
                "auto", "sedan", "т321ро", 2, false, new Car.Key(true, true));
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея",
                "auto", "cross", "м525па", 5, true, new Car.Key(true, false));
        auto[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2015, "Южная Корея",
                "auto", "sedan", "и874ап", 5, false, new Car.Key(false, false));
        for (Car j : auto) {
            System.out.println(j);
        }
    }
}