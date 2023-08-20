package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
        }

        for(int i = 0; i < numberToGoUntil; i++) {
            if(i == toBreakWith) {
                break;
            }

            System.out.println(i + 1);
        }
    }

    public static void main(String[] args) {
        printNumbersUntilWithBreakOn(6, 5);
    }
}
