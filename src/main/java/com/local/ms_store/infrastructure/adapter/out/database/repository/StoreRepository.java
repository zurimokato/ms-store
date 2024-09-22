package com.local.ms_store.infrastructure.adapter.out.database.repository;

import com.local.ms_store.infrastructure.adapter.out.database.entities.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity,Long> {
}
