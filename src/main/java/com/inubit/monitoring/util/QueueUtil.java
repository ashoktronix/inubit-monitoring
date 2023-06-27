package com.inubit.monitoring.util;

import com.inubit.monitoring.dto.*;
import com.inubit.monitoring.vo.*;

public class QueueUtil {

    public static InubitQueueVO populateToDTO(InubitQueueDTO inubitQueue) {
        InubitQueueVO inubitQueueVO = new InubitQueueVO();
        inubitQueueVO.setIsGlobalPId(inubitQueue.getIsGlobalPId());
        inubitQueueVO.setIsWorkflowId(inubitQueue.getIsWorkflowId());
        inubitQueueVO.setIsWorkflowName(inubitQueue.getIsWorkflowName());
        inubitQueueVO.setIsModuleName(inubitQueue.getIsModuleName());
        inubitQueueVO.setIsStatus(inubitQueue.getIsStatus());
        inubitQueueVO.setIsFileName(inubitQueue.getIsFileName());
        inubitQueueVO.setIsOwner(inubitQueue.getIsOwner());
        inubitQueueVO.setIsStartTime(inubitQueue.getIsStartTime());
        return inubitQueueVO;
    }
}
