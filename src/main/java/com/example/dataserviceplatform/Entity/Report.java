package com.example.dataserviceplatform.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @description report
 * @author zyt
 * @date 2022-09-23
 */
@Entity
@Data
@Table(name="report")
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue
    /**
     * 编号
     */
    @Id
    @Column(name="id")
    private Integer id;

    /**
     * 项目编号
     */
    @Column(name="project_id")
    private Integer projectId;

    /**
     * 创建人编号 当前用户id
     */
    @Column(name="creator_id")
    private Integer creatorId;

    /**
     * 创建时间
     */
    @Column(name="create_time")
    private Date createTime;

    /**
     * 约定报告名称
     */
    @Column(name="agreed_report_name")
    private String agreedReportName;

    /**
     * 约定提交时间
     */
    @Column(name="agreed_submission_time")
    private Date agreedSubmissionTime;

    /**
     * 报告主笔人
     */
    @Column(name="report_writer")
    private String reportWriter;

    /**
     * 审查人
     */
    @Column(name="examiner")
    private String examiner;

    /**
     * 审定人
     */
    @Column(name="approver")
    private String approver;

    /**
     * 审核人
     */
    @Column(name="reviewer")
    private String reviewer;

    /**
     * 审核时间
     */
    @Column(name="audit_time")
    private Date auditTime;

    /**
     * 报告归档 0未归档1已归档
     */
    @Column(name="report_archiving")
    private String reportArchiving;

    /**
     * 是否删除
     */
    @Column(name="deleted")
    private String deleted;

    /**
     * 年度
     */
    @Column(name="project_year")
    private Integer projectYear;

    /**
     * 序号
     */
    @Column(name="serial_number")
    private Integer serialNumber;

    /**
     * 备注
     */
    @Column(name="remarks")
    private String remarks;

    public Report() {
    }

}
