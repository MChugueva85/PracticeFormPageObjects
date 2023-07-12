package home_task_page_object.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomUtils {
    static Faker faker = new Faker();
    static Faker fakerRu = new Faker(new Locale("ru"));

    public static String getRandomFirstName() {
        return fakerRu.name().firstName();
    }


    public static String getRandomLastName() {
        return fakerRu.name().lastName();
    }

    public static String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomPhone() {
        return "8" + faker.random().nextInt(100000000, 999999999);
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return faker.options().option(genders);
    }

    public static String getDayOfBirth() {
        return String.format("%02d", faker.random().nextInt(10, 28));
    }

    public static String getMonthOfBirth() {
        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"};

        return faker.options().option(months);
    }

    public static int getYearOfBirth() {
        return faker.random().nextInt(1980,2023);
    }

    public static String getSubjects() {
        String[] subjects = {"Maths", "Accounting", "Arts", "Social Studies",
                "Biology", "Physics", "Chemistry", "Computer Science", "Commerce",
                "Economics", "Civics", "Hindi", "English", "History"};
        return faker.options().option(subjects);
    }

    public static String getHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public static String getAddress() {
        return new Faker(new Locale("ru")).address().fullAddress();
    }

    public static String getState() {
        String[] State = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return faker.options().option(State);
    }
    public static String getCity(String state) {
        String[] NCR = {"Delhi", "Gurgaon", "Noida"};
        String[] UttarPradesh = {"Agra", "Lucknow", "Merrut"};
        String[] Haryana = {"Karnal", "Panipat"};
        String[] Rajasthan = {"Jaipur", "Jaiselmer"};
        return switch (state) {
            case "NCR" ->  faker.options().option(NCR);
            case "Uttar Pradesh" ->  faker.options().option(UttarPradesh);
            case "Haryana" ->  faker.options().option(Haryana);
            case "Rajasthan" -> faker.options().option(Rajasthan);
            default -> throw new IllegalStateException("Unexpected value: " + state);
        };
    }
}
