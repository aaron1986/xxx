public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.populate();
        System.out.println(gym.toString());
        gym.readFromCSV("members.csv");
        System.out.println(gym.toString());
    }
}