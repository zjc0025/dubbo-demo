package com.xxx.mapper;

import com.xxx.model.TestTable;

public interface TestTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_table
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_table
     *
     * @mbg.generated
     */
    int insert(TestTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_table
     *
     * @mbg.generated
     */
    int insertSelective(TestTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_table
     *
     * @mbg.generated
     */
    TestTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_table
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TestTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_table
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TestTable record);
}