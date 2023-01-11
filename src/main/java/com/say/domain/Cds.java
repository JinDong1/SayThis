package com.say.domain;

import cn.hutool.core.date.DateUtil;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Cds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "SECURITY", columnDefinition = "varchar(64) ")
    private String SECURITY;
    @Column(name = "ISSUER_S", columnDefinition = "varchar(64) ")
    private String ISSUER_S;
    @Column(name = "FULL_NET", columnDefinition = "varchar(64) ")
    private String FULL_NET;
    @Column(name = "DAILY_PL", columnDefinition = "varchar(64) ")
    private String DAILY_PL;

    @Column(name = "D_REALIZ", columnDefinition = "varchar(64) ")
    private String D_REALIZ;
    @Column(name = "D_UNREAL", columnDefinition = "varchar(64) ")
    private String D_UNREAL;
    @Column(name = "HI_YTD_REALIZED_S", columnDefinition = "varchar(64) ")
    private String HI_YTD_REALIZED_S;
    @Column(name = "HI_YTD_UNREALIZED_S", columnDefinition = "varchar(64) ")
    private String HI_YTD_UNREALIZED_S;

    @Column(name = "HI_YTD", columnDefinition = "varchar(64) ")
    private String HI_YTD;
    @Column(name = "DV01_S", columnDefinition = "varchar(64) ")
    private String DV01_S;
    @Column(name = "COST_SPREAD_S", columnDefinition = "varchar(64) ")
    private String COST_SPREAD_S;
    @Column(name = "MV_RT", columnDefinition = "varchar(64) ")
    private String MV_RT;
    @Column(name = "MV_T_1_S", columnDefinition = "varchar(64) ")
    private String MV_T_1_S;
    @Column(name = "SPRD_T", columnDefinition = "varchar(64) ")
    private String SPRD_T;
    @Column(name = "SPRD_T_1_S", columnDefinition = "varchar(64) ")
    private String SPRD_T_1_S;
    @Column(name = "SERIES_S", columnDefinition = "varchar(64) ")
    private String SERIES_S;
    @Column(name = "CDS_BUY_S", columnDefinition = "varchar(64) ")
    private String CDS_BUY_S;

    @Column(name = "CNTRPRTY_S", columnDefinition = "varchar(64) ")
    private String CNTRPRTY_S;

    @Column(name = "MATURITY_S", columnDefinition = "varchar(64) ")
    private String MATURITY_S;
    @Column(name = "CDS_QTD_S", columnDefinition = "varchar(64) ")
    private String CDS_QTD_S;

    @Column(name = "CDS_CASH_S", columnDefinition = "varchar(64) ")
    private String CDS_CASH_S;

    @Column(name = "RR_RATE", columnDefinition = "varchar(64) ")
    private String RR_RATE;

    @Column(name = "PV_CDS_PREM_LEG_S", columnDefinition = "varchar(64) ")
    private String PV_CDS_PREM_LEG_S;

    @Column(name = "PV_CDS_DFLT_LEG_S", columnDefinition = "varchar(64) ")
    private String PV_CDS_DFLT_LEG_S;


    @Column(name = "NET_ACC_INT_S", columnDefinition = "varchar(64) ")
    private String NET_ACC_INT_S;

    @Column(name = "DAYS_ACC_S", columnDefinition = "varchar(64) ")
    private String DAYS_ACC_S;
    @Column(name = "PAY_NEXT_PAYMENT_DAT_S", columnDefinition = "varchar(64) ")
    private String PAY_NEXT_PAYMENT_DAT_S;

    @Column(name = "SW_TRD_DT_S", columnDefinition = "varchar(64) ")
    private String SW_TRD_DT_S;

    @Column(name = "TRADER", columnDefinition = "varchar(64) ")
    private String TRADER;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");

}
