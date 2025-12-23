package com.xiaolanhe.ai.domain.agent.adapter.repository;

import com.xiaolanhe.ai.domain.agent.model.valobj.AiClientAdvisorVO;
import com.xiaolanhe.ai.domain.agent.model.valobj.AiClientApiVO;
import com.xiaolanhe.ai.domain.agent.model.valobj.AiClientModelVO;
import com.xiaolanhe.ai.domain.agent.model.valobj.AiClientSystemPromptVO;
import com.xiaolanhe.ai.domain.agent.model.valobj.AiClientToolMcpVO;
import com.xiaolanhe.ai.domain.agent.model.valobj.AiClientVO;

import java.util.List;
import java.util.Map;

/**
 * description: AiAgent 仓储接口
 *
 * @author xiaolanhe
 * @date 2025/12/14 10:47
 */
public interface IAgentRepository {
    List<AiClientApiVO> queryAiClientApiVOListByClientIds(List<String> clientIdList);

    List<AiClientModelVO> queryAiClientModelVOByClientIds(List<String> clientIdList);

    List<AiClientToolMcpVO> queryAiClientToolMcpVOByClientIds(List<String> clientIdList);

    List<AiClientSystemPromptVO> queryAiClientSystemPromptVOByClientIds(List<String> clientIdList);

    Map<String, AiClientSystemPromptVO> queryAiClientSystemPromptMapByClientIds(List<String> clientIdList);

    List<AiClientAdvisorVO> queryAiClientAdvisorVOByClientIds(List<String> clientIdList);

    List<AiClientVO> queryAiClientVOByClientIds(List<String> clientIdList);

    List<AiClientApiVO> queryAiClientApiVOListByModelIds(List<String> modelIdList);

    List<AiClientModelVO> queryAiClientModelVOByModelIds(List<String> modelIdList);

}
