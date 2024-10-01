import java.util.Objects;

//3- Create Manager class, it should have managerId (auto generate)
// and actionNumber( set zero when you created the object so it should assign 0 in the constructor)
//Required extra functions: getActionNumber, setActionNumber and getManagerID
//Overide toString again and print extra managerID
//override equals function and check if username and password matchs
// or managerIDand password match.  IF any of cases are correct we will return true.
class Manager extends Person {
    int managerID;
    private int actionNumber;  // Set to zero in the constructor
    private String surName;
    public Manager(String name, String surName, int age, String userName,  String password) {
        super(name, age, userName,  password);
        this.managerID = (int)(1000000*Math.random());
        this.surName= surName;
        this.actionNumber = 0;

    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    public int getManagerID() {
        return managerID;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerID=" + managerID +
                ", actionNumber=" + actionNumber +
                ", username='" +  getUserName()+ '\'' +
                ", password='" + getPassword() + '\'' +
                "} " ;
    }
    //override equals function and check if username and password matchs
    // or managerID and password match.  IF any of cases are correct we will return true.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return  super.equals(o) || (managerID == manager.managerID && password.equals(manager.password));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managerID, password);
    }

    public String getPassword() {
        return password;
    }

    public int getManagerId() {
        return managerID;
    }


    public String getSurname() {
        return surName;
    }


}
