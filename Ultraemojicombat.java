package com.mycompany.ultraemojicombat;

public class Ultraemojicombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];
        l[0] = new Lutador("Ana", "Franca", 18, 1.78f, 60f,34, 2, 3 );
        l[1] = new Lutador("Pedro", "Brasil", 18, 1.67f, 69f, 12, 3, 5);
        
        Luta UEC = new Luta(); 
        UEC.marcarLuta(l[0], l[1]);
        UEC.lutar();
        l[0].status();
        l[1].status();
    }
    
}
