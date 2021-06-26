package com.design.pattern.observer.demo5.test;

import com.design.pattern.observer.demo5.Subscribe;

/**
 * @author y
 */
public class EventPListener {

    @Subscribe
    public void dealWithEvent(Message event) {
        // TODO: 收到EventTest消息之后，做相应的处理
        System.out.println("EventPListener ---> 命令内容为：" + event.getContent());
    }
}
