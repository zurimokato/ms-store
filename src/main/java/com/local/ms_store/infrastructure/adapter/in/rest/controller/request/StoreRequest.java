package com.local.ms_store.infrastructure.adapter.in.rest.controller.request;

import com.local.ms_store.domain.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StoreRequest {
    private Long id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String address;
    private String phone;
    @NotNull
    private Status status;
}
