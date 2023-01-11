package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName trad
 */
@TableName(value ="trad")
@Data
public class Trad implements Serializable {
    private Long id;

    private String security;

    private String isin;

    private String curncyS;

    private String shortSale;

    private String log;

    private String positionUsd;

    private String cumulati;

    private String wac;

    private String t1MtmS;

    private String mtm;

    private String bvalMid;

    private String exchRtS;

    private String pL;

    private String unrealiz;

    private String realized;

    private String dayrealS;

    private String ytdUnr;

    private String ytdRlz;

    private String bkCcyY;

    private String hIYtdTotalPL;

    private String dateFirS;

    private String industryS;

    private String posStra;

    private String bbCompoS;

    private String fitchIsS;

    private String mdsIsS;

    private String sPIsS;

    private String fitchS;

    private String moodySS;

    private String sPS;

    private String netMarkS;

    private String stratDe;

    private String ytdSecuS;

    private String securityS;

    private String midMacS;

    private String dv01;

    private String hIRlzS;

    private String hIUnrS;

    private String pricing;

    private String risk;

    private String yrsMatS;

    private String maturityS;

    private String isCallS;

    private String isPutS;

    private String prevCpnS;

    private String nxtCpnS;

    private String cntryOfS;

    private String cpnS;

    private String issuerS;

    private String dirtyBiS;

    private String amtOutS;

    private String igHyS;

    private String mtmXTrSUsd;

    private String accIntS;

    private String ytcS;

    private String midMacaS;

    private String yldFlag;

    private String principalFactorS;

    private String trader;

    private String createTime;

    private static final long serialVersionUID = 1L;
}