package com.local.ms_store.domain.model;

import com.local.ms_store.domain.enums.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Store {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private Status status;
}
