
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> book;

    public AddressBook() {
        this.book = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo ish = new BuddyInfo("ish","Ottawa",911);
        AddressBook booky = new AddressBook();
        booky.addBuddy(ish);
        booky.removeBuddy(ish);

    }

    public List<BuddyInfo> addBuddy(BuddyInfo tempInfo) {
        this.book.add(tempInfo);
        return this.book;
    }
    public void addBuddy(BuddyInfo tempInfo) {
        System.out.println("came from new branch");
    }
    public List<BuddyInfo> removeBuddy(BuddyInfo tempInfo) {
        this.book.remove(tempInfo);
        return this.book;
    }
}
