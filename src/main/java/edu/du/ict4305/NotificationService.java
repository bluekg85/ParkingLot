package edu.du.ict4305;

import java.util.*;

public class NotificationService {
    private Map<Event, List<ParkingAction>> customers;
    public NotificationService(){
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event,new ArrayList<>()) );
    }
    public void register(Event eventType, ParkingAction text_receiver){
        customers.get(eventType).add(text_receiver);
    }
    public void unregister(Event eventType, Observer observer){
        customers.get(eventType).remove(observer);
    }
    public void notify(Event eventType){
        customers.get(eventType).forEach(text_receiver-> text_receiver.update(eventType));
    }

}
