package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class RemoveAllByWeaponType extends Command{
     private final CollectionManager collectionManagerImpl;

     public RemoveAllByWeaponType(CollectionManager collectionManager){
         super("remove_all_by_weapon_type"," удалить из коллекции все элементы," +
                 " значение поля weaponType которого эквивалентно заданному");
         this.collectionManagerImpl = collectionManager;
     }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
         collectionManagerImpl.removeAllByWeaponType(humanBeing.getWeaponType());
    }

    @Override
    public boolean isHumanBeingRequired() {
        return true;
    }
}
