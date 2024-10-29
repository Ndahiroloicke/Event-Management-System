public abstract class EventBase {
    private int eventId;
    private String name;
    private String date;
    private String location;
    private int capacity;

    public EventBase(int eventId, String name, String date, String location, int capacity) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
    }

    public int getEventId() { return eventId; }
    public String getName() { return name; }
    public String getDate() { return date; }
    public String getLocation() { return location; }
    public int getCapacity() { return capacity; }

    public abstract String getEventDetails();
}
