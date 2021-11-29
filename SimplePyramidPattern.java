class SimplePyramidPattern {
  public static void main(String[] args) {
    int n = 5;
    printStars(n);
  }

  public static void printStars(int n) {
    int arr[][] = null ;
    int row, colum;
    // Outer loop to handile number of rows in this case
    for ( row = 0; row < n; row++) {
      // Inner loop to handile number of columns
      for ( colum = 0; colum < row; colum++) {
        System.out.print("* ");
        arr += arr[row][colum];
        System.out.println(arr);
      }
      // Ending line after each row.
      System.out.println();
    }
  }
}