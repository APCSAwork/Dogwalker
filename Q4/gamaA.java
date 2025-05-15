public SumOrSameGame(int numRow, int numCols){
        int[][] game = new int[numRow][numCols];
        for(int i = 0 ; i < game.length ; i++){
            for(int j = 0 ; j < game[0].length ; j++){
                game[i][j] = (int)(Math.random()* 9)+1;
                
            }

        }

    }
