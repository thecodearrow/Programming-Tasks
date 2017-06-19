/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Prashanth
 * TITLE: BankApplication (Address.java)
 * Methods/Contructors: public Address(int , String , int , String )
 *                      public String getStreet(), public String setStreet(String)
 *                      public int getdoorno(),public int setdoorno(int),
 *                      public int getPostalCode(),
 *                      public void setPostalCode(int),
 *                      public String getCity(), public void setCity(String)
 *                      public String toString()
 * 
 * Variables:           private int doorno
                        private String street
                        private int postalcode
                        private String city
 *                      
 */
public class Address extends Object {

    private int doorno;
    private String street;
    private int postalcode;
    private String city;

    public Address(int doorno, String street, int postalcode, String city) {
        this.doorno = doorno;
        this.street = street;
        this.postalcode = postalcode;
        this.city = city;
    }

    //Getters & Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getdoorno() {
        return doorno;
    }

    public void setdoorno(int doorno) {
        this.doorno = doorno;
    }

    public int getPostalCode() {
        return postalcode;
    }

    public void setPostalCode(int postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
 
    @Override
    public String toString() {
        return ("Doorno= " + doorno + ", Street= " + street
                + ", Postal Code= " + postalcode + ", City= " + city );
    }

    
    
   
}
