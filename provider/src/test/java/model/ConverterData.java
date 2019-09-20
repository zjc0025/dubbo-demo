package model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import lombok.Data;
import util.CustomStringStringConverter;
import util.CustomStringStringConverterW;

/**
 * @ClassName ConverterData
 * @Description
 * @Author ZJC
 * @Date 2019/9/19 13:24
 */
@Data
public class ConverterData {

    /**
     * 我自定义 转换器，不管数据库传过来什么 。我给他加上“自定义：”
     */
    @ExcelProperty(converter = CustomStringStringConverterW.class, index = 0)
    private String string;
    /**
     * 这里用string 去接日期才能格式化。我想接收年月日格式
     */
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "日期",index = 1)
    private String date;
    /**
     * 我想接收百分比的数字
     */
    @NumberFormat("#.##%")
    @ExcelProperty(value = "百分比", index = 0)
    private String doubleData;
}
