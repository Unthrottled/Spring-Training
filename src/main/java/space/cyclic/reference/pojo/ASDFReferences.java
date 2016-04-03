package space.cyclic.reference.pojo;

public class ASDFReferences {
    private String referenceOne;
    private String referenceTwo;
    private String referenceThree;

    public ASDFReferences(){}

    public ASDFReferences(String referenceOne, String referenceTwo , String referenceThree){
        this.referenceOne = referenceOne;
        this.referenceTwo = referenceTwo;
        this.referenceThree = referenceThree;
    }

    public String getReferenceOne() {
        return referenceOne;
    }

    public void setReferenceOne(String referenceOne) {
        this.referenceOne = referenceOne;
    }

    public String getReferenceTwo() {
        return referenceTwo;
    }

    public void setReferenceTwo(String referenceTwo) {
        this.referenceTwo = referenceTwo;
    }

    public String getReferenceThree() {
        return referenceThree;
    }

    public void setReferenceThree(String referenceThree) {
        this.referenceThree = referenceThree;
    }
}
