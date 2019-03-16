package com.monco.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户类型 1 管理员 2 商家  3 用户
     */
    private Integer userType;

    /**
     * 地址id
     */
    private Long addressId;

    /**
     * 性别 1 男 0 女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证号
     */
    private String identityCode;

    /**
     * 电话号码
     */
    private String phoneCode;

    /**
     * 邮箱号码
     */
    private String email;

    /**
     * 微信号码
     */
    private String weChatCode;

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
     * t_user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 昵称
     * @return nick_name 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 用户类型 1 管理员 2 商家  3 管理员
     * @return user_type 用户类型 1 管理员 2 商家  3 管理员
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型 1 管理员 2 商家  3 管理员
     * @param userType 用户类型 1 管理员 2 商家  3 管理员
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 地址id
     * @return address_id 地址id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 地址id
     * @param addressId 地址id
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 性别 1 男 0 女
     * @return sex 性别 1 男 0 女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别 1 男 0 女
     * @param sex 性别 1 男 0 女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 年龄
     * @return age 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 身份证号
     * @return identity_code 身份证号
     */
    public String getIdentityCode() {
        return identityCode;
    }

    /**
     * 身份证号
     * @param identityCode 身份证号
     */
    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    /**
     * 电话号码
     * @return phone_code 电话号码
     */
    public String getPhoneCode() {
        return phoneCode;
    }

    /**
     * 电话号码
     * @param phoneCode 电话号码
     */
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode == null ? null : phoneCode.trim();
    }

    /**
     * 邮箱号码
     * @return email 邮箱号码
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱号码
     * @param email 邮箱号码
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 微信号码
     * @return we_chat_code 微信号码
     */
    public String getWeChatCode() {
        return weChatCode;
    }

    /**
     * 微信号码
     * @param weChatCode 微信号码
     */
    public void setWeChatCode(String weChatCode) {
        this.weChatCode = weChatCode == null ? null : weChatCode.trim();
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getIdentityCode() == null ? other.getIdentityCode() == null : this.getIdentityCode().equals(other.getIdentityCode()))
            && (this.getPhoneCode() == null ? other.getPhoneCode() == null : this.getPhoneCode().equals(other.getPhoneCode()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getWeChatCode() == null ? other.getWeChatCode() == null : this.getWeChatCode().equals(other.getWeChatCode()))
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
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getIdentityCode() == null) ? 0 : getIdentityCode().hashCode());
        result = prime * result + ((getPhoneCode() == null) ? 0 : getPhoneCode().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getWeChatCode() == null) ? 0 : getWeChatCode().hashCode());
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", userType=").append(userType);
        sb.append(", addressId=").append(addressId);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", identityCode=").append(identityCode);
        sb.append(", phoneCode=").append(phoneCode);
        sb.append(", email=").append(email);
        sb.append(", weChatCode=").append(weChatCode);
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