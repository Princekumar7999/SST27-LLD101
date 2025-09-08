package exercise;

public class EmployeeLDAPAdapter implements Employee {
    private final EmployeeLDAP instance;

    public EmployeeLDAPAdapter(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getAttributes().get("uid");
    }

    @Override
    public String getFirstName() {
        return instance.getAttributes().get("givenName");
    }

    @Override
    public String getLastName() {
        return instance.getAttributes().get("sn");
    }

    @Override
    public String getEmail() {
        return instance.getAttributes().get("mail");
    }
}
