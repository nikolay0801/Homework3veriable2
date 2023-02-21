public class Main {
    public static void main(String[] args)
    {
        int gramm250 = 250;
        int gramm500 = 500;
        byte needToThrow = 7;
        short weightInGramm = 7 *1000;
        int numberOfDaysWhenDropping250gr =  weightInGramm / gramm250;
        int numberOfDaysWhenDropping500gr = weightInGramm / gramm500;
        System.out.println("За" + numberOfDaysWhenDropping250gr + " дней спортсмен похудеет, если будет тратить в день 250 гр");
        System.out.println("За" + numberOfDaysWhenDropping500gr + " дней спортсмен похудеет, если будет тратить в день 500 гр");

        {
    }

    }
}