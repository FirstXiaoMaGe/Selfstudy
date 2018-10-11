package com.ssms.domain;

import javax.persistence.*;

/**
 * @Author liuxuke
 * @Title: Permission
 * @ProjectName smms
 * @Description: //TODO
 * @date 2018/10/11 17:46
 */
@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String permission;
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
