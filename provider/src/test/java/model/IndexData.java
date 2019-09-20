package model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName IndexData
 * @Description
 * @Author ZJC
 * @Date 2019/9/19 15:24
 */
@Data
public class IndexData {
    @ExcelProperty(value = "字符串标题", index = 0)
//    @ExcelProperty(index = 0)
    private String string;
//    @ExcelProperty(value = "日期标题", index = 1)
    @ExcelProperty(value = "日期标题", index = 1)
    private Date date;
    /**
     * 这里设置3 会导致第二列空的
     */
    @ExcelProperty(value = "数字标题", index = 3)
    private Double doubleData;
}
