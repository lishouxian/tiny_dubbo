package com.xian.myrpc1.service.Impl;

import com.xian.myrpc1.service.entity.Blog;
import com.xian.myrpc1.service.BlogService;

/**
 * @Auther: lishouxian
 * @Date: 2020/11/25 22:05
 * @Description: BlogServiceImpl
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog getBlogById(Integer id) {
        Blog blog = Blog.builder().id(id).title("我的博客").useId(22).build();
        System.out.println("客户端查询了"+id+"博客");
        return blog;
    }
}
