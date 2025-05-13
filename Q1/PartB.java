public int dogWalkShift(int startHour, int end){
        int total = 0;
        for(int hour = startHour; hour <= endHour; hour++){
            int dogs = walkDogs(hour);
            total += dogs*5;
            if(dogs == maxDogs || (hour >= 9 && hour <= 17)){
                total +=3;
            }
        }
        return total;
    }
