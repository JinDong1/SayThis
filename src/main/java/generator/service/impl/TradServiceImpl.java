package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Trad;
import generator.service.TradService;
import generator.mapper.TradMapper;
import org.springframework.stereotype.Service;

/**
* @author ojd
* @description 针对表【trad】的数据库操作Service实现
* @createDate 2023-01-11 17:30:05
*/
@Service
public class TradServiceImpl extends ServiceImpl<TradMapper, Trad>
    implements TradService{

}




