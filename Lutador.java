package com.mycompany.ultraemojicombat;

public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    public void apresentar() {
        System.out.println("Apresentamos o lutador:" + this.getNome());
        System.out.println("Diretamente de:" + this.getNacionalidade());
        System.out.println("Com:" + this.getIdade() + "anos");
        System.out.println("Pesando:" + this.getPeso());
        System.out.println("Com:" + this.getAltura() + "metros");
        System.out.println("Ganhou:" + this.getVitorias());
        System.out.println("Perdeu:" + this.getDerrotas());
        System.out.println("E com:" + this.getEmpates() + "empates");
        
    }
    
    public void status() {
        System.out.println(this.getNome());
        System.out.println("E um peso:" + this.getCategoria());
        System.out.println(this.getVitorias() + "vitorias");
        System.out.println(this.getDerrotas() + "derrotas");
        System.out.println(this.getEmpates() + "empates");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria(String categoria) {
        if (peso < 52.2) {
            this.categoria = "Invalido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Medio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
