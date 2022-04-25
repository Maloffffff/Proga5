package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class RemoveAtIndexCommand extends Command{
    private final CollectionManager collectionManagerImpl;

    public RemoveAtIndexCommand(String name, String description, CollectionManager collectionManagerImpl) {
        super("remove_at index","удалить элемент коллекции по его индексу");
        this.collectionManagerImpl = collectionManagerImpl;
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        int index = Integer.parseInt(args[0]);
        collectionManagerImpl.removeAtIndex(index);
    }

    @Override
    public boolean isHumanBeingRequired() {
        return true;
    }
}
