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
    public Integer getProjectId() {
        return projectId;
    }


    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

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
    private Integer C;

    /**
     * 备注
     */
    @Column(name="remarks")
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAgreedReportName() {
        return agreedReportName;
    }

    public void setAgreedReportName(String agreedReportName) {
        this.agreedReportName = agreedReportName;
    }

    public Date getAgreedSubmissionTime() {
        return agreedSubmissionTime;
    }

    public void setAgreedSubmissionTime(Date agreedSubmissionTime) {
        this.agreedSubmissionTime = agreedSubmissionTime;
    }

    public String getReportWriter() {
        return reportWriter;
    }

    public void setReportWriter(String reportWriter) {
        this.reportWriter = reportWriter;
    }

    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getReportArchiving() {
        return reportArchiving;
    }

    public void setReportArchiving(String reportArchiving) {
        this.reportArchiving = reportArchiving;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Integer getProjectYear() {
        return projectYear;
    }

    public void setProjectYear(Integer projectYear) {
        this.projectYear = projectYear;
    }

    public Integer getC() {
        return C;
    }

    public void setC(Integer c) {
        C = c;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Report() {
    }
}
