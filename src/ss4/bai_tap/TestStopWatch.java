package ss4.bai_tap;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(i + ",");
            }
        }

        System.out.println("\n" + stopWatch.stop());
        // từ giây * 10000==> miliSecon
        System.out.println(stopWatch.getElapsedTime());
    }
}
