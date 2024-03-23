/*
public class Robo {

    String nome;
    String cor;
    float velocidadeMaxima;
    int nivelAtualDeBateria;
    String tipoTracao;
    float pesoCargaMaxima;
    boolean temAntena;

    public void printStatus() {
        System.out.println("----------------------");

        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Nivel atual de bateria: " + nivelAtualDeBateria);
        System.out.println("Tipo de tração" + tipoTracao);
        System.out.println("Carga máxima: " + pesoCargaMaxima);
        System.out.println("Possui antena? " + temAntena);

        System.out.println("-----------------------");
    }

    public static void main(String[] args) {

        Robo obj1 = new Robo();
        obj1.nome = "Robo Fofinho";
        obj1.cor = "Roxo";
        obj1.velocidadeMaxima = 45;
        obj1.nivelAtualDeBateria = 73;
        obj1.tipoTracao = "Esteira";
        obj1.pesoCargaMaxima = 300;
        obj1.temAntena = true;

        Robo obj2 = new Robo();
        obj2.nome = "Ron";
        obj2.cor = "Branco";
        obj2.velocidadeMaxima = 50;
        obj2.nivelAtualDeBateria = 13;
        obj2.tipoTracao = "Flutuante";
        obj2.pesoCargaMaxima = 30;
        obj2.temAntena = false;
    }
