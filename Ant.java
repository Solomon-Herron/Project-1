

import java.util.ArrayList;


public class Ant extends Creature {
    int breedTimer = 3;
    private int numNeighbors = 0;
    public static char icon;
    int[] neighbors  = new int[4];
    static ArrayList<Ant> antList = new ArrayList<>(0);

    //=====constructors
    public Ant(){
        super();
        antList.add(this);
        //antKeys.put(this.key, this);
    }

    @Override
    public String move(){
        String b = " ";
        /*
            The move, breed and starve functions will provide information to main to perform the operation
            o These functions do not modify the grid
            o It wouldn’t make sense for an object in an array to use the containing array as an argument to an
            object method
            o I have intentionally left the implementation of these methods up to you. If the methods do not
            modify the array, what data could they possibly tell you for that object?
            • You can add any member variables necessary for each cla
         */
        return b;
    }

    @Override
    public String breed(){
        String b = " ";
/*
            The move, breed and starve functions will provide information to main to perform the operation
            o These functions do not modify the grid
            o It wouldn’t make sense for an object in an array to use the containing array as an argument to an
            object method
            o I have intentionally left the implementation of these methods up to you. If the methods do not
            modify the array, what data could they possibly tell you for that object?
            • You can add any member variables necessary for each cla
         */
        return b;
    }


    public int getBreedTimer() {
        return breedTimer;
    }

    public void setBreedTimer(int breedTimer) {
        this.breedTimer = breedTimer;
    }

    public int getNumNeighbors() {
        return numNeighbors;
    }

    public void setNumNeighbors(int numNeighbors) {
        this.numNeighbors = numNeighbors;
    }

    public static char getIcon() {
        return icon;
    }

    public static void setIcon(char icon) {
        Ant.icon = icon;
    }

    public int[] getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(int[] neighbors) {
        this.neighbors = neighbors;
    }

    public static ArrayList<Ant> getAntList() {
        return antList;
    }

    public static void setAntList(ArrayList<Ant> antList) {
        Ant.antList = antList;
    }
}

/*
      int[] direction = this.;
        double minDistance = 100;
        double distance;
        int index = 0;
        ArrayList<Beetle> tieList = new ArrayList<Beetle>();
        int indexOfClosestBeetle = 0;
        boolean orthogonalBeetle =false;

        for(Beetle beetle : Beetle.beetleList){
            if(beetle.[0] == this.[0] || beetle.[1] == this.[1]){
                distance = Math.sqrt( Math.pow((beetle.[0]-this.[0]), 2) + Math.pow((beetle.[1]-this.[1]), 2));
                if(distance <= minDistance ){
                    indexOfClosestBeetle = index;
                    minDistance = distance;
                }
                orthogonalBeetle = true;
            }
            index++;
        }



        //sloppy solution to determine if there are any ties
        index = 0;
        for(Beetle beetle : Beetle.beetleList){
            distance = Math.sqrt( Math.pow((beetle.[0]-this.[0]), 2) + Math.pow((beetle.[1]-this.[1]), 2));
            if(distance == minDistance){
                if(index != indexOfClosestBeetle){
                    tieList.add(beetle);
                }
            }
            index++;
        }

        //TOD0: handle ties


             [=,-]
        [-,=]  a  [+,=]
             [=.-]


        //If no orthogonal beetle, ant stands still
        if(orthogonalBeetle){
        int[] OfClosestBeetle = Beetle.beetleList.get(indexOfClosestBeetle).;
        int[] directionOfClosestBeetle = new int[]{OfClosestBeetle[0]-this.[0], OfClosestBeetle[1]-this.[1]};

        //east
        if(directionOfClosestBeetle[0] > 0){
        direction[0] = this.[0] - 1;
        direction[1] = this.[1];
        }

        //west
        if(directionOfClosestBeetle[0] < 0){
        direction[0] = this.[0] + 1;
        direction[1] = this.[1];
        }
        //north
        if(directionOfClosestBeetle[0] == 0 && directionOfClosestBeetle[1] < 0){
        direction[0] = this.[0];
        direction[1] = this.[1] +1;
        }
        //south
        if(directionOfClosestBeetle[0] == 0 && directionOfClosestBeetle[1] > 0){
        direction[0] = this.[0];
        direction[1] = this.[1] -1;
        }
        }
        return direction;


 //    public static void sort() {
//        int indexOfMin = 0;
//        int minVal = antList.get(indexOfMin).[0] ;
//        int leftAlignment;
//
//        for(int x = 1; x <= antList.size() -1; x++){
//            leftAlignment = antList.get(x).[0];
//            if(leftAlignment <= minVal){
//                minVal = antList.get(x).[0];
//                swap(x, indexOfMin);
//                indexOfMin = x;
//            }
//        }
//    }
//    private static void swap( int newMin, int indexOfOldMin){
//        //nt temp = new Ant(antList.get(indexOfOldMin));
//        antList.set(indexOfOldMin, antList.get(newMin));
//        antList.set(newMin, temp);
//    }
 */