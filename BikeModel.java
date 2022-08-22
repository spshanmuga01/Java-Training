import java.util.ArrayList;

public class BikeModel {
  public static void main(String[] args) {
    ArrayList<String> BikeModels = new ArrayList<String>();
    BikeModels.add("Pulsar");
    BikeModels.add("RX-100");
    BikeModels.add("Interceptor");
    BikeModels.add("Himalayan");
    System.out.println(BikeModels);
    System.out.println(BikeModels.get(1));
    System.out.println(BikeModels.set(0,"Ns-100"));
    System.out.println(BikeModels);
  }
}