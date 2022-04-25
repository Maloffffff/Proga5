package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class InfoCommand extends Command{
    private final CollectionManager collectionManagerImpl;

    public InfoCommand(CollectionManager collectionManager){
        super("info", "вывести в стандартный поток вывода информацию о коллекции " +
                "(тип, дата инициализации, количество элементов и т.д.)");
        this.collectionManagerImpl = collectionManager;
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        collectionManagerImpl.info();
    }

    @Override
    public boolean isHumanBeingRequired() {
        return super.isHumanBeingRequired();
    }
}
