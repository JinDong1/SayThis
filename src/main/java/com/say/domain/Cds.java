package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.say.utils.DateUtils;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @TableName cds
 */
@TableName(value ="cds")
@Entity
public class Cds implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint(20)")
    private Long id;
    @Excel(name = "Security")
    @Column(name = "SECURITY", columnDefinition = "varchar(64)")
    private String security;

    @Excel(name = "ISSUER(s)")
    @Column(name = "ISSUER_S", columnDefinition = "varchar(64)")
    private String issuerS;

    @Excel(name = "Full Net")
    @Column(name = "FULL_NET", columnDefinition = "varchar(64)")
    private String fullNet;

    @Excel(name = "DAILY PL")
    @Column(name = "DAILY_PL", columnDefinition = "varchar(64)")
    private String dailyPl;

    @Excel(name = "D Realiz")
    @Column(name = "D_REALIZ", columnDefinition = "varchar(64)")
    private String dRealiz;

    @Excel(name = "D Unreal")
    @Column(name = "D_UNREAL", columnDefinition = "varchar(64)")
    private String dUnreal;

    @Excel(name = "H+I YTD Realized(s)")
    @Column(name = "HI_YTD_REALIZED_S", columnDefinition = "varchar(64)")
    private String hiYtdRealizedS;

    @Excel(name = "H+I YTD Unrealized(s)")
    @Column(name = "HI_YTD_UNREALIZED_S", columnDefinition = "varchar(64)")
    private String hiYtdUnrealizedS;

    @Excel(name = "H+I YTD")
    @Column(name = "HI_YTD", columnDefinition = "varchar(64)")
    private String hiYtd;

    @Excel(name = "DV01(s)")
    @Column(name = "DV01_S", columnDefinition = "varchar(64)")
    private String dv01S;

    @Excel(name = "Cost spread(s)")
    @Column(name = "COST_SPREAD_S", columnDefinition = "varchar(64)")
    private String costSpreadS;


    @Excel(name = "MV RT")
    @Column(name = "MV_RT", columnDefinition = "varchar(64)")
    private String mvRt;

    @Excel(name = "MV T-1(s)")
    @Column(name = "MV_T1_S", columnDefinition = "varchar(64)")
    private String mvT1S;

    @Excel(name = "Sprd T")
    @Column(name = "SPRD_T", columnDefinition = "varchar(64)")
    private String sprdT;

    @Excel(name = "Sprd T-1(s)")
    @Column(name = "SPRD_T1_S", columnDefinition = "varchar(64)")
    private String sprdT1S;

    @Excel(name = "Series(s)")
    @Column(name = "SERIES_S", columnDefinition = "varchar(64)")
    private String seriesS;

    @Excel(name = "CDS Buy/(s)")
    @Column(name = "CDS_BUY_S", columnDefinition = "varchar(64)")
    private String cdsBuyS;

    @Excel(name = "Cntrprty(s)")
    @Column(name = "CNTRPRTY_S", columnDefinition = "varchar(64)")
    private String cntrprtyS;

    @Excel(name = "Maturity(s)")
    @Column(name = "MATURITY_S", columnDefinition = "varchar(64)")
    private String maturityS;

    @Excel(name = "CDS Qtd(s)")
    @Column(name = "CDS_QTD_S", columnDefinition = "varchar(64)")
    private String cdsQtdS;

    @Excel(name = "CDS Cash(s)")
    @Column(name = "CDS_CASH_S", columnDefinition = "varchar(64)")
    private String cdsCashS;

    @Excel(name = "RR rate")
    @Column(name = "RR_RATE", columnDefinition = "varchar(64)")
    private String rrRate;

    @Excel(name = "PV CDS Prem Leg(s)")
    @Column(name = "PV_CDS_PREM_LEG_S", columnDefinition = "varchar(64)")
    private String pvCdsPremLegS;

    @Excel(name = "PV CDS Dflt Leg(s)")
    @Column(name = "PV_CDS_DFLT_LEG_S", columnDefinition = "varchar(64)")
    private String pvCdsDfltLegS;

    @Excel(name = "Net Acc Int(s)")
    @Column(name = "NET_ACC_INT_S", columnDefinition = "varchar(64)")
    private String netAccIntS;

    @Excel(name = "Days Acc(s)")
    @Column(name = "DAYS_ACC_S", columnDefinition = "varchar(64)")
    private String daysAccS;

    @Excel(name = "Pay Next Payment Dat(s)")
    @Column(name = "PAY_NEXT_PAYMENT_DAT_S", columnDefinition = "varchar(64)")
    private String payNextPaymentDatS;

    @Excel(name = "Sw Trd Dt(s)")
    @Column(name = "SW_TRD_DT_S", columnDefinition = "varchar(64)")
    private String swTrdDtS;

    @Excel(name = "Trader")
    @Column(name = "TRADER", columnDefinition = "varchar(64)")
    private String trader;

    @Column(name = "CREATE_TIME", nullable = false, length = 32)
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

    public String getIssuerS() {
        return issuerS;
    }

    public void setIssuerS(String issuerS) {
        this.issuerS = issuerS;
    }

    public String getFullNet() {
        return fullNet;
    }

    public void setFullNet(String fullNet) {
        this.fullNet = fullNet;
    }

    public String getDailyPl() {
        return dailyPl;
    }

    public void setDailyPl(String dailyPl) {
        this.dailyPl = dailyPl;
    }

    public String getdRealiz() {
        return dRealiz;
    }

    public void setdRealiz(String dRealiz) {
        this.dRealiz = dRealiz;
    }

    public String getdUnreal() {
        return dUnreal;
    }

    public void setdUnreal(String dUnreal) {
        this.dUnreal = dUnreal;
    }

    public String getHiYtdRealizedS() {
        return hiYtdRealizedS;
    }

    public void setHiYtdRealizedS(String hiYtdRealizedS) {
        this.hiYtdRealizedS = hiYtdRealizedS;
    }

    public String getHiYtdUnrealizedS() {
        return hiYtdUnrealizedS;
    }

    public void setHiYtdUnrealizedS(String hiYtdUnrealizedS) {
        this.hiYtdUnrealizedS = hiYtdUnrealizedS;
    }

    public String getHiYtd() {
        return hiYtd;
    }

    public void setHiYtd(String hiYtd) {
        this.hiYtd = hiYtd;
    }

    public String getDv01S() {
        return dv01S;
    }

    public void setDv01S(String dv01S) {
        this.dv01S = dv01S;
    }

    public String getCostSpreadS() {
        return costSpreadS;
    }

    public void setCostSpreadS(String costSpreadS) {
        this.costSpreadS = costSpreadS;
    }

    public String getMvRt() {
        return mvRt;
    }

    public void setMvRt(String mvRt) {
        this.mvRt = mvRt;
    }

    public String getMvT1S() {
        return mvT1S;
    }

    public void setMvT1S(String mvT1S) {
        this.mvT1S = mvT1S;
    }

    public String getSprdT() {
        return sprdT;
    }

    public void setSprdT(String sprdT) {
        this.sprdT = sprdT;
    }

    public String getSprdT1S() {
        return sprdT1S;
    }

    public void setSprdT1S(String sprdT1S) {
        this.sprdT1S = sprdT1S;
    }

    public String getSeriesS() {
        return seriesS;
    }

    public void setSeriesS(String seriesS) {
        this.seriesS = seriesS;
    }

    public String getCdsBuyS() {
        return cdsBuyS;
    }

    public void setCdsBuyS(String cdsBuyS) {
        this.cdsBuyS = cdsBuyS;
    }

    public String getCntrprtyS() {
        return cntrprtyS;
    }

    public void setCntrprtyS(String cntrprtyS) {
        this.cntrprtyS = cntrprtyS;
    }

    public String getMaturityS() {
        return maturityS;
    }

    public void setMaturityS(String maturityS) {
        this.maturityS = maturityS;
    }

    public String getCdsQtdS() {
        return cdsQtdS;
    }

    public void setCdsQtdS(String cdsQtdS) {
        this.cdsQtdS = cdsQtdS;
    }

    public String getCdsCashS() {
        return cdsCashS;
    }

    public void setCdsCashS(String cdsCashS) {
        this.cdsCashS = cdsCashS;
    }

    public String getRrRate() {
        return rrRate;
    }

    public void setRrRate(String rrRate) {
        this.rrRate = rrRate;
    }

    public String getPvCdsPremLegS() {
        return pvCdsPremLegS;
    }

    public void setPvCdsPremLegS(String pvCdsPremLegS) {
        this.pvCdsPremLegS = pvCdsPremLegS;
    }

    public String getPvCdsDfltLegS() {
        return pvCdsDfltLegS;
    }

    public void setPvCdsDfltLegS(String pvCdsDfltLegS) {
        this.pvCdsDfltLegS = pvCdsDfltLegS;
    }

    public String getNetAccIntS() {
        return netAccIntS;
    }

    public void setNetAccIntS(String netAccIntS) {
        this.netAccIntS = netAccIntS;
    }

    public String getDaysAccS() {
        return daysAccS;
    }

    public void setDaysAccS(String daysAccS) {
        this.daysAccS = daysAccS;
    }

    public String getPayNextPaymentDatS() {
        return payNextPaymentDatS;
    }

    public void setPayNextPaymentDatS(String payNextPaymentDatS) {
        this.payNextPaymentDatS = payNextPaymentDatS;
    }

    public String getSwTrdDtS() {
        return swTrdDtS;
    }

    public void setSwTrdDtS(String swTrdDtS) {
        this.swTrdDtS = swTrdDtS;
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