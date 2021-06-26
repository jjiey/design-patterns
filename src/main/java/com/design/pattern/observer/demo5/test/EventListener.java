package com.design.pattern.observer.demo5.test;

import com.design.pattern.observer.demo5.Subscribe;

/**
 * @author y
 */
public class EventListener extends EventPListener {

    @Subscribe
    public void dealWithEvent2(Message event) {
        // TODO: 收到EventTest消息之后，做相应的处理
        System.out.println("我收到了您的命令，命令内容为：" + event.getContent());
    }
}
