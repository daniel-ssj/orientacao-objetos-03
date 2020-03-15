package exercicios;

public class Correntista {
    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;

    public Correntista() {

    }

    public Correntista(Integer codigo, String nome) {
        this(codigo, nome, "", "");
    }

    public Correntista(Integer codigo, String nome, String email) {
        this(codigo, nome, email, "");
    }

    public Correntista(Integer codigo, String nome, String email, String telefone) {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public static Correntista criarComNome(Integer codigo, String nome) {
        return new Correntista(codigo, nome);
    }

    public static Correntista criarComNomeEEmail(Integer codigo, String nome, String email) {
        return new Correntista(codigo, nome, email);
    }

    public static Correntista criarComNomeEmailETelefone(Integer codigo, String nome, String email, String telefone) {
        return new Correntista(codigo, nome, email, telefone);
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}
