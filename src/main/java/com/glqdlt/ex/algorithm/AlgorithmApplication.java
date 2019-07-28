package com.glqdlt.ex.algorithm;

import com.glqdlt.ex.algorithm.stack.SimpleTextEditor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlgorithmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");
        String text = scanner.nextLine();
        SimpleTextEditor simpleTextEditor = new SimpleTextEditor(text);
        while (true) {
            System.out.println(String.format("입력 된 문자 : %s", simpleTextEditor.getText()));
            System.out.println("[<],[>],[i],[d],[b],[q] 키를 입력해주세요.");
            String menu = scanner.nextLine();
            if (menu.equals("q")) {
                System.out.println("종료 합니다.");
                break;
            }
            if (menu.equals("i")) {
                System.out.println("문자를 입력해주세요.");
                String t = scanner.nextLine();
                simpleTextEditor.insert(t);
            }
            if (menu.equals("<")) {
                simpleTextEditor.moveToLeft();
            }
            if (menu.equals(">")) {
                simpleTextEditor.moveToLeft();
            }
            if (menu.equals("b")) {
                simpleTextEditor.backspace();
            }
            if (menu.equals("d")) {
                simpleTextEditor.delete();
            }
        }
        scanner.close();
    }
}
