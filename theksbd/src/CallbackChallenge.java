interface Member {
    void callback();
}

class Store {
    Member[] members = new Member[100];
    int count = 0;

    void register(Member member) {
        members[count++] = member;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("Woohoo! Hey, " + name + "! There is a sale!");
    }
}

public class CallbackChallenge {
    public static void main(String[] args) {
        Store store = new Store();
        Customer hoang = new Customer("Hoang");
        Customer jonas = new Customer("Jonas");
        Customer john = new Customer("John");

        store.register(hoang);
        store.register(jonas);

        store.inviteSale();
    }
}
