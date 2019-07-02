package com.company.lab4.AnimalRescue.Calculator;

public class LogicalOp {

    //1.Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    //Metoda sa verifice numarul primit,
    // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.

    public void printToHundred(int x) {
        for (int j = x; j <= 100; j++)
            System.out.println(j);
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit,
    // si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    int x = 5;

    public void printToMinusHundred(int number) {
        for (int x = number; number > (-100); number--)
            System.out.println(number);

    }




    //3.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void count() {
        int x = 6;
        int y = 15;
        for (int firstNumber = x; x <= y; x++)
            System.out.println(x);

    }

    // 4.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x)

    public void count2(int x) {
        int y = 23;
        for (int j = 4; x <= y; x++) {
            System.out.println(x);
        }


    }


    //1. Creati o metoda in clasa LogicalOp, care primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.

    public void countToHundredDowhile(int number) {
        int i = 10;
        number = i;
        do {
            System.out.println(number);
            number++;
        } while (number <= 100);
        {

        }
    }

    ///2.  Creati o metoda in clasa LogicalOp, care primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit,
    // si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.


    public void countToMinusHundred(int m) {
        do {
            System.out.println(m);
            m--;
        } while (m > (-100));
        {

        }

    }

    //3. Creati o metoda in clasa LogicalOp, care primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void ascendingCount() {

        int x = 9;
        int y = 20;
        do {
            System.out.println(x);
            x++;
        } while (x <= y);

    }

    //4.Creati o metoda in clasa LogicalOp, care primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).

    public void countBetweenTwoGivenNumbers() {
        int x = 7;
        int y = 15;
        do {
            System.out.println(x);
            x++;
        } while (x <= y);
    }

    //5 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100

    public void evenNumbersToHundredDoWhile(){
        int x = 2;

        do {
            System.out.println(x);
            x+=2;
        }while(x<=100);

    }

    //6 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100

    public void oddNumbersToHundredDoWhile(){
        int y = 1;

        do{
            System.out.println(y);
        y+=2;
    }while(y<=100);

    }

}








