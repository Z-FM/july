package com.july.service;

import com.github.pagehelper.PageInfo;

/**
 * Created by GXR on 2018/11/26.
 */
public interface IIndexService {

    public PageInfo queryBlogContentPage(int pageNumber, int pageSize);

}
