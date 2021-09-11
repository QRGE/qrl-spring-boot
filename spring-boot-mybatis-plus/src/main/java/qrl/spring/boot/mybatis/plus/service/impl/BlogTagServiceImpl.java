package qrl.spring.boot.mybatis.plus.service.impl;

import qrl.spring.boot.mybatis.plus.entity.po.BlogTag;
import qrl.spring.boot.mybatis.plus.mapper.BlogTagMapper;
import qrl.spring.boot.mybatis.plus.service.IBlogTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帖子-标签表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Service
public class BlogTagServiceImpl extends ServiceImpl<BlogTagMapper, BlogTag> implements IBlogTagService {

}
