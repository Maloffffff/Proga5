package fileWork;

import exception.FileIsNotAvailableException;
import model.HumanBeing;

import java.util.Vector;

/**
 * @author tsypk on 25.04.2022 19:34
 * @project Proga5
 */
public interface HumanBeingsToFile {
    void writeToFile(Vector<HumanBeing> entities, String filename) throws FileIsNotAvailableException;
}
