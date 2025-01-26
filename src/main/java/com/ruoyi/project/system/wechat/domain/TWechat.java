package com.ruoyi.project.system.wechat.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.aspectj.lang.annotation.Excels;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.dept.domain.Dept;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel.Type;

/**
 * 部门微信对象 t_wechat
 *
 * @author fuxp3
 * @date 2025-01-19
 */
public class TWechat extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 微信号 */
    @Excel(name = "微信号")
    private String wechatNumber;

    /** 部门id */
    @Excel(name = "部门id")
    private Long departmentId;

    /** 备注 */
    @Excel(name = "备注")
    private String description;

    /** 创建人ID */
    @Excel(name = "创建人ID")
    private Long createUser;

    /** 更新人ID */
    @Excel(name = "更新人ID")
    private Long updateUser;

    /** 部门对象 */
    @Excels({
            @Excel(name = "部门名称", targetAttr = "deptName", type = Type.EXPORT),
            @Excel(name = "部门负责人", targetAttr = "leader", type = Type.EXPORT)
    })
    private Dept dept;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setWechatNumber(String wechatNumber)
    {
        this.wechatNumber = wechatNumber;
    }

    public String getWechatNumber()
    {
        return wechatNumber;
    }

    public void setDepartmentId(Long departmentId)
    {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId()
    {
        return departmentId;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setCreateUser(Long createUser)
    {
        this.createUser = createUser;
    }

    public Long getCreateUser()
    {
        return createUser;
    }

    public void setUpdateUser(Long updateUser)
    {
        this.updateUser = updateUser;
    }

    public Long getUpdateUser()
    {
        return updateUser;
    }

    public Dept getDept()
    {
        if (dept == null)
        {
            dept = new Dept();
        }
        return dept;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("wechatNumber", getWechatNumber())
                .append("departmentId", getDepartmentId())
                .append("description", getDescription())
                .append("createTime", getCreateTime())
                .append("createUser", getCreateUser())
                .append("updateTime", getUpdateTime())
                .append("updateUser", getUpdateUser())
                .toString();
    }
}

