package com.day23;

/**
 * UC1 :- As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 * UC2 :- As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 character
 * UC3 :- As a User need to enter  a valid email
 *        - E.g. abc.xyz@bl.co.in
 *        - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 * UC4 :- As a User need to follow pre-defined Mobile Format
 *        - E.g. 91 9919819801
 *        - Country code follow by space and 10 digit number
 * UC5 :- As a User need to follow pre-defined Password rules.Rule1– minimum 8 Characters
 *         - NOTE – All rules must be passed
 * UC6 :- Rule2 – Should have at least 1 Upper Case
 *        - NOTE – All rules must be passed
 * UC7 :- Rule3 – Should  have at least 1 numeric number in the password
 *       - NOTE – All rules must be passed
 * UC8 :- Rule4 – Has exactly 1 Special Character
 *        - NOTE – All rules must be passed
 * UC9 :- Should clear all email samples provided separately
 * UC10 :-Write JUnit Test to validate the User Entry for First Name, Last Name,Email, Mobile, and Password.
 *         - Write Junit Test for Happy as well as Sad test  case.
 *         - Happy Test Case validates the Entry Successfully
 *         - Sad Test Cases fails the Entry.
 * UC11 :- Write JUnit Parameterised Test to validate multiple entry for the Email Address.
 */

/**
 * import matcher class and pattern class
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * create a class name as UserRegistration
 */
public class UserRegistration {

    /**
     * Create a method name as firstName, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     *
     * @param firstName
     * @return firstname matched the regex
     */
    public boolean firstName(String firstName) {
        /**
         * Regex to check valid firstname
         * 1) First name starts with Cap and has minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{3,}";
        /**
         * First, the pattern is created using the Pattern.compile() method
         * The first parameter indicates which pattern is being searched for
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */
        Matcher match = pattern.matcher(firstName);
        /**
         * Return if the firsName matched the Regex
         */
        return match.matches();
    }

    /**
     * Create a method name as lastName, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     *
     * @param lastName
     * @return userlastname matched the Regex
     */

    public boolean lastName(String lastName) {
        /**
         *  Regex to check valid userlastname.
         *  1) Last name starts with Cap and has minimum 3 character
         */
        String regex = "^[A-Z]{1}[a-z]{3,}";
        /**
         *  Compile the Regex
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
    }

    /**
     * Create a method name as emailAddress, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param email
     * @return useremail matched the Regex
     */
    public boolean emailAddress(String email) {
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
        Matcher matcher = pattern.matcher(email);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Create a method name as  phoneNumber, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param phoneNumber
     * @return mobileNo matched the Regex
     */
    public boolean phoneNumber(String phoneNumber) {
        /**
         * regex pattern for email
         * 1) Country code follow by space and 10 digit number
         */
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given phoneNumber
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(phoneNumber);
        /**
         * Return if the mobileNo matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Create a method name as passwordRule1, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param password
     * @return password matched the Regex
     */
    public boolean passwordRule1(String password) {
        /**
         * regex pattern for password:must contain atleast 8 characters
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters and more than characters.
         * 3) $ represents the end of the string.
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
    }

    /**
     * Create a method name as passwordRule2, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param password
     * @return password matched the Regex
     */
    public boolean passwordRule2(String password) {
        /**
         * Regex to check valid password.
         * 1)must contain atleast 8 characters
         * 2)must contain one UpperCase
         * 3) ^ represents starting character of the string.
         * 4) {8,} represents at least 8 characters or more than that characters.
         * 5) [A-Z]{1,} represents an upper case alphabet that must occur at least once.
         * 6) $ represents the end of the string.
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
    }

    /**
     * Create a method name as passwordRule3, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param password
     * @return password matched the Regex
     */
    public boolean passwordRule3(String password) {
        /**
         * regex pattern for password:
         * 1)must contain atleast 8 characters
         * 2)must contain one UpperCase
         * 3)should have 1 numericno.
         *
         * a) ^ represents starting character of the string.
         * b) {8,} represents at least 8 characters or more than that characters.
         * c) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * d) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * e) [1-9]{1}represents a digit must occur at least once.
         * f) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[1-9]{1}$";
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

    }

    /**
     * Create a method name as passwordRule4, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param password
     * @return password matched the Regex
     */
    public boolean passwordRule4(String password) {
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
    }

    /**
     * Create a method name as emailAddressSample, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param emailId
     * @return
     */
    public boolean emailAddressSample(String emailId) {
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
    }

}

