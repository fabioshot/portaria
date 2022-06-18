package com.wlhinfo.portaria.entidade;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

@Entity
public class Terceiros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @NonNull
    private String nome;
    @Column
    @NonNull
    private String Telefone;
    @Column
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrada;
    @Column
    @NonNull
    private LocalTime horaEntrada;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataSaida;
    @Column
    private LocalTime horaSaida;
    @Column
    private int apartamento;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    public LocalTime getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }
    public int getApartamento() {
        return apartamento;
    }
    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }
    
            
}
