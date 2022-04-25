package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class RemoveLastCommand extends Command{
    private final CollectionManager collectionManagerImpl;

    public RemoveLastCommand(CollectionManager collectionManager){
        super("remove_last", "удалить последний элемент из коллекции");
        this.collectionManagerImpl = collectionManager;

    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        collectionManagerImpl.removeLast(humanBeing);

    }

    @Override
    public boolean isHumanBeingRequired() {
        return true;
    }
}
