package model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName IndexOrNameData
 * @Description
 * @Author ZJC
 * @Date 2019/9/19 13:21
 */
@Data
public class IndexOrNameData {
    /**
     * 强制读取第三个 这里不建议 index 和 name 同时用，要么一个对象只用index，要么一个对象只用name去匹配
     */
    @ExcelProperty(index = 0)
    private Long id;
    /**
     * 用名字去匹配，这里需要注意，如果名字重复，会导致只有一个字段读取到数据
     */
    @ExcelProperty(index = 1)
    private String name;
    @ExcelProperty(index = 2)
    private int age;
}
