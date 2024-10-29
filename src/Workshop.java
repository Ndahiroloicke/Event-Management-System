public class Workshop extends EventBase {
    private String speaker;

    public Workshop(int eventId, String name, String date, String location, int capacity, String speaker) {
        super(eventId, name, date, location, capacity);
        this.speaker = speaker;
    }

    public String getSpeaker() { return speaker; }

    @Override
    public String getEventDetails() {
        return "Workshop: " + getName() + " by " + speaker + " on " + getDate() + " at " + getLocation();
    }
}
