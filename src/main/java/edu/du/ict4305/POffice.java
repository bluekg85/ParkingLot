package edu.du.ict4305;

import java.util.ArrayList;
import java.util.List;

public class POffice {
    private List<Command> commandList = new ArrayList<Command>();

    public void takeCommand(Command command) {
        commandList.add(command);
    }

    public void placeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
