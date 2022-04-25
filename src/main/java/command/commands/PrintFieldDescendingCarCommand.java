package command.commands;

import model.Car;
import model.HumanBeing;

import java.util.Collections;
import java.util.Vector;

public class PrintFieldDescendingCarCommand extends Command{
    private Vector<HumanBeing> humanBeings;
    private Vector<Car> cars;

    public PrintFieldDescendingCarCommand(){
        super("print_field_descending_car", ": print field descending car of all humanBeings");

    }

    @Override
    public void execute(HumanBeing humanBeing, String[] args) {
        Vector cars = new Vector();
        for (HumanBeing hb: humanBeings){
            cars.addElement(hb.getCar());
        }
        Collections.sort(cars,Collections.reverseOrder());
        System.out.println(cars);
    }

    @Override
    public boolean isHumanBeingRequired() {
        return super.isHumanBeingRequired();
    }
}
