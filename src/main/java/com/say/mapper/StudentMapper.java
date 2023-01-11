package com.say.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.say.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author HP
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-01-05 14:36:00
* @Entity SayThis.domain.Student
*/
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

   int batchBave(List<Student> students);

}



