package com.say.domain;


import cn.hutool.core.date.DateUtil;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Irs {


    @Id
    private Long ID;

    @Column(length = 64)
    private String CNTRPRTY_S;
    @Column(length = 64)
    private String FULL_NET;
    @Column(length = 64)
    private String MKT_VAL;
    @Column(length = 64)
    private String DV01_S;
    @Column(length = 64)
    private String RECEIVE_S;
    @Column(length = 64)
    private String PAY_NOTI_S;
    @Column(length = 64)
    private String PAY_RECE_S;
    @Column(length = 64)
    private String RCV_NOT_AMT_S;
    @Column(length = 64)
    private String PAY_NOT_S;
    @Column(length = 64)
    private String PAY_CCY_S;
    @Column(length = 64)
    private String RCV_CCY_S;
    @Column(length = 64)
    private String RCV_CP_S;
    @Column(length = 64)
    private String RCV_AI_S;
    @Column(length = 64)
    private String RCV_INX_S;
    @Column(length = 64)
    private String PAY_INX_S;
    @Column(length = 64)
    private String PAY_ACC_S;
    @Column(length = 64)
    private String PAY_SPRE_S;
    @Column(length = 64)
    private String RATE_AT_S;
    @Column(length = 64)
    private String NET_ACC_S;
    @Column(length = 64)
    private String ONE_D_ACC_M_S;
    @Column(length = 64)
    private String MID_MOD_S;
    @Column(length = 64)
    private String D_PNL;
    @Column(length = 64)
    private String DAY_REALIZ;
    @Column(length = 64)
    private String H_I_YTD_UNREAL_P_L_S;
    @Column(length = 64)
    private String H_I_YTD_REALI_P_L_S;
    @Column(length = 64)
    private String H_I_YTD_TOTAL_P_L;
    @Column(length = 64)
    private String YEST_EOD_SW_MV_S;
    @Column(length = 64)
    private String COUPON_O_S;
    @Column(length = 64)
    private String PAY_CPN_S;
    @Column(length = 64)
    private String SWAP_TYP_S;
    @Column(length = 64)
    private String PAY_NEXT_S;
    @Column(length = 64)
    private String PAY_FREQ_S;
    @Column(length = 64)
    private String EFF_DT_S;
    @Column(length = 64)
    private String MATURITY_S;

    @Column(length = 64)
    private String ORIGINAL_S;
    @Column(length = 64)
    private String BBID_S;
    @Column(length = 64)
    private String SWAP_PAR_COUPON_S;
    @Column(length = 64)
    private String TRADER;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");

}
