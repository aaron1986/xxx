import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gym {
    private Map<Integer, Member> members;
    private int dailyVisits;
    private int monthlyVisits;

    public Gym() {
        members = new HashMap<>();
        dailyVisits = 0;
        monthlyVisits = 0;
    }

    public boolean isMember(int memberId) {
        return members.containsKey(memberId);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Members:\n");
        for (Member member : members.values()) {
            sb.append(member.toString()).append("\n");
        }
        sb.append("Daily visits: ").append(dailyVisits).append("\n");
        sb.append("Monthly visits: ").append(monthlyVisits).append("\n");
        return sb.toString();
    }

    public void populate() {
        int memberId = 1;
        addMember(new Member(memberId++, "mickey mouse",34,"Male","1 Neighborhood Lane"));
        addMember(new Member(memberId++, "Bananaman",12,"Male","29 Acacia Road"));
    }

    public void readFromCSV(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                String memberName = fields[1];
                int memberAge = Integer.parseInt(fields[2]);
                String memberGender = fields[3];
                String memberAddress = fields[4];
                Member member = new Member(56, memberName, memberAge, memberGender, memberAddress);
                addMember(member);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
