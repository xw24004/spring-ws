package com.xw.spring.framework.aop.$1.proxy;

public class ForumServiceImpl implements ForumService {

    @Override
    public void reMoveTopic(int topicId) {
        System.out.println("删除topic topicId=" + topicId);
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reMoveForum(int forumId) {
        System.out.println("删除forum forumId=" + forumId);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
