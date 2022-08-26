package com.say.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.say.domain.ScheduledLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author admin
 * @description 针对表【scheduled_log】的数据库操作Mapper
 * @createDate 2022-08-03 16:43:00
 * @Entity com.say.domain.ScheduledLog
 */
@Mapper
public interface ScheduledLogMapper extends BaseMapper<ScheduledLog> {

}




