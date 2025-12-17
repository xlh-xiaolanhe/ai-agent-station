package com.xiaolanhe.ai.domain.agent.model.entity;

import com.xiaolanhe.ai.domain.agent.model.valobj.AiAgentEnumVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xiaolanhe
 * @description: 装配命令
 * @create 2025/12/14 10:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArmoryCommandEntity {
    /**
     * 命令类型 AiAgentEnumVO.getCode {@link AiAgentEnumVO}
     */
    private String commandType;

    /**
     * 命令索引（clientId、modelId、apiId...）
     */
    private List<String> commandIdList;
}
