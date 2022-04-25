package validation;

import exception.InvalidFieldException;
import model.Car;
import model.HumanBeing;
import model.Mood;
import model.WeaponType;

import java.time.LocalDate;


public interface HumanBeingBuilder {

    void setId(long id);
    void setIdRandom();
    void setName(String name) throws InvalidFieldException;
    void setCoordinateX(long x) throws InvalidFieldException;
    void setCoordinateY(long y) throws InvalidFieldException;
    void setCreationDate(LocalDate creationDate);
    void setImpactSpeed(int ImpactSpeed);
    void setWeaponType(WeaponType weaponType) throws InvalidFieldException;
    void setMood(Mood mood) throws InvalidFieldException;
    void setCar(Car car) throws InvalidFieldException;
    void setRealHero(boolean realHero);
    void setHasToothpick(boolean hasToothPick);

    HumanBeing getHumanBeing();
}
