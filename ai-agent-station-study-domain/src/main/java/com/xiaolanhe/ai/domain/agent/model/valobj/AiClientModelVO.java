package com.xiaolanhe.ai.domain.agent.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaolanhe
 * @description: 聊天模型配置，值对象
 * @create 2025/12/14 11:37
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AiClientModelVO {
    /**
     * 全局唯一模型ID
     */
    private String modelId;

    /**
     * 关联的API配置ID
     */
    private String apiId;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 模型类型：openai、deepseek、claude
     */
    private String modelType;
}
