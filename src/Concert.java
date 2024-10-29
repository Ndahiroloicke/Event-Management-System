public class Concert extends EventBase {
    private String artist;

    public Concert(int eventId, String name, String date, String location, int capacity, String artist) {
        super(eventId, name, date, location, capacity);
        this.artist = artist;
    }

    public String getArtist() { return artist; }

    @Override
    public String getEventDetails() {
        return "Concert: " + getName() + " featuring " + artist + " on " + getDate() + " at " + getLocation();
    }
}
