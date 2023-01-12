package com.say.service.impl;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.say.domain.*;
import com.say.mapper.*;
import com.say.utils.FunctionUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.beans.Transient;

@Component
@AllArgsConstructor
public class LedgerWarehousingService {

    @Autowired
    private StudentMapper studentMapper;

    private AmtMapper amtMapper;
    private CdsMapper cdsMapper;
    private FxMapper fxMapper;
    private IrsMapper irsMapper;
    private NdirsMapper ndirsMapper;
    private TradMapper tradMapper;
    private TrsMapper trsMapper;

    private final static ImportParams params = new ImportParams();
    {
        // 表头设置有几行0
        params.setHeadRows(1);
        // 标题行设置为0行，默认是0，可以不设置
        params.setTitleRows(0);
    }



    @Transient
    public void batchBaveStudent(MultipartFile file)  {

        ExcelImportResult<Student> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Student.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        int i = studentMapper.batchBave(result.getList());

        FunctionUtils.isTure(i == 0).throwMessage("Student.class台账源数据入库失败");


    }

    public void batchBaveAmt(MultipartFile file)  {

        ExcelImportResult<Amt> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Amt.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        if (result.getList().size()>0){
            FunctionUtils.isTure(amtMapper.insertBatch(result.getList())<0).throwMessage("Amt.class台账源数据入库失败");
        }

    }
    public void batchBaveCds(MultipartFile file)  {


        ExcelImportResult<Cds> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Cds.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        if (result.getList().size()>0){
            FunctionUtils.isTure(cdsMapper.insertBatch(result.getList())<0).throwMessage("Cds.class台账源数据入库失败");
        }


    }
    public void batchBaveFx(MultipartFile file)  {

        ExcelImportResult<Fx> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Fx.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        if (result.getList().size()>0){
            FunctionUtils.isTure(fxMapper.insertBatch(result.getList())<0).throwMessage("Fx.class台账源数据入库失败");
        }


    }
    public void batchBaveIrs(MultipartFile file)  {

        ExcelImportResult<Irs> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Irs.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        if (result.getList().size()>0){
            FunctionUtils.isTure(irsMapper.insertBatch(result.getList())<0).throwMessage("Irs.class台账源数据入库失败");
        }


    }
    public void batchBaveNdirs(MultipartFile file)  {
        ExcelImportResult<Ndirs> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Ndirs.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        if (result.getList().size()>0){
            FunctionUtils.isTure(ndirsMapper.insertBatch(result.getList())<0).throwMessage("Ndirs.class台账源数据入库失败");
        }

    }
    public void batchBaveTrad(MultipartFile file)  {

        ExcelImportResult<Trad> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Trad.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        if (result.getList().size()>0){
            FunctionUtils.isTure(tradMapper.insertBatch(result.getList())<0).throwMessage("Trad.class台账源数据入库失败");
        }

    }
    public void batchBaveTrs(MultipartFile file)  {

        ExcelImportResult<Trs> result;
        try {
            result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Trs.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        if (result.getList().size()>0){
            FunctionUtils.isTure(trsMapper.insertBatch(result.getList())<0).throwMessage("Trs.class台账源数据入库失败");
        }

    }







}
