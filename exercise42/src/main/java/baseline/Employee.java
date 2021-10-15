package baseline;

//create a class for each employee
//sonarLint created record, allows to input each string
public record Employee(String lastName, String firstName, String salary) {
    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSalary(){
        return salary;
    }
}
