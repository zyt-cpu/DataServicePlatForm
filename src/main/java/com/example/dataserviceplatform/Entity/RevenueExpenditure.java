package com.example.dataserviceplatform.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @description revenue_expenditure
 * @author zyt
 * @date 2022-09-23
 */
@Entity
@Data
@Table(name="revenue_expenditure")
public class RevenueExpenditure implements Serializable {

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
    private String creatorId;

    /**
     * 创建时间
     */
    @Column(name="create_time")
    private Date createTime;

    /**
     * 年度
     */
    @Column(name="project_year")
    private Integer projectYear;

    /**
     * 产生日期
     */
    @Column(name="generation_date")
    private Date generationDate;

    /**
     * 金额
     */
    @Column(name="amount")
    private Float amount;

    /**
     * 描述
     */
    @Column(name="column_describe")
    private String columnDescribe;

    /**
     * 栏目类型 1年度开票2年度回款3差旅、招待4劳务派遣工资5劳务及专家费6外委材料已开票7外委设备已开票8外委服务已开票9其它支出10预付11分摊12未结算成本13已付款14固定资产15安环综合支出
     */
    @Column(name="column_type")
    private Integer columnType;

    /**
     * 是否删除
     */
    @Column(name="deleted")
    private String deleted;

    /**
     * 备注
     */
    @Column(name="remarks")
    private String remarks;

    public RevenueExpenditure() {
    }

    public RevenueExpenditure(Integer id, Integer projectId, String creatorId, Date createTime, Integer projectYear, Date generationDate, Float amount, String columnDescribe, Integer columnType, String deleted, String remarks) {
        this.id = id;
        this.projectId = projectId;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.projectYear = projectYear;
        this.generationDate = generationDate;
        this.amount = amount;
        this.columnDescribe = columnDescribe;
        this.columnType = columnType;
        this.deleted = deleted;
        this.remarks = remarks;
    }

    public Integer getId() {
        return id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getProjectYear() {
        return projectYear;
    }

    public Date getGenerationDate() {
        return generationDate;
    }

    public Float getAmount() {
        return amount;
    }

    public String getColumnDescribe() {
        return columnDescribe;
    }

    public Integer getColumnType() {
        return columnType;
    }

    public String getDeleted() {
        return deleted;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setProjectYear(Integer projectYear) {
        this.projectYear = projectYear;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setColumnDescribe(String columnDescribe) {
        this.columnDescribe = columnDescribe;
    }

    public void setColumnType(Integer columnType) {
        this.columnType = columnType;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "RevenueExpenditure{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", creatorId='" + creatorId + '\'' +
                ", createTime=" + createTime +
                ", projectYear=" + projectYear +
                ", generationDate=" + generationDate +
                ", amount=" + amount +
                ", columnDescribe='" + columnDescribe + '\'' +
                ", columnType=" + columnType +
                ", deleted='" + deleted + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}