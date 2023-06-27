package com.inubit.monitoring.dto;

public class InubitQueueDTO {

    public InubitQueueDTO(String isGlobalPId, Long isWorkflowId, String isWorkflowName, String isModuleName, String isModuleType, Long isStartTime, Byte isStatus, String isFileName, Long isFileSize, String isOwner) {
        this.isGlobalPId = isGlobalPId;
        this.isWorkflowId = isWorkflowId;
        this.isWorkflowName = isWorkflowName;
        this.isModuleName = isModuleName;
        this.isModuleType = isModuleType;
        this.isStartTime = isStartTime;
        this.isStatus = isStatus;
        this.isFileName = isFileName;
        this.isFileSize = isFileSize;
        this.isOwner = isOwner;
    }

    private String isGlobalPId;
    private Long isWorkflowId;
    private String isWorkflowName;
    private String isModuleName;
    private String isTag;
    private String isModuleType;
    private Long isStartTime;
    private Long isNextStartTime;
    private Byte isStatus;
    private String isFileName;
    private Long isFileSize;
    private String isOwner;
    private Byte isPriority;
    private String isNode;
    private String isUserDefined1;
    private String isUserDefined2;
    private String isUserDefined3;
    private String isUserDefined4;
    private String isUserDefined5;

    public String getIsGlobalPId() {
        return this.isGlobalPId;
    }

    public void setIsGlobalPId(String isGlobalPId) {
        this.isGlobalPId = isGlobalPId;
    }

    public Long getIsWorkflowId() {
        return this.isWorkflowId;
    }

    public void setIsWorkflowId(Long isWorkflowId) {
        this.isWorkflowId = isWorkflowId;
    }

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

    public Long getIsStartTime() {
        return this.isStartTime;
    }

    public void setIsStartTime(Long isStartTime) {
        this.isStartTime = isStartTime;
    }

    public Long getIsNextStartTime() {
        return this.isNextStartTime;
    }

    public void setIsNextStartTime(Long isNextStartTime) {
        this.isNextStartTime = isNextStartTime;
    }

    public Byte getIsStatus() {
        return this.isStatus;
    }

    public void setIsStatus(Byte isStatus) {
        this.isStatus = isStatus;
    }

    public String getIsFileName() {
        return this.isFileName;
    }

    public void setIsFileName(String isFileName) {
        this.isFileName = isFileName;
    }

    public Long getIsFileSize() {
        return this.isFileSize;
    }

    public void setIsFileSize(Long isFileSize) {
        this.isFileSize = isFileSize;
    }

    public String getIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(String isOwner) {
        this.isOwner = isOwner;
    }

    public Byte getIsPriority() {
        return this.isPriority;
    }

    public void setIsPriority(Byte isPriority) {
        this.isPriority = isPriority;
    }

    public String getIsNode() {
        return this.isNode;
    }

    public void setIsNode(String isNode) {
        this.isNode = isNode;
    }

    public String getIsUserDefined1() {
        return this.isUserDefined1;
    }

    public void setIsUserDefined1(String isUserDefined1) {
        this.isUserDefined1 = isUserDefined1;
    }

    public String getIsUserDefined2() {
        return this.isUserDefined2;
    }

    public void setIsUserDefined2(String isUserDefined2) {
        this.isUserDefined2 = isUserDefined2;
    }

    public String getIsUserDefined3() {
        return this.isUserDefined3;
    }

    public void setIsUserDefined3(String isUserDefined3) {
        this.isUserDefined3 = isUserDefined3;
    }

    public String getIsUserDefined4() {
        return this.isUserDefined4;
    }

    public void setIsUserDefined4(String isUserDefined4) {
        this.isUserDefined4 = isUserDefined4;
    }

    public String getIsUserDefined5() {
        return this.isUserDefined5;
    }

    public void setIsUserDefined5(String isUserDefined5) {
        this.isUserDefined5 = isUserDefined5;
    }
}
