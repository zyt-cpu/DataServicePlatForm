package com.example.dataserviceplatform.Entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @description project
 * @author zyt
 * @date 2022-09-23
 */
@Entity
@Data
@Table(name="project")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;


    @GeneratedValue(generator = "id")
    /**
     * 编号
     */
    @Id
    @Column(name="id")
    private Integer id;

    /**
     * 合同简称
     */
    @Column(name="contract_abbreviation")
    private String contractAbbreviation;

    /**
     * 创建人编号 当前用户id
     */
    @Column(name="creator_id")
    private String creatorId;

    /**
     * 创建时间
     */
    @Column(name="create_time")
    private Date createTime;

    /**
     * 合同名称
     */
    @Column(name="contract_name")
    private String contractName;

    /**
     * 合同签订人
     */
    @Column(name="contract_signing_personnel")
    private String contractSigningPersonnel;

    /**
     * 项目负责人
     */
    @Column(name="project_leader")
    private String projectLeader;

    /**
     * 合同开始时间
     */
    @Column(name="contract_start_time")
    private Date contractStartTime;

    /**
     * 合同结束时间
     */
    @Column(name="contract_end_time")
    private Date contractEndTime;

    /**
     * 合同额
     */
    @Column(name="contract_amount")
    private BigDecimal contractAmount;

    /**
     * 研究室:0安全所、1沉环所、2治理所、3工程所、4综合所、5x
     */
    @Column(name="research_office")
    private Integer researchOffice;

    /**
     * 项目状态 0在研1结题
     */
    @Column(name="project_status")
    private int projectStatus;

    /**
     * 合同归档 0未归档1已归档2无单独合同
     */
    @Column(name="contract_archiving")
    private int contractArchiving;

    /**
     * 项目等级 0正常、1进度延期、2超低利润、4延期回款、8安全风险、16进度延期-自动
     */
    @Column(name="project_level")
    private Integer projectLevel;

    /**
     * 甲方简称
     */
    @Column(name="first_party")
    private String firstParty;

    /**
     * 年度
     */
    @Column(name="project_year")
    private Integer projectYear;

    /**
     * 投标保证金
     */
    @Column(name="bid_security")
    private BigDecimal bidSecurity;

    /**
     * 预计利润率
     */
    @Column(name="estimated_profit_margin")
    private Float estimatedProfitMargin;

    /**
     * 是否删除
     */
    @Column(name="deleted")
    private int deleted;

    /**
     * 参与人员贡献度
     */
    @Column(name="contribution_of_participants")
    private String contributionOfParticipants;

    /**
     * 备注
     */
    @Column(name="remarks")
    private String remarks;

    /**
     * 投标保证金是否退回(0未退1已退)
     */
    @Column(name="bid_security_return")
    private int bidSecurityReturn;

    /**
     * 中标服务费
     */
    @Column(name="bid_fee")
    private Float bidFee;

    /**
     * 中标服务费是否开发票
     */
    @Column(name="bid_fee_invoicing")
    private int bidFeeInvoicing;

    /**
     * 应收款=累计开票-全部回款（在收支表插入开票或回款时修改）
     */
    @Column(name="receivable")
    private Float receivable;

    /**
     * 跨年度工程类合同:0否1是
     */
    @Column(name="engineering")
    private int engineering;

    public Project() {
    }


}