package com.say.domain;

import cn.hutool.core.date.DateUtil;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Trad {

    @Id
    private Long ID;
    @Column(length = 64)
    private String SECURITY;
    @Column(length = 64)
    private String ISIN;
    @Column(length = 64)
    private String CURNCY_S;
    @Column(length = 64)
    private String SHORT_SALE;
    @Column(length = 64)
    private String LOG;
    @Column(length = 64)
    private String POSITION_USD;
    @Column(length = 64)
    private String CUMULATI;
    @Column(length = 64)
    private String WAC;
    @Column(length = 64)
    private String T_1_MTM_S;
    @Column(length = 64)
    private String MTM;
    @Column(length = 64)
    private String BVAL_MID;
    @Column(length = 64)
    private String EXCH_RT_S;
    @Column(length = 64)
    private String P_L;
    @Column(length = 64)
    private String UNREALIZ;
    @Column(length = 64)
    private String REALIZED;
    @Column(length = 64)
    private String DAYREAL_S;
    @Column(length = 64)
    private String YTD_UNR;
    @Column(length = 64)
    private String YTD_RLZ;
    @Column(length = 64)
    private String BK_CCY_Y;
    @Column(length = 64)
    private String H_I_YTD_TOTAL_P_L;
    @Column(length = 64)
    private String DATE_FIR_S;
    @Column(length = 64)
    private String INDUSTRY_S;
    @Column(length = 64)
    private String POS_STRA;
    @Column(length = 64)
    private String BB_COMPO_S;
    @Column(length = 64)
    private String FITCH_IS_S;
    @Column(length = 64)
    private String MDS_IS_S;

    @Column(length = 64)
    private String S_P_IS_S;
    @Column(length = 64)
    private String FITCH_S;
    @Column(length = 64)
    private String MOODY_S_S;
    @Column(length = 64)
    private String S_P_S;
    @Column(length = 64)
    private String NET_MARK_S;
    @Column(length = 64)
    private String STRAT_DE;
    @Column(length = 64)
    private String YTD_SECU_S;
    @Column(length = 64)
    private String SECURITY_S;
    @Column(length = 64)
    private String MID_MAC_S;
    @Column(length = 64)
    private String DV01;
    @Column(length = 64)
    private String H_I_RLZ_S;
    @Column(length = 64)
    private String H_I_UNR_S;
    @Column(length = 64)
    private String PRICING;
    @Column(length = 64)
    private String RISK;
    @Column(length = 64)
    private String YRS_MAT_S;
    @Column(length = 64)
    private String MATURITY_S;
    @Column(length = 64)
    private String IS_CALL_S;
    private String IS_PUT_S;
    @Column(length = 64)
    private String PREV_CPN_S;
    @Column(length = 64)

    private String NXT_CPN_S;
    @Column(length = 64)
    private String CNTRY_OF_S;
    @Column(length = 64)
    private String CPN_S;
    @Column(length = 64)
    private String ISSUER_S;
    @Column(length = 64)
    private String DIRTY_BI_S;
    @Column(length = 64)
    private String AMT_OUT_S;
    @Column(length = 64)
    private String IG_HY_S;
    @Column(length = 64)
    private String MTM_X_TR_S_USD;
    @Column(length = 64)
    private String ACC_INT_S;
    @Column(length = 64)
    private String YTC_S;
    @Column(length = 64)
    private String MID_MACA_S;
    @Column(length = 64)
    private String YLD_FLAG;
    @Column(length = 64)
    private String PRINCIPAL_FACTOR_S;
    @Column(length = 64)
    private String TRADER;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");


}
