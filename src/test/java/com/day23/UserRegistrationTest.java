package com.day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    /**
     * test case for uc 1 firstName
     */
    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Nilofar");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("nilofar");
        Assertions.assertEquals(false, result);
    }

    /**
     * test case for uc2 lastName
     */
    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Mujawar");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("mujawar");
        Assertions.assertEquals(false, result);

    }
    /**
     * test case for uc3 email
     */
    @Test
    public void givenEmail_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailAddress("abc@gmail.com.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.emailAddress("abc()*@gmail.com");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc4 Mobile no.
     */
    @Test
    public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 9604315270");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 9604315270");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc5 password rule 1
     */
    @Test
    public void givenPassword_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule1("bridgelabz");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule1("Bri");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc6 password rule 2
     */
    @Test
    public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("Bridgelabz");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("bridgelabz");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc 7 password rule 3
     */
    @Test
    public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("Bridgelabz1");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("Bridgelabz");
        Assertions.assertEquals(false, result);
    }
}

