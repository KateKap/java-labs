package lab1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привіт! Це друга лабораторна по Java! JavaRush тобі в допомогу.");

        Schedule schedule = new Schedule();
        schedule.setRoomName("room1");
        System.out.println(schedule.getRoomName());
        schedule.getTimePeriod();


    }
}
