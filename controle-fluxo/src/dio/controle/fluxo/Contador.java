package dio.controle.fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int primeiroNumero, segundoNumero;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("================Programa Controle de Fluxo================");
        System.out.print("\n");
        System.out.print("Digite o Primeiro Numero: ");
        primeiroNumero = scanner.nextInt();
        System.out.print("Digite o Segundo Numero: ");
        segundoNumero = scanner.nextInt();
        System.out.print("\n");
        try {
            contarNumeros(primeiroNumero, segundoNumero);
        } catch (ParametroInvalidosException e) {
            System.out.println("O Segundo Parametro deve ser Maior que o Primeiro");
        }
    }

    static void contarNumeros(int numeroPrimeiro, int numeroSegundo) throws ParametroInvalidosException {

        if (numeroPrimeiro > numeroSegundo) {
            throw new ParametroInvalidosException();
        } else {
            int interacao = numeroSegundo - numeroPrimeiro;
            for(int indice= 0; indice < interacao; indice++) {
                System.out.println("Imprimindo o Número: " +(indice+1));
                System.out.print("\n");
            }
        }
    }
}

