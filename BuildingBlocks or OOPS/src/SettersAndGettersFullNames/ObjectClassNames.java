package SettersAndGettersFullNames;

public class ObjectClassNames {
    private String FirstName;
    private String LastName;

    //Setters
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    //Getters are returimg the first name and last name
    public String getname() {
            return FirstName + LastName;
    }

}
