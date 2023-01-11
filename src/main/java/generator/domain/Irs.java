package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName irs
 */
@TableName(value ="irs")
@Data
public class Irs implements Serializable {
    private Long id;

    private String cntrprtyS;

    private String fullNet;

    private String mktVal;

    private String dv01S;

    private String receiveS;

    private String payNotiS;

    private String payReceS;

    private String rcvNotAmtS;

    private String payNotS;

    private String payCcyS;

    private String rcvCcyS;

    private String rcvCpS;

    private String rcvAiS;

    private String rcvInxS;

    private String payInxS;

    private String payAccS;

    private String paySpreS;

    private String rateAtS;

    private String netAccS;

    private String oneDAccMS;

    private String midModS;

    private String dPnl;

    private String dayRealiz;

    private String hIYtdUnrealPLS;

    private String hIYtdRealiPLS;

    private String hIYtdTotalPL;

    private String yestEodSwMvS;

    private String couponOS;

    private String payCpnS;

    private String swapTypS;

    private String payNextS;

    private String payFreqS;

    private String effDtS;

    private String maturityS;

    private String originalS;

    private String bbidS;

    private String swapParCouponS;

    private String trader;

    private String createTime;

    private static final long serialVersionUID = 1L;
}