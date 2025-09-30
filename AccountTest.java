public class AccountTest {
    public static void main(String[] args) {
        // проверка конструктора и toString()
        Account a1 = new Account("111", "ким чен ын", 88);
        System.out.println(a1);

        Account a2 = new Account("222", "путин"); // баланс по умолчанию
        System.out.println(a2);

        // проверка геттеров
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // проверка credit() и debit()
        a1.credit(100);
        System.out.println(a1);

        a1.debit(50);
        System.out.println(a1);

        a1.debit(500);  // превышает баланс
        System.out.println(a1);

        // проверка transfer()
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}

class Account {
    private String accId;
    private String owner;
    private int balance;

    // конструкторы
    public Account(String id, String name) {
        this.accId = id;
        this.owner = name;
        this.balance = 0; // по умолчанию
    }

    public Account(String id, String name, int initialBalance) {
        this.accId = id;
        this.owner = name;
        this.balance = initialBalance;
    }

    // геттеры
    public String getID() {
        return accId;
    }

    public String getName() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    // пополнение
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // снятие
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }

    // перевод
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + accId +
                ",name=" + owner +
                ",balance=" + balance + "]";
    }
}
