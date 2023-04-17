package com.say.framework.model;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.say.web.exception.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PledgeInvoiceITransferVO implements Cloneable{


    private Integer index;

    private String assetCode;

    /**
     * 应收账款转让编号
     */
    private String transferNumber;

    /**
     * 基础交易合同名称
     */
    private String contractName;

    /**
     * 基出交易合同编号
     */
    private String contractCode;

    /**
     * 项目公司
     */
    private String projectOrgName;

    /**
     * 债权人
     */
    private String supplierName;

    /**
     * 发票编号
     */
    private String invoiceNo;

    /**
     * 发要金额
     */
    private BigDecimal invoiceAmount;

    private BigDecimal invoiceTransAmount;

    private BigDecimal financeMoney;

    @DateTimeFormat("yyyy/MM/dd")
    private Date applyDueDate;

    public PledgeInvoiceITransferVO clone(){
        PledgeInvoiceITransferVO transferVO;
        try {
            transferVO = (PledgeInvoiceITransferVO)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new ServiceException("对象复制失败。");
        }
        return transferVO;
    }


}
