package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName fx
 */
@TableName(value ="fx")
@Data
public class Fx implements Serializable {
    private Long id;

    private String security;

    private String astTyp;

    private String ccyPair;

    private String tenorBc;

    private String ccy1Net;

    private String ccy2Net;

    private String cost;

    private String mtm;

    private String avgcost;

    private String ccy101;

    private String ccy201;

    private String dTotalpl;

    private String dRealiz;

    private String dUnrealiz;

    private String isSecMaturedDeletS;

    private String pricingMethod;

    private String pxSource;

    private String bidPx;

    private String midPx;

    private String askPx;

    private String fxYtdRlz;

    private String fxYtdTotalPl;

    private String fxTotalUndiscount;

    private String ytdUrlz;

    private String ytdTotalPl14ChS;

    private String hiYtdTotalPl;

    private String hiYtdMarketPlS;

    private String hiYtdTradePlS;

    private String ccy1Npv;

    private String ccy2Npv;

    private String ccy1Del;

    private String ccy2Dl;

    private String ccy2Df;

    private String ccy1Df;

    private String ccy1Pl;

    private String ccy2Pl;

    private String trader;

    private String createTime;

    private static final long serialVersionUID = 1L;
}