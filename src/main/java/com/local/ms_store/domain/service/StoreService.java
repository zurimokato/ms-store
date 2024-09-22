package com.local.ms_store.domain.service;

import com.local.ms_store.application.port.in.FindStoreUseCase;
import com.local.ms_store.application.port.in.SaveStoreUseCase;
import com.local.ms_store.application.port.out.StoreOutputPort;
import com.local.ms_store.domain.model.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class StoreService implements FindStoreUseCase, SaveStoreUseCase {
    private final StoreOutputPort storeOutputPort;
    @Override
    public Store findStoreById(Long id) {
        return storeOutputPort.getStoreById(id);
    }

    @Override
    public Page<Store> findAllStores(Pageable pageable) {
        return storeOutputPort.getStores(pageable);
    }

    @Override
    public Store saveStore(Store store) {
        return storeOutputPort.saveStore(store);
    }

    @Override
    public Store updateStore(Store store) {
        Store oldStore = storeOutputPort.getStoreById(store.getId());
        return storeOutputPort.saveStore(store);
    }
}
