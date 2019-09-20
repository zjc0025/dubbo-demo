package model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName DemoData
 * @Description
 * @Author ZJC
 * @Date 2019/9/19 9:13
 */
@Data
public class DemoData {

    @ExcelProperty("ID")
    private Long id;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("年龄")
    private int age;

}
