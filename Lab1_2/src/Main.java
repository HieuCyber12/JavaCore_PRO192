public class Main {
    public static void main(String[] args) {
        int size = 10000;
        
        // calculate product of two sizexsize matrices using THREAD
        int[][] matrixA = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrixA[i][j] = randomInt();
            }
        }

        System.out.println("Success generate matrix A");

        int[][] matrixB = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrixB[i][j] = randomInt();
            }
        }

        System.out.println("Success generate matrix B");

        //Running time
        long startTime = System.currentTimeMillis();

        int[][] matrixResult = new int[size][size];

        // create size threads
        Thread[] threads = new Thread[size];
        for (int i = 0; i < size; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < size; j++) {
                    for (int k = 0; k < size; k++) {
                        matrixResult[finalI][j] += matrixA[finalI][k] * matrixB[k][j];
                    }
                }
            });
            threads[i].start();
        }

        // wait for all threads to finish

        for (int i = 0; i < size; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Success calculate matrix result");

        long endTime = System.currentTimeMillis();
        System.out.println("Running time: " + (endTime - startTime) + "ms");
    }
    private static int randomInt() {
        return (int) (Math.random() * 10);
    }
}