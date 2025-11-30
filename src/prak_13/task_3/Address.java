package prak_13.task_3;

import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    public void parseStringSplit(String address, String delimiter) {
        String[] parts = address.split(delimiter);
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        }
    }

    public void parseStringTokenizer(String address, String delimiters) {
        StringTokenizer tokenizer = new StringTokenizer(address, delimiters);
        if (tokenizer.countTokens() >= 7) {
            country = tokenizer.nextToken().trim();
            region = tokenizer.nextToken().trim();
            city = tokenizer.nextToken().trim();
            street = tokenizer.nextToken().trim();
            house = tokenizer.nextToken().trim();
            building = tokenizer.nextToken().trim();
            apartment = tokenizer.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return String.format("Страна: %s, Регион: %s, Город: %s, Улица: %s, Дом: %s, корпус: %s, квартира: %s",
                country, region, city, street, house, building, apartment);
    }
}
