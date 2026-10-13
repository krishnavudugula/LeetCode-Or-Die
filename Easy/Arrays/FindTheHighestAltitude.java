//1732. Find the Highest Altitude
public class FindTheHighestAltitude {
    public int findHighestAltitude(int[] gain){
        int altitude = 0;
        int highest = 0;

        for(int change : gain){
            altitude += change;
            highest = Math.max(altitude, highest);
        }
        return highest;
    }   
}
