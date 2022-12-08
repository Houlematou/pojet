package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    Registration registrationUtil;

    @BeforeEach
    public void setUp(){
        registrationUtil = new Registration();

    }
    @Test
    public void testIfValidateUserWork()
    {
        assertTrue(registrationUtil.validateUserInput("barry","12345","12345"));
        assertFalse(registrationUtil.validateUserInput("barry","","12345"));
        assertFalse(registrationUtil.validateUserInput("","12345","12345"));
    }


}