package home_task_page_object.tests;

import home_task_page_object.utils.RandomUtils;

public class RandomData {
    RandomUtils randomUtils = new RandomUtils();

    String firstName, lastName,userEmail,gender,UserNumber,
            Day,Month,Year,subjects,hobbies,address,state,city;

    public RandomData() {
        firstName = randomUtils.getRandomFirstName();
        lastName = randomUtils.getRandomLastName();
        userEmail = randomUtils.getRandomUserEmail();
        gender = randomUtils.getRandomGender();
        UserNumber = randomUtils.getRandomPhone();
        Day = randomUtils.getDayOfBirth();
        Month = randomUtils.getMonthOfBirth();
        subjects = randomUtils.getSubjects();
        hobbies = randomUtils.getHobbies();
        address = randomUtils.getAddress();
        state = randomUtils.getState();
        city = randomUtils.getCity(state);
        Year = String.valueOf(randomUtils.getYearOfBirth());
    }
}
