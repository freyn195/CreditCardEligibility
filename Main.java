package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here
        AccountHolder tom = new AccountHolder();
        AccountHolder sarah = new AccountHolder();
        AccountHolder Henry = new AccountHolder();

        tom.firstName="Tom";
        tom.lastName="Smith";
        tom.age=21;
        tom.accountBalance=10000;
        tom.testEligibilityforCreditCard();
        System.out.println("Is Tom Eligible for CC : "+tom.eligibleForCreditCard);

        tom.firstName="Henry";
        tom.lastName="Smits";
        tom.age=26;
        tom.accountBalance=30000;
        tom.testEligibilityforCreditCard();
        System.out.println("Is Henry Eligible for CC : "+tom.eligibleForCreditCard);

    }
}

