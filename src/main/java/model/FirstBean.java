package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class FirstBean {
    private Prototype prototype;
    private Singleton singleton;

    public FirstBean(Prototype prototype, Singleton singleton) {
        this.prototype = prototype;
        this.singleton = singleton;
        System.out.println("first bean created" + prototype.toString());
        System.out.println("first bean created" + singleton.toString());
    }
}
