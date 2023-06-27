package com.inubit.monitoring.controller;

import com.inubit.monitoring.dto.*;
import com.inubit.monitoring.repository.*;
import com.inubit.monitoring.service.*;
import com.inubit.monitoring.vo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class InubitQueueController {

    @Autowired
    InubitQueueService inubitQueueService;

    @GetMapping(value = "*")
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    public List<InubitQueueVO> getAllQueues() {
        return inubitQueueService.getAllQueueEntries();
    }
}
