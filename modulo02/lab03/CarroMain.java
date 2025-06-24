public class CarroMain {
    public static void main(String[] args) {
        Proprietario p = new Proprietario("Emmett L. Brown", 98008173, 1920);
        Placa pl = new Placa("OAT-3966", 6);
        Motor m = new Motor(1, 2.85, 130);
        Carro c = new Carro("DeLorean", "DMC-12", p, pl, m);

        System.out.println(c.getDescricao());
    }
}
