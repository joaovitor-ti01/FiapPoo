package br.com.fiapride.model;

public class Motor {
    
    // 1. Atributos Simples
    private String marca;
    private double potencia;
    
    
    // 2. ATRIBUTOS DE ASSOCIAÇÃO (Objetos Complexos)
    // Clean Code: O nome da variável indica O PAPEL que o objeto desempenha na Viagem!
    private Portao oResultante;

    // 3. CONSTRUTOR (Regra de Negócio)
    // Uma viagem SÓ PODE nascer se tiver um destino, um passageiro e um carro!
    public Motor(double potencia, String marca, Portao oResultante) {
        this.potencia = potencia;
        this.marca = marca;
        this.Oresultante = Oresultante;
        
        System.out.println("✅ Motor: Ligado");
    }