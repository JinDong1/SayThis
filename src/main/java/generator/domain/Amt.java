package generator.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @TableName amt
 */
@TableName(value ="amt")
@Data
@Entity
public class Amt implements Serializable {

    @Id
    private Long id;

    @Excel(name = "Security")
    @Column(name = "SECURITY", columnDefinition = "varchar(64)")
    private String security;

    @Excel(name = "ISIN")
    @Column(name = "ISIN", columnDefinition = "varchar(25)")
    private String isin;

    @Excel(name = "Position(USD)")
    @Column(name = "POSITION_USD", columnDefinition = "varchar(64)")
    private String positionUsd;

    @Excel(name = "pos")
    @Column(name = "POS", columnDefinition = "varchar(64)")
    private String pos;

    @Excel(name = "Date Fir(s)")
    @Column(name = "DATE_FIR_S", columnDefinition = "varchar(64)")
    private String dateFirS;

    @Excel(name = "Curncy(s)")
    @Column(name = "CURNCY_S", columnDefinition = "varchar(64)")
    private String curncyS;

    @Excel(name = "Method")
    @Column(name = "METHOD", columnDefinition = "varchar(64)")
    private String method;

    @Excel(name = "BGN Bid(s)")
    @Column(name = "BGN_BID_S", columnDefinition = "varchar(64)")
    private String bgnBidS;

    @Excel(name = "COST")
    @Column(name = "COST", columnDefinition = "varchar(64)")
    private String cost;

    @Excel(name = "COST Yld(s)")
    @Column(name = "COST_YLD_S", columnDefinition = "varchar(64)")
    private String costYldS;

    @Excel(name = "Book Pri(s)")
    @Column(name = "BOOK_PRI_S", columnDefinition = "varchar(64)")
    private String bookPriS;

    @Excel(name = "Bid Px")
    @Column(name = "BID_PX", columnDefinition = "varchar(64)")
    private String bidPx;

    @Excel(name = "MTM PC")
    @Column(name = "MTM_PC", columnDefinition = "varchar(64)")
    private String mtmPc;

    @Excel(name = "MTM")
    @Column(name = "MTM", columnDefinition = "varchar(64)")
    private String mtm;

    @Excel(name = "BVAL MID")
    @Column(name = "BVAL_MID", columnDefinition = "varchar(64)")
    private String bvalMid;

    @Excel(name = "Cum Prin(s)")
    @Column(name = "CUM_PRIN_S", columnDefinition = "varchar(64)")
    private String cumPrinS;

    @Excel(name = "Px Acc P(s)")
    @Column(name = "PX_ACC_P_S", columnDefinition = "varchar(64)")
    private String pxAccPS;

    @Excel(name = "Price Ac(s)")
    @Column(name = "PRICE_AC_S", columnDefinition = "varchar(64)")
    private String priceAcS;

    @Excel(name = "Day CPN(s)")
    @Column(name = "DAY_CPN_S", columnDefinition = "varchar(64)")
    private String dayCpnS;

    @Excel(name = "Day CPN(s)")
    @Column(name = "MTD_CPN_S", columnDefinition = "varchar(64)")
    private String mtdCpnS;

    @Excel(name = "YTD CPN(s)")
    @Column(name = "YTD_CPN_S", columnDefinition = "varchar(64)")
    private String ytdCpnS;

    @Excel(name = "Amortiza")
    @Column(name = "AMORTIZA", columnDefinition = "varchar(64)")
    private String amortiza;

    @Excel(name = "Opn Avg(s)")
    @Column(name = "OPN_AVG_S", columnDefinition = "varchar(64)")
    private String opnAvgS;

    @Excel(name = "Maturity(s)")
    @Column(name = "MATURITY_S", columnDefinition = "varchar(64)")
    private String maturityS;

    @Excel(name = "Nxt Call(s)")
    @Column(name = "NXT_CALL_S", columnDefinition = "varchar(64)")
    private String nxtCallS;
    @Excel(name = "P & L")
    @Column(name = "P_L", columnDefinition = "varchar(64)")
    private String pL;
    @Excel(name = "H+I MTD(s)")
    @Column(name = "HI_MTD_S", columnDefinition = "varchar(64)")
    private String hiMtdS;

    @Excel(name = "Unrealiz")
    @Column(name = "UNREALIZ", columnDefinition = "varchar(64)")
    private String unrealiz;

    @Excel(name = "MTD Trad(s)")
    @Column(name = "MTD_TRAD_S", columnDefinition = "varchar(64)")
    private String mtdTradS;

    @Excel(name = "YTD Trad(s)")
    @Column(name = "YTD_TRAD_S", columnDefinition = "varchar(64)")
    private String ytdTradS;

    @Excel(name = "YTDTotal")
    @Column(name = "YTDTOTAL", columnDefinition = "varchar(64)")
    private String ytdtotal;

    @Excel(name = "YTD REAL")
    @Column(name = "YTD_REAL", columnDefinition = "varchar(64)")
    private String ytdReal;

    @Excel(name = "YTD UNRL")
    @Column(name = "YTD_UNRL", columnDefinition = "varchar(64)")
    private String ytdUnrl;

    @Excel(name = "OCI PNL(USD)")
    @Column(name = "OCI_PNL_USD", columnDefinition = "varchar(64)")
    private String ociPnlUsd;

