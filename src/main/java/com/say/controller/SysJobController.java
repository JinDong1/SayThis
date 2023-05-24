package com.say.controller;

import com.say.commom.core.R;
import com.say.commom.model.PageCondition;
import com.say.domain.SysJob;
import com.say.service.SysJobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 调度任务信息操作处理
 *
 * @author ruoyi
 */
@RestController
@AllArgsConstructor
@RequestMapping("/job")
public class SysJobController {


    private SysJobService jobService;
/*

    @GetMapping("/all")
    public List<String> getAllSuperScheduledName() {
        return superScheduledManager.getAllSuperScheduledName();
    }
*/

    /**
     * 查询定时任务列表
     */
    @PostMapping("/list")
    public R list(@RequestBody PageCondition<SysJob> pageCondition) {
        return R.success(jobService.list());
    }

    public static void main(String[] args) {
        System.out.println("一级分类\t    |二级分类 \t\t\t\t\t|\t评分标准\n" +
                "------------|-----------------------------------------------------------------------------\n" +
                "\t\t\t|委托机构 \t\t\t\t\t| \t大型银行及其理财子公司3分，优质金融机构 3分，其余白名单内交易对手机构 1分\n" +
                "\t\t\t|------------------------------------------------------------------------------------------\n" +
                "\t\t\t|交易机构 \t\t\t\t  \t| \t与实际交易对手一致0分，与实际交易对手不一致-0.5分\n" +
                "\t\t\t|--------------------------------------------------------------------------------\n" +
                "\t\t\t|经办交易员合作情况（近3个月）  \t|\t近3个月合作过3次以上2分，近3个月合作过1-3次1分，近3个月未合作过0分\n" +
                "\t\t    |----------------------------------------------------------------------------------------\n" +
                "\t\t\t|\t\t\t       \t\t\t|\t签署协议或有公章的委托投标书8分;\n" +
                "\t\t\t|\t\t\t\t\t\t\t|----------------------------------------------------------------\n" +
                "\t\t\t|   \t\t\t\t\t\t| 交易人员的授权书或其他能形成表见代理的充分文件材料6分；\n" +
                "\t\t    | \t\t\t\t\t\t\t|------------------------------------------------------------\n" +
                "实际对\t\t|  对方委托方式 \t\t\t\t|\t对方以公司邮箱确认交易并抄送条线业务主管5分；\n" +
                "手方评估\t\t|\t\t\t\t\t\t\t|------------------------------------------------------------\n" +
                "\t\t\t|  \t\t\t\t\t\t\t|\t对方以公司邮箱确认交易但未抄送条线业务主管3分；\n" +
                "\t\t\t|\t\t\t\t\t\t\t|------------------------------------------------------------\n" +
                "\t\t\t|\t\t\t\t\t\t\t|\t客户企业统一配备的通讯工具（企业QQ或Qtrade等）双人复核3分\n" +
                "\t\t\t|\t\t\t\t\t\t\t|------------------------------------------------------------\n" +
                "\t\t\t|\t\t\t\t\t\t\t|\t客户企业统一配备的通讯工具（企业QQ或Qtrade等）单人确认1分\n" +
                "\t\t\t|\t\t\t\t\t\t\t|------------------------------------------------------------\n" +
                "\t\t\t|\t\t\t\t\t\t\t|\t客户普通通讯工具确认且我司向对方公司邮箱发送交易信息0分\n" +
                "\t\t\t|\t\t\t\t\t\t\t|------------------------------------------------------------\n" +
                "\t\t\t|\t\t\t\t\t\t\t|\t客户普通通讯工具确认-1分\n" +
                "--------------------------------------------------------------------------------------------\n" +
                "\t\t    | 发行场所\t\t\t\t\t|银行间发行上市2分，交易所发行上市0分\n" +
                " \t\t\t|----------------------------|-------------------------------\n" +
                "\t\t\t|债项评级\t    \t\t\t| AAA 3分，AA+ 1分，AA 0分，其他0分\n" +
                "\t\t\t|---------------------------|--------------------------------------------\n" +
                "\t\t\t|债券期限\t\t\t\t\t|1年及以内2分，1-5年（含5年）1分，5年以上0分\n" +
                "债券评估\t\t|---------------------------|----------------------------------\n" +
                "\t\t\t|企业性质\t\t\t\t\t|国企2分，民企0分\n" +
                "\t\t\t|---------------------------|-------------------------------\n" +
                "\t\t\t|发行方式\t\t\t\t\t|公募2分，私募0分\n" +
                "------------|---------------------------|--------------------------------------\n" +
                "业务类型\t\t\t\t\t\t\t\t\t|利率债代缴3分，银行间信用债2分，交易所信用债1分，交易所   ABS0分\n" +
                "------------------------------------------------\n" +
                "\n" +
                "根据以上数据格式设计合理的ORCEL表结构".length());
    }
}
