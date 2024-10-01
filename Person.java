import java.util.Objects;

//1. Create Person class, it should have name, age, username, password.
//Override toString function to just print name and age in a good format.
//Override equals function to check username and password.
public class Person {
    private String name;
    private int age;
    private String userName;
     String password;
    public Person(String name, int age, String userName,  String password){
        this.name = name;
        this.age = age;
        this.userName =userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(userName, person.userName) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
            return name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
