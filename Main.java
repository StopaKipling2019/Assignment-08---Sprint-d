public class Main {

    public static double totalEffort, totalHours;
    public static double capacity, capacityF;
    public static int workWeek = 40;
    public static int engineers = 8;
    public static int sprintLength = 3;

    public static void main(String[] args) {
        // write your code here
        System.out.print("With ");
        System.out.print(engineers);
        System.out.print(" devs working a ");
        System.out.print(sprintLength);
        System.out.print(" week sprint, for ");
        System.out.print(workWeek);
        System.out.print(" hrs/wk, we would be at ");
        System.out.printf("%.0f",capacity());
        System.out.print("% of capacity.");

    }
    public static double totalEffort(){
        totalEffort = 100 + 50 + 20 + 360 + 80 + 160 + 500 + 240 + 40 + 40;

        return totalEffort;
    }
    public static double totalHours(){
        totalHours = (engineers * workWeek) * sprintLength;

        return totalHours;
    }

    public static double capacity() {
        capacity = totalEffort() / totalHours();
        capacityF = capacity *100;

        return capacityF;
    }

}
