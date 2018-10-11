package com.demon.democore.model;


import lombok.*;

/**
 * @program:
 * @Auther: Zhang Qiang
 * @Date: 2018/9/18 20:09
 * @Description: Lombok
 */
@Data //@Data结合了@ToString，@EqualsAndHashCode， @Getter和@Setter
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode //该注解在类级别注释会同时生成equals和hashCode
@AllArgsConstructor //提供一个全参数的构造方法，默认不提供无参构造。
@NoArgsConstructor //提供一个无参构造
public class Entity {

    private Long id;

    private String title;

    private int gender;

    private int age;

    private String intro;

    private String content;

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", intro='" + intro + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
