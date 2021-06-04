import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class BattleOfWarships
{
    static char[][] gameBoard = {{' ', '0', ' ', '1', ' ', '2', ' ', '3', ' ', '4'},
                                 {'0', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'1', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'3', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'4', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
    static char[][] boatBoard = {{' ', '0', ' ', '1', ' ', '2', ' ', '3', ' ', '4'},
                                 {'0', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'1', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'3', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                 {'4', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
    static int x1 = 0;
    static int x2 = 0;
    static int y1 = 0;
    static int y2 = 0;
    static int ux = 0;
    static int uy = 0;
    public static void main(String args[]) throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        printGameBoard(gameBoard);
        Random rand = new Random();
        int def = 0;
        System.out.println("Commander! Welcome to the Battle of Warships");
        System.out.println("You need to sink the entire fleet");
        System.out.println("Visuals are not available, the radar is damaged!");
        System.out.println("Good luck!");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        
        long start = System.currentTimeMillis();
        HashMap<Integer, Integer> coordinates = new HashMap<Integer, Integer>();
        for(int i = 0; i<=4; i++)
        {
            x1 = rand.nextInt(5);
            y1 = rand.nextInt(5);
            while(true)
            {
                if(coordinates.containsKey(x1))
                {
                    x1 = rand.nextInt(5);
                }else
                {
                    break;
                }
            }
            while(true)
            {
                if(coordinates.containsValue(y1))
                {
                    y1 = rand.nextInt(5);
                }else
                {
                    break;
                }
            }
            coordinates.put(x1, y1);
            if(x1>0&&y1>0)
            {
                def = rand.nextInt(4)+1;
            }else if(x1>0)
            {
                def = rand.nextInt(3) + 1;
            }else if(y1>0)
            {
                def = rand.nextInt(3) + 2;
            }else 
            {
                def = rand.nextInt(2) + 2;
            }
            switch (def)
            {
                case 1:
                x2 = x1 - 1;
                y2 = y1;
                break;
                case 2:
                x2 = x1 + 1;
                y2 = y1;
                break;
                case 3:
                x2 = x1;
                y2 = y1 + 1;
                break;
                case 4:
                x2 = x1;
                y2 = y1 - 1;
                break;
            }
            //System.out.println(x1+" "+y1+" "+x2+" "+y2);
            switch (x1)
            {
                case 0:
                switch(y1)
                {
                    case 0:
                    boatBoard[1][1] = '#';
                    break;
                    case 1:
                    boatBoard[2][1] = '#';
                    break;
                    case 2:
                    boatBoard[3][1] = '#';
                    break;
                    case 3:
                    boatBoard[4][1] = '#';
                    break;
                    case 4:
                    boatBoard[5][1] = '#';
                    break;
                }
                case 1:
                switch(y1)
                {
                    case 0:
                    boatBoard[1][3] = '#';
                    break;
                    case 1:
                    boatBoard[2][3] = '#';
                    break;
                    case 2:
                    boatBoard[3][3] = '#';
                    break;
                    case 3:
                    boatBoard[4][3] = '#';
                    break;
                    case 4:
                    boatBoard[5][3] = '#';
                    break;
                }
                case 2:
                switch(y1)
                {
                    case 0:
                    boatBoard[1][5] = '#';
                    break;
                    case 1:
                    boatBoard[2][5] = '#';
                    break;
                    case 2:
                    boatBoard[3][5] = '#';
                    break;
                    case 3:
                    boatBoard[4][5] = '#';
                    break;
                    case 4:
                    boatBoard[5][5] = '#';
                    break;
                }
                case 3:
                switch(y1)
                {
                    case 0:
                    boatBoard[1][7] = '#';
                    break;
                    case 1:
                    boatBoard[2][7] = '#';
                    break;
                    case 2:
                    boatBoard[3][7] = '#';
                    break;
                    case 3:
                    boatBoard[4][7] = '#';
                    break;
                    case 4:
                    boatBoard[5][7] = '#';
                    break;
                }
                case 4:
                switch(y1)
                {
                    case 0:
                    boatBoard[1][9] = '#';
                    break;
                    case 1:
                    boatBoard[2][9] = '#';
                    break;
                    case 2:
                    boatBoard[3][9] = '#';
                    break;
                    case 3:
                    boatBoard[4][9] = '#';
                    break;
                    case 4:
                    boatBoard[5][9] = '#';
                    break;
                }
            }
            switch (x2)
            {
                case 0:
                switch(y2)
                {
                    case 0:
                    boatBoard[1][1] = '#';
                    break;
                    case 1:
                    boatBoard[2][1] = '#';
                    break;
                    case 2:
                    boatBoard[3][1] = '#';
                    break;
                    case 3:
                    boatBoard[4][1] = '#';
                    break;
                    case 4:
                    boatBoard[5][1] = '#';
                    break;
                }
                case 1:
                switch(y2)
                {
                    case 0:
                    boatBoard[1][3] = '#';
                    break;
                    case 1:
                    boatBoard[2][3] = '#';
                    break;
                    case 2:
                    boatBoard[3][3] = '#';
                    break;
                    case 3:
                    boatBoard[4][3] = '#';
                    break;
                    case 4:
                    boatBoard[5][3] = '#';
                    break;
                }
                case 2:
                switch(y2)
                {
                    case 0:
                    boatBoard[1][5] = '#';
                    break;
                    case 1:
                    boatBoard[2][5] = '#';
                    break;
                    case 2:
                    boatBoard[3][5] = '#';
                    break;
                    case 3:
                    boatBoard[4][5] = '#';
                    break;
                    case 4:
                    boatBoard[5][5] = '#';
                    break;
                }
                case 3:
                switch(y2)
                {
                    case 0:
                    boatBoard[1][7] = '#';
                    break;
                    case 1:
                    boatBoard[2][7] = '#';
                    break;
                    case 2:
                    boatBoard[3][7] = '#';
                    break;
                    case 3:
                    boatBoard[4][7] = '#';
                    break;
                    case 4:
                    boatBoard[5][7] = '#';
                    break;
                }
                case 4:
                switch(y2)
                {
                    case 0:
                    boatBoard[1][9] = '#';
                    break;
                    case 1:
                    boatBoard[2][9] = '#';
                    break;
                    case 2:
                    boatBoard[3][9] = '#';
                    break;
                    case 3:
                    boatBoard[4][9] = '#';
                    break;
                    case 4:
                    boatBoard[5][9] = '#';
                    break;
                }
            }
        }
        //printBoatBoard(boatBoard);
        int b = 0;
        for(int i = 0; i<=5; i++)
         {
             for(int j = 0; j<=9; j++)
             {
                 if(boatBoard[i][j]=='#')
                 {
                     b++;
                 }
                }
            }
        int ammo = b+8;
        long finish, timeElapsed
        while(true)
        {
            System.out.println("Ammo left: "+ammo);
            try{
                System.out.println("Enter the x - coordinate to attack on: ");
                ux = input.nextInt();
                System.out.println("Enter the y - coordinate to attack on: ");
                uy = input.nextInt();
                ammo--;
                checkHit(ux, uy, boatBoard, gameBoard);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The co-ordinates are only from 0 - 4!");
            }
            finish = System.currentTimeMillis();
            timeElapsed = finish - start;
            if(checkWinner(boatBoard, gameBoard))
            {
                System.out.println("Congrats! You sunk the fleet");
                System.out.println("Time taken: "+timeElapsed/1000+"s");
                break;
            }
            if((timeElapsed/1000) == 120)
            {
                System.out.println("Time's up Commander! The fleet is here!");
                printBoatBoard(boatBoard);
                break;
            }
            if(ammo == 0)
            {
                System.out.println("We have run out of ammo!");
                printBoatBoard(boatBoard);
                break;
            }
            printGameBoard(gameBoard);
            System.out.println("___________________________");
        }
    }
    public static void printGameBoard(char[][] gameBoard)
    {
         for(int i = 0; i<=5; i++)
         {
             for(int j = 0; j<=9; j++)
             {
                 System.out.print(gameBoard[i][j]);
             }
             System.out.println();
         }
    }
    public static void printBoatBoard(char[][] boatBoard)
    {
         for(int i = 0; i<=5; i++)
         {
             for(int j = 0; j<=9; j++)
             {
                 System.out.print(boatBoard[i][j]);
             }
             System.out.println();
         }
    }
    public static void checkHit(int ux, int uy, char[][] boatBoard, char [][] gameBoard)
    {
        if(boatBoard[uy+1][(2*ux)+1]=='#'){
            gameBoard[uy+1][(2*ux)+1] = 'X';
            System.out.println("Bang on!");
        }
    }
    public static boolean checkWinner(char[][] boatBoard, char[][] gameBoard)
    {
        int b = 0, g = 0; 
        for(int i = 0; i<=5; i++)
         {
             for(int j = 0; j<=9; j++)
             {
                 if(boatBoard[i][j]=='#')
                 {
                     b++;
                 }
                 if(gameBoard[i][j]=='X')
                 {
                     g++;
                 }
             }
         }
        if(b==g)
        {
           return true;
        }
        else{
           return false;
        }
    }
}
        
