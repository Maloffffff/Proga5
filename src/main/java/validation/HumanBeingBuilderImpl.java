package validation;

import exception.InvalidFieldException;
import model.*;

import java.time.LocalDate;

/**
 * класс, осуществляющий создание экземляров класса HumanBeing
 */

public class HumanBeingBuilderImpl implements HumanBeingBuilder {
    private final HumanBeingValidator validator;

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


    public HumanBeingBuilderImpl(HumanBeingValidator validator) {
        this.validator = validator;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void setIdRandom() {
        this.id = (long) (Math.random() * 15679 + 15);
    }

    @Override
    public void setName(String name) throws InvalidFieldException {
        validator.validateName(name);
        this.name = name;
    }

    @Override
    public void setCoordinateX(long x) throws InvalidFieldException {
        if (coordinates == null)
            coordinates = new Coordinates();
        validator.validateCoordinateX(x);
        this.coordinates.setX(x);
    }

    @Override
    public void setCoordinateY(long y) throws InvalidFieldException {
        if (coordinates == null)
            coordinates = new Coordinates();
        validator.validateCoordinateY(y);
        this.coordinates.setY(y);
    }

    @Override
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = LocalDate.now();
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
    public void setImpactSpeed(int impactSpeed) {
        this.impactSpeed = impactSpeed;
    }

    @Override
    public void setWeaponType(WeaponType weaponType) throws InvalidFieldException {
        validator.validateWeaponType(weaponType);
        this.weaponType = weaponType;
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

    @Override
    public HumanBeing getHumanBeing() {
        return HumanBeing.builder()
                .id(id)
                .name(name)
                .coordinates(coordinates)
                .creationDate(creationDate)
                .realHero(realHero)
                .hasToothpick(hasToothpick)
                .impactSpeed(impactSpeed)
                .weaponType(weaponType)
                .mood(mood)
                .car(car).build();
    }
}
