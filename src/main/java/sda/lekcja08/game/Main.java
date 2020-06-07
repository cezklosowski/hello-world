package sda.lekcja08.game;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {


    static int HIGH;
    static int WIDTH;


    public static void main(String[] args) throws IOException {

        // read map from file
        char[][] mapdata = new char[100][100];
        loadMap(mapdata);


        // board generation
        Element[][] board = new Element[HIGH][WIDTH];
        Element cursor = new Element();

        // convert map to board of elements
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HIGH; j++) {
                switch(mapdata[j][i]){
                    case '*':
                        board[j][i] = new Element('*',false);
                        break;
                    case ' ':
                        board[j][i] = new Element(' ',true);
                        break;
                    case 'x':
                        cursor = new Element('x',true, j,i,false);
                        board[j][i] = cursor;
                        break;
                    case 'F':
                        board[j][i] = new Element('F',true);
                        break;
                }

            }
        }


        boolean win = false;

        while (!cursor.isWin()){

            //Runtime.getRuntime().exec("clear");


            printBoard(board);
            char move = (char) System.in.read();

            switch (move){
               case 'w':
                   checkUp(cursor,board);
                   break;
               case 's':
                   checkDown(cursor,board);
                   break;
               case 'a':
                   checkLeft(cursor,board);
                   break;
               case 'd':
                   checkRight(cursor,board);
                   break;
            }
        }
        printBoard(board);
        if(cursor.isWin()){
            System.out.println("Victory!");
        }



    }

    public static void loadMap(char[][] mapdata) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\cezkl\\IdeaProjects\\hello-world\\src\\main\\java\\sda\\lekcja08\\game\\map1.txt"));
        ArrayList<String> lines = new ArrayList<String>();
        String line = in.readLine();

        while (line != null){
            lines.add(line);
            line = in.readLine();

        }
        HIGH = lines.size();
        WIDTH = lines.get(0).length();


        // Parse the data
        for (int i = 0; i < HIGH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                mapdata[i][j] = lines.get(i).charAt(j);
            }
        }

    }

    public static void printBoard( Element[][] board){
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        for (int i = 0; i < HIGH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static void checkUp(Element cursor, Element[][] board) {
        int x = cursor.getX();
        int y = cursor.getY();
        if (y > 0 && board[y-1][x].isStatus()){
            // if finish
            if (board[y-1][x].getValue() == 'F'){
                board[y][x] = new Element(' ', true);
                board[y-1][x] = cursor;
                cursor.setValue('W');
                cursor.setWin(true);
            };
            // swipe
            board[y-1][x] = cursor;
            cursor.setY(y-1);
            board[y][x] = new Element(' ', true);

        }
    }

    private static void checkRight(Element cursor, Element[][] board) {
        int x = cursor.getX();
        int y = cursor.getY();
        if (x < WIDTH - 1 && board[y][x+1].isStatus()){
            // if finish
            if (board[y][x+1].getValue() == 'F'){
                board[y][x] = new Element(' ', true);
                board[y][x+1] = cursor;
                cursor.setValue('W');
                cursor.setWin(true);
            };
            // swipe
            board[y][x+1] = cursor;
            cursor.setX(x+1);
            board[y][x] = new Element(' ', true);

        }
    }

    private static void checkDown(Element cursor, Element[][] board) {
        int x = cursor.getX();
        int y = cursor.getY();
        if (x < HIGH - 1 && board[y+1][x].isStatus()){
            // if finish
            if (board[y+1][x].getValue() == 'F'){
                board[y][x] = new Element(' ', true);
                board[y+1][x] = cursor;
                cursor.setValue('W');
                cursor.setWin(true);
            };
            // swipe
            board[y+1][x] = cursor;
            cursor.setY(y+1);
            board[y][x] = new Element(' ', true);
        }
    }

    private static void checkLeft(Element cursor, Element[][] board) {
        int x = cursor.getX();
        int y = cursor.getY();
        if (x > 0 && board[y][x-1].isStatus()){
            // if finish
            if (board[y][x-1].getValue() == 'F'){
                board[y][x] = new Element(' ', true);
                board[y][x-1] = cursor;
                cursor.setValue('W');
                cursor.setWin(true);
            };
            // swipe
            board[y][x-1] = cursor;
            cursor.setX(x-1);
            board[y][x] = new Element(' ', true);

        }
    }


}
