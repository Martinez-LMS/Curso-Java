package aula06;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Construtor para inicializar os atributos
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso (peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        definirCategoria();
    }

    // Método para apresentar o lutador
    public void apresentar() {
        System.out.println("Lutador: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    // Método para mostrar o status do lutador
    public void status() {
        System.out.println("Lutador: " + this.nome);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    // Métodos para alterar os atributos de lutas
    public void ganharLuta() {
        this.vitorias++;
    }

    public void perderLuta() {
        this.derrotas++;
    }

    public void empatarLuta() {
        this.empates++;
    }

    // Métodos getters e setters
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
        definirCategoria();
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

    public String getCategoria() {
        return categoria;
    }

    private void definirCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
}
