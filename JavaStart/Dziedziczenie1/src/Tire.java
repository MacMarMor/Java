class Tire extends Part{
    private double size;
    private double width;

    Tire(){

    }

    Tire(String idNumber, String producerName, String modelName, String productNumber, double size, double width){
        setIdNumber(idNumber);
        setProducerName(producerName);
        setModelName(modelName);
        setProductNumber(productNumber);
        this.size = size;
        this.width = width;
    }

    //settery

    public void setSize(double size) {
        this.size = size;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //gettery

    public double getSize() {
        return size;
    }

    public double getWidth() {
        return width;
    }

    void printInfo(){
        System.out.println(getIdNumber() + " " + getModelName() + " " + getProducerName() + " " + getProductNumber() + " " + getSize() + " " + getWidth());
    }
}
