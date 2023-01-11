package com.say.domain;

import cn.hutool.core.date.DateUtil;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Fx {


    @Id
    private Long ID;

    private String SECURITY;
    private String AST_TYP;
    private String CCY_PAIR;
    private String TENOR_BC;
    private String CCY1_NET;
    private String CCY2_NET;
    private String COST;
    private String MTM;
    private String AVGCOST;
    private String CCY1_01;
    private String CCY2_01;
    private String D_TOTALPL;
    private String D_REALIZ;
    private String D_UNREALIZ;
    private String IS_SEC_MATURED_DELET_S;
    private String PRICING_METHOD;
    private String PX_SOURCE;
    private String BID_PX;
    private String MID_PX;
    private String ASK_PX;
    private String FX_YTD_RLZ;
    private String FX_YTD_TOTAL_PL;
    private String FX_TOTAL_UNDISCOUNT;
    private String YTD_URLZ;
    private String YTD_TOTAL_PL_14_CH_S;
    private String HI_YTD_TOTAL_PL;
    private String HI_YTD_MARKET_PL_S;
    private String HI_YTD_TRADE_PL_S;
    private String CCY1_NPV;
    private String CCY2_NPV;
    private String CCY1_DEL;
    private String CCY_2_DL;
    private String CCY2_DF;
    private String CCY1_DF;
    private String CCY_1_PL;
    private String CCY_2_PL;
    private String TRADER;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");

}
