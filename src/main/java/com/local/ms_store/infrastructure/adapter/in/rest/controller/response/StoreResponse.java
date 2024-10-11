package com.local.ms_store.infrastructure.adapter.in.rest.controller.response;

import com.local.ms_store.domain.enums.Status;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreResponse {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private Status status;
}
