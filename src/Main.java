public class Main {
    public static void main(String[] args){

        // Harmonic Mean Formula : n (numbers of elements) / harmonic series of the elements

        int[] positiveNumbers = {1,2,3,4,5,6,7,8,9};

        double result = 0;

        for (int positiveNumber : positiveNumbers) {

            result = result + (1 / (double) positiveNumber);

        }

        double harmonicMean = (positiveNumbers.length / result);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Harmonic Series of Positive Numbers : " + result);
        System.out.println("Harmonic Mean of Positive Numbers   : " + harmonicMean);
        System.out.println("---------------------------------------------------------------------------");





    }
}
