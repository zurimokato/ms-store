package com.local.ms_store.infrastructure.adapter.out.database;

import com.local.ms_store.application.port.out.StoreOutputPort;
import com.local.ms_store.domain.model.Store;
import com.local.ms_store.infrastructure.adapter.out.database.mapper.StorePersistenceMapper;
import com.local.ms_store.infrastructure.adapter.out.database.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class StorePersistenceAdapter implements StoreOutputPort {
    private final StoreRepository storeRepository;
    private final StorePersistenceMapper storePersistenceMapper;

    @Override
    public Store getStoreById(Long id) {
        return storePersistenceMapper.toModel(
                storeRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Store not found")));
    }

    @Override
    public Page<Store> getStores(Pageable pageable) {
        return storeRepository.findAll(pageable).map(storePersistenceMapper::toModel);
    }

    @Override
    public Store saveStore(Store store) {
        return storePersistenceMapper.toModel(
                storeRepository.save(storePersistenceMapper.toEntity(store))
        );
    }
}
