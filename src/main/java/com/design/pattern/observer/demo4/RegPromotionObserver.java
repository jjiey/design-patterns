package com.design.pattern.observer.demo4;

import com.design.pattern.observer.demo3.ClassUtil.PromotionService;
import com.google.common.eventbus.Subscribe;

/**
 * @author yangsanity
 *
 * note：Spring 环境，promotionService 为依赖注入
 */
public class RegPromotionObserver {

    private PromotionService promotionService;

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
