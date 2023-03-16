public class checkErr  extends IllegalAccessException {

  public checkErr(int weight) {
    super("Вес ДОЛЖЕН БЫТЬ ПОЛОЖИТЕЛЬНЫМ! Ві ввели отрицательное число:  " + weight);
  }
  // try catch с  checkErr для weight в PizzaRunner
  public static void checkError(int weight) throws checkErr {
    if (weight < 0) {
      throw new checkErr(weight);
    }
  }

}
