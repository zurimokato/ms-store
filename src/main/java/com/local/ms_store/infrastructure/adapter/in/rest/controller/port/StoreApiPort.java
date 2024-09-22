package com.local.ms_store.infrastructure.adapter.in.rest.controller.port;

import com.local.ms_store.infrastructure.adapter.in.rest.controller.request.StoreRequest;
import com.local.ms_store.infrastructure.adapter.in.rest.controller.response.GenericResponse;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public interface StoreApiPort {
    @GetMapping
    ResponseEntity<GenericResponse> getStore(Pageable pageable);

    @GetMapping("/{id}")
    ResponseEntity<GenericResponse> getStoreById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<GenericResponse> createStore(@RequestBody @Valid StoreRequest storeRequest);

    @PutMapping
    ResponseEntity<GenericResponse> updateStore(@RequestBody @Valid StoreRequest storeRequest);
}
