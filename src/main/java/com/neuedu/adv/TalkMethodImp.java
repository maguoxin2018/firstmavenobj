package com.neuedu.adv;
//目标类

public class TalkMethodImp implements TalkMethod {
    @Override
    public String weChat() {
        return "微信聊着呢";
    }

    @Override
    public String qqstyle() {
        return "qq没登录";
    }

    @Override
    public String msnstyle() {
        return "msn不会用";
    }
}
