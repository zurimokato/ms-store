package com.local.ms_store.infrastructure.adapter.in.rest.controller;

import com.local.ms_store.application.port.in.FindStoreUseCase;
import com.local.ms_store.application.port.in.SaveStoreUseCase;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.mapper.StoreApiMapper;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.port.StoreApiPort;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.request.StoreRequest;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.response.GenericResponse;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.response.StoreResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("v1/stores")
public class StoreController  implements StoreApiPort {
    private final SaveStoreUseCase saveStoreUseCase;
    private final FindStoreUseCase findStoreUseCase;
    private final StoreApiMapper storeApiMapper;
    @Override
    public ResponseEntity<GenericResponse> getStore(Pageable pageable) {
        Page<StoreResponse>page=findStoreUseCase.findAllStores(pageable)
                .map(storeApiMapper::toResponse);
        GenericResponse genericResponse=GenericResponse.success();
        genericResponse.setData(page.getContent());
        genericResponse.setPage(storeApiMapper.toPageResponse(page));
        return ResponseEntity.ok(genericResponse);
    }

    @Override
    public ResponseEntity<GenericResponse> getStoreById(Long id) {
        StoreResponse storeResponse=storeApiMapper.toResponse(findStoreUseCase.findStoreById(id));
        GenericResponse genericResponse=GenericResponse.success();
        genericResponse.setData(storeResponse);
        return ResponseEntity.ok(genericResponse);
    }

    @Override
    public ResponseEntity<GenericResponse> createStore(StoreRequest storeRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> updateStore(StoreRequest storeRequest) {
        return null;
    }
}
