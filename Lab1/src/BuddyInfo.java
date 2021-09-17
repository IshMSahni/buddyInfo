public class BuddyInfo {
    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private int phoneNum;

    public BuddyInfo(String name, String address, int phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BuddyInfo ish = new BuddyInfo("ish","Ottawa",911);
        String helloName =ish.getName();
        System.out.println("hello " + helloName);
    }

}