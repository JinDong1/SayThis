package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName ndirs
 */
@TableName(value ="ndirs")
@Data
public class Ndirs implements Serializable {
    private Long id;

    private String security;

    private String cntrprtyS;

    private String fullNet;

    private String mktValCny;

    private String yestEodSwMvSCny;

    private String dPnlCny;

    private String unrealizCny;

    private String hIYtdTradePLSCny;

    private String hIYtdMarketPLSCny;

    private String ytdPnlCny;

    private String dv01SCny;

    private String payCpnS;

    private String payReceS;

    private String payNotiS;

    private String payNotS;

    private String receiveS;

    private String rcvNotS;

    private String payCcyS;

    private String rcvCcyS;

    private String rcvCpS;

    private String rcvInxS;

    private String midModS;

    private String swapTypS;

    private String payNextS;

    private String payFreqS;

    private String effDtS;

    private String maturityS;

    private String originalS;

    private String bbidS;

    private String realizCny;

    private String ytdTradeProfitAndS;

    private String ytdMarketProfitAnS;

    private String ytdTotPL;

    private String swapParCouponS;

    private String createTime;

    private static final long serialVersionUID = 1L;
}