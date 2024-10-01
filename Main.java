public class Main {
    public static void main(String[] args) {
        // PERSON OBJ
        Person person1 = new Person("Jack", 24, "JackMwisa", "1234");
        Person person2 = new Person("Sam", 21, "SamNeema", "5678");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println("person1 equals person2: " + person1.equals(person2));

        // CUSTOMER OBJ
        Customer customer1 = new Customer("AliceBahi", 23,"Ali","alice@2024",  200.00);
        System.out.println(customer1.toString());
        Manager manager1 = new Manager("Sam","Daniel", 36,"SamLove","sam@2024");
        Manager manager2 = new Manager("John","Matiw",37,"SamLove","sam@2024");
        manager1.setActionNumber(2);
        System.out.println(manager1.toString());
        System.out.println(manager2.toString());
        System.out.println("Are manager1 and manager2 equal? " + manager1.equals(manager2));




    }
}