package command.commandReader;

import command.commands.Command;
import exception.CommandIsNotExistException;
import exception.InvalidFieldException;
import model.HumanBeing;

import java.util.HashMap;

public interface CommandReader {
    void addCommand(String commandName, Command command);

    void executeCommand(String userCommand, HumanBeing studyGroup) throws InvalidFieldException, CommandIsNotExistException;

    HashMap<String, Command> getCommandMap();

    Command getCommandByName(String commandName);
}
