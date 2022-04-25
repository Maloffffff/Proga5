package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class SaveCommand extends Command{
    private final CollectionManager collectionManagerImpl;

    public SaveCommand(CollectionManager collectionManager){
        super("save","сохранить коллекцию в файл");
        this.collectionManagerImpl = collectionManager;
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {

    }

    @Override
    public boolean isHumanBeingRequired() {
        return true;
    }
}
