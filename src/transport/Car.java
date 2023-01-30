package transport;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean tires;
    private Key key;

    public static class Key {
        private final boolean remoteStart;
        private final boolean withoutKey;

        public Key(boolean remoteStart, boolean withoutKey) {
            this.remoteStart = remoteStart;
            this.withoutKey = withoutKey;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isWithoutKey() {
            return withoutKey;
        }

        @Override
        public String toString() {
            return ", удаленный запуск:" + (remoteStart ? "Да" : "Нет") +
                    ", доступ без ключа:" + (withoutKey ? "Да" : "Нет") + ".";
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, String transmission, String bodyType, String registrationNumber, int seats, boolean tires, Key key) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "sedan";
        }
        this.bodyType = bodyType;

        setRegistrationNumber(registrationNumber);

        if (seats <= 0) {
            seats = 5;
        }
        this.seats = seats;
        this.tires = tires;
        setKey(key);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "manual";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "A000AA";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void tiersChanger(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            tires = false;
        }
        if (month >= 4 && month <= 10) {
            tires = true;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                ", цвет кузова: " + color + ", год выпуска: " + year + ", страна сборки: " + country +
                ", коробка передач: " + transmission + ", тип кузова: " + bodyType + ", рег.номер: " + registrationNumber +
                ", количество мест: " + seats + ", тип резины: " + (tires ? "зимняя" : "летняя") + key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && seats == car.seats && tires == car.tires && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country, transmission, bodyType, registrationNumber, seats, tires);
    }

}

