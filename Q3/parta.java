public Round (String[] names){
  
  for(int i = 0; i < names.length; i++){
          int place = i+1;
          Competitor player = new Competitor(names[i], place);
          competitorList.add(player);

        }
  
}

