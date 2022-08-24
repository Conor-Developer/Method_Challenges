import java.math.BigInteger;

public class FibonacciCalc {

    public static void Fibonacci() {
        BigInteger previousNum = BigInteger.valueOf(0);
        BigInteger currentNum = BigInteger.valueOf(0);
        BigInteger fibonacciSequence;

        // Iterates through 100 sequences of the Fibonacci Sequence
        for(int sequenceCount = 1; sequenceCount <= 99; sequenceCount++) {
            System.out.println(currentNum);

            // Prints the second and third values in the sequence
            if(currentNum.equals(BigInteger.valueOf(0))) {
                currentNum = currentNum.add(BigInteger.valueOf(1));
                previousNum = previousNum.add(BigInteger.valueOf(1));
                System.out.println(currentNum);
                System.out.println(previousNum);
            }

            // Updates the values as the sequence progresses
            fibonacciSequence = currentNum.add(previousNum);
            previousNum = currentNum;
            currentNum = fibonacciSequence;
        }
    }

    public static void main(String[] args) {
        Fibonacci();
    }
}
