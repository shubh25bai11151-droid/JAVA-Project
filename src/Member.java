
public class Member {

    private int memberId;
    private String name;

    // Constructor
    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters
    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    // Display member information
    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("----------------------------");
    }
}
