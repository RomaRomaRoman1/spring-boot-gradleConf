package model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

public class RequestBean {
    public RequestBean() {
        System.out.println("Request bean created!!!");
    }
}
