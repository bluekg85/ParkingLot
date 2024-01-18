package edu.du.ict4305;

public class Observer implements ParkingAction{
    private String text;

    public Observer(String text){
        this.text = text;
    }
    @Override
    public Enum<Event> update(Event eventType){
        return eventType;

    }
}
