package mesa1508;

public class Dentista {

    private String sobrenome;
    private String nome;
    private Integer matricula;
    private Integer id;

    public Dentista(String nome, String sobrenome, Integer matricula, Integer id) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
