package Application;

import collectionManager.CollectionManager;
import command.commandReader.CommandReader;
import command.commands.Command;
import command.commands.ShowCommand;
import exception.BrokenDataException;
import exception.FileIsNotAvailableException;
import fileWork.FileToHumanBeings;
import fileWork.HumanBeingsToFile;
import model.HumanBeing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 * @author tsypk on 25.04.2022 21:23
 * @project Proga5
 */
public class Application {
    private final CollectionManager manager;
    private final CommandReader commandReader;
    private final FileToHumanBeings fileReader;
    private final HumanBeingsToFile fileWriter;
    private final BufferedReader consoleReader;
    private boolean isRunning = true;
    private String filename = "";

    public Application(CollectionManager manager, CommandReader commandReader, FileToHumanBeings fileReader, HumanBeingsToFile fileWriter) {
        this.manager = manager;
        this.commandReader = commandReader;
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start(String file) {
        try {
            this.filename = file;
            Vector<HumanBeing> readEntities = fileReader.readFromXml(filename);
            for (HumanBeing hb : readEntities) {
                manager.addElement(hb);
            }
            initCommands();
            run();
        } catch (FileIsNotAvailableException e) {
            e.printStackTrace();
        } catch (BrokenDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void run() throws IOException {
        while (isRunning) {
            String[] inputCommand = consoleReader.readLine().trim().toLowerCase().split("\\s", 2);

            Command command = commandReader.getCommandByName(inputCommand[0]);
            if (command == null) {
                System.out.println("Command is not exist");
                continue;
            }
            HumanBeing hb = null;
            if (command.isHumanBeingRequired()) {
                // todo read hb
            }
            command.execute(hb, inputCommand);
        }
    }

    public void exit() {
        this.isRunning = false;
    }

    public void save() throws FileIsNotAvailableException {
        fileWriter.writeToFile(manager.getHumanBeings(), filename);
    }

    private void initCommands() {
        commandReader.addCommand("show", new ShowCommand(manager));
        // todo add all commands
    }
}
