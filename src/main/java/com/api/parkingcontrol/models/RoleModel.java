package com.api.parkingcontrol.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

@Entity
@Table(name = "TB_ROLE")
public class RoleModel implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = 1L;


    @Override
    public String getAuthority() {
        return null;
    }
}
