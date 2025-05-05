public class Person {

    /**
     * A class to describe a person with a first name, last name, day of birth, birth month, birth year, SSN, number of siblings, and list (array) of siblings.
     */

    private String firstname, lastname, ssn;
    private int birthDay, birthMonth, birthYear, numberOfSiblings;
    private Person[] siblings;

    /**
     * A constructor to initialize a person. Sets all parameters except the person's number of siblings and sibling array, which are kept as 0 and an array with length 0 by default.
     * 
     * @param firstname the person's first name
     * @param lastname the person's last name
     * @param birthDay the person's day of birth
     * @param birthMonth the person's birth month
     * @param birthYear the person's birth year
     * @param ssn the person's SSN
     */

    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    /**
     * A getter method to return the person's first name.
     * 
     * @return the person's first name
     */

    public String getFirstname() {
        return this.firstname;
    }

    /**
     * A getter method to return the person's last name.
     * 
     * @return the person's last name
     */

    public String getLastname() {
        return this.lastname;
    }

    /**
     * A setter method to set the person's first name.
     * 
     * @param s the person's first name
     */

    public void setFirstname(String s) {
        this.firstname = s;
    }

    /**
     * A setter method to set the person's last name.
     * 
     * @param s the person's last name
     */

    public void setLastname(String s) {
        this.lastname = s;
    }

    /**
     * A getter method to return the person's birthday, including their day of birth, birth month, and birth year.
     * 
     * @return the person's birthday in day/month/year format ("birthDay/birthMonth/birthYear")
     */

    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * A method to add a sibling to the person's array of siblings. Also increments the person's number of siblings by 1.
     * 
     * @param p the sibling to be added to the person's array
     */

    public void addSibling(Person p) {
        ++this.numberOfSiblings;
        Person[] newSiblings = new Person[this.siblings.length + 1];
        for (int i = 0; i < this.siblings.length; ++i) newSiblings[i] = this.siblings[i];
        newSiblings[this.siblings.length] = p;
        this.siblings = newSiblings;
    }

    /**
     * A getter method to return the person's array of siblings.
     * 
     * @return the person's array of siblings
     */

    public Person[] getSiblings() {
        return this.siblings;
    }

}