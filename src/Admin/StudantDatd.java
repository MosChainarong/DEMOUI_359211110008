package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudantDatd {
    private final StringProperty ID;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty emailName;
    private final StringProperty dob;

    //constructor

    public StudantDatd(String ID, String firstName, String lastName, String emaliName, String dob) {
        this.ID = new SimpleStringProperty(ID);
        this.firstName = new SimpleStringProperty(firstName;
        this.lastName = new SimpleStringProperty(lastName;
        this.emailName = new SimpleStringProperty(emaliName);
        this.dob = new SimpleStringProperty(dob);
    }

    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getEmaliName() {
        return emailName.get();
    }

    public StringProperty emaliNameProperty() {
        return emailName;
    }

    public void setEmaliName(String emaliName) {
        this.emailName.set(emaliName);
    }

    public String getDob() {
        return dob.get();
    }

    public StringProperty dobProperty() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob.set(dob);
    }
}
}//class
