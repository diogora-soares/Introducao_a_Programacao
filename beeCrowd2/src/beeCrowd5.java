import java.util.Scanner;

public class beeCrowd5 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        int pontosX = 0;
        int pontosY = 0;

        int pos1;
        int pos2;
        int pos3;
        try (Scanner sc = new Scanner(System.in)) {

            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            if (x > y) {
                pontosX++;
            } else {
                pontosY++;
            }

            if (x > z) {
                pontosX++;
            }

            if (y > z) {
                pontosY++;
            }

            if (pontosX == 2) {
                pos3 = x;
            } else if (pontosY == 2) {
                pos3 = y;
            } else {
                pos3 = z;
            }

            if (pontosX == 1) {
                pos2 = x;
            } else if (pontosY == 1) {
                pos2 = y;
            } else {
                pos2 = z;
            }

            if (pontosX == 0) {
                pos1 = x;
            } else if (pontosY == 0) {
                pos1 = y;
            } else {
                pos1 = z;
            }

            System.out.printf("%d%n%d%n%d%n%n%d%n%d%n%d%n", pos1, pos2, pos3, x, y, z);
        }
    }
}
