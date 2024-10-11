package com.local.ms_store.infrastructure.adapter.in.rest.controller.port;

import com.local.ms_store.infrastructure.adapter.in.rest.controller.request.StoreRequest;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.response.GenericResponse;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


public interface StoreApiPort {
    @GetMapping
   GenericResponse getStore(Pageable pageable);

    @GetMapping("/{id}")
    GenericResponse getStoreById(@PathVariable Long id);

    @PostMapping
    GenericResponse createStore(@RequestBody @Valid StoreRequest storeRequest);

    @PutMapping
    GenericResponse updateStore(@RequestBody @Valid StoreRequest storeRequest);
}
