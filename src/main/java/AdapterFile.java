import com.codegym.FileUtil;

import java.io.File;


public class AdapterFile implements FileCalculator {
    @Override
    public long calculatorSize(String path) {
        FileUtil fileUtil= new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
