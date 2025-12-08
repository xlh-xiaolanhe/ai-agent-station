package com.xiaolanhe.ai.test.dao;

import com.xiaolanhe.ai.infrastructure.dao.IAiClientToolMcpDao;
import com.xiaolanhe.ai.infrastructure.dao.po.AiClientToolMcp;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * @author xiaolanhe
 * @description: MCP客户端配置表 DAO 测试
 * @create 2025/11/25 9:12
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AiClientToolMcpDaoTest {
    @Resource
    private IAiClientToolMcpDao aiClientToolMcpDao;

    @Test
    public void test_insert() {
        AiClientToolMcp aiClientToolMcp = AiClientToolMcp.builder()
                .mcpId("test_5006")
                .mcpName("测试MCP工具")
                .transportType("sse")
                .transportConfig("{\"baseUri\":\"http://localhost:8080\",\"sseEndpoint\":\"/sse\"}")
                .requestTimeout(180)
                .status(1)
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        int result = aiClientToolMcpDao.insert(aiClientToolMcp);
        log.info("插入结果: {}, 生成ID: {}", result, aiClientToolMcp.getId());
    }

    @Test
    public void test_queryByMcpId() {
        AiClientToolMcp aiClientToolMcp = aiClientToolMcpDao.queryByMcpId("5001");
        log.info("根据MCP ID查询结果: {}", aiClientToolMcp);
    }
}
