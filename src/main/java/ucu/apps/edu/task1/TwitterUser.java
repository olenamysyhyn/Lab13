package ucu.apps.edu.task1;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TwitterUser {
    private String userMail;
    private String userCountry;
    private LocalDateTime userActiveTime;
}
