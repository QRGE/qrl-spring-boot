package qrl.spring.boot.mybatis.plus.service.impl;

import qrl.spring.boot.mybatis.plus.entity.po.Tag;
import qrl.spring.boot.mybatis.plus.mapper.TagMapper;
import qrl.spring.boot.mybatis.plus.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
