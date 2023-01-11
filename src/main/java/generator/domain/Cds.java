package generator.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName cds
 */
@TableName(value ="cds")
@Data
public class Cds implements Serializable {
    private Long id;

    private String security;

    private String issuerS;

    private String fullNet;

    private String dailyPl;

    private String dRealiz;

    private String dUnreal;

    private String hiYtdRealizedS;

    private String hiYtdUnrealizedS;

    private String hiYtd;

    private String dv01S;

    private String costSpreadS;

    private String mvRt;

    private String mvT1S;

    private String sprdT;

    private String sprdT1S;

    private String seriesS;

    private String cdsBuyS;

    private String cntrprtyS;

    private String maturityS;

    private String cdsQtdS;

    private String cdsCashS;

    private String rrRate;

    private String pvCdsPremLegS;

    private String pvCdsDfltLegS;

    private String netAccIntS;

    private String daysAccS;

    private String payNextPaymentDatS;

    private String swTrdDtS;

    private String trader;

    private String createTime;

    private static final long serialVersionUID = 1L;
}