package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class FilterByCarCommand extends Command{
    private final CollectionManager collectionManagerImpl;

    public FilterByCarCommand(CollectionManager collectionManager){
        super("filter_by_car", "вывести элементы, значение поля car которых равно заданному");
        this.collectionManagerImpl = collectionManager;
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        collectionManagerImpl.filterByCar(humanBeing,args);
    }

    @Override
    public boolean isHumanBeingRequired() {
        return true;
    }



}
