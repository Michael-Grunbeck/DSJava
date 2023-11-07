//Michael Grunbeck
//Project Unit 3 AT Java
//11/7/23

class DoorSystem{
    private boolean dashLeft=false;
    private boolean dashRight=false;
    private boolean insideLeft = false;
    private boolean insideRight=false;
    private boolean OutsideRight = false;
    private boolean OutsideLeft = false;
    private boolean masterUnlock=false;
    private boolean childLock = false;
//Declares and initalizes variables that are essential to the system.
//They are private because they are not to be used by the users
    enum GearState {PARK, DRIVE, GEAR1, GEAR2, GEAR3, NEUTRAL, REVERSE}
    GearState currentGear = GearState.PARK;
    private GearState gearState;
//Gear state is an enumerted type


    public void updateState(String newState){
       newState=newState.toUpperCase();
    //newState is a string that sets true false values
       if (newState.charAt(0)=='1'){
            dashLeft = true;
        } 
       else{
            dashLeft=false;
            }
       if (newState.charAt(1)=='1'){
        dashRight=true;
       }
       else{
        dashRight=false;
       }
       if (newState.charAt(2)=='1'){
        insideLeft=true;
       }
       else{
        insideLeft=false;
       }
       if (newState.charAt(3)=='1'){
        insideRight=true;
       }
       else{
        insideRight=false;
       }
       if (newState.charAt(4)=='1'){
        OutsideLeft=true;
       }
       else{
        OutsideLeft=false;
       }
       if (newState.charAt(5)=='1'){
        OutsideRight=true;
       }
       else{
        OutsideRight=false;
       }
       if (newState.charAt(6)=='1'){
        masterUnlock=true;
       }
       else{
        masterUnlock=false;
       }
       if (newState.charAt(7)=='1'){
        childLock=true;
       }
       else{
        childLock=false;
       }
       if(newState.charAt(8)=='P'){
        gearState=GearState.PARK;
       }
       else if(newState.charAt(8)=='D'){
        gearState=GearState.DRIVE;
       }
       else if((newState.charAt(8)=='1')){
        gearState=GearState.GEAR1;
       }
       else if((newState.charAt(8)=='2')){
        gearState=GearState.GEAR2;
       }
       else if((newState.charAt(8)=='3')){
        gearState=GearState.GEAR3;
       }
       else if(newState.charAt(8)=='N'){
        gearState=GearState.NEUTRAL;
       }
       else if (newState.charAt(8)=='R'){
        gearState=GearState.REVERSE;
       }
       //Each of these statements are to set the string value to different values like true or flase, in order to have the door system
    }
    public boolean IsLeftDoorOpen (){
        if (masterUnlock){
            if (gearState == GearState.PARK) {
                // check child lock and inside handle.
                if(childLock){
                    if (insideLeft){
                        return false;
                    }
                    if (dashLeft){
                        return true;
                    }
                    if (OutsideLeft){
                        return true;
                    }
                 }       
                else{
                    if (insideLeft){
                    return true;
                    }
                    if (OutsideLeft){
                    return true;
                    }
                    if (dashLeft){
                    return true;
                    } else{
                        return false;
                    }}
                }else{
                    return false;
                }
            }else{
                return false;
            }
        return OutsideLeft;
        }
        //The function IsLeftDoorOpen acts as a checker for whether the door is open or not that can be checked later
        //This uses if statements
        public boolean IsRightDoorOpen (){
        if (masterUnlock){
            if (gearState == GearState.PARK) {
                // check child lock and inside handle.
                if(childLock){
                    if (insideRight){
                        return false;
                    }
                    if (dashRight){
                        return true;
                    }
                    if (OutsideRight){
                        return true;
                    }
                 }       
                else{
                    if (insideRight){
                    return true;
                    }
                    if (OutsideRight){
                    return true;
                    }
                    if (dashRight){
                    return true;
                    } else{
                        return false;
                    }}
                }else{
                    return false;
                }
            }else{
                return false;
            }
        return OutsideRight;
        }
//Same as left door but for the right door

public static void main (String[] args) throws Exception{
    DoorSystem doorSystem = new DoorSystem();
    boolean openingFlag = false;
    //Sets a flag
    doorSystem.updateState("00001110P");
    //Adds the newState
    System.out.println("Phase 1:");
    if (doorSystem.IsLeftDoorOpen() == true ) {
        System.out.println("Left door is opening");
        openingFlag=true;
        //Checks with the function IsLeftDoorOpen to dermine whether the left door is open
        //Then the opening flag is set to true, which is for the both doors being open
    }
    
    if(doorSystem.IsRightDoorOpen()==true){
        System.out.println("Right door is opening");
        openingFlag=true;
        //Checks with the function IsRightDoorOpen and determines wether the doo is opening, and changes the state of the flag if it is
    }
    if (openingFlag==false){
        System.out.println("Both doors stay closed");
        //Checks with the flag to determine if any of the doors are opening, if not prints out the above statement
    }
doorSystem.updateState("11000001P");
    openingFlag=false;
//Same as above, with a different newState
    System.out.println("Phase 2:");
    if (doorSystem.IsLeftDoorOpen() == true ) {
        System.out.println("Left door is opening");
        openingFlag=true;
    }
    
    if(doorSystem.IsRightDoorOpen()==true){
        System.out.println("Right door is opening");
        openingFlag=true;
    }
    if (openingFlag==false){
        System.out.println("Both doors stay closed");
    }
doorSystem.updateState("11110011P");
//Same as Above
    openingFlag=false;
    System.out.println("Phase 3:");
    if (doorSystem.IsLeftDoorOpen() == true ) {
        System.out.println("Left door is opening");
        openingFlag=true;
    }
    
    if(doorSystem.IsRightDoorOpen()==true){
        System.out.println("Right door is opening");
        openingFlag=true;
    }
    if (openingFlag==false){
        System.out.println("Both doors stay closed");
    }
doorSystem.updateState("111111103");
//Same as Above
    openingFlag=false;
    System.out.println("Phase 4:");
    if (doorSystem.IsLeftDoorOpen() == true ) {
        System.out.println("Left door is opening");
        openingFlag=true;
    }
    
    if(doorSystem.IsRightDoorOpen()==true){
        System.out.println("Right door is opening");
        openingFlag=true;
    }
    if (openingFlag==false){
        System.out.println("Both doors stay closed");
    }
doorSystem.updateState("10000011P");
//Same as above
    openingFlag=false;
    System.out.println("Phase 5:");
    if (doorSystem.IsLeftDoorOpen() == true ) {
        System.out.println("Left door is opening");
        openingFlag=true;
    }
    
    if(doorSystem.IsRightDoorOpen()==true){
        System.out.println("Right door is opening");
        openingFlag=true;
    }
    if (openingFlag==false){
        System.out.println("Both doors stay closed");
    }

}
}


                

         
    
    

