package qrl.spring.boot.mybatis.plus.service.impl;

import qrl.spring.boot.mybatis.plus.entity.po.BlogCollection;
import qrl.spring.boot.mybatis.plus.mapper.BlogCollectionMapper;
import qrl.spring.boot.mybatis.plus.service.IBlogCollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户_博客收藏表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Service
public class BlogCollectionServiceImpl extends ServiceImpl<BlogCollectionMapper, BlogCollection> implements IBlogCollectionService {

}
