package interview.clean;

import java.util.HashSet;
import java.util.Set;

public class Name {
    private final String name;

    public Name(String first) {
        this.name = first;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Name other = (Name) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Set names = new HashSet();
        names.add(new Name("Donald Duck"));
        System.out.println(names.contains(new Name("Donald Duck"))); //prints false!!!
    }

}
