package com.inubit.monitoring.dto;

public class InubitSchedulerDTO {
    private String isWorkflowName;
    private String isModuleName;
    private String isTag;
    private String isModuleType;
    private Byte isStatusActive;
    private Long isNextStartTime;
    private String isOwner;

    public String getIsWorkflowName() {
        return this.isWorkflowName;
    }

    public void setIsWorkflowName(String isWorkflowName) {
        this.isWorkflowName = isWorkflowName;
    }

    public String getIsModuleName() {
        return this.isModuleName;
    }

    public void setIsModuleName(String isModuleName) {
        this.isModuleName = isModuleName;
    }

    public String getIsTag() {
        return this.isTag;
    }

    public void setIsTag(String isTag) {
        this.isTag = isTag;
    }

    public String getIsModuleType() {
        return this.isModuleType;
    }

    public void setIsModuleType(String isModuleType) {
        this.isModuleType = isModuleType;
    }

    public Byte getIsStatusActive() {
        return this.isStatusActive;
    }

    public void setIsStatusActive(Byte isStatusActive) {
        this.isStatusActive = isStatusActive;
    }

    public Long getIsNextStartTime() {
        return this.isNextStartTime;
    }

    public void setIsNextStartTime(Long isNextStartTime) {
        this.isNextStartTime = isNextStartTime;
    }

    public String getIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(String isOwner) {
        this.isOwner = isOwner;
    }
}
