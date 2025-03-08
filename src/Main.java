

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        while (!scanner.hasNextInt()) { 
            System.out.println("Por favor, digite um número válido para a idade.");
            scanner.next(); 
        }
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (ex: 1.75): ");
        while (!scanner.hasNextDouble()) { 
            System.out.println("Por favor, digite um valor válido para altura.");
            scanner.next(); 
        }
        double altura = scanner.nextDouble();

      
        Pessoa pessoa = new Pessoa(nome, idade, altura);

       
        pessoa.exibirDados();

        
        if (pessoa.isMaiorDeIdade()) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " não é maior de idade.");
        }

        
        System.out.println(pessoa.getNome() + " faltam " + pessoa.anosPara100() + " anos para atingir 100 anos.");

        
        scanner.close();
    }
}
