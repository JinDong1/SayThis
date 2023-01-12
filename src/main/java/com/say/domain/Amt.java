package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @TableName amt
 */
@TableName(value ="amt")
@Entity
public class Amt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint(20)")
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

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getPositionUsd() {
        return positionUsd;
    }

    public void setPositionUsd(String positionUsd) {
        this.positionUsd = positionUsd;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getDateFirS() {
        return dateFirS;
    }

    public void setDateFirS(String dateFirS) {
        this.dateFirS = dateFirS;
    }

    public String getCurncyS() {
        return curncyS;
    }

    public void setCurncyS(String curncyS) {
        this.curncyS = curncyS;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBgnBidS() {
        return bgnBidS;
    }

    public void setBgnBidS(String bgnBidS) {
        this.bgnBidS = bgnBidS;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCostYldS() {
        return costYldS;
    }

    public void setCostYldS(String costYldS) {
        this.costYldS = costYldS;
    }

    public String getBookPriS() {
        return bookPriS;
    }

    public void setBookPriS(String bookPriS) {
        this.bookPriS = bookPriS;
    }

    public String getBidPx() {
        return bidPx;
    }

    public void setBidPx(String bidPx) {
        this.bidPx = bidPx;
    }

    public String getMtmPc() {
        return mtmPc;
    }

    public void setMtmPc(String mtmPc) {
        this.mtmPc = mtmPc;
    }

    public String getMtm() {
        return mtm;
    }

    public void setMtm(String mtm) {
        this.mtm = mtm;
    }

    public String getBvalMid() {
        return bvalMid;
    }

    public void setBvalMid(String bvalMid) {
        this.bvalMid = bvalMid;
    }

    public String getCumPrinS() {
        return cumPrinS;
    }

    public void setCumPrinS(String cumPrinS) {
        this.cumPrinS = cumPrinS;
    }

    public String getPxAccPS() {
        return pxAccPS;
    }

    public void setPxAccPS(String pxAccPS) {
        this.pxAccPS = pxAccPS;
    }

    public String getPriceAcS() {
        return priceAcS;
    }

    public void setPriceAcS(String priceAcS) {
        this.priceAcS = priceAcS;
    }

    public String getDayCpnS() {
        return dayCpnS;
    }

    public void setDayCpnS(String dayCpnS) {
        this.dayCpnS = dayCpnS;
    }

    public String getMtdCpnS() {
        return mtdCpnS;
    }

    public void setMtdCpnS(String mtdCpnS) {
        this.mtdCpnS = mtdCpnS;
    }

    public String getYtdCpnS() {
        return ytdCpnS;
    }

    public void setYtdCpnS(String ytdCpnS) {
        this.ytdCpnS = ytdCpnS;
    }

    public String getAmortiza() {
        return amortiza;
    }

    public void setAmortiza(String amortiza) {
        this.amortiza = amortiza;
    }

    public String getOpnAvgS() {
        return opnAvgS;
    }

    public void setOpnAvgS(String opnAvgS) {
        this.opnAvgS = opnAvgS;
    }

    public String getMaturityS() {
        return maturityS;
    }

    public void setMaturityS(String maturityS) {
        this.maturityS = maturityS;
    }

    public String getNxtCallS() {
        return nxtCallS;
    }

    public void setNxtCallS(String nxtCallS) {
        this.nxtCallS = nxtCallS;
    }

    public String getpL() {
        return pL;
    }

    public void setpL(String pL) {
        this.pL = pL;
    }

    public String getHiMtdS() {
        return hiMtdS;
    }

    public void setHiMtdS(String hiMtdS) {
        this.hiMtdS = hiMtdS;
    }

    public String getUnrealiz() {
        return unrealiz;
    }

    public void setUnrealiz(String unrealiz) {
        this.unrealiz = unrealiz;
    }

    public String getMtdTradS() {
        return mtdTradS;
    }

    public void setMtdTradS(String mtdTradS) {
        this.mtdTradS = mtdTradS;
    }

    public String getYtdTradS() {
        return ytdTradS;
    }

    public void setYtdTradS(String ytdTradS) {
        this.ytdTradS = ytdTradS;
    }

    public String getYtdtotal() {
        return ytdtotal;
    }

    public void setYtdtotal(String ytdtotal) {
        this.ytdtotal = ytdtotal;
    }

    public String getYtdReal() {
        return ytdReal;
    }

    public void setYtdReal(String ytdReal) {
        this.ytdReal = ytdReal;
    }

    public String getYtdUnrl() {
        return ytdUnrl;
    }

    public void setYtdUnrl(String ytdUnrl) {
        this.ytdUnrl = ytdUnrl;
    }

    public String getOciPnlUsd() {
        return ociPnlUsd;
    }

    public void setOciPnlUsd(String ociPnlUsd) {
        this.ociPnlUsd = ociPnlUsd;
    }

    public String getYldFlag() {
        return yldFlag;
    }

    public void setYldFlag(String yldFlag) {
        this.yldFlag = yldFlag;
    }

    public String getBidYtmS() {
        return bidYtmS;
    }

    public void setBidYtmS(String bidYtmS) {
        this.bidYtmS = bidYtmS;
    }

    public String getIndGrouS() {
        return indGrouS;
    }

    public void setIndGrouS(String indGrouS) {
        this.indGrouS = indGrouS;
    }

    public String getBbCompoS() {
        return bbCompoS;
    }

    public void setBbCompoS(String bbCompoS) {
        this.bbCompoS = bbCompoS;
    }

    public String getFitchIsS() {
        return fitchIsS;
    }

    public void setFitchIsS(String fitchIsS) {
        this.fitchIsS = fitchIsS;
    }

    public String getMoodyIsS() {
        return moodyIsS;
    }

    public void setMoodyIsS(String moodyIsS) {
        this.moodyIsS = moodyIsS;
    }

    public String getsPIsS() {
        return sPIsS;
    }

    public void setsPIsS(String sPIsS) {
        this.sPIsS = sPIsS;
    }

    public String getFitchS() {
        return fitchS;
    }

    public void setFitchS(String fitchS) {
        this.fitchS = fitchS;
    }

    public String getMoodySS() {
        return moodySS;
    }

    public void setMoodySS(String moodySS) {
        this.moodySS = moodySS;
    }

    public String getsPS() {
        return sPS;
    }

    public void setsPS(String sPS) {
        this.sPS = sPS;
    }

    public String getNetMarkS() {
        return netMarkS;
    }

    public void setNetMarkS(String netMarkS) {
        this.netMarkS = netMarkS;
    }

    public String getMidMacS() {
        return midMacS;
    }

    public void setMidMacS(String midMacS) {
        this.midMacS = midMacS;
    }

    public String getDv01() {
        return dv01;
    }

    public void setDv01(String dv01) {
        this.dv01 = dv01;
    }

    public String getYrsMatS() {
        return yrsMatS;
    }

    public void setYrsMatS(String yrsMatS) {
        this.yrsMatS = yrsMatS;
    }

    public String getIsCallS() {
        return isCallS;
    }

    public void setIsCallS(String isCallS) {
        this.isCallS = isCallS;
    }

    public String getIsPutS() {
        return isPutS;
    }

    public void setIsPutS(String isPutS) {
        this.isPutS = isPutS;
    }

    public String getPrevCpnS() {
        return prevCpnS;
    }

    public void setPrevCpnS(String prevCpnS) {
        this.prevCpnS = prevCpnS;
    }

    public String getNxtCpnS() {
        return nxtCpnS;
    }

    public void setNxtCpnS(String nxtCpnS) {
        this.nxtCpnS = nxtCpnS;
    }

    public String getCntryOfS() {
        return cntryOfS;
    }

    public void setCntryOfS(String cntryOfS) {
        this.cntryOfS = cntryOfS;
    }

    public String getCpnRateS() {
        return cpnRateS;
    }

    public void setCpnRateS(String cpnRateS) {
        this.cpnRateS = cpnRateS;
    }

    public String getIssuerS() {
        return issuerS;
    }

    public void setIssuerS(String issuerS) {
        this.issuerS = issuerS;
    }

    public String getAmtOutS() {
        return amtOutS;
    }

    public void setAmtOutS(String amtOutS) {
        this.amtOutS = amtOutS;
    }

    public String getDirtyBiS() {
        return dirtyBiS;
    }

    public void setDirtyBiS(String dirtyBiS) {
        this.dirtyBiS = dirtyBiS;
    }

    public String getIgHyS() {
        return igHyS;
    }

    public void setIgHyS(String igHyS) {
        this.igHyS = igHyS;
    }

    public String getYestMtmS() {
        return yestMtmS;
    }

    public void setYestMtmS(String yestMtmS) {
        this.yestMtmS = yestMtmS;
    }

    public String getMtmXTrSUsd() {
        return mtmXTrSUsd;
    }

    public void setMtmXTrSUsd(String mtmXTrSUsd) {
        this.mtmXTrSUsd = mtmXTrSUsd;
    }

    public String getMidMacaS() {
        return midMacaS;
    }

    public void setMidMacaS(String midMacaS) {
        this.midMacaS = midMacaS;
    }

    public String getDaypnl() {
        return daypnl;
    }

    public void setDaypnl(String daypnl) {
        this.daypnl = daypnl;
    }

    public String getYdunrl() {
        return ydunrl;
    }

    public void setYdunrl(String ydunrl) {
        this.ydunrl = ydunrl;
    }

    public String getYdrealS() {
        return ydrealS;
    }

    public void setYdrealS(String ydrealS) {
        this.ydrealS = ydrealS;
    }

    public String getHiYtdS() {
        return hiYtdS;
    }

    public void setHiYtdS(String hiYtdS) {
        this.hiYtdS = hiYtdS;
    }

    public String getPrincipaS() {
        return principaS;
    }

    public void setPrincipaS(String principaS) {
        this.principaS = principaS;
    }

    public String getAccIntPdS() {
        return accIntPdS;
    }

    public void setAccIntPdS(String accIntPdS) {
        this.accIntPdS = accIntPdS;
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