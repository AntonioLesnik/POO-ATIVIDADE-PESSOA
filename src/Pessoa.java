

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

   
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void exibirDados() {
        System.out.println("\n--- Dados da Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
    }

    
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    
    public int anosPara100() {
        return Math.max(100 - idade, 0);
    }
}
