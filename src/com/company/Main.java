package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // String типті стак динамикалық массивын қүрамыз
        Stack<String> stak = new Stack<>();
        // Stirng типті динамикалық массив
        ArrayList<String> list = new ArrayList<>();
        // ішінде ақпарат бар файл
        File file = new File("name.txt");
        // Scanner класы арқылы оқимыз
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            // Ақпаратты Стекке жазып отырамыз
            stak.push(scan.next());
        }
        while (true) {
            // Егер out болса онда бул есімді жазу қажет емес
            if (stak.peek().equals("out")) {
                stak.pop();
                stak.pop();

            }
            // Баскаша болса онда жазу керек
            else {
                stak.pop();
                // Оны динамикалық массивке жазамыз
                list.add(stak.peek());
                stak.pop();
            }
            // егер стак өлшемі бітсе циклдан шығамыз
            if (stak.size() == 0) break;
        }
        // Динамикалық массивке қандай ақпарат жазылды экранга шыгарамыз
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}