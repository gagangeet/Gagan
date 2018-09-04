package gagangeet;




import java.util.Date;

class Gagangeet
{
   private String timestamp;
    private String data,nodeId,referenceNodeId,genesisReferenceNodeId,HashValue;
    private int nodeNumber;
private String[] childReferenceNodeId;
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) 
    {
        if(nodeId.length()==32)
        {
            this.nodeId=nodeId;
        }
            else
        {
            System.out.println("nodeId is not 32bit");
        }
   
    }
    public String getReferenceNodeId() {
        return referenceNodeId;
    }

    public void setReferenceNodeId(String referenceNodeId) {
        this.referenceNodeId = referenceNodeId;
    }

    public String getGenesisReferenceNodeId() {
        return genesisReferenceNodeId;
    }

    public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
        this.genesisReferenceNodeId = genesisReferenceNodeId;
    }

    public String getHashValue() {
        return HashValue;
    }

    public void setHashValue(String HashValue) {
        this.HashValue = HashValue;
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(int nodeNumber) {
        this.nodeNumber = nodeNumber;
    }
    

   
   
    
}
