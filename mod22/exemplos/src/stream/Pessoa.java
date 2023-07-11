package stream;


import java.util.List;
import java.util.Objects;

public class Pessoa {

    private String id;

    private String nome;

    private String nacionalidade;

    private int idade;

    public String getId() {
        return id;
    }

    public Pessoa(String id, String nome, String nacionalidade, int idade) {

        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;

    }


    public void setId(String id) {
        this.id = id;
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

    public Pessoa() {

    }

    public List populaPessoa() {

        Pessoa peossoa1 = new Pessoa("p1", "Matheus", "Brasil", 18);
        Pessoa peossoa2 = new Pessoa("p2", "Hernandez", "Brasil", 18);
        Pessoa peossoa3 = new Pessoa("p3", "Sara", "Brasil", 25);
        Pessoa peossoa4 = new Pessoa("p4", "junior", "Canada", 23);


        return List.of(peossoa1, peossoa2, peossoa3, peossoa4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
