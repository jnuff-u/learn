package com.demon.democore.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("avalue")
public class Avalue {

    @Value("#{userConfig['user.url']}")
    public String userUrl;

    @Value("#{userConfig['user.age']}")
    public int age;

//    @Value("#{userConfig['user.name']}")
//    public String name;

    @Value("#{proper['user.name']}")
    public String name;

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
