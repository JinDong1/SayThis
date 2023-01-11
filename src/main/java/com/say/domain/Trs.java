package com.say.domain;

import cn.hutool.core.date.DateUtil;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Trs {

    @Id
    private Long ID;

    @Column(length = 64)
    private String SECURITY;
    @Column(length = 64)
    private String FULL_NET;
    @Column(length = 64)
    private String BB_ID_S_;
    @Column(length = 64)
    private String SEC_TYPE_S_;
    @Column(length = 64)
    private String POS_STRAT_TAG_1;
    @Column(length = 64)
    private String DV01;
    @Column(length = 64)
    private String MID_MOD_DUR_S_;
    @Column(length = 64)
    private String MTM_X_TRADE_DATE_NET_S;
    @Column(length = 64)
    private String MARK_TO_MKT_PX;
    private String SECURITY_INCOME_S;
    private String H_I_YTD_TRADE_P_L_S;
    private String H_I_YTD_MARKET_P_L_S;
    private String H_I_YTD_TOTAL_P_L;
    private String REALIZ;
    @Column(length = 64)
    private String UNREALIZ;
    private String TOTAL;
    @Column(length = 64)
    private String ISIN;
    @Column(length = 64)
    private String CURNCY_S_;
    @Column(length = 64)
    private String CUMULATIVE_AVERAGE_C;
    @Column(length = 64)
    private String YEST_MTM_PX_S_;
    @Column(length = 64)
    private String BID_PX;
    @Column(length = 64)
    private String EXCH_RT_S_;
    @Column(length = 64)
    private String DATE_FIRST_ACQUIRED_S;
    @Column(length = 64)
    private String YTD_SECURITY_INCOME_S;
    @Column(length = 64)
    private String PRICING_METHOD;
    @Column(length = 64)
    private String CNTRPRTY_S;
    private String PAY_FLOATING_RATE_IN_S;
    @Column(length = 64)
    private String PAY_SPREAD_S;
    @Column(length = 64)
    private String PAY_ACC_INT_S;
    @Column(length = 64)
    private String ACC_INT_PD_S;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");

}
