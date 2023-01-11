package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName trs
 */
@TableName(value ="trs")
@Data
public class Trs implements Serializable {
    private Long id;

    private String security;

    private String fullNet;

    private String bbIdS;

    private String secTypeS;

    private String posStratTag1;

    private String dv01;

    private String midModDurS;

    private String mtmXTradeDateNetS;

    private String markToMktPx;

    private String securityIncomeS;

    private String hIYtdTradePLS;

    private String hIYtdMarketPLS;

    private String hIYtdTotalPL;

    private String realiz;

    private String unrealiz;

    private String total;

    private String isin;

    private String curncyS;

    private String cumulativeAverageC;

    private String yestMtmPxS;

    private String bidPx;

    private String exchRtS;

    private String dateFirstAcquiredS;

    private String ytdSecurityIncomeS;

    private String pricingMethod;

    private String cntrprtyS;

    private String payFloatingRateInS;

    private String paySpreadS;

    private String payAccIntS;

    private String accIntPdS;

    private String createTime;

    private static final long serialVersionUID = 1L;
}