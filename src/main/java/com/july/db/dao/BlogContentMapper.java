package com.july.db.dao;

import com.july.po.BlogContent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BlogContentMapper {
    int deleteByPrimaryKey(Integer contentId);

    int insert(BlogContent record);

    int insertSelective(BlogContent record);

    BlogContent selectByPrimaryKey(Integer contentId);

    int updateByPrimaryKeySelective(BlogContent record);

    int updateByPrimaryKey(BlogContent record);

    List<BlogContent> queryBlogContents();

    List<BlogContent> queryBlogContentsByPage();
}