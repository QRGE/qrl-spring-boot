package qrl.spring.boot.mybatis.plus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import qrl.spring.boot.mybatis.plus.controller.BaseController;
import qrl.spring.boot.mybatis.plus.entity.bean.Result;
import qrl.spring.boot.mybatis.plus.service.IBlogService;

/**
 * <p>
 * 用户_博客收藏表 前端控制器
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@RestController
@RequestMapping("/blog-collection")
public class BlogCollectionController extends BaseController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("/remove/{id}")
    public Result<?> deleteBlogById(@PathVariable Integer id) {
        boolean result = blogService.removeById(id);
        return null;
    }
}
