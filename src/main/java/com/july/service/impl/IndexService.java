package com.july.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.july.db.dao.BlogContentMapper;
import com.july.po.BlogContent;
import com.july.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GXR on 2018/11/26.
 */
@Service
public class IndexService implements IIndexService {
    @Autowired
    private BlogContentMapper blogContentMapper;

    @Override
    public PageInfo queryBlogContentPage(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<BlogContent> blogContents = blogContentMapper.queryBlogContents();
        PageInfo<BlogContent> pageInfo  = new PageInfo<>(blogContents);
        return pageInfo;
    }
}
