package util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName TestFileUtil
 * @Description
 * @Author ZJC
 * @Date 2019/9/19 9:09
 */
public class TestFileUtil {
    public static InputStream getResourcesFileInputStream(String fileName) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("" + fileName);
    }

    public static String getPath() {
//        return TestFileUtil.class.getResource("/").getPath();
        File file = new File("");
        try {
            return file.getCanonicalPath()+File.separator+"src"+File.separator+"test"+File.separator+"excel"+File.separator;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static File createNewFile(String pathName) {
        File file = new File(getPath() + pathName);
        if (file.exists()) {
            file.delete();
        } else {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
        }
        return file;
    }

    public static File readFile(String pathName) throws IOException {
        return new File(getPath() + pathName);
    }
}
