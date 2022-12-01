
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GandalfNods {
//  Gandalf nods his head 2.1 times a second-ish
//  126 times a minute.
//  7560 times a hour.
//  75,600 in the whole video.
//  181,440 in a day.
//  63,072,000 after an entire year.

    LocalDateTime start = LocalDateTime.of(2012,9,12,0,0,0);

    void calculateTotalNods(){
        LocalDateTime currentTime = LocalDateTime.now();
        long seconds = ChronoUnit.SECONDS.between(start,currentTime);
        long amount = (long) (seconds*2.1);
        System.out.println("In the Video Gandalf Sax Guy, Gandalf has nod his head " + new BigDecimal(amount).toPlainString() + " times since " + start);
    }

    public static void main(String[] args) {
        GandalfNods gn = new GandalfNods();
        gn.calculateTotalNods();
    }
}
