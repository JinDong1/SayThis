package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Cds;
import generator.service.CdsService;
import generator.mapper.CdsMapper;
import org.springframework.stereotype.Service;

/**
* @author ojd
* @description 针对表【cds】的数据库操作Service实现
* @createDate 2023-01-11 17:30:05
*/
@Service
public class CdsServiceImpl extends ServiceImpl<CdsMapper, Cds>
    implements CdsService{

}




