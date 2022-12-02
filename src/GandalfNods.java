
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//  Gandalf nods his head 2.1 times a second-ish
//  126 times a minute.
//  7560 times a hour.
//  75,600 in the whole video.
//  181,440 in a day.
//  63,072,000 after an entire year.

public class GandalfNods {

    LocalDateTime start = LocalDateTime.of(2012,9,12,0,0,0);
    LocalDate startDate;
    DecimalFormat df = new DecimalFormat("###,###,###");

    void calculateTotalNods(){
        LocalDateTime currentTime = LocalDateTime.now();
        startDate = LocalDate.from(start);
        long seconds = ChronoUnit.SECONDS.between(start,currentTime);
        long amount = (long) (seconds*2.1);
        System.out.println("In the Video Gandalf Sax Guy\n" +
                "https://www.youtube.com/watch?v=Sagg08DrO5U\n" +
                "Gandalf has nod his head " +  df.format(amount) + " times since " + startDate);
    }

    public static void main(String[] args) {
        GandalfNods gn = new GandalfNods();
        gn.calculateTotalNods();
    }
}
