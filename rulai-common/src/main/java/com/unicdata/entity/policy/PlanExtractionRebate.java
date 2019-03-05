package com.unicdata.entity.policy;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class PlanExtractionRebate {
    private Integer id;
    @ApiModelProperty(value = "计提Id")
    private Integer planExtractionId;
    @ApiModelProperty(value = "返利项目id")
    private Integer rebateProjectId;
    @ApiModelProperty(value = "返利项目名称")
    private String rebateProjectName;
    @ApiModelProperty(value = "计提年份")
    private Integer planYear;
    @ApiModelProperty(value = "计提年月 yyyyMM格式")
    private Integer planExtractionDate;
    @ApiModelProperty(value = "当月计提总额")
    private BigDecimal monthPlanMoney;
    @ApiModelProperty(value = "当年计提总额")
    private BigDecimal yearPlanMoney;
    @ApiModelProperty(value = "当年计提总额")
    private BigDecimal yearPlanAbjustMoney;
    @ApiModelProperty(value = "核对金额")
    private BigDecimal proofreaderMoney;
    @ApiModelProperty(value = "当年计提总额")
    private BigDecimal arriveBillMoney;
    @ApiModelProperty(value = "状态  0待审核，1已审核")
    private Integer status;
    @ApiModelProperty(value = "门店")
    private Integer storeId;
    @ApiModelProperty(value = "操作人")
    private Integer employeeId;
    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanYear() {
        return planYear;
    }

    public void setPlanYear(Integer planYear) {
        this.planYear = planYear;
    }

    public Integer getPlanExtractionDate() {
        return planExtractionDate;
    }

    public void setPlanExtractionDate(Integer planExtractionDate) {
        this.planExtractionDate = planExtractionDate;
    }

    public Integer getPlanExtractionId() {
        return planExtractionId;
    }

    public void setPlanExtractionId(Integer planExtractionId) {
        this.planExtractionId = planExtractionId;
    }

    public Integer getRebateProjectId() {
        return rebateProjectId;
    }

    public void setRebateProjectId(Integer rebateProjectId) {
        this.rebateProjectId = rebateProjectId;
    }

    public String getRebateProjectName() {
        return rebateProjectName;
    }

    public void setRebateProjectName(String rebateProjectName) {
        this.rebateProjectName = rebateProjectName;
    }

    public BigDecimal getMonthPlanMoney() {
        return monthPlanMoney;
    }

    public void setMonthPlanMoney(BigDecimal monthPlanMoney) {
        this.monthPlanMoney = monthPlanMoney;
    }

    public BigDecimal getYearPlanMoney() {
        return yearPlanMoney;
    }

    public void setYearPlanMoney(BigDecimal yearPlanMoney) {
        this.yearPlanMoney = yearPlanMoney;
    }

    public BigDecimal getYearPlanAbjustMoney() {
        return yearPlanAbjustMoney;
    }

    public void setYearPlanAbjustMoney(BigDecimal yearPlanAbjustMoney) {
        this.yearPlanAbjustMoney = yearPlanAbjustMoney;
    }

    public BigDecimal getProofreaderMoney() {
        return proofreaderMoney;
    }

    public void setProofreaderMoney(BigDecimal proofreaderMoney) {
        this.proofreaderMoney = proofreaderMoney;
    }

    public BigDecimal getArriveBillMoney() {
        return arriveBillMoney;
    }

    public void setArriveBillMoney(BigDecimal arriveBillMoney) {
        this.arriveBillMoney = arriveBillMoney;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}