package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Amt;
import generator.service.AmtService;
import generator.mapper.AmtMapper;
import org.springframework.stereotype.Service;

/**
* @author ojd
* @description 针对表【amt】的数据库操作Service实现
* @createDate 2023-01-11 17:30:05
*/
@Service
public class AmtServiceImpl extends ServiceImpl<AmtMapper, Amt>
    implements AmtService{

}




