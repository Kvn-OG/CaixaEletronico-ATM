package util;

import java.util.Scanner;

public class Conta {
    private double actualValue = 1000.00;
    Scanner sc = new Scanner(System.in);

    public void showBalance(){
        if (actualValue <= 0){
            System.out.println("Não há saldo nesta conta.");
        } else {
            System.out.println("Saldo atual: " + actualValue);
        }
    }

    public void withdrawValue(){
        double withdrawValue = 0;
        System.out.println("Digite o valor para saque: ");
        withdrawValue = sc.nextDouble();
        if (withdrawValue > actualValue){
            System.out.println("O valor do saque não pode ser maior que o saldo atual.");
            return;
        }
        actualValue -= withdrawValue;
        System.out.printf("Valor sacado: R$%.2f%n", withdrawValue);
    }

    public void depositAmount(){
        double valorDeposito;
        System.out.println("Digite o valor a ser depositado: ");
        valorDeposito = sc.nextDouble();
        if (valorDeposito <= 0){
            System.out.println("Valor inválido. Tente novamente.");
            return;
        }
        System.out.printf("Valor depositado: R$%.2f%n", valorDeposito);
        setActualValue(actualValue + valorDeposito);
        System.out.printf("Saldo atual: R$%.2f%n", getActualValue());

    }

    public double getActualValue() {
        return actualValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }
}
