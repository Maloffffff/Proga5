package command.commands;

import model.HumanBeing;

public class ExitCommand extends Command{

    public ExitCommand(){
        super("exit","завершить программу (без сохранения в файл)");
    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {

    }

    @Override
    public boolean isHumanBeingRequired() {
        return super.isHumanBeingRequired();
    }
}
