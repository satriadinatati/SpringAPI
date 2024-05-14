package com.rest.SpringAPI.service;

import com.rest.SpringAPI.entity.Buah;

import java.util.List;
import java.util.Optional;

public interface BuahService {
    List<Buah> getAllBuah();
    List<Buah> findAll();
    Optional<Buah> findById(Long id);
    Buah saveBuah(Buah buah);
    Buah updateBuah(Buah buah);
    void deleteBuah(Long id);
}
