public ArrayList<Match> buildMatches(){
        ArrayList<Match> battles = new ArrayList<Match>();
        
        int howbig = competitorList.size();
        if(howbig%2 == 0 ){
            for(int i = 0; i < howbig/2 ; i++){
                Match game = new Match(competitorList.get(i),competitorList.get(howbig -1 - i));
                battles.add(game);
                return battles;
            }

        } 
        else{
            for(int i = 1; i < howbig/2 ; i++){
                Match gameodd = new Match(competitorList.get(i),competitorList.get(howbig -1 - i));
                battles.add(gameodd);
                battles;
            }
        }
        
    }
