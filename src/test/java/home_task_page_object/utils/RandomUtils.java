package home_task_page_object.utils;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class RandomUtils {
    Faker faker = new Faker();
    Faker fakerRu = new Faker(new Locale("ru"));

    public String getRandomFirstName() {
        return fakerRu.name().firstName();
    }


    public String getRandomLastName() {
        return fakerRu.name().lastName();
    }


    public String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }


    public String getRandomPhone() {
        return faker.phoneNumber().subscriberNumber(10);
    }


    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return faker.options().option(genders);
    }


    public String getDayOfBirth() {
        return String.format("%02d", faker.random().nextInt(1, 28));
    }

    public String getMonthOfBirth() {
        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"};

        return faker.options().option(months);
    }

    public int getYearOfBirth() {
        return faker.random().nextInt(1980, 2023);
    }


    public String getSubjects() {
        String[] subjects = {"Maths", "Accounting", "Arts", "Social Studies",
                "Biology", "Physics", "Chemistry", "Computer Science", "Commerce",
                "Economics", "Civics", "Hindi", "English", "History"};
        return faker.options().option(subjects);
    }


    public String getHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }


    public String getAddress() {
        return new Faker(new Locale("ru")).address().fullAddress();
    }


    public String getState() {
        String[] State = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return faker.options().option(State);
    }


    public String getCity(String state) {
        String city = null;
        List<String> citiesNCR = Arrays.asList("Delhi", "Gurgaon", "Noida");
        List<String> citiesUttarPradesh = Arrays.asList("Agra", "Lucknow", "Merrut");
        List<String> citiesHaryana = Arrays.asList("Karnal", "Panipat");
        List<String> citiesRajasthan = Arrays.asList("Jaipur", "Jaiselmer");

        switch (state) {
            case "NCR":
                city = citiesNCR.get(faker.random().nextInt(0, citiesNCR.size() - 1));
                break;
            case "Uttar Pradesh":
                city = citiesUttarPradesh.get(faker.random().nextInt(0, citiesUttarPradesh.size() - 1));
                break;
            case "Haryana":
                city = citiesHaryana.get(faker.random().nextInt(0, citiesHaryana.size() - 1));
                break;
            case "Rajasthan" :
                city = citiesRajasthan.get(faker.random().nextInt(0, citiesRajasthan.size() - 1));
        }
        return city;
    }
}
