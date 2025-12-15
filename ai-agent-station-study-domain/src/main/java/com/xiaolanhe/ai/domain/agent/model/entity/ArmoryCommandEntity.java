package com.xiaolanhe.ai.domain.agent.model.entity;

import lombok.Data;

import java.util.List;

/**
 * @author xiaolanhe
 * @description: 装配命令
 * @create 2025/12/14 10:54
 */
@Data
public class ArmoryCommandEntity {
    /**
     * 命令类型
     */
    private String commandType;

    /**
     * 命令索引（clientId、modelId、apiId...）
     */
    private List<String> commandIdList;
}
