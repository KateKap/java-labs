package lab1;

public class Schedule {
    String roomName;
    String[][] timePeriod = {{"понеділок","09:00","19:00"},
            {"вівторок","07:00","19:00"},
            {"середа","07:00","19:00"},
            {"четвер","07:00","19:00"},
            {"п'ятниця","07:00","21:00"},
            {"субота","10:00","21:00"},
            {"неділя","10:00","21:00"}
    };


    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }


    public String[][] getTimePeriod() {
        for (int i = 0; i < timePeriod.length; i++) {
            for (int j = 0; j < timePeriod[i].length; j++) {

                System.out.print(timePeriod[i][j] + "\t");
            }
            System.out.println();
        }
        return timePeriod;
    }
}
