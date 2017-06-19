/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.*;

/**
 *
 * @author Prashanth
 * TITLE: To create an application for registering the details of job seeker. 
 * Classes: class JobSeeker, public class P2Question4
 * Methods: boolean validateUserName(String)
 * Variables: String uname,userName
 *            Boolean validate_1,validate_2,valid
 *            int index;
 *
 */

class JobSeeker {

    boolean validateUserName(String userName) {
        Boolean validate_1, validate_2;
        validate_1 = userName.endsWith("_job");
//Validate_1 checks if the userName ends with "_job"
//Validate_2 checks if there are a min of 8 characters before "_job"
        int index = userName.lastIndexOf("_job");
        if (index >= 8) {
            validate_2 = true;
        } else {
            validate_2 = false;
        }
 
        //both conditions are true, then userName is VALID
        if (validate_1 == true && validate_2 == true) {
            return (true); 
        }
        else
            return(false);
    }

}

public class P2Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobSeeker j = new JobSeeker();
        System.out.println("NOTE: The username should end with _job and "
                + "also have atleast 8 characters to its left.\n");
        System.out.println("Please enter your username:");
        String uname = sc.next();
        Boolean valid = j.validateUserName(uname);
        if (valid == false) {
            System.err.println("Username INVALID!");
        } else {
            System.out.println("Username successfully validated");
        }
    }

}
