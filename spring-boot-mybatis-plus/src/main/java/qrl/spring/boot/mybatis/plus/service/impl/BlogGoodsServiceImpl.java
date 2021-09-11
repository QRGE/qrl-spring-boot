package qrl.spring.boot.mybatis.plus.service.impl;

import qrl.spring.boot.mybatis.plus.entity.po.BlogGoods;
import qrl.spring.boot.mybatis.plus.mapper.BlogGoodsMapper;
import qrl.spring.boot.mybatis.plus.service.IBlogGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户_博客点赞表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Service
public class BlogGoodsServiceImpl extends ServiceImpl<BlogGoodsMapper, BlogGoods> implements IBlogGoodsService {

}
