
public class usuario {

  // Dados
  private int id;
  private String name;
  private String email;
  private String password;
  private boolean status;

  // Método Construtor
  public usuario(int id, String nome, String email, String senha) {
      this.id = id;
      this.name = nome;
      this.email = email;
      this.password = senha;
      this.status = true;
  }

  // Métodos de Inicialização/Consulta
  public void SetId(int id) {
    this.id = id;
  }
  public int GetId() {
    return this.id;
  }

  public void SetName(String nome) {
    this.name = nome;
  }
  public String GetName() {
    return this.name;
  }

  public void SetEmail(String email) {
    this.email = email;
  }
  public String GetEmail() {
    return this.email;
  }

  public void SetPassword(String senha) {
    this.password = senha;
  }
  public String GetPassword() {
    return this.password;
  }

  public void SetStatus(boolean status) {
    this.status = status;
  }
  public boolean GetStatus() {
    return this.status;
  }

  @Override
  // Método toString
  public String toString() {

    String out = GetName() + " (id: " + GetId() + ")\n";
    out = out + "email: " + GetEmail() + "\n";
    out = out + "senha: " + GetPassword() + "\n";
    out = out + "status: " + GetStatus() + "\n";

    return out;
  }

}
