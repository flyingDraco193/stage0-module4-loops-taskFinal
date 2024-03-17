package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int height = cathetusLength * 2 - 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == cathetusLength) {
                    System.out.print(1);
                } else if (j >= cathetusLength - i + 1 && j <= cathetusLength + i - 1) {
                    if (j >= cathetusLength - i + 1 && j < cathetusLength) {
                        System.out.print(cathetusLength - j + 1);
                    } else {
                        System.out.print(j - cathetusLength + 1);
                    }
                } else if (j < cathetusLength) {
                    System.out.print(" ");
                }

                if (j == height) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
