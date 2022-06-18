package com.wlhinfo.portaria.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wlhinfo.portaria.entidade.Terceiros;

public interface RepositorioTerceiros extends JpaRepository<Terceiros, Long> {
    
}
