package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@TableName(value ="AMT")
@Table(schema = "AMT")
@Entity
@Data
public class Amt {

    @Id
    private Long ID;

    private String SECURITY;
    private String ISIN;
    private String POSITION_USD;
    private String POS;
    private String DATE_FIR_S;
    private String CURNCY_S;
    private String METHOD;
    private String BGN_BID_S;
    private String COST;
    private String COST_YLD_S;
    private String BOOK_PRI_S;
    private String BID_PX;
    private String MTM_PC;
    private String MTM;
    private String BVAL_MID;
    private String CUM_PRIN_S;
    private String PX_ACC_P_S;
    private String PRICE_AC_S;
    private String DAY_CPN_S;
    private String MTD_CPN_S;
    private String YTD_CPN_S;
    private String AMORTIZA;
    private String OPN_AVG_S;
    private String MATURITY_S;
    private String NXT_CALL_S;
    private String P_L;
    private String HI_MTD_S;
    private String UNREALIZ;
    private String MTD_TRAD_S;
    private String YTD_TRAD_S;
    private String YTDTOTAL;
    private String YTD_REAL;
    private String YTD_UNRL;
    private String OCI_PNL_USD;
    private String YLD_FLAG;
    private String BID_YTM_S;
    private String IND_GROU_S;
    private String BB_COMPO_S;
    private String FITCH_IS_S;
    private String MOODY_IS_S;
    private String S_P_IS_S;
    private String FITCH_S;
    private String MOODY_S_S;
    private String S_P_S;
    private String NET_MARK_S;
    private String MID_MAC_S;
    private String DV01;
    private String YRS_MAT_S;
    private String IS_CALL_S;
    private String IS_PUT_S;
    private String PREV_CPN_S;
    private String NXT_CPN_S;
    private String CNTRY_OF_S;
    private String CPN_RATE_S;
    private String ISSUER_S;
    private String AMT_OUT_S;
    private String DIRTY_BI_S;
    private String IG_HY_S;
    private String YEST_MTM_S;
    private String MTM_X_TR_S_USD;
    private String MID_MACA_S;
    private String DAYPNL;
    private String YDUNRL;
    private String YDREAL_S;
    private String HI_YTD_S;
    private String PRINCIPA_S;
    private String ACC_INT_PD_S;
    private String TRADER;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String CREATETIME = DateUtil.format(new Date(), "yyyyMMdd");

}
