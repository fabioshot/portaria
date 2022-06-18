package com.wlhinfo.portaria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wlhinfo.portaria.database.RepositorioTerceiros;
import com.wlhinfo.portaria.entidade.Terceiros;

@RestController
@RequestMapping("/terceiros")
public class TerceirosRest {
    @Autowired
    private RepositorioTerceiros repositorio;

    @GetMapping
    public List<Terceiros> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Terceiros terceiros){
       repositorio.save(terceiros);
    }

    @PutMapping
    public void alterar(@RequestBody Terceiros terceiros){
        if(terceiros.getId() > 0)
        repositorio.save(terceiros);
    }

    @DeleteMapping
    public void remover(@RequestBody Terceiros terceiros){
        repositorio.delete(terceiros);
    }

}



