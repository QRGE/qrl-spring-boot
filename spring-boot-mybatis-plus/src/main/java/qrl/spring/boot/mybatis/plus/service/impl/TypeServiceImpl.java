package qrl.spring.boot.mybatis.plus.service.impl;

import qrl.spring.boot.mybatis.plus.entity.po.Type;
import qrl.spring.boot.mybatis.plus.mapper.TypeMapper;
import qrl.spring.boot.mybatis.plus.service.ITypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帖子类型表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
