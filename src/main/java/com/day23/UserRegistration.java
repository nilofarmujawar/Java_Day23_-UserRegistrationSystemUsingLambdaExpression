package com.day23;

/**
 * UC1  :- As a User need to enter a valid First Name
 *         - First name starts with Cap and has minimum 3 characters
 * UC2  :- As a User need to enter a valid Last Name
 *         - Last name starts with Cap and has minimum 3 characters
 * UC3  :- As a User need to enter  a valid email
 *         - E.g. abc.xyz@bl.co.in
 *         - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 * UC4  :- As a User need to follow pre-defined Mobile Format
 *         - E.g. 91 9919819801
 *         - Country code follow by space and 10 digit number
 * UC5  :- As a User need to follow pre-defined Password rules.Rule1– minimum 8 Characters
 *         - NOTE – All rules must be passed
 * UC6  :- Rule2 – Should have at least 1 Upper Case
 *         - NOTE – All rules must be passed
 * UC7  :- Rule3 – Should  have at least 1 numeric number in the password
 *         - NOTE – All rules must be passed
 * UC8  :- Rule4 – Has exactly 1 Special Character
 *         - NOTE – All rules must be passed
 * UC9  :- Should clear all email samples provided separately
 * UC10 :- Write JUnit Test to validate the User Entry for First Name, Last Name,Email, Mobile, and Password.
 *         - Write Junit Test for Happy as well as Sad test  case.
 *         - Happy Test Case validates the Entry Successfully
 *         - Sad Test Cases fails the Entry
 * UC11 :- Write JUnit Parameterised Test to validate multiple entry for the Email Address.
 * UC12 :- Refactor the Code to throw custom exceptions in case of Invalid User Details
 *         - Rewrite all Test Cases to take in Custom Exception for Invalid First Name, Last Name,
 *           Email, Mobile, and Password
 * UC13 :- Refactor the Code to use Lambda Function to validate User Entry
 *         - Use Lambda Function to validate First  Name, Last Name, Email, Mobile, and Password
 */

/**
 *  import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Purpose  - To validate all the use case through Lambda Expression
 **/

@FunctionalInterface
interface UserDetailsValidationFI {
    boolean validate(String x) throws UserRegistrationException;
}

public class UserRegistration {

    /**
     * Created a method to validate first name using lambda expression
     */
    UserDetailsValidationFI validateFirstName = firstName -> {
        if (firstName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            /**
             *  Regex to check valid userlastname.
             */
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            /**
             *  Compile the ReGex
             */
            Pattern pattern = Pattern.compile(regex);
            /**
             * Pattern class contains matcher() method to find matching between given username
             * and regular expression.
             */
            Matcher matcher = pattern.matcher(firstName);
            /**
             * Return if the username matched the Regex
             */
            return matcher.matches();
        }
    };

    /**
     * Created a method to validate last name using lambda expression
     */
    UserDetailsValidationFI validateLastName = lastName -> {
        if (lastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         *  Regex to check valid userlastname.
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        /**
         *  Compile the ReGex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Return if the userlastname matched the Regex
         */
        return matcher.matches();
    };

    /**
     * Created a method to validate email address using lambda expression
     */
    UserDetailsValidationFI validateEmail = email -> {
        if (email == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (email.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-z]{3,}([_+-.]?[a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,][a-z]{2,3}+)*$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(email);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    };

    /**
     * Created a method to validate phone number using lambda expression
     */
    UserDetailsValidationFI validatePhoneNumber = phoneNumber -> {
        if (phoneNumber == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (phoneNumber.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         *  regex pattern for email
         */
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(phoneNumber);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    };
    /**
     * Created a method to validate password according to all the rules by using lambda expression
     */
    UserDetailsValidationFI validatePassword1 = password -> {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * ^ represents starting character of the string.
         * .{8,} represents at least 8 characters and more than characters.
         * $ represents the end of the string.
         */
        String regex = "^[a-zA-z1-9]{8,}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         *  Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         *  Return if the password matched the Regex
         */
        return matcher.matches();
    };
    /**
     * Created a method to validate password according to all the rules by using lambda expression
     */
    UserDetailsValidationFI validatePassword2 = password -> {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [A-Z]{1,} represents an upper case alphabet that must occur at least once.
         * 4) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1,}[a-zA-z1-9]{8,}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given password
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         *  Return if the password matched the Regex
         */
        return matcher.matches();
    };
    /**
     * Created a method to validate password according to all the rules by using lambda expression
     */
    UserDetailsValidationFI validatePassword3 = password -> {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) $ represents the end of the string.
         */
        String regex =  "^[A-Z]{1}+[a-zA-z1-9]{9,}[1-9]{1}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         * Return if the password matched the Regex
         */
        return matcher.matches();
    };
    /**
     * Created a method to validate password according to all the rules by using lambda expression
     */
    UserDetailsValidationFI validatePassword4 = password -> {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) [@$^]{1} represents a at least once special character.
         * 6) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[@$^]{1}[1-9]{1}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         *  Return if the password matched the Regex
         */
        return matcher.matches();
    };

    /**
     * Created a method to validate all the emails in the list using lambda expression
     */
    UserDetailsValidationFI validateEmailId = emailId -> {
        if (emailId == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (emailId.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(emailId);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    };
}