public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Workshop workshop = new Workshop(1, "Java Workshop", "2023-11-15", "Room A", 30, "Alice Johnson");
        Concert concert = new Concert(2, "Live Music Night", "2023-12-10", "Auditorium", 100, "The Band");

        eventManager.addEvent(workshop);
        eventManager.addEvent(concert);

        System.out.println("All Events:");
        for (EventBase event : eventManager.listEvents()) {
            System.out.println(event.getEventDetails());
        }
    }
}
