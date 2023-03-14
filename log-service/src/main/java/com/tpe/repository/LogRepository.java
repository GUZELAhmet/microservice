package com.tpe.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tpe.domain.AppLog;

// !!! JpaRepository yerine MongoRepository yazdik...
public interface LogRepository extends MongoRepository<AppLog, String> {


}