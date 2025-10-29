package BucleFor;

public class BucleFor{
    public static void main(String[]args){

        final int MAXIMUM_RETRY = 4;
        for (int iterationCount = 0; iterationCount <= MAXIMUM_RETRY; iterationCount++){
            System.out.println("iterationCount = " + iterationCount);
        }
    }
}