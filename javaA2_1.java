public class javaA2_1 {
  int modelYear;
  String modelName;

  public javaA2_1(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    javaA2_1 myCar = new javaA2_1(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}