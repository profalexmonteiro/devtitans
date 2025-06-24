public class Carro {
    // Atributos públicos
    public String marca;
    public String modelo;
    public Proprietario proprietario;
    public Placa placa;
    public Motor motor;

    // Construtor com parâmetros
    public Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }

    // Método getDescricao
    public String getDescricao() {
        return "Carro " + marca + "/" + modelo + ". " +
               proprietario.getDescricao() + " " +
               placa.getDescricao() + " " +
               motor.getDescricao();
    }
}
