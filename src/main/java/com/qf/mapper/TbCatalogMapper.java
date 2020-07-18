package com.qf.mapper;

import com.qf.pojo.TbCatalog;
import com.qf.pojo.TbCatalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCatalogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    long countByExample(TbCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByExample(TbCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByPrimaryKey(Integer catalogid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insert(TbCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insertSelective(TbCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    List<TbCatalog> selectByExample(TbCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    TbCatalog selectByPrimaryKey(Integer catalogid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbCatalog record, @Param("example") TbCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExample(@Param("record") TbCatalog record, @Param("example") TbCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKeySelective(TbCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_catalog
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKey(TbCatalog record);
}