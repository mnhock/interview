package interview.clean;

import java.util.ArrayList;
import java.util.Date;

public class ImmutableStudent {
    
    private int number;
    private String firstName;
    private String lastName;
    private Date registered;
    private ArrayList cources = new ArrayList();

    public ImmutableStudent(int number, String LastName, String firstName, Date registered) {
        this.number = number;
        this.lastName = LastName;
        this.firstName = firstName;
        this.registered = registered;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getNumber() {
        return this.number;
    }

    public Date getRegistered() {
        return this.registered;
    }

    public ArrayList getCources() {
        return this.cources;
    }

    public boolean addCource(String text) {
        text.trim();
        return this.cources.add(text);
    }
}
