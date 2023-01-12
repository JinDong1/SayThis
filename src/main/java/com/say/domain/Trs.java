package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.say.utils.DateUtils;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @TableName trs
 */
@TableName(value ="trs")
@Entity
public class Trs implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint(20)")
    private Long id;

    @Excel(name = "Security")
    @Column(name = "SECURITY", columnDefinition = "varchar(64) ")
    private String security;

    @Excel(name = "Full Net")
    @Column(name = "FULL_NET", columnDefinition = "varchar(64) ")
    private String fullNet;

    @Excel(name = "BB ID(s)")
    @Column(name = "BB_ID_S", columnDefinition = "varchar(64) ")
    private String bbIdS;

    @Excel(name = "Sec Type(s)")
    @Column(name = "SEC_TYPE_S", columnDefinition = "varchar(64) ")
    private String secTypeS;

    @Excel(name = "Pos Strat Tag 1")
    @Column(name = "POS_STRAT_TAG_1", columnDefinition = "varchar(64) ")
    private String posStratTag1;

    @Excel(name = "DV01")
    @Column(name = "DV01", columnDefinition = "varchar(64) ")
    private String dv01;
    @Excel(name = "Mid Mod Dur(s)")
    @Column(name = "MID_MOD_DUR_S", columnDefinition = "varchar(64) ")
    private String midModDurS;

    @Excel(name = "MTM x Trade Date Net(s)")
    @Column(name = "MTM_X_TRADE_DATE_NET_S", columnDefinition = "varchar(64) ")
    private String mtmXTradeDateNetS;

    @Excel(name = "Mark to Mkt Px")
    @Column(name = "MARK_TO_MKT_PX", columnDefinition = "varchar(64) ")
    private String markToMktPx;

    @Excel(name = "Security Income(s)")
    @Column(name = "SECURITY_INCOME_S", columnDefinition = "varchar(64) ")
    private String securityIncomeS;

    @Excel(name = "H+I YTD Trade P&L(s)")
    @Column(name = "H_I_YTD_TRADE_P_L_S", columnDefinition = "varchar(64) ")
    private String hIYtdTradePLS;

    @Excel(name = "H+I YTD Market P&L(s)")
    @Column(name = "H_I_YTD_MARKET_P_L_S", columnDefinition = "varchar(64) ")
    private String hIYtdMarketPLS;

    @Excel(name = "H+I YTD Total P&L")
    @Column(name = "H_I_YTD_TOTAL_P_L", columnDefinition = "varchar(64) ")
    private String hIYtdTotalPL;

    @Excel(name = "Realiz")
    @Column(name = "REALIZ", columnDefinition = "varchar(64) ")
    private String realiz;

    @Excel(name = "Unrealiz")
    @Column(name = "UNREALIZ", columnDefinition = "varchar(64) ")
    private String unrealiz;

    @Excel(name = "Total")
    @Column(name = "TOTAL", columnDefinition = "varchar(64) ")
    private String total;

    @Excel(name = "ISIN")
    @Column(name = "ISIN", columnDefinition = "varchar(64) ")
    private String isin;

    @Excel(name = "Curncy(s)")
    @Column(name = "CURNCY_S", columnDefinition = "varchar(64) ")
    private String curncyS;

    @Excel(name = "Cumulative Average C")
    @Column(name = "CUMULATIVE_AVERAGE_C", columnDefinition = "varchar(64) ")
    private String cumulativeAverageC;

    @Excel(name = "Yest MTM Px(s)")
    @Column(name = "YEST_MTM_PX_S", columnDefinition = "varchar(64) ")
    private String yestMtmPxS;

    @Excel(name = "Bid Px")
    @Column(name = "BID_PX", columnDefinition = "varchar(64) ")
    private String bidPx;

    @Excel(name = "Exch Rt(s)")
    @Column(name = "EXCH_RT_S_", columnDefinition = "varchar(64) ")
    private String exchRtS;

    @Excel(name = "Date First Acquired(s)")
    @Column(name = "DATE_FIRST_ACQUIRED_S", columnDefinition = "varchar(64) ")
    private String dateFirstAcquiredS;

    @Excel(name = "YTD Security Income(s)")
    @Column(name = "YTD_SECURITY_INCOME_S", columnDefinition = "varchar(64) ")
    private String ytdSecurityIncomeS;

    @Excel(name = "Pricing Method")
    @Column(name = "PRICING_METHOD", columnDefinition = "varchar(64) ")
    private String pricingMethod;

    @Excel(name = "Cntrprty(s)")
    @Column(name = "CNTRPRTY_S", columnDefinition = "varchar(64) ")
    private String cntrprtyS;

    @Excel(name = "Pay Floating Rate In(s)")
    @Column(name = "PAY_FLOATING_RATE_IN_S", columnDefinition = "varchar(64) ")
    private String payFloatingRateInS;

    @Excel(name = "Pay Spread(s)")
    @Column(name = "PAY_SPREAD_S", columnDefinition = "varchar(64) ")
    private String paySpreadS;

    @Excel(name = "Pay Acc Int(s)")
    @Column(name = "PAY_ACC_INT_S", columnDefinition = "varchar(64) ")
    private String payAccIntS;

    @Excel(name = "Acc Int Pd(s)")
    @Column(name = "ACC_INT_PD_S", columnDefinition = "varchar(64) ")
    private String accIntPdS;

    @Column(name = "CREATE_TIME", columnDefinition = "varchar(32) ")
    private String createTime = DateUtils.dateTime();

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

    public String getFullNet() {
        return fullNet;
    }

    public void setFullNet(String fullNet) {
        this.fullNet = fullNet;
    }

    public String getBbIdS() {
        return bbIdS;
    }

    public void setBbIdS(String bbIdS) {
        this.bbIdS = bbIdS;
    }

    public String getSecTypeS() {
        return secTypeS;
    }

    public void setSecTypeS(String secTypeS) {
        this.secTypeS = secTypeS;
    }

    public String getPosStratTag1() {
        return posStratTag1;
    }

    public void setPosStratTag1(String posStratTag1) {
        this.posStratTag1 = posStratTag1;
    }

    public String getDv01() {
        return dv01;
    }

    public void setDv01(String dv01) {
        this.dv01 = dv01;
    }

    public String getMidModDurS() {
        return midModDurS;
    }

    public void setMidModDurS(String midModDurS) {
        this.midModDurS = midModDurS;
    }

    public String getMtmXTradeDateNetS() {
        return mtmXTradeDateNetS;
    }

    public void setMtmXTradeDateNetS(String mtmXTradeDateNetS) {
        this.mtmXTradeDateNetS = mtmXTradeDateNetS;
    }

    public String getMarkToMktPx() {
        return markToMktPx;
    }

    public void setMarkToMktPx(String markToMktPx) {
        this.markToMktPx = markToMktPx;
    }

    public String getSecurityIncomeS() {
        return securityIncomeS;
    }

    public void setSecurityIncomeS(String securityIncomeS) {
        this.securityIncomeS = securityIncomeS;
    }

    public String gethIYtdTradePLS() {
        return hIYtdTradePLS;
    }

    public void sethIYtdTradePLS(String hIYtdTradePLS) {
        this.hIYtdTradePLS = hIYtdTradePLS;
    }

    public String gethIYtdMarketPLS() {
        return hIYtdMarketPLS;
    }

    public void sethIYtdMarketPLS(String hIYtdMarketPLS) {
        this.hIYtdMarketPLS = hIYtdMarketPLS;
    }

    public String gethIYtdTotalPL() {
        return hIYtdTotalPL;
    }

    public void sethIYtdTotalPL(String hIYtdTotalPL) {
        this.hIYtdTotalPL = hIYtdTotalPL;
    }

    public String getRealiz() {
        return realiz;
    }

    public void setRealiz(String realiz) {
        this.realiz = realiz;
    }

    public String getUnrealiz() {
        return unrealiz;
    }

    public void setUnrealiz(String unrealiz) {
        this.unrealiz = unrealiz;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCurncyS() {
        return curncyS;
    }

    public void setCurncyS(String curncyS) {
        this.curncyS = curncyS;
    }

    public String getCumulativeAverageC() {
        return cumulativeAverageC;
    }

    public void setCumulativeAverageC(String cumulativeAverageC) {
        this.cumulativeAverageC = cumulativeAverageC;
    }

    public String getYestMtmPxS() {
        return yestMtmPxS;
    }

    public void setYestMtmPxS(String yestMtmPxS) {
        this.yestMtmPxS = yestMtmPxS;
    }

    public String getBidPx() {
        return bidPx;
    }

    public void setBidPx(String bidPx) {
        this.bidPx = bidPx;
    }

    public String getExchRtS() {
        return exchRtS;
    }

    public void setExchRtS(String exchRtS) {
        this.exchRtS = exchRtS;
    }

    public String getDateFirstAcquiredS() {
        return dateFirstAcquiredS;
    }

    public void setDateFirstAcquiredS(String dateFirstAcquiredS) {
        this.dateFirstAcquiredS = dateFirstAcquiredS;
    }

    public String getYtdSecurityIncomeS() {
        return ytdSecurityIncomeS;
    }

    public void setYtdSecurityIncomeS(String ytdSecurityIncomeS) {
        this.ytdSecurityIncomeS = ytdSecurityIncomeS;
    }

    public String getPricingMethod() {
        return pricingMethod;
    }

    public void setPricingMethod(String pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public String getCntrprtyS() {
        return cntrprtyS;
    }

    public void setCntrprtyS(String cntrprtyS) {
        this.cntrprtyS = cntrprtyS;
    }

    public String getPayFloatingRateInS() {
        return payFloatingRateInS;
    }

    public void setPayFloatingRateInS(String payFloatingRateInS) {
        this.payFloatingRateInS = payFloatingRateInS;
    }

    public String getPaySpreadS() {
        return paySpreadS;
    }

    public void setPaySpreadS(String paySpreadS) {
        this.paySpreadS = paySpreadS;
    }

    public String getPayAccIntS() {
        return payAccIntS;
    }

    public void setPayAccIntS(String payAccIntS) {
        this.payAccIntS = payAccIntS;
    }

    public String getAccIntPdS() {
        return accIntPdS;
    }

    public void setAccIntPdS(String accIntPdS) {
        this.accIntPdS = accIntPdS;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private static final long serialVersionUID = 1L;
}