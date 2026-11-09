package objectsExample;

public class Objects {

    public static void main(String[] args) {
        Person customer1 = new Person("Pesho", "Petrov", 12321321, 15);
//        Person customer2 = new Person("Gosho", "Petrov", 123213341, 18);
//        Person customer3 = new Person("Dancho", "Petrov", 12334321, 21);

        BankAccount account1 = new BankAccount("checking", "EUR", customer1);

        System.out.println(account1.getBalance());
        account1.deposit(100);
        System.out.println(account1.getBalance());

        account1.withdraw(50);
        System.out.println(account1.getBalance());

        // Change name
        customer1.changeFamilyName("Petrova");

        System.out.println(account1.getHolder().getName());
    }
}
