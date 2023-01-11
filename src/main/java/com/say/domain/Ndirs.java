package com.say.domain;

import cn.hutool.core.date.DateUtil;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Ndirs {

    @Id
    private Long id;

    private String SECURITY;
    private String CNTRPRTY_S;
    private String FULL_NET;
    private String MKT_VAL_CNY;
    private String YEST_EOD_SW_MV_S_CNY;
    private String D_PNL_CNY;
    private String UNREALIZ_CNY;
    private String H_I_YTD_TRADE_P_L_S_CNY;
    private String H_I_YTD_MARKET_P_L_S_CNY;
    private String YTD_PNL_CNY;
    private String DV01_S_CNY;
    private String PAY_CPN_S;
    private String PAY_RECE_S;
    private String PAY_NOTI_S;
    private String PAY_NOT_S;
    private String RECEIVE_S;
    private String RCV_NOT_S;
    private String PAY_CCY_S;
    private String RCV_CCY_S;
    private String RCV_CP_S;
    private String RCV_INX_S;
    private String MID_MOD_S;
    private String SWAP_TYP_S;
    private String PAY_NEXT_S;
    private String PAY_FREQ_S;
    private String EFF_DT_S;
    private String MATURITY_S;
    private String ORIGINAL_S;
    private String BBID_S;
    private String REALIZ_CNY;
    private String YTD_TRADE_PROFIT_AND_S;
    private String YTD_MARKET_PROFIT_AN_S;
    private String YTD_TOT_P_L;
    private String SWAP_PAR_COUPON_S;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");


}
