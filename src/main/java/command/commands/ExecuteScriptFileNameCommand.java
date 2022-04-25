package command.commands;

import collectionManager.CollectionManager;
import model.HumanBeing;

public class ExecuteScriptFileNameCommand extends Command{

    public ExecuteScriptFileNameCommand(){
        super("execute_script file_name",
                "считать и исполнить скрипт из указанного файла. " +
                        "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {

    }

    @Override
    public boolean isHumanBeingRequired() {
        return super.isHumanBeingRequired();
    }
}
