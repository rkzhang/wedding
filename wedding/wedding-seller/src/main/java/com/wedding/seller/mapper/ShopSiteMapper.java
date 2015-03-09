package com.wedding.seller.mapper;

import com.wedding.seller.dto.ShopSiteIndexDto;
import com.wedding.seller.pojo.ShopSite;
import com.wedding.seller.pojo.ShopSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopSiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int countByExample(ShopSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int deleteByExample(ShopSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int insert(ShopSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int insertSelective(ShopSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    List<ShopSite> selectByExample(ShopSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    ShopSite selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int updateByExampleSelective(@Param("record") ShopSite record, @Param("example") ShopSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int updateByExample(@Param("record") ShopSite record, @Param("example") ShopSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int updateByPrimaryKeySelective(ShopSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop_site
     *
     * @mbggenerated Wed Oct 15 15:35:58 CST 2014
     */
    int updateByPrimaryKey(ShopSite record);

    /**
     * 根据domain加载网站数据
     * @param domain
     * @return
     */
    ShopSiteIndexDto loadShopSite(@Param("domain") String domain);
}