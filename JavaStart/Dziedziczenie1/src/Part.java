class Part {
   private String idNumber;
   private String producerName;
   private String modelName;
   private String productNumber;

   Part(){

   }

   Part(String idNumber, String producerName, String modelName, String productNumber){
      this.idNumber = idNumber;
      this.producerName = producerName;
      this.modelName = modelName;
      this.productNumber = productNumber;
   }

   public String getIdNumber() {
      return idNumber;
   }

   public String getProducerName() {
      return producerName;
   }

   public String getModelName() {
      return modelName;
   }

   public String getProductNumber() {
      return productNumber;
   }

   public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
   }

   public void setProducerName(String producerName) {
      this.producerName = producerName;
   }

   public void setModelName(String modelName) {
      this.modelName = modelName;
   }

   public void setProductNumber(String productNumber) {
      this.productNumber = productNumber;
   }
}
