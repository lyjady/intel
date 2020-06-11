package org.augustus.intel.modal;

/**
 * @author LinYongJin
 * @date 2020/6/11 14:14
 */
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
