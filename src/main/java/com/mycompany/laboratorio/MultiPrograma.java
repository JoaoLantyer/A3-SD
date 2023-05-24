package com.mycompany.laboratorio;


public class MultiPrograma {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Para executar o programa: MultiPrograma <tipo> <identificador> <porta>");
            System.exit(0);
        }
        
        String tipo = args[0];
        String nome = args[1];
        String porta = args[2];
        System.out.println("Olá, eu sou o programa do tipo " + tipo + " com o identificador " + nome);
        
        if (tipo.equals("vendedor")){
            Vendedor p = new Vendedor(porta, nome);
            p.run();
        }else if(tipo.equals("gerente")){
            Gerente c = new Gerente(porta, nome);
            c.run();
        } else {
            System.out.println("Tipo não válido!");
        }
    }
}
