package com.local.ms_store.infrastructure.adapter.in.rest.controller.mapper;

import com.local.ms_store.domain.model.Store;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.request.StoreRequest;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.response.PageResponse;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.response.StoreResponse;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface StoreApiMapper {

    StoreResponse toResponse(Store store);

    Store toModel(StoreRequest storeResponse);

    PageResponse toPageResponse(Page<StoreResponse> page);
}
