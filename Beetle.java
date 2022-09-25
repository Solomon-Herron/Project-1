import java.util.ArrayList;
import java.util.HashMap;

public class Beetle extends Creature {
    int breedTimer = 8;
    int starveTimer = 5;
    public static char icon;
    static ArrayList<Beetle> beetleList = new ArrayList<Beetle>(0);


    public Beetle(){
        super();
        beetleList.add(this);
        //beetleKeys.put(this.key, this); // added in notepad++
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
            modify the array, what data could they possibly tel Seqdl you for that object?
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

}

/*
 int[] direction = new int[2];
        double minDistance = 100;
        double distance;
        int index = 0;
        ArrayList<Ant> tieList = new ArrayList<Ant>();
        int indexOfClosestAnt = 0;


        //Determine which is closest ant
        for(Ant ant : Ant.antList){
            // System.out.println("Ant #" + index + "@: [" +ant.[0] + ", " +ant.[1] +"]"  );
            distance = Math.sqrt( Math.pow((ant.[0]-this.[0]), 2) + Math.pow((ant.[1]-this.[1]), 2));
            if(distance <= minDistance ){
                indexOfClosestAnt = index;
                minDistance = distance;
            }
            index++;

        }

        //sloppy solution to determine if there are any ties
        index = 0;
        for(Ant ant : Ant.antList){
            distance = Math.sqrt( Math.pow((ant.[0]-this.[0]), 2) + Math.pow((ant.[1]-this.[1]), 2));
            if(distance == minDistance){  // remove && (ant.pos[0] > this.pos[0] && ant.pos[1] <= this.pos[1]) after core implementation
                if(index != indexOfClosestAnt){
                    tieList.add(ant);
                }
            }
            index++;
        }

        //most adjacent neighbors if tie
        int mostNeighbors = 0;

        for(Ant ant : tieList) {
            if(ant.getNumNeighbors() > mostNeighbors){
                indexOfClosestAnt = Ant.antList.indexOf(ant);
                mostNeighbors = ant.getNumNeighbors();
            }
        }


        [-,+][=,-][+,-]
        [-,=]  B  [+,=]
        [-,+][=.-][+.+]

int[] OfClosestAnt = Ant.antList.get(indexOfClosestAnt).;
    int[] directionOfClosestAnt = new int[]{OfClosestAnt[0]-this.[0], OfClosestAnt[1]-this.[1]};

        //east
        if(directionOfClosestAnt[0] > 0){
        direction[0] = this.[0] + 1;
        direction[1] = this.[1];
        }

        //west
        if(directionOfClosestAnt[0] < 0){
        direction[0] = this.[0] - 1;
        direction[1] = this.[1];
        }
        //north
        if(directionOfClosestAnt[0] == 0 && directionOfClosestAnt[1] < 0){
        direction[0] = this.[0];
        direction[1] = this.[1] -1;
        }
        //south
        if(directionOfClosestAnt[0] == 0 && directionOfClosestAnt[1] > 0){
        direction[0] = this.[0];
        direction[1] = this.[1] +1;
        }

        return direction;
 */