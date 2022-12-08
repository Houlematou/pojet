package org.example;

public class Registration {
    boolean validateUserInput(String username, String passWord, String confirmPassword){
        if (username.isEmpty()|| passWord.isEmpty()|| confirmPassword.isEmpty() ){
            return false;
        }
        if (!passWord.equals(confirmPassword)){
            return false;
        }
        return true;
    }
}
