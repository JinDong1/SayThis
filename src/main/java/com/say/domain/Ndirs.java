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
 * @TableName ndirs
 */
@TableName(value ="ndirs")
@Entity
public class Ndirs implements Serializable {


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

    @Excel(name = "Mkt Val(CNY)")
    @Column(name = "MKT_VAL_CNY", columnDefinition = "varchar(64)")
    private String mktValCny;

    @Excel(name = "Yest EOD Sw MV(s)(CNY)")
    @Column(name = "YEST_EOD_SW_MV_S_CNY", columnDefinition = "varchar(64)")
    private String yestEodSwMvSCny;

    @Excel(name = "D PNL(CNY)")
    @Column(name = "D_PNL_CNY", columnDefinition = "varchar(64)")
    private String dPnlCny;

    @Excel(name = "Unrealiz(CNY)")
    @Column(name = "UNREALIZ_CNY", columnDefinition = "varchar(64)")
    private String unrealizCny;

    @Excel(name = "H+I YTD Trade P&L(s)(CNY)")
    @Column(name = "H_I_YTD_TRADE_P_L_S_CNY", columnDefinition = "varchar(64)")
    private String hIYtdTradePLSCny;

    @Excel(name = "H+I YTD Market P&L(s)(CNY)")
    @Column(name = "H_I_YTD_MARKET_P_L_S_CNY", columnDefinition = "varchar(64)")
    private String hIYtdMarketPLSCny;

    @Excel(name = "YTD PNL(CNY)")
    @Column(name = "YTD_PNL_CNY", columnDefinition = "varchar(64)")
    private String ytdPnlCny;

    @Excel(name = "dv01(s)(CNY)")
    @Column(name = "DV01_S_CNY", columnDefinition = "varchar(64)")
    private String dv01SCny;

    @Excel(name = "Pay Cpn(s)")
    @Column(name = "PAY_CPN_S", columnDefinition = "varchar(64)")
    private String payCpnS;

    @Excel(name = "Pay/Rece(s)")
    @Column(name = "PAY_RECE_S", columnDefinition = "varchar(64)")
    private String payReceS;

    @Excel(name = "Pay Noti(s)")
    @Column(name = "PAY_NOTI_S", columnDefinition = "varchar(64)")
    private String payNotiS;

    @Excel(name = "Pay Not(s)")
    @Column(name = "PAY_NOT_S", columnDefinition = "varchar(64)")
    private String payNotS;

    @Excel(name = "Receive(s)")
    @Column(name = "RECEIVE_S", columnDefinition = "varchar(64)")
    private String receiveS;

    @Excel(name = "Rcv Not(s)")
    @Column(name = "RCV_NOT_S", columnDefinition = "varchar(64)")
    private String rcvNotS;

    @Excel(name = "Pay Ccy(s)")
    @Column(name = "PAY_CCY_S", columnDefinition = "varchar(64)")
    private String payCcyS;

    @Excel(name = "Rcv Ccy(s)")
    @Column(name = "RCV_CCY_S", columnDefinition = "varchar(64)")
    private String rcvCcyS;

    @Excel(name = "Rcv cp(s)")
    @Column(name = "RCV_CP_S", columnDefinition = "varchar(64)")
    private String rcvCpS;

    @Excel(name = "RCV INX(s)")
    @Column(name = "RCV_INX_S", columnDefinition = "varchar(64)")
    private String rcvInxS;

    @Excel(name = "Mid Mod(s)")
    @Column(name = "MID_MOD_S", columnDefinition = "varchar(64)")
    private String midModS;

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

    @Excel(name = "Realiz(CNY)")
    @Column(name = "REALIZ_CNY", columnDefinition = "varchar(64)")
    private String realizCny;

    @Excel(name = "YTD Trade Profit and(s)")
    @Column(name = "YTD_TRADE_PROFIT_AND_S", columnDefinition = "varchar(64)")
    private String ytdTradeProfitAndS;

    @Excel(name = "YTD Market Profit an(s)")
    @Column(name = "YTD_MARKET_PROFIT_AN_S", columnDefinition = "varchar(64)")
    private String ytdMarketProfitAnS;

    @Excel(name = "YTD Tot P&L")
    @Column(name = "YTD_TOT_P_L", columnDefinition = "varchar(64)")
    private String ytdTotPL;

