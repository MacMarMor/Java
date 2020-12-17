class ExhaustPart extends  Part{
    private boolean europejskaNorma;

    ExhaustPart(){

    }

    ExhaustPart(String idNumber, String producerName, String modelName, String productNumber, boolean europejskaNorma){
        setIdNumber(idNumber);
        setProducerName(producerName);
        setModelName(modelName);
        setProductNumber(productNumber);
        this.europejskaNorma = europejskaNorma;
    }

    public void setEuropejskaNorma(boolean europejskaNorma) {
        this.europejskaNorma = europejskaNorma;
    }
    public boolean getEuropejskNorma(){
        return europejskaNorma;
    }

    void printInfo(){
        System.out.println(getIdNumber() + " " + getModelName() + " " + getProducerName() + " " + getProductNumber() + " " + getEuropejskNorma());
    }
}