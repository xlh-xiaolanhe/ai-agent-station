package com.xiaolanhe.ai.domain.agent.service.armory.business.data;

import com.xiaolanhe.ai.domain.agent.model.entity.ArmoryCommandEntity;
import com.xiaolanhe.ai.domain.agent.service.armory.factory.DefaultArmoryStrategyFactory;

/**
 * description: 加载数据策略
 *
 * @author xiaolanhe
 * @date 2025/12/14 11:00
 */
public interface ILoadDataStrategy {
    void loadData(ArmoryCommandEntity armoryCommandEntity, DefaultArmoryStrategyFactory.DynamicContext dynamicContext);
}
