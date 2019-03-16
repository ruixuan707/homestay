package com.monco.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RoomInfo implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 房间名
     */
    private String name;

    /**
     * 房间类型 1 大床  2 标间  3 三人间  4  套房 
     */
    private Integer roomType;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 图片
     */
    private String pic;

    /**
     * 房间号
     */
    private Integer roomNumber;

    /**
     * 房间大小
     */
    private Double roomSize;

    /**
     * 所属民宿
     */
    private Long homeId;

    /**
     * 容纳人数
     */
    private Integer holdSize;

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
     * t_room_info
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
     * 房间名
     * @return name 房间名
     */
    public String getName() {
        return name;
    }

    /**
     * 房间名
     * @param name 房间名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 房间类型 1 大床  2 标间  3 三人间  4  套房 
     * @return room_type 房间类型 1 大床  2 标间  3 三人间  4  套房 
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * 房间类型 1 大床  2 标间  3 三人间  4  套房 
     * @param roomType 房间类型 1 大床  2 标间  3 三人间  4  套房 
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    /**
     * 价格
     * @return price 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 价格
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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
     * 房间号
     * @return room_number 房间号
     */
    public Integer getRoomNumber() {
        return roomNumber;
    }

    /**
     * 房间号
     * @param roomNumber 房间号
     */
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * 房间大小
     * @return room_size 房间大小
     */
    public Double getRoomSize() {
        return roomSize;
    }

    /**
     * 房间大小
     * @param roomSize 房间大小
     */
    public void setRoomSize(Double roomSize) {
        this.roomSize = roomSize;
    }

    /**
     * 所属民宿
     * @return home_id 所属民宿
     */
    public Long getHomeId() {
        return homeId;
    }

    /**
     * 所属民宿
     * @param homeId 所属民宿
     */
    public void setHomeId(Long homeId) {
        this.homeId = homeId;
    }

    /**
     * 容纳人数
     * @return hold_size 容纳人数
     */
    public Integer getHoldSize() {
        return holdSize;
    }

    /**
     * 容纳人数
     * @param holdSize 容纳人数
     */
    public void setHoldSize(Integer holdSize) {
        this.holdSize = holdSize;
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
        RoomInfo other = (RoomInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRoomType() == null ? other.getRoomType() == null : this.getRoomType().equals(other.getRoomType()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getRoomNumber() == null ? other.getRoomNumber() == null : this.getRoomNumber().equals(other.getRoomNumber()))
            && (this.getRoomSize() == null ? other.getRoomSize() == null : this.getRoomSize().equals(other.getRoomSize()))
            && (this.getHomeId() == null ? other.getHomeId() == null : this.getHomeId().equals(other.getHomeId()))
            && (this.getHoldSize() == null ? other.getHoldSize() == null : this.getHoldSize().equals(other.getHoldSize()))
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
        result = prime * result + ((getRoomType() == null) ? 0 : getRoomType().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getRoomNumber() == null) ? 0 : getRoomNumber().hashCode());
        result = prime * result + ((getRoomSize() == null) ? 0 : getRoomSize().hashCode());
        result = prime * result + ((getHomeId() == null) ? 0 : getHomeId().hashCode());
        result = prime * result + ((getHoldSize() == null) ? 0 : getHoldSize().hashCode());
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
        sb.append(", roomType=").append(roomType);
        sb.append(", price=").append(price);
        sb.append(", pic=").append(pic);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", roomSize=").append(roomSize);
        sb.append(", homeId=").append(homeId);
        sb.append(", holdSize=").append(holdSize);
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