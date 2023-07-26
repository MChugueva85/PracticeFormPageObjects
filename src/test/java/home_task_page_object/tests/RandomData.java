package home_task_page_object.tests;

import home_task_page_object.utils.RandomUtils;

public class RandomData {
    RandomUtils randomUtils = new RandomUtils();


        String firstName = randomUtils.getRandomFirstName(),
        lastName = randomUtils.getRandomLastName(),
        userEmail = randomUtils.getRandomUserEmail(),
        gender = randomUtils.getRandomGender(),
        userNumber = randomUtils.getRandomPhone(),
        day = randomUtils.getDayOfBirth(),
        month = randomUtils.getMonthOfBirth(),
        subjects = randomUtils.getSubjects(),
        hobbies = randomUtils.getHobbies(),
        userPic = "Picture.png",
        address = randomUtils.getAddress(),
        state = randomUtils.getState(),
        city = randomUtils.getCity(state),
        year = String.valueOf(randomUtils.getYearOfBirth());

}
