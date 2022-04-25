import collectionManager.CollectionManager;
import collectionManager.CollectionManagerImpl;
import command.commandReader.CommandReader;
import command.commandReader.CommandReaderImpl;
import model.Car;
import model.Coordinates;
import model.WeaponType;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        CommandReader reader = new CommandReaderImpl();

        CollectionManager manager = new CollectionManagerImpl();
    }
}
