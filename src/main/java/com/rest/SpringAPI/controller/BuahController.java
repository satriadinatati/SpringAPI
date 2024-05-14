package com.rest.SpringAPI.controller;

import com.rest.SpringAPI.entity.Buah;
import com.rest.SpringAPI.service.BuahService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/buah")
public class BuahController {

    private final BuahService buahService;


    public BuahController(BuahService buahService) {
        this.buahService = buahService;
    }

    @GetMapping
    public List<Buah> getAll() {
        return buahService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Buah> getById(@PathVariable Long id) {
        return buahService.findById(id);
    }

    @PostMapping
    public Buah save(@RequestBody Buah buah) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        buah.setCreated_at(now.format(dtf));
        buah.setUpdated_at(now.format(dtf));
        return buahService.saveBuah(buah);
    }

    @PutMapping
    public Buah update(@RequestBody Buah buah) {
        return buahService.updateBuah(buah);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        Optional<Buah> buah = buahService.findById(id);
        buah.ifPresent(b -> {
            b.setIs_deleted(true);
            buahService.saveBuah(b);
        });

        return "Berhasil dihapus";

    }
}
