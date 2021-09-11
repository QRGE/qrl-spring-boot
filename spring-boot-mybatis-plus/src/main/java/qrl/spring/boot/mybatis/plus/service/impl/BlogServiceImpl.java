package qrl.spring.boot.mybatis.plus.service.impl;

import qrl.spring.boot.mybatis.plus.entity.po.Blog;
import qrl.spring.boot.mybatis.plus.mapper.BlogMapper;
import qrl.spring.boot.mybatis.plus.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
