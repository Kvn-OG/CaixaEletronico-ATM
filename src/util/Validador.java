package util;

import java.util.Scanner;
import util.Conta;

public class Validador {
    Scanner sc = new Scanner(System.in);
    Conta ct = new Conta();

    boolean running = true;

    public void initATM(){
        while (running){
            showMenu();
        }
    }

    public void showMenu(){
        System.out.println("Bem vindo ao Caixa Eletrônico!");
        System.out.println("--- MENU DE OPÇÕES ---");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");
        System.out.println("Escolha uma opção:");

        int option = getOption();

        switch (option){
            case 1 -> {
                ct.showBalance();
                continueOperation();
            }
            case 2 -> {
                ct.withdrawValue();
                continueOperation();
            }
            case 3 -> {
                ct.depositAmount();
                continueOperation();
            }
            case 4 -> {
                running = false;
                System.out.println("Encerrando programa...");
                sc.close();
            }
            default -> System.out.println("Opção inválida. Tente novamente.");
        }

    }

    public int getOption(){
        while (!sc.hasNextInt()){
            System.out.println("Digite uma das opções mostradas no menu.");
            sc.nextLine();
        }
        int option = sc.nextInt();
        sc.nextLine();

        return option;
    }

    private void continueOperation(){
        String response = "";
        System.out.println("Deseja fazer outra operação ? (s/n): ");
        response = sc.nextLine().toLowerCase();
        if (!response.equals("s")){
            running = false;
            System.out.println("Encerrando programa...");
        }
    }




}
