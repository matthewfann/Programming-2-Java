package lectures;

public enum RewardsClub{
    GOLD(1000),
    SILVER(750),
    BRONZE(650),
    NONMEMBER(0);

    private int fee;

    
    public String toString(){
    	return this.name()+"("+this.fee+")";
    }
    
    private RewardsClub(int fee){
	     this.fee = fee;
	 }
}