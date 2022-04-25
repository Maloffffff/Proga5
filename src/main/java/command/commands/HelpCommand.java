package command.commands;

import model.HumanBeing;
import java.util.Formatter;
import java.util.HashMap;


public class HelpCommand extends Command{
    private final HashMap<String,Command> commandMap;

    public HelpCommand(HashMap<String, Command> commandMap){
        super("help", ": display help on available commands");
        this.commandMap = commandMap;
    }

    @Override
    public boolean isHumanBeingRequired() {
        return super.isHumanBeingRequired();
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        for (String it : commandMap.keySet()) {
            Formatter formatter = new Formatter();
            formatter.format("%-20s", commandMap.get(it).getName());
            formatter.format("%s", " " + commandMap.get(it).getDescription());
        }
    }
}
