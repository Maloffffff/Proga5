package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class UpdateIDCommand extends Command{
    private final CollectionManager collectionManagerImpl;

    public UpdateIDCommand(CollectionManager collectionManager) {
        super("update id", "обновить значение элемента коллекции, id которого равен заданному");
        this.collectionManagerImpl = collectionManager;
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        long id = Long.parseLong(args[0]);
        collectionManagerImpl.update(id,humanBeing);
    }

    @Override
    public boolean isHumanBeingRequired() {
        return super.isHumanBeingRequired();
    }
}
