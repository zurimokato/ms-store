package com.local.ms_store.application.port.in;

import com.local.ms_store.domain.model.Store;

public interface SaveStoreUseCase {
    Store saveStore(Store store);
    Store updateStore(Store store);
}
