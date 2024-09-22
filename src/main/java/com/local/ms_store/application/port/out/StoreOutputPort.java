package com.local.ms_store.application.port.out;

import com.local.ms_store.domain.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StoreOutputPort {
    Store getStoreById(Long id);
    Page<Store>getStores(Pageable pageable);
    Store saveStore(Store store);
}
