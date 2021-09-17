
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> book = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    public List<BuddyInfo> addBuddy(List<BuddyInfo> arr, String name, String address, int phoneNum) {
        BuddyInfo temp = new BuddyInfo(name, address,phoneNum);
        arr.add(temp);
        return arr;
    }
    public List<BuddyInfo> removeBuddy(List<BuddyInfo> arr, int index) {
        arr.remove(index);
        return arr;
    }
}
