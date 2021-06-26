package com.design.pattern.observer.demo3;

import com.design.pattern.observer.demo3.ClassUtil.PromotionService;

/**
 * @author yangsanity
 *
 * note：Spring 环境，promotionService 为依赖注入
 */
public class RegPromotionObserver implements RegObserver {

    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        // 发放投资体验金
        promotionService.issueNewUserExperienceCash(userId);
    }
}
