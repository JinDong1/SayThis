package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.say.utils.DateUtils;
import lombok.Data;

import javax.persistence.*;

/**
 * @TableName irs
 */
@TableName(value ="irs")
@Data
@Entity
public class Irs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint(20)")
    private Long id;
    @Excel(name = "Security")
    @Column(name = "SECURITY", columnDefinition = "varchar(64)")
    private String security;

    @Excel(name = "Cntrprty(s)")
    @Column(name = "CNTRPRTY_S", columnDefinition = "varchar(64)")
    private String cntrprtyS;


    @Excel(name = "Full Net")
    @Column(name = "FULL_NET", columnDefinition = "varchar(64)")
    private String fullNet;

    @Excel(name = "Mkt Val")
    @Column(name = "MKT_VAL", columnDefinition = "varchar(64)")
    private String mktVal;

    @Excel(name = "dv01(s)")
    @Column(name = "DV01_S", columnDefinition = "varchar(64)")
    private String dv01S;

    @Excel(name = "Receive(s)")
    @Column(name = "RECEIVE_S", columnDefinition = "varchar(64)")
    private String receiveS;

    @Excel(name = "Pay Noti(s)")
    @Column(name = "PAY_NOTI_S", columnDefinition = "varchar(64)")
    private String payNotiS;

    @Excel(name = "Pay/Rece(s)")
    @Column(name = "PAY_RECE_S", columnDefinition = "varchar(64)")
    private String payReceS;

    @Excel(name = "Rcv Not Amt(s)")
    @Column(name = "RCV_NOT_AMT_S", columnDefinition = "varchar(64)")
    private String rcvNotAmtS;

    @Excel(name = "Pay Not(s)")
    @Column(name = "PAY_NOT_S", columnDefinition = "varchar(64)")
    private String payNotS;

    @Excel(name = "Pay Ccy(s)")
    @Column(name = "PAY_CCY_S", columnDefinition = "varchar(64)")
    private String payCcyS;

    @Excel(name = "Rcv Ccy(s)")
    @Column(name = "RCV_CCY_S", columnDefinition = "varchar(64)")
    private String rcvCcyS;

    @Excel(name = "Rcv cp(s)")
    @Column(name = "RCV_CP_S", columnDefinition = "varchar(64)")
    private String rcvCpS;

    @Excel(name = "Rcv AI(s)")
    @Column(name = "RCV_AI_S", columnDefinition = "varchar(64)")
    private String rcvAiS;

    @Excel(name = "Pay INX(s)")
    @Column(name = "RCV_INX_S", columnDefinition = "varchar(64)")
    private String rcvInxS;

    @Excel(name = "RCV INX(s)")
    @Column(name = "PAY_INX_S", columnDefinition = "varchar(64)")
    private String payInxS;

    @Excel(name = "Pay Acc(s)")
    @Column(name = "PAY_ACC_S", columnDefinition = "varchar(64)")
    private String payAccS;

    @Excel(name = "Pay Spre(s)")
    @Column(name = "PAY_SPRE_S", columnDefinition = "varchar(64)")
    private String paySpreS;

    @Excel(name = "Rate at(s)")
    @Column(name = "RATE_AT_S", columnDefinition = "varchar(64)")
    private String rateAtS;

    @Excel(name = "Net Acc(s)")
    @Column(name = "NET_ACC_S", columnDefinition = "varchar(64)")
    private String netAccS;

    @Excel(name = "1D Acc M(s)")
    @Column(name = "ONE_D_ACC_M_S", columnDefinition = "varchar(64)")
    private String oneDAccMS;

    @Excel(name = "Mid Mod(s)")
    @Column(name = "MID_MOD_S", columnDefinition = "varchar(64)")
    private String midModS;

    @Excel(name = "D PNL")
    @Column(name = "D_PNL", columnDefinition = "varchar(64)")
    private String dPnl;

    @Excel(name = "Day Realiz")
    @Column(name = "DAY_REALIZ", columnDefinition = "varchar(64)")
    private String dayRealiz;

    @Excel(name = "H+I YTD Unreal P&L(s)")
    @Column(name = "H_I_YTD_UNREAL_P_L_S", columnDefinition = "varchar(64)")
    private String hIYtdUnrealPLS;

    @Excel(name = "H+I YTD reali P&L(s)")
    @Column(name = "H_I_YTD_REALI_P_L_S", columnDefinition = "varchar(64)")
    private String hIYtdRealiPLS;

    @Excel(name = "H+I YTD Total P&L")
    @Column(name = "H_I_YTD_TOTAL_P_L", columnDefinition = "varchar(64)")
    private String hIYtdTotalPL;

    @Excel(name = "Yest EOD Sw MV(s)")
    @Column(name = "YEST_EOD_SW_MV_S", columnDefinition = "varchar(64)")
    private String yestEodSwMvS;

    @Excel(name = "Coupon O(s)")
    @Column(name = "COUPON_O_S", columnDefinition = "varchar(64)")
    private String couponOS;

    @Excel(name = "Pay Cpn(s)")
    @Column(name = "PAY_CPN_S", columnDefinition = "varchar(64)")
    private String payCpnS;

    @Excel(name = "Swap Typ(s)")
    @Column(name = "SWAP_TYP_S", columnDefinition = "varchar(64)")
    private String swapTypS;

    @Excel(name = "Pay Next(s)")
    @Column(name = "PAY_NEXT_S", columnDefinition = "varchar(64)")
    private String payNextS;

    @Excel(name = "Pay Freq(s)")
    @Column(name = "PAY_FREQ_S", columnDefinition = "varchar(64)")
    private String payFreqS;

    @Excel(name = "Eff Dt(s)")
    @Column(name = "EFF_DT_S", columnDefinition = "varchar(64)")
    private String effDtS;

    @Excel(name = "Maturity(s)")
    @Column(name = "MATURITY_S", columnDefinition = "varchar(64)")
    private String maturityS;

    @Excel(name = "Original(s)")
    @Column(name = "ORIGINAL_S", columnDefinition = "varchar(64)")
    private String originalS;

    @Excel(name = "BBID(s)")
    @Column(name = "BBID_S", columnDefinition = "varchar(64)")
    private String bbidS;

    @Excel(name = "Swap Par Coupon(s)")
    @Column(name = "SWAP_PAR_COUPON_S", columnDefinition = "varchar(64)")
    private String swapParCouponS;

    @Excel(name = "Trader")
    @Column(name = "TRADER", columnDefinition = "varchar(64)")
    private String trader;

    @Column(name = "CREATE_TIME", columnDefinition = "varchar(64)")
    private String createTime = DateUtils.dateTime();

    private static final long serialVersionUID = 1L;

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

    public String getCntrprtyS() {
        return cntrprtyS;
    }

    public void setCntrprtyS(String cntrprtyS) {
        this.cntrprtyS = cntrprtyS;
    }

    public String getFullNet() {
        return fullNet;
    }

    public void setFullNet(String fullNet) {
        this.fullNet = fullNet;
    }

    public String getMktVal() {
        return mktVal;
    }

    public void setMktVal(String mktVal) {
        this.mktVal = mktVal;
    }

    public String getDv01S() {
        return dv01S;
    }

    public void setDv01S(String dv01S) {
        this.dv01S = dv01S;
    }

    public String getReceiveS() {
        return receiveS;
    }

    public void setReceiveS(String receiveS) {
        this.receiveS = receiveS;
    }

    public String getPayNotiS() {
        return payNotiS;
    }

    public void setPayNotiS(String payNotiS) {
        this.payNotiS = payNotiS;
    }

    public String getPayReceS() {
        return payReceS;
    }

    public void setPayReceS(String payReceS) {
        this.payReceS = payReceS;
    }

    public String getRcvNotAmtS() {
        return rcvNotAmtS;
    }

    public void setRcvNotAmtS(String rcvNotAmtS) {
        this.rcvNotAmtS = rcvNotAmtS;
    }

    public String getPayNotS() {
        return payNotS;
    }

    public void setPayNotS(String payNotS) {
        this.payNotS = payNotS;
    }

    public String getPayCcyS() {
        return payCcyS;
    }

    public void setPayCcyS(String payCcyS) {
        this.payCcyS = payCcyS;
    }

    public String getRcvCcyS() {
        return rcvCcyS;
    }

    public void setRcvCcyS(String rcvCcyS) {
        this.rcvCcyS = rcvCcyS;
    }

    public String getRcvCpS() {
        return rcvCpS;
    }

    public void setRcvCpS(String rcvCpS) {
        this.rcvCpS = rcvCpS;
    }

    public String getRcvAiS() {
        return rcvAiS;
    }

    public void setRcvAiS(String rcvAiS) {
        this.rcvAiS = rcvAiS;
    }

    public String getRcvInxS() {
        return rcvInxS;
    }

    public void setRcvInxS(String rcvInxS) {
        this.rcvInxS = rcvInxS;
    }

    public String getPayInxS() {
        return payInxS;
    }

    public void setPayInxS(String payInxS) {
        this.payInxS = payInxS;
    }

    public String getPayAccS() {
        return payAccS;
    }

    public void setPayAccS(String payAccS) {
        this.payAccS = payAccS;
    }

    public String getPaySpreS() {
        return paySpreS;
    }

    public void setPaySpreS(String paySpreS) {
        this.paySpreS = paySpreS;
    }

    public String getRateAtS() {
        return rateAtS;
    }

    public void setRateAtS(String rateAtS) {
        this.rateAtS = rateAtS;
    }

    public String getNetAccS() {
        return netAccS;
    }

    public void setNetAccS(String netAccS) {
        this.netAccS = netAccS;
    }

    public String getOneDAccMS() {
        return oneDAccMS;
    }

    public void setOneDAccMS(String oneDAccMS) {
        this.oneDAccMS = oneDAccMS;
    }

    public String getMidModS() {
        return midModS;
    }

    public void setMidModS(String midModS) {
        this.midModS = midModS;
    }

    public String getdPnl() {
        return dPnl;
    }

    public void setdPnl(String dPnl) {
        this.dPnl = dPnl;
    }

    public String getDayRealiz() {
        return dayRealiz;
    }

    public void setDayRealiz(String dayRealiz) {
        this.dayRealiz = dayRealiz;
    }

    public String gethIYtdUnrealPLS() {
        return hIYtdUnrealPLS;
    }

    public void sethIYtdUnrealPLS(String hIYtdUnrealPLS) {
        this.hIYtdUnrealPLS = hIYtdUnrealPLS;
    }

    public String gethIYtdRealiPLS() {
        return hIYtdRealiPLS;
    }

    public void sethIYtdRealiPLS(String hIYtdRealiPLS) {
        this.hIYtdRealiPLS = hIYtdRealiPLS;
    }

    public String gethIYtdTotalPL() {
        return hIYtdTotalPL;
    }

    public void sethIYtdTotalPL(String hIYtdTotalPL) {
        this.hIYtdTotalPL = hIYtdTotalPL;
    }

    public String getYestEodSwMvS() {
        return yestEodSwMvS;
    }

    public void setYestEodSwMvS(String yestEodSwMvS) {
        this.yestEodSwMvS = yestEodSwMvS;
    }

    public String getCouponOS() {
        return couponOS;
    }

    public void setCouponOS(String couponOS) {
        this.couponOS = couponOS;
    }

    public String getPayCpnS() {
        return payCpnS;
    }

    public void setPayCpnS(String payCpnS) {
        this.payCpnS = payCpnS;
    }

    public String getSwapTypS() {
        return swapTypS;
    }

    public void setSwapTypS(String swapTypS) {
        this.swapTypS = swapTypS;
    }

    public String getPayNextS() {
        return payNextS;
    }

    public void setPayNextS(String payNextS) {
        this.payNextS = payNextS;
    }

    public String getPayFreqS() {
        return payFreqS;
    }

    public void setPayFreqS(String payFreqS) {
        this.payFreqS = payFreqS;
    }

    public String getEffDtS() {
        return effDtS;
    }

    public void setEffDtS(String effDtS) {
        this.effDtS = effDtS;
    }

    public String getMaturityS() {
        return maturityS;
    }

    public void setMaturityS(String maturityS) {
        this.maturityS = maturityS;
    }

    public String getOriginalS() {
        return originalS;
    }

    public void setOriginalS(String originalS) {
        this.originalS = originalS;
    }

    public String getBbidS() {
        return bbidS;
    }

    public void setBbidS(String bbidS) {
        this.bbidS = bbidS;
    }

    public String getSwapParCouponS() {
        return swapParCouponS;
    }

    public void setSwapParCouponS(String swapParCouponS) {
        this.swapParCouponS = swapParCouponS;
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
}