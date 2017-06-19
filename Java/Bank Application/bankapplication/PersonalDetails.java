/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Prashanth
 * TITLE: Bank Application (PersonalDetails.java)
 * Variables:   private String firstName;
                private String lastName;
                private int age;
                private Address address;
                
  Constructors/Methods:  public String getFirstName() 
  *                      public void setFirstName(String )
  *                      public String getLastName()
  *                      public void setLastName(String)
  *                      public int getAge()
  *                      public void setAge(int)
  *                      public void setAddress(int, String, int, String)
  *                      public Address getAddress()
  *                      public String toString()
  * 
  * 
  *                      
                 
             
                
 */
public class PersonalDetails {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(int doorno, String street, int postalcode, String city) {
        this.address = new Address(doorno, street, postalcode, city);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return (" First Name: " + firstName + ", LastName:" + lastName
                + ", Age: " + age + ", Address: " + address );
    }

}
