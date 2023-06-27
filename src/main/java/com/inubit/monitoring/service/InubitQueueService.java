package com.inubit.monitoring.service;


import com.inubit.monitoring.dto.*;
import com.inubit.monitoring.repository.*;
import com.inubit.monitoring.util.*;
import com.inubit.monitoring.vo.*;
import java.util.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
public class InubitQueueService {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private JDBCInubitQueueRepository jdbcInubitQueueRepository;


    @Transactional(readOnly = false)
    public List<InubitQueueVO> getAllQueueEntries() {
        Long currentTimeMillis = System.currentTimeMillis();
        List<InubitQueueVO> inubitQueueVOS = new ArrayList<>();
        try {
            List<InubitQueueDTO> queueList = jdbcInubitQueueRepository.findAll();
            queueList.stream().forEach(inubitQueue -> inubitQueueVOS.add(QueueUtil.populateToDTO(inubitQueue)));
           System.out.println("get queues >>>"+queueList.size());
        }catch (Exception ex){
            ex.printStackTrace();
            LOGGER.error(ex.getMessage());
        }
        System.out.println("Spring boot execution for fetching queue log:"+ (System.currentTimeMillis()-currentTimeMillis));
        return inubitQueueVOS;
    }

}
