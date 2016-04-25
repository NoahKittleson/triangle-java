public class Triangle {
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public String getTriangleType() {
    if (mSideA + mSideB < mSideC || mSideA + mSideC < mSideB || mSideB + mSideC < mSideA) {
      return "Not a Triangle";
    } else if (mSideA == mSideB && mSideB == mSideA) {
      return "Equilateral";
    } else if (mSideA == mSideB || mSideB == mSideC || mSideA == mSideC) {
      return "Isosceles";
    } else {
      return "Scalene";
    }
  }
}
