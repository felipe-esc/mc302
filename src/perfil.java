
public class perfil {

  // Dados
  private char sex;
  private String birthDate;
  private String city;
  private String state;
  private String phoneNum;
  private boolean smoker;
  private int licenseTime;

  // Construtor
  public perfil(char sexo, String dataNascimento, String cidade, String estado, String numTelefone, boolean fumante, int tempoHabilitacao) {
    this.sex = sexo;
    this.birthDate = dataNascimento;
    this.city = cidade;
    this.state = estado;
    this.phoneNum = numTelefone;
    this.smoker = fumante;
    this.licenseTime = tempoHabilitacao;
  }

  // Métodos de Inicialização/Consulta
  public void SetSex(char sexo) {
    this.sex = sexo;
  }
  public char GetSex(){
    return this.sex;
  }

  public void SetBirthDate(String dataNascimento) {
    this.birthDate = dataNascimento;
  }
  public String GetBirthDate() {
    return this.birthDate;
  }

  public void SetCity(String cidade) {
    this.city = cidade;
  }
  public String GetCity() {
    return this.city;
  }

  public void SetState(String estado){
    this.state = estado;
  }
  public String GetState(){
    return this.state;
  }

  public void SetPhoneNumber(String numTelefone) {
    this.phoneNum = numTelefone;
  }
  public String GetPhoneNumber() {
    return this.phoneNum;
  }

  public void SetSmokes(boolean fumante) {
    this.smoker = fumante;
  }
  public boolean GetSmokes() {
    return this.smoker;
  }

  public void SetLicenseTime(int tempoHabilitacao) {
    this.licenseTime = tempoHabilitacao;
  }
  public int GetLicenseTime() {
    return this.licenseTime;
  }

  @Override
  public String toString() {

    String out = "sexo: " + GetSex() + "\n";
    out = out + "Data de Nascimento: " + GetBirthDate() + "\n";
    out = out + "Cidade: " + GetCity() + "\n";
    out = out + "Estado: " + GetState() + "\n";
    out = out + "Num. Telefone: " + GetPhoneNumber() + "\n";
    out = out + "Fumante: " + GetSmokes() + "\n";
    out = out + "Tempo de habilitacao: " + GetLicenseTime() + "\n";

    return out;
  }
}
