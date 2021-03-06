package com.qf.mapper;

import com.qf.pojo.TbAddress;
import com.qf.pojo.TbAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    long countByExample(TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int deleteByExample(TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int deleteByPrimaryKey(Integer addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int insert(TbAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int insertSelective(TbAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    List<TbAddress> selectByExample(TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    TbAddress selectByPrimaryKey(Integer addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbAddress record, @Param("example") TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int updateByExample(@Param("record") TbAddress record, @Param("example") TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int updateByPrimaryKeySelective(TbAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    int updateByPrimaryKey(TbAddress record);
}