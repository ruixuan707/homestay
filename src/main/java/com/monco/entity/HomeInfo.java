package com.monco.entity;

import java.io.Serializable;
import java.util.Date;

public class HomeInfo implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 民宿名称
     */
    private String name;

    /**
     * 地址ID
     */
    private Long addressId;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 民宿类型 1 经济适用  2 豪华  
     */
    private Integer homeType;

    /**
     * 评分
     */
    private Double score;

    /**
     * 信用
     */
    private Double credit;

    /**
     * 图片
     */
    private String pic;

    /**
     * 绑定用户ID
     */
    private Long userId;

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
     * t_home_info
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
     * 民宿名称
     * @return name 民宿名称
     */
    public String getName() {
        return name;
    }

    /**
     * 民宿名称
     * @param name 民宿名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 地址ID
     * @return address_id 地址ID
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 地址ID
     * @param addressId 地址ID
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 电话号码
     * @return phone 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 电话号码
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 民宿类型 1 经济适用  2 豪华  
     * @return home_type 民宿类型 1 经济适用  2 豪华  
     */
    public Integer getHomeType() {
        return homeType;
    }

    /**
     * 民宿类型 1 经济适用  2 豪华  
     * @param homeType 民宿类型 1 经济适用  2 豪华  
     */
    public void setHomeType(Integer homeType) {
        this.homeType = homeType;
    }

    /**
     * 评分
     * @return score 评分
     */
    public Double getScore() {
        return score;
    }

    /**
     * 评分
     * @param score 评分
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 信用
     * @return credit 信用
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * 信用
     * @param credit 信用
     */
    public void setCredit(Double credit) {
        this.credit = credit;
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
     * 绑定用户ID
     * @return user_id 绑定用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 绑定用户ID
     * @param userId 绑定用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
        HomeInfo other = (HomeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getHomeType() == null ? other.getHomeType() == null : this.getHomeType().equals(other.getHomeType()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getHomeType() == null) ? 0 : getHomeType().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", addressId=").append(addressId);
        sb.append(", phone=").append(phone);
        sb.append(", homeType=").append(homeType);
        sb.append(", score=").append(score);
        sb.append(", credit=").append(credit);
        sb.append(", pic=").append(pic);
        sb.append(", userId=").append(userId);
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