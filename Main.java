class Main {
  public static void main(String[] args) {
    //define an array with unknown elements
    int[] arr1 = new int[7];
    //define an array with known elements
    int[] arr2 = {51,52,53,54,55};

    int sum;
    sum = 3;

    arr1[0] = 4;
    arr1[1] = arr2[1];
    System.out.println(arr1[3]);
    System.out.println(arr1[4]);

    for(int index = 2; index < arr2.length; index++){
      arr1[index] = arr2[index];
      System.out.println(arr1[index]);
    }
    arr1[4] = 6;
    arr1[2] = 7;
    System.out.println(arr1[4] +" "+ arr1[2]);
  }
}