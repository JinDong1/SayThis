package com.say.service.impl;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.say.domain.Column;

import java.util.ArrayList;
import java.util.List;


public class StudentListener extends AnalysisEventListener<Column> {


    private List<Column> studentList = new ArrayList<>();

    @Override
    public void invoke(Column student, AnalysisContext analysisContext) {
        studentList.add(student);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        // 对解析后的数据进行处理，比如将数据写入数据库
        for (Column student : studentList) {

            System.out.println(student);
            // do something with student
        }

    }


    public List<Column> getStudentList() {
        return studentList;
    }
}
