package com.rest.SpringAPI.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Buah {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buah")
    private Long id_buah;

    @Column(name = "name")
    private String name;

    @Column(name = "is_deleted")
    private boolean is_deleted = false;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;

    public Buah() {
    }

    public Buah(Long id_buah, String name, boolean is_deleted, String created_at, String updated_at) {
        this.id_buah = id_buah;
        this.name = name;
        this.is_deleted = is_deleted;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId_buah() {
        return id_buah;
    }

    public void setId_buah(Long id_buah) {
        this.id_buah = id_buah;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
