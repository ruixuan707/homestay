package com.monco.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RoomOrder implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 订单号
     */
    private String orderCode;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 绑定用户
     */
    private Long userId;

    /**
     * 房价ID
     */
    private Long roomId;

    /**
     * 入住时间
     */
    private String stayDate;

    /**
     * 入住天数
     */
    private Integer stayDays;

    /**
     * 总花费
     */
    private BigDecimal cost;

    /**
     * 付款状态
     */
    private Integer costStatus;

    /**
     * 订单评分
     */
    private Double score;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private String createName;

    /**
     * 
     */
    private Long createId;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private String updateName;

    /**
     * 
     */
    private Long updateId;

    /**
     * 
     */
    private Long version;

    /**
     * 
     */
    private Integer dataStatus;

    /**
     * 
     */
    private Integer dataDelete;

    /**
     * 
     */
    private String remarks;

    /**
     * t_room_order
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 订单号
     * @return order_code 订单号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 订单号
     * @param orderCode 订单号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 订单状态
     * @return order_status 订单状态
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 绑定用户
     * @return user_id 绑定用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 绑定用户
     * @param userId 绑定用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 房价ID
     * @return room_id 房价ID
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 房价ID
     * @param roomId 房价ID
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 入住时间
     * @return stay_date 入住时间
     */
    public String getStayDate() {
        return stayDate;
    }

    /**
     * 入住时间
     * @param stayDate 入住时间
     */
    public void setStayDate(String stayDate) {
        this.stayDate = stayDate == null ? null : stayDate.trim();
    }

    /**
     * 入住天数
     * @return stay_days 入住天数
     */
    public Integer getStayDays() {
        return stayDays;
    }

    /**
     * 入住天数
     * @param stayDays 入住天数
     */
    public void setStayDays(Integer stayDays) {
        this.stayDays = stayDays;
    }

    /**
     * 总花费
     * @return cost 总花费
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 总花费
     * @param cost 总花费
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * 付款状态
     * @return cost_status 付款状态
     */
    public Integer getCostStatus() {
        return costStatus;
    }

    /**
     * 付款状态
     * @param costStatus 付款状态
     */
    public void setCostStatus(Integer costStatus) {
        this.costStatus = costStatus;
    }

    /**
     * 订单评分
     * @return score 订单评分
     */
    public Double getScore() {
        return score;
    }

    /**
     * 订单评分
     * @param score 订单评分
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 
     * @return create_date 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return create_name 
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 
     * @param createName 
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 
     * @return create_id 
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 
     * @param createId 
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 
     * @return update_date 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 
     * @param updateDate 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 
     * @return update_name 
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 
     * @param updateName 
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * 
     * @return update_id 
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 
     * @param updateId 
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * 
     * @return version 
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 
     * @return data_status 
     */
    public Integer getDataStatus() {
        return dataStatus;
    }

    /**
     * 
     * @param dataStatus 
     */
    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    /**
     * 
     * @return data_delete 
     */
    public Integer getDataDelete() {
        return dataDelete;
    }

    /**
     * 
     * @param dataDelete 
     */
    public void setDataDelete(Integer dataDelete) {
        this.dataDelete = dataDelete;
    }

    /**
     * 
     * @return remarks 
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks 
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     *
     * @mbg.generated 2019-03-09
     */
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
        RoomOrder other = (RoomOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getStayDate() == null ? other.getStayDate() == null : this.getStayDate().equals(other.getStayDate()))
            && (this.getStayDays() == null ? other.getStayDays() == null : this.getStayDays().equals(other.getStayDays()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getCostStatus() == null ? other.getCostStatus() == null : this.getCostStatus().equals(other.getCostStatus()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateName() == null ? other.getCreateName() == null : this.getCreateName().equals(other.getCreateName()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getUpdateName() == null ? other.getUpdateName() == null : this.getUpdateName().equals(other.getUpdateName()))
            && (this.getUpdateId() == null ? other.getUpdateId() == null : this.getUpdateId().equals(other.getUpdateId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getDataStatus() == null ? other.getDataStatus() == null : this.getDataStatus().equals(other.getDataStatus()))
            && (this.getDataDelete() == null ? other.getDataDelete() == null : this.getDataDelete().equals(other.getDataDelete()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    /**
     *
     * @mbg.generated 2019-03-09
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getStayDate() == null) ? 0 : getStayDate().hashCode());
        result = prime * result + ((getStayDays() == null) ? 0 : getStayDays().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getCostStatus() == null) ? 0 : getCostStatus().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateName() == null) ? 0 : getCreateName().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getUpdateName() == null) ? 0 : getUpdateName().hashCode());
        result = prime * result + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDataStatus() == null) ? 0 : getDataStatus().hashCode());
        result = prime * result + ((getDataDelete() == null) ? 0 : getDataDelete().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated 2019-03-09
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", userId=").append(userId);
        sb.append(", roomId=").append(roomId);
        sb.append(", stayDate=").append(stayDate);
        sb.append(", stayDays=").append(stayDays);
        sb.append(", cost=").append(cost);
        sb.append(", costStatus=").append(costStatus);
        sb.append(", score=").append(score);
        sb.append(", createDate=").append(createDate);
        sb.append(", createName=").append(createName);
        sb.append(", createId=").append(createId);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateName=").append(updateName);
        sb.append(", updateId=").append(updateId);
        sb.append(", version=").append(version);
        sb.append(", dataStatus=").append(dataStatus);
        sb.append(", dataDelete=").append(dataDelete);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}