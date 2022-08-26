package com.say.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName scheduled_log
 */
@TableName(value = "scheduled_log")
@Data
public class ScheduledLog implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 任务调度日志ID
     */
    @TableId(type = IdType.AUTO)
    private Integer scheduledLogId;
    /**
     * 任务名称
     */
    private String scheduledName;
    /**
     * 开始时间
     */
    private Date statrDate;
    /**
     * 结束时间
     */
    private Date endDate;
    /**
     * 异常信息
     */
    private String exception;
    /**
     * 执行耗时
     */
    private Long executionTime;
    /**
     * 是否成功
     */
    private Boolean isSuccess;

    public void computingTime() {
        this.executionTime = this.getEndDate().getTime() - this.statrDate.getTime();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScheduledLog other = (ScheduledLog) that;
        return (this.getScheduledLogId() == null ? other.getScheduledLogId() == null : this.getScheduledLogId().equals(other.getScheduledLogId()))
                && (this.getScheduledName() == null ? other.getScheduledName() == null : this.getScheduledName().equals(other.getScheduledName()))
                && (this.getStatrDate() == null ? other.getStatrDate() == null : this.getStatrDate().equals(other.getStatrDate()))
                && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
                && (this.getException() == null ? other.getException() == null : this.getException().equals(other.getException()))
                && (this.getExecutionTime() == null ? other.getExecutionTime() == null : this.getExecutionTime().equals(other.getExecutionTime()))
                && (this.getIsSuccess() == null ? other.getIsSuccess() == null : this.getIsSuccess().equals(other.getIsSuccess()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScheduledLogId() == null) ? 0 : getScheduledLogId().hashCode());
        result = prime * result + ((getScheduledName() == null) ? 0 : getScheduledName().hashCode());
        result = prime * result + ((getStatrDate() == null) ? 0 : getStatrDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getException() == null) ? 0 : getException().hashCode());
        result = prime * result + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        result = prime * result + ((getIsSuccess() == null) ? 0 : getIsSuccess().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduledLogId=").append(scheduledLogId);
        sb.append(", scheduledName=").append(scheduledName);
        sb.append(", statrDate=").append(statrDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", exception=").append(exception);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", isSuccess=").append(isSuccess);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}