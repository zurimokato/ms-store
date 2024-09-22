package com.local.ms_store.infrastructure.adapter.out.database.mapper;

import com.local.ms_store.domain.model.Store;
import com.local.ms_store.infrastructure.adapter.out.database.entities.StoreEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StorePersistenceMapper {
    Store toModel(StoreEntity source);
    StoreEntity toEntity(Store source);
}