    @Excel(name = "Swap Par Coupon(s)")
    @Column(name = "SWAP_PAR_COUPON_S", columnDefinition = "varchar(64)")
    private String swapParCouponS;

    @Column(name = "CREATE_TIME", columnDefinition = "varchar(32)")
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

    public String getMktValCny() {
        return mktValCny;
    }

    public void setMktValCny(String mktValCny) {
        this.mktValCny = mktValCny;
    }

    public String getYestEodSwMvSCny() {
        return yestEodSwMvSCny;
    }

    public void setYestEodSwMvSCny(String yestEodSwMvSCny) {
        this.yestEodSwMvSCny = yestEodSwMvSCny;
    }

    public String getdPnlCny() {
        return dPnlCny;
    }

    public void setdPnlCny(String dPnlCny) {
        this.dPnlCny = dPnlCny;
    }

    public String getUnrealizCny() {
        return unrealizCny;
    }

    public void setUnrealizCny(String unrealizCny) {
        this.unrealizCny = unrealizCny;
    }

    public String gethIYtdTradePLSCny() {
        return hIYtdTradePLSCny;
    }

    public void sethIYtdTradePLSCny(String hIYtdTradePLSCny) {
        this.hIYtdTradePLSCny = hIYtdTradePLSCny;
    }

    public String gethIYtdMarketPLSCny() {
        return hIYtdMarketPLSCny;
    }

    public void sethIYtdMarketPLSCny(String hIYtdMarketPLSCny) {
        this.hIYtdMarketPLSCny = hIYtdMarketPLSCny;
    }

    public String getYtdPnlCny() {
        return ytdPnlCny;
    }

    public void setYtdPnlCny(String ytdPnlCny) {
        this.ytdPnlCny = ytdPnlCny;
    }

    public String getDv01SCny() {
        return dv01SCny;
    }

    public void setDv01SCny(String dv01SCny) {
        this.dv01SCny = dv01SCny;
    }

    public String getPayCpnS() {
        return payCpnS;
    }

    public void setPayCpnS(String payCpnS) {
        this.payCpnS = payCpnS;
    }

    public String getPayReceS() {
        return payReceS;
    }

    public void setPayReceS(String payReceS) {
        this.payReceS = payReceS;
    }

    public String getPayNotiS() {
        return payNotiS;
    }

    public void setPayNotiS(String payNotiS) {
        this.payNotiS = payNotiS;
    }

    public String getPayNotS() {
        return payNotS;
    }

    public void setPayNotS(String payNotS) {
        this.payNotS = payNotS;
    }

    public String getReceiveS() {
        return receiveS;
    }

    public void setReceiveS(String receiveS) {
        this.receiveS = receiveS;
    }

    public String getRcvNotS() {
        return rcvNotS;
    }

    public void setRcvNotS(String rcvNotS) {
        this.rcvNotS = rcvNotS;
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

    public String getRcvInxS() {
        return rcvInxS;
    }

    public void setRcvInxS(String rcvInxS) {
        this.rcvInxS = rcvInxS;
    }

    public String getMidModS() {
        return midModS;
    }

    public void setMidModS(String midModS) {
        this.midModS = midModS;
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

    public String getRealizCny() {
        return realizCny;
    }

    public void setRealizCny(String realizCny) {
        this.realizCny = realizCny;
    }

    public String getYtdTradeProfitAndS() {
        return ytdTradeProfitAndS;
    }

    public void setYtdTradeProfitAndS(String ytdTradeProfitAndS) {
        this.ytdTradeProfitAndS = ytdTradeProfitAndS;
    }

    public String getYtdMarketProfitAnS() {
        return ytdMarketProfitAnS;
    }

    public void setYtdMarketProfitAnS(String ytdMarketProfitAnS) {
        this.ytdMarketProfitAnS = ytdMarketProfitAnS;
    }

    public String getYtdTotPL() {
        return ytdTotPL;
    }

    public void setYtdTotPL(String ytdTotPL) {
        this.ytdTotPL = ytdTotPL;
    }

    public String getSwapParCouponS() {
        return swapParCouponS;
    }

    public void setSwapParCouponS(String swapParCouponS) {
        this.swapParCouponS = swapParCouponS;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}