package com.qf.pojo;

public class TbCatalog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.catalogid
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    private Integer catalogid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.catalog_name
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    private String catalogName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.father_id
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    private Integer fatherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.catalogid
     *
     * @return the value of tb_catalog.catalogid
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    public Integer getCatalogid() {
        return catalogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.catalogid
     *
     * @param catalogid the value for tb_catalog.catalogid
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    public void setCatalogid(Integer catalogid) {
        this.catalogid = catalogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.catalog_name
     *
     * @return the value of tb_catalog.catalog_name
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.catalog_name
     *
     * @param catalogName the value for tb_catalog.catalog_name
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.father_id
     *
     * @return the value of tb_catalog.father_id
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.father_id
     *
     * @param fatherId the value for tb_catalog.father_id
     *
     * @mbg.generated Sat Jul 18 16:00:17 CST 2020
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }
}