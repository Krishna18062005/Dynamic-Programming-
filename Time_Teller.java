import java.util.*;
import java.time.LocalTime;

public class ss {
    public static void main(String args[]) {
        String time = "11:23";

        while (true) {
            LocalTime CurrentTime = LocalTime.now();
            String ct = CurrentTime.toString().substring(0, 5);
            if (ct.equals(time)) {
                System.out.println("padinga bro time ipo  " + time);
                break;
            }
        }

    }
}
