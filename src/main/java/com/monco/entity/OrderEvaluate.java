package com.monco.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderEvaluate implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 评价
     */
    private String evaluate;

    /**
     * 图片
     */
    private String pic;

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
     * t_order_evaluate
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
     * 订单ID
     * @return order_id 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单ID
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 评价
     * @return evaluate 评价
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * 评价
     * @param evaluate 评价
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    /**
     * 图片
     * @return pic 图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 图片
     * @param pic 图片
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
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
        OrderEvaluate other = (OrderEvaluate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getEvaluate() == null ? other.getEvaluate() == null : this.getEvaluate().equals(other.getEvaluate()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
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
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", pic=").append(pic);
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