public boolean clearPoint(int numRow, int numCols){
        boolean check = true;
        int object = puzzle[numRow][numCols];
        for(int i = numRow ; i < game.length ; i++){
            for(int j = 0 ; j < game[0].length ; j++){
                if(check && j == numCols){
                    check = false;
                }
                if(puzzle[i][j]+ object == 10 || object == puzzle[i][j]){
                    puzzle[numRow][numCols] = 0;
                    puzzle[i][j] = 0;
                    return true;
                }
            }

        }
        return false;
            

    }
