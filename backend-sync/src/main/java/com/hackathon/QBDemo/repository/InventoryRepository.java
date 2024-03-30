package com.hackathon.QBDemo.repository;

import com.hackathon.QBDemo.model.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryEntity, String> {
}
