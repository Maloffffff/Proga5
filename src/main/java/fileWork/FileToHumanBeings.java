package fileWork;

import exception.BrokenDataException;
import exception.FileIsNotAvailableException;
import model.HumanBeing;

import java.util.List;
import java.util.Vector;

/**
 * @author tsypk on 25.04.2022 19:34
 * @project Proga5
 */

public interface FileToHumanBeings {
    Vector<HumanBeing> readFromXml(String filename) throws FileIsNotAvailableException, BrokenDataException;
}
