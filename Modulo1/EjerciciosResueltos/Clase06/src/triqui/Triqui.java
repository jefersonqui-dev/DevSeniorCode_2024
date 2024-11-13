package triqui;

public class Triqui {
    public static void startGame() {
        // Pensar en el algoritmo antes de escribir el codigo
        // 1. Identificar el primer Jugadores X u O
        // 2. Inicializar el tablero
        // 3. Inicializar y mostrar el tablero
        // 4. Leer el movimiento del jugador
        // 5. Verificar si hizo 3 en linea
        // 6. si lo hizo, diga gano
        // 7. cambia de jugador
        // 8. volver a 3
        var sc = new Scanner(System.in);
        var isFinished = false;
        var player = 'X';
        var board = initializeBoard();

        do{
        showBoard(board);
        System.out.printf("Jugador %c ingresa tu movimiento: %n", player);
        System.out.print("Fila: (1-3)");
        var row = sc.nextInt()-1;
        System.out.print("Columna: (1-3)");
        var col = sc.nextInt()-1;

        if(makeMove(board, row, col, player)){            
            if(checkWinner(board, player)){
                showBoard(board);
                System.out.println("El jugador "+ player+" ha ganado");
                isFinished = true;
            }else{
                player = 'O';
            }
        }else{
            System.err.println("Movimiento Invalido. Intenta de nuevo");
        }
    }while(!isFinished);
        
    sc.close(); 
    }
    private static boolean checkWinner(char[][] board, char player){
        for (var row : board) {
            if(row[0] == player && row[1] == player && row[2] == player)  {
                return true;
        }
        //validar columnas
        for (int i = 0; i < board[0].length; i++) {
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
                return true;
            }
        }
        //validar diagonales
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
    }
    private static boolean makeMove(char[][] board, int row, int col, char player) {
        if(board[row][col] != ' '){
            //ya hay un valor en esta posicion
            return false;
        }
        board[row][col] = player;
        return true;
    }

    private static void showBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print('|');
                }
            }
            System.out.println();
            if (i < board[i].length - 1) {
                System.out.println("-----");
            }

        }
    }

    private static char[][] initializeBoard() {
        var board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }
}
