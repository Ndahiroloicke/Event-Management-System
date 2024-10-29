import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventBase> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void addEvent(EventBase event) {
        events.add(event);
    }

    public List<EventBase> listEvents() {
        return events;
    }

    public EventBase findEventById(int eventId) {
        for (EventBase event : events) {
            if (event.getEventId() == eventId) {
                return event;
            }
        }
        return null;
    }

    public boolean cancelEvent(int eventId) {
        EventBase event = findEventById(eventId);
        if (event != null) {
            events.remove(event);
            return true;
        }
        return false;
    }
}
