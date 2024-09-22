package com.local.ms_store.infrastructure.adapter.in.rest.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GenericResponse {
    private String message;
    private String code;
    private Object data;
    private PageResponse page;

}
