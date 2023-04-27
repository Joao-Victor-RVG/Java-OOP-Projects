import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o numero de discos da torre de hanoi a ser resolvida: ");
        Scanner input = new Scanner(System.in);
        int qtd = input.nextInt();

        moveTower(qtd, "Torre1", "Torre2", "Torre3");

        System.out.println("Terminou");

    }

    public static void moveDisk(String fromPole, String toPole){
        //System.out.println("Movendo disco de "+fromPole+" para "+toPole);
    }

    public static void moveTower(int height, String fromPole, String toPole, String withPole){
        if(height >= 1){
            moveTower(height - 1, fromPole, withPole, toPole);
            moveDisk(fromPole, toPole);
            moveTower(height - 1, withPole, toPole, fromPole);
        }

        else return;
    }
}
