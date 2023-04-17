package com.say.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SheetModel {

  private String index;  //序号
  private String transferNumber;   //应收账款转让编号
  private String contractName;  //基础交易合同名称
  private String contractCode; //基出交易合同编号
  private String projectOrgName; //项目公司
  private String supplierName;   //债权人
  private String invoiceNo;   //发票编号
  private BigDecimal invoiceAmount; //发要金额






}
