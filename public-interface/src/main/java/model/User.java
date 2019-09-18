package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 10:01
 */
@Data
@AllArgsConstructor
public class User implements Serializable{

    private String name;

    private int age;

    private String sex;

}