    @Excel(name = "Yld Flag")
    @Column(name = "YLD_FLAG", columnDefinition = "varchar(64)")
    private String yldFlag;

    @Excel(name = "Bid YTM(s)")
    @Column(name = "BID_YTM_S", columnDefinition = "varchar(64)")
    private String bidYtmS;

    @Excel(name = "Ind Grou(s)")
    @Column(name = "IND_GROU_S", columnDefinition = "varchar(64)")
    private String indGrouS;

    @Excel(name = "BB Compo(s)")
    @Column(name = "BB_COMPO_S", columnDefinition = "varchar(64)")
    private String bbCompoS;

    @Excel(name = "Fitch IS(s)")
    @Column(name = "FITCH_IS_S", columnDefinition = "varchar(64)")
    private String fitchIsS;

    @Excel(name = "Moody IS(s)")
    @Column(name = "MOODY_IS_S", columnDefinition = "varchar(64)")
    private String moodyIsS;

    @Excel(name = "S&P IS(s)")
    @Column(name = "S_P_IS_S", columnDefinition = "varchar(64)")
    private String sPIsS;

    @Excel(name = "Fitch(s)")
    @Column(name = "FITCH_S", columnDefinition = "varchar(64)")
    private String fitchS;

    @Excel(name = "Moody's(s)")
    @Column(name = "MOODY_S_S", columnDefinition = "varchar(64)")
    private String moodySS;

    @Excel(name = "S&P(s)")
    @Column(name = "S_P_S", columnDefinition = "varchar(64)")
    private String sPS;

    @Excel(name = "Net Mark(s)")
    @Column(name = "NET_MARK_S", columnDefinition = "varchar(64)")
    private String netMarkS;

    @Excel(name = "Mid Mac(s)")
    @Column(name = "MID_MAC_S", columnDefinition = "varchar(64)")
    private String midMacS;

    @Excel(name = "DV01")
    @Column(name = "DV01", columnDefinition = "varchar(64)")
    private String dv01;

    @Excel(name = "Yrs Mat(s)")
    @Column(name = "YRS_MAT_S", columnDefinition = "varchar(64)")
    private String yrsMatS;

    @Excel(name = "Is Call(s)")
    @Column(name = "IS_CALL_S", columnDefinition = "varchar(64)")
    private String isCallS;

    @Excel(name = "Is Put(s)")
    @Column(name = "IS_PUT_S", columnDefinition = "varchar(64)")
    private String isPutS;

    @Excel(name = "Prev Cpn(s)")
    @Column(name = "PREV_CPN_S", columnDefinition = "varchar(64)")
    private String prevCpnS;

    @Excel(name = "Nxt Cpn(s)")
    @Column(name = "NXT_CPN_S", columnDefinition = "varchar(64)")
    private String nxtCpnS;

    @Excel(name = "Cntry of(s)")
    @Column(name = "CNTRY_OF_S", columnDefinition = "varchar(64)")
    private String cntryOfS;

    @Excel(name = "Cpn RATE(s)")
    @Column(name = "CPN_RATE_S", columnDefinition = "varchar(64)")
    private String cpnRateS;

    @Excel(name = "Issuer(s)")
    @Column(name = "ISSUER_S", columnDefinition = "varchar(64)")
    private String issuerS;

    @Excel(name = "Amt Out(s)")
    @Column(name = "AMT_OUT_S", columnDefinition = "varchar(64)")
    private String amtOutS;
    @Excel(name = "Dirty Bi(s)")
    @Column(name = "DIRTY_BI_S", columnDefinition = "varchar(64)")
    private String dirtyBiS;

    @Excel(name = "IG/HY(s)")
    @Column(name = "IG_HY_S", columnDefinition = "varchar(64)")
    private String igHyS;


    @Excel(name = "Yest MTM(s)")
    @Column(name = "YEST_MTM_S", columnDefinition = "varchar(64)")
    private String yestMtmS;

    @Excel(name = "MTM x Tr(s)(USD)")
    @Column(name = "MTM_X_TR_S_USD", columnDefinition = "varchar(64)")
    private String mtmXTrSUsd;

    @Excel(name = "Mid Maca(s)")
    @Column(name = "MID_MACA_S", columnDefinition = "varchar(64)")
    private String midMacaS;

    @Excel(name = "daypnl")
    @Column(name = "DAYPNL", columnDefinition = "varchar(64)")
    private String daypnl;

    @Excel(name = "YDUNRL")
    @Column(name = "YDUNRL", columnDefinition = "varchar(64)")
    private String ydunrl;

    @Excel(name = "YDREAL(s)")
    @Column(name = "YDREAL_S", columnDefinition = "varchar(64)")
    private String ydrealS;

    @Excel(name = "H+I YTD(s)")
    @Column(name = "HI_YTD_S", columnDefinition = "varchar(64)")
    private String hiYtdS;

    @Excel(name = "Principa(s)")
    @Column(name = "PRINCIPA_S", columnDefinition = "varchar(64)")
    private String principaS;

    @Excel(name = "Acc Int Pd(s)")
    @Column(name = "ACC_INT_PD_S", columnDefinition = "varchar(64)")
    private String accIntPdS;

    @Excel(name = "Trader")
    @Column(name = "TRADER", columnDefinition = "varchar(64)")
    private String trader;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String createTime = DateUtil.format(new Date(), "yyyyMMdd");

    private static final long serialVersionUID = 1L;
}