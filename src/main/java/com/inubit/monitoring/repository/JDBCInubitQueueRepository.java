package com.inubit.monitoring.repository;

import com.inubit.monitoring.dto.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;

@Repository
public class JDBCInubitQueueRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<InubitQueueDTO> findAll() {
        return jdbcTemplate.query(
                "select * from inubitQueue",
                (rs, rowNum) ->
                        new InubitQueueDTO(
                                rs.getString("is_globalPId"),
                                rs.getLong("is_workflowId"),
                                rs.getString("is_workflowName"),
                                rs.getString("is_moduleName"),
                                rs.getString("is_moduleType"),
                                rs.getLong("is_startTime"),
                                rs.getByte("is_status"),
                                rs.getString("is_fileName"),
                                rs.getLong("is_fileSize"),
                                rs.getString("is_owner")
                        )
        );
    }
    public int deleteById(Long id) {
        return jdbcTemplate.update(
                "delete books where id = ?",
                id);
    }

}
