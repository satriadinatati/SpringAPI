package com.rest.SpringAPI.repository;

import com.rest.SpringAPI.entity.Buah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuahRepository extends JpaRepository<Buah, Long> {

    @Query(value = "select fruits.* from fruits where is_deleted=false", nativeQuery = true)
    List<Buah> findAll();
}
