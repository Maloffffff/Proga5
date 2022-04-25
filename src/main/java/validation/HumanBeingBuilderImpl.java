package validation;

import exception.InvalidFieldException;
import model.Car;
import model.Coordinates;
import model.Mood;
import model.WeaponType;

import java.io.BufferedInputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

/**
 * класс, осуществляющий создание экземляров класса HumanBeing
 */

public class HumanBeingBuilderImpl implements HumanBeingBuilder{
    private final HumanBeingValidator validator;
    private final BufferedInputStream reader;

    protected long id = -1; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private boolean realHero;
    private boolean hasToothpick;
    private int impactSpeed;
    private WeaponType weaponType; //Поле не может быть null
    private Mood mood; //Поле не может быть null
    private Car car; //Поле может быть null


    public HumanBeingBuilderImpl(HumanBeingValidator validator, BufferedInputStream reader) {
        this.validator = validator;
        this.reader = reader;
    }

    @Override
    public void setId(long id) {
        this.id = (long) (Math.random()*15679+15);

    }

    @Override
    public void setName(String name) throws InvalidFieldException {
        validator.validateName(name);
        this.name = name;
    }

    @Override
    public void setCoordinateX(long x) throws InvalidFieldException {
        validator.validateCoordinateX(x);
        this.setCoordinateX(x);

    }

    @Override
    public void setCoordinateY(long y) throws InvalidFieldException {
        validator.validateCoordinateY(y);
        this.setCoordinateY(y);
    }

    @Override
    public void setCreationDate(LocalDate creationDate) {
        creationDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
    }

    @Override
    public void setRealHero(boolean realHero) {
        this.realHero = realHero;
    }

    @Override
    public void setHasToothpick(boolean hasToothpick) {
        this.hasToothpick = hasToothpick;

    }

    @Override
    public void setImpactSpeed(int ImpactSpeed) {
        this.impactSpeed = impactSpeed;

    }

    @Override
    public void setWeaponType(WeaponType weaponType) throws InvalidFieldException {
        validator.validateWeaponType(weaponType);
        this.setWeaponType(weaponType);

    }

    @Override
    public void setMood(Mood mood) throws InvalidFieldException {
        validator.validateMood(mood);
        this.mood = mood;

    }

    @Override
    public void setCar(Car car) throws InvalidFieldException {
        validator.validateCar(car);
        this.car = car;
    }
}
