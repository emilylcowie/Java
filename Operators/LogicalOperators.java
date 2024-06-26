package Beginner.Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30; // && is AND
        System.out.println(isWarm); //false

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || is OR, ! is NOT
        System.out.println(isEligible); // true
    }
}
