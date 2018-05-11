public class HelloTeamCity {
    private String greetMessage;

    public HelloTeamCity(String message) {
        greetMessage = message;
    }

    public String getGreetMessage() {
        return greetMessage;
    }

    public static void main(String[] args) {
        HelloTeamCity helloTeamCity = new HelloTeamCity("HelloTeamCity!!");
        System.out.println(helloTeamCity.getGreetMessage());
    }
}
