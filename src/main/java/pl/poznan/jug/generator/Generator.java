package pl.poznan.jug.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class Generator {
    public static void main(String[] args) {
        System.out.printf("How many participants? : ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> listOfIntegers =
                IntStream.range(1, i)
                        .boxed()
                        .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(listOfIntegers);
        Iterator<Integer> winnersIterator = listOfIntegers.iterator();
        while (winnersIterator.hasNext()) {
            System.out.printf("Shuffle?");
            scan.nextLine();
            Integer winner = winnersIterator.next();
            System.out.println("Winner is " + winner);
        }

    }
}
