public int walkDogs(int hour){
        int numDogs = numAvaiableDogs(hour);
        if(maxDogs > numDogs){
            updateDogs(hour, numDogs);
            return numDogs;
            
        }
        else{
            updateDogs(hour, naxDogs);
            return maxDogs;

        }
    }
