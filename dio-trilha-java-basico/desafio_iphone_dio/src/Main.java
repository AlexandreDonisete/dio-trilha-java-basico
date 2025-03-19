import entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.exibirPagina("https://www.dio.me/users/ale_bezerra_donisete");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("==========");

        iphone.ligar("11987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("==========");

        iphone.selecionarMusica("Le Sserafim - Hot");
        iphone.tocar();
        iphone.pausar();
    }
}