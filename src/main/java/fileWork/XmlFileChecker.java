package fileWork;

import java.io.File;

/**
 * @author tsypk on 25.04.2022 20:00
 * @project Proga5
 */
public class XmlFileChecker implements FileChecker {
    @Override
    public boolean checkFile(String filename) {
        File file = new File(filename);
        boolean isFileAndReadableAndWriteable = file.exists() && file.isFile() && file.canRead() && file.canWrite();
        boolean isXml = filename.endsWith(".xml");

        return isFileAndReadableAndWriteable && isXml;
    }
}
