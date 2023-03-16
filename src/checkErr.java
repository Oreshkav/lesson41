public class checkErr  extends IllegalAccessException {

  public checkErr(int weight) {
    super("Вес ДОЛЖЕН БЫТЬ ПОЛОЖИТЕЛЬНЫМ! Ві ввели отрицательное число:  " + weight);
  }

}
