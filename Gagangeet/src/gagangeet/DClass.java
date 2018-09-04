package gagangeet;

public class DClass 
{
   private int ownerId,hashCode;
   private String ownerName;
    private double value;

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setValue(double value) {
        this.value = value;
    }
    

    public int getOwnerId() {
        return ownerId;
    }

    public int getHashCode() {
        return hashCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getValue() {
        return value;
    }
    
    
}
