package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.say.utils.DateUtils;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @TableName fx
 */
@TableName(value ="fx")
@Entity
public class Fx implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint(20)")
    private Long id;


    @Excel(name = "Security")
    @Column(name = "SECURITY", columnDefinition = "varchar(64)")
    private String security;

    @Excel(name = "Ast Typ")
    @Column(name = "AST_TYP", columnDefinition = "varchar(64)")
    private String astTyp;

    @Excel(name = "Ccy Pair")
    @Column(name = "CCY_PAIR", columnDefinition = "varchar(64)")
    private String ccyPair;


    @Excel(name = "Tenor Bc")
    @Column(name = "TENOR_BC", columnDefinition = "varchar(64)")
    private String tenorBc;

    @Excel(name = "Ccy1 Net")
    @Column(name = "CCY1_NET", columnDefinition = "varchar(64)")
    private String ccy1Net;

    @Excel(name = "Ccy2 Net")
    @Column(name = "CCY2_NET", columnDefinition = "varchar(64)")
    private String ccy2Net;

    @Excel(name = "COST")
    @Column(name = "COST", columnDefinition = "varchar(64)")
    private String cost;

    @Excel(name = "MTM")
    @Column(name = "MTM", columnDefinition = "varchar(64)")
    private String mtm;

    @Excel(name = "AvgCost")
    @Column(name = "AVGCOST", columnDefinition = "varchar(64)")
    private String avgcost;

    @Excel(name = "Ccy1 .01")
    @Column(name = "CCY101", columnDefinition = "varchar(64)")
    private String ccy101;

    @Excel(name = "Ccy2 .01")
    @Column(name = "CCY201", columnDefinition = "varchar(64)")
    private String ccy201;


    @Excel(name = "D TotalP&L")
    @Column(name = "D_TOTALPL", columnDefinition = "varchar(64)")
    private String dTotalpl;

    @Excel(name = "D Realiz")
    @Column(name = "D_REALIZ", columnDefinition = "varchar(64)")
    private String dRealiz;

    @Excel(name = "D Unrealiz")
    @Column(name = "D_UNREALIZ", columnDefinition = "varchar(64)")
    private String dUnrealiz;

    @Excel(name = "Is Sec Matured/Delet(s)")
    @Column(name = "IS_SEC_MATURED_DELET_S", columnDefinition = "varchar(64)")
    private String isSecMaturedDeletS;

    @Excel(name = "Pricing Method")
    @Column(name = "PRICING_METHOD", columnDefinition = "varchar(64)")
    private String pricingMethod;

    @Excel(name = "Px Source")
    @Column(name = "PX_SOURCE", columnDefinition = "varchar(64)")
    private String pxSource;

    @Excel(name = "Bid Px")
    @Column(name = "BID_PX", columnDefinition = "varchar(64)")
    private String bidPx;

    @Excel(name = "Mid Px")
    @Column(name = "MID_PX", columnDefinition = "varchar(64)")
    private String midPx;

    @Excel(name = "Ask Px")
    @Column(name = "ASK_PX", columnDefinition = "varchar(64)")
    private String askPx;

    @Excel(name = "FX YTD RLZ")
    @Column(name = "FX_YTD_RLZ", columnDefinition = "varchar(64)")
    private String fxYtdRlz;

    @Excel(name = "FX YTD TOTAL PL")
    @Column(name = "FX_YTD_TOTAL_PL", columnDefinition = "varchar(64)")
    private String fxYtdTotalPl;

    @Excel(name = "FX TOTAL UNDISCOUNT")
    @Column(name = "FX_TOTAL_UNDISCOUNT", columnDefinition = "varchar(64)")
    private String fxTotalUndiscount;

    @Excel(name = "YTD Urlz")
    @Column(name = "YTD_URLZ", columnDefinition = "varchar(64)")
    private String ytdUrlz;

    @Excel(name = "YTD Total P&L (14 Ch(s)")
    @Column(name = "YTD_TOTAL_PL14_CH_S", columnDefinition = "varchar(64)")
    private String ytdTotalPl14ChS;

    @Excel(name = "H+I YTD Total P&L")
    @Column(name = "HI_YTD_TOTAL_PL", columnDefinition = "varchar(64)")
    private String hiYtdTotalPl;

    @Excel(name = "H+I YTD Market P&L(s)")
    @Column(name = "HI_YTD_MARKET_PL_S", columnDefinition = "varchar(64)")
    private String hiYtdMarketPlS;

    @Excel(name = "H+I YTD Trade P&L(s)")
    @Column(name = "HI_YTD_TRADE_PL_S", columnDefinition = "varchar(64)")
    private String hiYtdTradePlS;

    @Excel(name = "Ccy1 NPV")
    @Column(name = "CCY1_NPV", columnDefinition = "varchar(64)")
    private String ccy1Npv;

    @Excel(name = "Ccy2 NPV")
    @Column(name = "CCY2_NPV", columnDefinition = "varchar(64)")
    private String ccy2Npv;

    @Excel(name = "Ccy1 Del")
    @Column(name = "CCY1_DEL", columnDefinition = "varchar(64)")
    private String ccy1Del;

    @Excel(name = "Ccy 2 Dl")
    @Column(name = "CCY2_DL", columnDefinition = "varchar(64)")
    private String ccy2Dl;

    @Excel(name = "Ccy2 DF")
    @Column(name = "CCY2_DF", columnDefinition = "varchar(64)")
    private String ccy2Df;

    @Excel(name = "Ccy1 DF")
    @Column(name = "CCY1_DF", columnDefinition = "varchar(64)")
    private String ccy1Df;

    @Excel(name = "CCY 1 P&L")
    @Column(name = "CCY1_PL", columnDefinition = "varchar(64)")
    private String ccy1Pl;

    @Excel(name = "CCY 2 P&L")
    @Column(name = "CCY2_PL", columnDefinition = "varchar(64)")
    private String ccy2Pl;

    @Excel(name = "Trader")
    @Column(name = "TRADER", columnDefinition = "varchar(64)")
    private String trader;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
    private String createTime =  DateUtils.dateTime();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getAstTyp() {
        return astTyp;
    }

    public void setAstTyp(String astTyp) {
        this.astTyp = astTyp;
    }

    public String getCcyPair() {
        return ccyPair;
    }

    public void setCcyPair(String ccyPair) {
        this.ccyPair = ccyPair;
    }

    public String getTenorBc() {
        return tenorBc;
    }

    public void setTenorBc(String tenorBc) {
        this.tenorBc = tenorBc;
    }

    public String getCcy1Net() {
        return ccy1Net;
    }

    public void setCcy1Net(String ccy1Net) {
        this.ccy1Net = ccy1Net;
    }

    public String getCcy2Net() {
        return ccy2Net;
    }

    public void setCcy2Net(String ccy2Net) {
        this.ccy2Net = ccy2Net;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMtm() {
        return mtm;
    }

    public void setMtm(String mtm) {
        this.mtm = mtm;
    }

    public String getAvgcost() {
        return avgcost;
    }

    public void setAvgcost(String avgcost) {
        this.avgcost = avgcost;
    }

    public String getCcy101() {
        return ccy101;
    }

    public void setCcy101(String ccy101) {
        this.ccy101 = ccy101;
    }

    public String getCcy201() {
        return ccy201;
    }

    public void setCcy201(String ccy201) {
        this.ccy201 = ccy201;
    }

    public String getdTotalpl() {
        return dTotalpl;
    }

    public void setdTotalpl(String dTotalpl) {
        this.dTotalpl = dTotalpl;
    }

    public String getdRealiz() {
        return dRealiz;
    }

    public void setdRealiz(String dRealiz) {
        this.dRealiz = dRealiz;
    }

    public String getdUnrealiz() {
        return dUnrealiz;
    }

    public void setdUnrealiz(String dUnrealiz) {
        this.dUnrealiz = dUnrealiz;
    }

    public String getIsSecMaturedDeletS() {
        return isSecMaturedDeletS;
    }

    public void setIsSecMaturedDeletS(String isSecMaturedDeletS) {
        this.isSecMaturedDeletS = isSecMaturedDeletS;
    }

    public String getPricingMethod() {
        return pricingMethod;
    }

    public void setPricingMethod(String pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public String getPxSource() {
        return pxSource;
    }

    public void setPxSource(String pxSource) {
        this.pxSource = pxSource;
    }

    public String getBidPx() {
        return bidPx;
    }

    public void setBidPx(String bidPx) {
        this.bidPx = bidPx;
    }

    public String getMidPx() {
        return midPx;
    }

    public void setMidPx(String midPx) {
        this.midPx = midPx;
    }

    public String getAskPx() {
        return askPx;
    }

    public void setAskPx(String askPx) {
        this.askPx = askPx;
    }

    public String getFxYtdRlz() {
        return fxYtdRlz;
    }

    public void setFxYtdRlz(String fxYtdRlz) {
        this.fxYtdRlz = fxYtdRlz;
    }

    public String getFxYtdTotalPl() {
        return fxYtdTotalPl;
    }

    public void setFxYtdTotalPl(String fxYtdTotalPl) {
        this.fxYtdTotalPl = fxYtdTotalPl;
    }

    public String getFxTotalUndiscount() {
        return fxTotalUndiscount;
    }

    public void setFxTotalUndiscount(String fxTotalUndiscount) {
        this.fxTotalUndiscount = fxTotalUndiscount;
    }

    public String getYtdUrlz() {
        return ytdUrlz;
    }

    public void setYtdUrlz(String ytdUrlz) {
        this.ytdUrlz = ytdUrlz;
    }

    public String getYtdTotalPl14ChS() {
        return ytdTotalPl14ChS;
    }

    public void setYtdTotalPl14ChS(String ytdTotalPl14ChS) {
        this.ytdTotalPl14ChS = ytdTotalPl14ChS;
    }

    public String getHiYtdTotalPl() {
        return hiYtdTotalPl;
    }

    public void setHiYtdTotalPl(String hiYtdTotalPl) {
        this.hiYtdTotalPl = hiYtdTotalPl;
    }

    public String getHiYtdMarketPlS() {
        return hiYtdMarketPlS;
    }

    public void setHiYtdMarketPlS(String hiYtdMarketPlS) {
        this.hiYtdMarketPlS = hiYtdMarketPlS;
    }

    public String getHiYtdTradePlS() {
        return hiYtdTradePlS;
    }

    public void setHiYtdTradePlS(String hiYtdTradePlS) {
        this.hiYtdTradePlS = hiYtdTradePlS;
    }

    public String getCcy1Npv() {
        return ccy1Npv;
    }

    public void setCcy1Npv(String ccy1Npv) {
        this.ccy1Npv = ccy1Npv;
    }

    public String getCcy2Npv() {
        return ccy2Npv;
    }

    public void setCcy2Npv(String ccy2Npv) {
        this.ccy2Npv = ccy2Npv;
    }

    public String getCcy1Del() {
        return ccy1Del;
    }

    public void setCcy1Del(String ccy1Del) {
        this.ccy1Del = ccy1Del;
    }

    public String getCcy2Dl() {
        return ccy2Dl;
    }

    public void setCcy2Dl(String ccy2Dl) {
        this.ccy2Dl = ccy2Dl;
    }

    public String getCcy2Df() {
        return ccy2Df;
    }

    public void setCcy2Df(String ccy2Df) {
        this.ccy2Df = ccy2Df;
    }

    public String getCcy1Df() {
        return ccy1Df;
    }

    public void setCcy1Df(String ccy1Df) {
        this.ccy1Df = ccy1Df;
    }

    public String getCcy1Pl() {
        return ccy1Pl;
    }

    public void setCcy1Pl(String ccy1Pl) {
        this.ccy1Pl = ccy1Pl;
    }

    public String getCcy2Pl() {
        return ccy2Pl;
    }

    public void setCcy2Pl(String ccy2Pl) {
        this.ccy2Pl = ccy2Pl;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private static final long serialVersionUID = 1L;


}