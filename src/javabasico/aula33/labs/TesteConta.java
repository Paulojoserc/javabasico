package javabasico.aula33.labs;

public class TesteConta {
public static void main(String[] args){
        
        Conta conta = new Conta();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);
       
        
        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso"); 
           conta.consultarSaldo();
        } else {
            System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente"); 
        }
        
        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais"); 
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso"); 
           conta.consultarSaldo();
        } else {
            System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente"); 
        }
        
        System.out.println("Dep�sito de 500 reais"); 
        conta.depositar(500);
        conta.consultarSaldo();
        
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Est� usando cheque especial"); 
        } else {
            System.out.println("N�o est� usando cheque especial"); 
        }
        
        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Est� usando cheque especial"); 
        } else {
            System.out.println("N�o est� usando cheque especial"); 
        }
    }
}
