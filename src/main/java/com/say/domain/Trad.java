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
 * @TableName trad
 */
@TableName(value ="trad")
@Entity
public class Trad implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint(20)")
    private Long id;

    @Excel(name = "Security")
    @Column(name = "SECURITY", columnDefinition = "varchar(64) ")
    private String security;
    @Excel(name = "ISIN")
    @Column(name = "ISIN", columnDefinition = "varchar(64) ")
    private String isin;

    @Excel(name = "Curncy(s)")
    @Column(name = "CURNCY_S", columnDefinition = "varchar(64) ")
    private String curncyS;

    @Excel(name = "Short")
    @Column(name = "SHORT_SALE", columnDefinition = "varchar(64) ")
    private String shortSale;

    @Excel(name = "Long")
    @Column(name = "LOG", columnDefinition = "varchar(64) ")
    private String log;

    @Excel(name = "Position(USD)")
    @Column(name = "POSITION_USD", columnDefinition = "varchar(64) ")
    private String positionUsd;

    @Excel(name = "Cumulati")
    @Column(name = "CUMULATI", columnDefinition = "varchar(64) ")
    private String cumulati;

    @Excel(name = "WAC")
    @Column(name = "WAC", columnDefinition = "varchar(64) ")
    private String wac;

    @Excel(name = "T-1 MTM(s)")
    @Column(name = "T1_MTM_S", columnDefinition = "varchar(64) ")
    private String t1MtmS;

    @Excel(name = "MTM")
    @Column(name = "MTM", columnDefinition = "varchar(64) ")
    private String mtm;

    @Excel(name = "BVAL MID")
    @Column(name = "BVAL_MID", columnDefinition = "varchar(64) ")
    private String bvalMid;

    @Excel(name = "Exch Rt(s)")
    @Column(name = "EXCH_RT_S", columnDefinition = "varchar(64) ")
    private String exchRtS;

    @Excel(name = "P & L")
    @Column(name = "P_L", columnDefinition = "varchar(64) ")
    private String pL;

    @Excel(name = "Unrealiz")
    @Column(name = "UNREALIZ", columnDefinition = "varchar(64) ")
    private String unrealiz;

    @Excel(name = "Realized")
    @Column(name = "REALIZED", columnDefinition = "varchar(64) ")
    private String realized;

    @Excel(name = "DayReal(s)")
    @Column(name = "DAYREAL_S", columnDefinition = "varchar(64) ")
    private String dayrealS;

    @Excel(name = "YTD unr")
    @Column(name = "YTD_UNR", columnDefinition = "varchar(64) ")
    private String ytdUnr;

    @Excel(name = "YTD RLZ")
    @Column(name = "YTD_RLZ", columnDefinition = "varchar(64) ")
    private String ytdRlz;

    @Excel(name = "Bk Ccy Y")
    @Column(name = "BK_CCY_Y", columnDefinition = "varchar(64) ")
    private String bkCcyY;

    @Excel(name = "H+I YTD Total P&L")
    @Column(name = "H_I_YTD_TOTAL_P_L", columnDefinition = "varchar(64) ")
    private String hIYtdTotalPL;

    @Excel(name = "Date Fir(s)")
    @Column(name = "DATE_FIR_S", columnDefinition = "varchar(64) ")
    private String dateFirS;

    @Excel(name = "Industry(s)")
    @Column(name = "INDUSTRY_S", columnDefinition = "varchar(64) ")
    private String industryS;
    @Excel(name = "Pos Stra")
    @Column(name = "POS_STRA", columnDefinition = "varchar(64) ")
    private String posStra;

    @Excel(name = "BB Compo(s)")
    @Column(name = "BB_COMPO_S", columnDefinition = "varchar(64) ")
    private String bbCompoS;

    @Excel(name = "Fitch IS(s)")
    @Column(name = "FITCH_IS_S", columnDefinition = "varchar(64) ")
    private String fitchIsS;
    @Excel(name = "MDS IS(s)")
    @Column(name = "MDS_IS_S", columnDefinition = "varchar(64) ")
    private String mdsIsS;
    @Excel(name = "S&P IS(s)")
    @Column(name = "S_P_IS_S", columnDefinition = "varchar(64) ")
    private String sPIsS;
    @Excel(name = "Fitch(s)")
    @Column(name = "FITCH_S", columnDefinition = "varchar(64) ")
    private String fitchS;
    @Excel(name = "Moody's(s)")
    @Column(name = "MOODY_S_S", columnDefinition = "varchar(64) ")
    private String moodySS;

    @Excel(name = "S&P(s)")
    @Column(name = "S_P_S", columnDefinition = "varchar(64) ")
    private String sPS;
    @Excel(name = "Net Mark(s)")
    @Column(name = "NET_MARK_S", columnDefinition = "varchar(64) ")
    private String netMarkS;
    @Excel(name = "Strat De")
    @Column(name = "STRAT_DE", columnDefinition = "varchar(64) ")
    private String stratDe;

    @Excel(name = "YTD Secu(s)")
    @Column(name = "YTD_SECU_S", columnDefinition = "varchar(64) ")
    private String ytdSecuS;

    @Excel(name = "Security(s)")
    @Column(name = "SECURITY_S", columnDefinition = "varchar(64) ")
    private String securityS;
    @Excel(name = "Mid Mac(s)")
    @Column(name = "MID_MAC_S", columnDefinition = "varchar(64) ")
    private String midMacS;
    @Excel(name = "DV01")
    @Column(name = "DV01", columnDefinition = "varchar(64) ")
    private String dv01;
    @Excel(name = "H+I RLZ(s)")
    @Column(name = "H_I_RLZ_S", columnDefinition = "varchar(64) ")
    private String hIRlzS;

    @Excel(name = "H+I Unr(s)")
    @Column(name = "H_I_UNR_S", columnDefinition = "varchar(64) ")
    private String hIUnrS;

    @Excel(name = "Pricing")
    @Column(name = "PRICING", columnDefinition = "varchar(64) ")
    private String pricing;
    @Excel(name = "Risk")
    @Column(name = "RISK", columnDefinition = "varchar(64) ")
    private String risk;

    @Excel(name = "Yrs MAT(s)")
    @Column(name = "YRS_MAT_S", columnDefinition = "varchar(64) ")
    private String yrsMatS;

    @Excel(name = "Maturity(s)")
    @Column(name = "MATURITY_S", columnDefinition = "varchar(64) ")
    private String maturityS;

    @Excel(name = "Is Call(s)")
    @Column(name = "IS_CALL_S", columnDefinition = "varchar(64) ")
    private String isCallS;

    @Excel(name = "Is Put(s)")
    @Column(name = "IS_PUT_S", columnDefinition = "varchar(64) ")
    private String isPutS;

    @Excel(name = "Prev Cpn(s)")
    @Column(name = "PREV_CPN_S", columnDefinition = "varchar(64) ")
    private String prevCpnS;

    @Excel(name = "Nxt Cpn(s)")
    @Column(name = "NXT_CPN_S", columnDefinition = "varchar(64) ")
    private String nxtCpnS;

    @Excel(name = "Cntry of(s)")
    @Column(name = "CNTRY_OF_S", columnDefinition = "varchar(64) ")
    private String cntryOfS;

    @Excel(name = "Cpn(s)")
    @Column(name = "CPN_S", columnDefinition = "varchar(64) ")
    private String cpnS;
    @Excel(name = "Issuer(s)")
    @Column(name = "ISSUER_S", columnDefinition = "varchar(64) ")
    private String issuerS;

    @Excel(name = "Dirty Bi(s)")
    @Column(name = "DIRTY_BI_S", columnDefinition = "varchar(64) ")
    private String dirtyBiS;

    @Excel(name = "Amt Out(s)")
    @Column(name = "AMT_OUT_S", columnDefinition = "varchar(64) ")
    private String amtOutS;
    @Excel(name = "ig/hy(s)")
    @Column(name = "IG_HY_S", columnDefinition = "varchar(64) ")
    private String igHyS;

    @Excel(name = "MTM x Tr(s)(USD)")
    @Column(name = "MTM_X_TR_S_USD", columnDefinition = "varchar(64) ")
    private String mtmXTrSUsd;

    @Excel(name = "Acc Int(s)")
    @Column(name = "ACC_INT_S", columnDefinition = "varchar(64) ")
    private String accIntS;

    @Excel(name = "YTC(s)")
    @Column(name = "YTC_S", columnDefinition = "varchar(64) ")
    private String ytcS;
    @Excel(name = "Mid Maca(s)")
    @Column(name = "MID_MACA_S", columnDefinition = "varchar(64) ")
    private String midMacaS;

    @Excel(name = "Yld Flag")
    @Column(name = "YLD_FLAG", columnDefinition = "varchar(64) ")
    private String yldFlag;

    @Excel(name = "Principal Factor(s)")
    @Column(name = "PRINCIPAL_FACTOR_S", columnDefinition = "varchar(64) ")
    private String principalFactorS;

    @Excel(name = "Trader")
    @Column(name = "TRADER", columnDefinition = "varchar(64) ")
    private String trader;

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

    public String getShortSale() {
        return shortSale;
    }

    public void setShortSale(String shortSale) {
        this.shortSale = shortSale;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPositionUsd() {
        return positionUsd;
    }

    public void setPositionUsd(String positionUsd) {
        this.positionUsd = positionUsd;
    }

    public String getCumulati() {
        return cumulati;
    }

    public void setCumulati(String cumulati) {
        this.cumulati = cumulati;
    }

    public String getWac() {
        return wac;
    }

    public void setWac(String wac) {
        this.wac = wac;
    }

    public String getT1MtmS() {
        return t1MtmS;
    }

    public void setT1MtmS(String t1MtmS) {
        this.t1MtmS = t1MtmS;
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

    public String getExchRtS() {
        return exchRtS;
    }

    public void setExchRtS(String exchRtS) {
        this.exchRtS = exchRtS;
    }

    public String getpL() {
        return pL;
    }

    public void setpL(String pL) {
        this.pL = pL;
    }

    public String getUnrealiz() {
        return unrealiz;
    }

    public void setUnrealiz(String unrealiz) {
        this.unrealiz = unrealiz;
    }

    public String getRealized() {
        return realized;
    }

    public void setRealized(String realized) {
        this.realized = realized;
    }

    public String getDayrealS() {
        return dayrealS;
    }

    public void setDayrealS(String dayrealS) {
        this.dayrealS = dayrealS;
    }

    public String getYtdUnr() {
        return ytdUnr;
    }

    public void setYtdUnr(String ytdUnr) {
        this.ytdUnr = ytdUnr;
    }

    public String getYtdRlz() {
        return ytdRlz;
    }

    public void setYtdRlz(String ytdRlz) {
        this.ytdRlz = ytdRlz;
    }

    public String getBkCcyY() {
        return bkCcyY;
    }

    public void setBkCcyY(String bkCcyY) {
        this.bkCcyY = bkCcyY;
    }

    public String gethIYtdTotalPL() {
        return hIYtdTotalPL;
    }

    public void sethIYtdTotalPL(String hIYtdTotalPL) {
        this.hIYtdTotalPL = hIYtdTotalPL;
    }

    public String getDateFirS() {
        return dateFirS;
    }

    public void setDateFirS(String dateFirS) {
        this.dateFirS = dateFirS;
    }

    public String getIndustryS() {
        return industryS;
    }

    public void setIndustryS(String industryS) {
        this.industryS = industryS;
    }

    public String getPosStra() {
        return posStra;
    }

    public void setPosStra(String posStra) {
        this.posStra = posStra;
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

    public String getMdsIsS() {
        return mdsIsS;
    }

    public void setMdsIsS(String mdsIsS) {
        this.mdsIsS = mdsIsS;
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

    public String getStratDe() {
        return stratDe;
    }

    public void setStratDe(String stratDe) {
        this.stratDe = stratDe;
    }

    public String getYtdSecuS() {
        return ytdSecuS;
    }

    public void setYtdSecuS(String ytdSecuS) {
        this.ytdSecuS = ytdSecuS;
    }

    public String getSecurityS() {
        return securityS;
    }

    public void setSecurityS(String securityS) {
        this.securityS = securityS;
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

    public String gethIRlzS() {
        return hIRlzS;
    }

    public void sethIRlzS(String hIRlzS) {
        this.hIRlzS = hIRlzS;
    }

    public String gethIUnrS() {
        return hIUnrS;
    }

    public void sethIUnrS(String hIUnrS) {
        this.hIUnrS = hIUnrS;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getYrsMatS() {
        return yrsMatS;
    }

    public void setYrsMatS(String yrsMatS) {
        this.yrsMatS = yrsMatS;
    }

    public String getMaturityS() {
        return maturityS;
    }

    public void setMaturityS(String maturityS) {
        this.maturityS = maturityS;
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

    public String getCpnS() {
        return cpnS;
    }

    public void setCpnS(String cpnS) {
        this.cpnS = cpnS;
    }

    public String getIssuerS() {
        return issuerS;
    }

    public void setIssuerS(String issuerS) {
        this.issuerS = issuerS;
    }

    public String getDirtyBiS() {
        return dirtyBiS;
    }

    public void setDirtyBiS(String dirtyBiS) {
        this.dirtyBiS = dirtyBiS;
    }

    public String getAmtOutS() {
        return amtOutS;
    }

    public void setAmtOutS(String amtOutS) {
        this.amtOutS = amtOutS;
    }

    public String getIgHyS() {
        return igHyS;
    }

    public void setIgHyS(String igHyS) {
        this.igHyS = igHyS;
    }

    public String getMtmXTrSUsd() {
        return mtmXTrSUsd;
    }

    public void setMtmXTrSUsd(String mtmXTrSUsd) {
        this.mtmXTrSUsd = mtmXTrSUsd;
    }

    public String getAccIntS() {
        return accIntS;
    }

    public void setAccIntS(String accIntS) {
        this.accIntS = accIntS;
    }

    public String getYtcS() {
        return ytcS;
    }

    public void setYtcS(String ytcS) {
        this.ytcS = ytcS;
    }

    public String getMidMacaS() {
        return midMacaS;
    }

    public void setMidMacaS(String midMacaS) {
        this.midMacaS = midMacaS;
    }

    public String getYldFlag() {
        return yldFlag;
    }

    public void setYldFlag(String yldFlag) {
        this.yldFlag = yldFlag;
    }

    public String getPrincipalFactorS() {
        return principalFactorS;
    }

    public void setPrincipalFactorS(String principalFactorS) {
        this.principalFactorS = principalFactorS;
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