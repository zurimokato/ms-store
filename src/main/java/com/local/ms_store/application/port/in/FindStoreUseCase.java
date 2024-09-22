package com.local.ms_store.application.port.in;

import com.local.ms_store.domain.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindStoreUseCase {
    Store findStoreById(Long id);
    Page<Store>findAllStores(Pageable pageable);
}
