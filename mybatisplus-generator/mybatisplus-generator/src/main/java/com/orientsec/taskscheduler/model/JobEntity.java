package com.orientsec.taskscheduler.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 任务配置表
 * </p>
 *
 * @author orientsec
 * @since 2020-07-31
 */
public class JobEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * job名称
     */
    private String name;

    /**
     * job组名
     */
    private String jobGroup;

    /**
     * 执行的cron
     */
    private String cron;

    /**
     * job的参数
     */
    private String parameter;

    /**
     * job描述信息
     */
    private String description;

    /**
     * vm参数
     */
    private String vmParam;

    /**
     * job的jar路径
     */
    private String jarPath;

    /**
     * job的执行状态：OPEN/CLOSE
     */
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getVmParam() {
        return vmParam;
    }

    public void setVmParam(String vmParam) {
        this.vmParam = vmParam;
    }
    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "JobEntity{" +
        "id=" + id +
        ", name=" + name +
        ", jobGroup=" + jobGroup +
        ", cron=" + cron +
        ", parameter=" + parameter +
        ", description=" + description +
        ", vmParam=" + vmParam +
        ", jarPath=" + jarPath +
        ", status=" + status +
        "}";
    }
}
