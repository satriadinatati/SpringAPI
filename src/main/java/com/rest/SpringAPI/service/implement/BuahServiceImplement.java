package com.rest.SpringAPI.service.implement;

import com.rest.SpringAPI.entity.Buah;
import com.rest.SpringAPI.repository.BuahRepository;
import com.rest.SpringAPI.service.BuahService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuahServiceImplement implements BuahService {

    private final BuahRepository buahRepository;

    public BuahServiceImplement(BuahRepository buahRepository) {
        this.buahRepository = buahRepository;
    }

    @Override
    public List<Buah> getAllBuah() {
        return buahRepository.findAll();
    }

    @Override
    public Optional<Buah> findById(Long id) {
        return buahRepository.findById(id);
    }

    @Override
    public Buah saveBuah(Buah buah) {
        return buahRepository.save(buah);
    }

    @Override
    public Buah updateBuah(Buah buah) {
        return buahRepository.save(buah);
    }

    @Override
    public void deleteBuah(Long id) {
        buahRepository.deleteById(id);
    }

    @Override
    public List<Buah> findAll(){
        return buahRepository.findAll();
    }
}
