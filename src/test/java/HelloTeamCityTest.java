import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTeamCityTest {
    @Test
    public void checkGreetMessage() {
        String message = "HelloTeamcity";
        String expected = "HelloTeamcity";

        HelloTeamCity helloTeamCity = new HelloTeamCity(message);
        assertEquals(helloTeamCity.getGreetMessage(), expected);
    }
}
