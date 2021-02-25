package dataClasses;

public class Triple<U, T, R> {

  public final U first;
  public final T second;
  public final R third;

  public Triple(U first, T second, R third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }

  public static <U, T, R> Triple<U, T, R> of(U first, T second, R third) {
    return new Triple(first, second, third);
  }

  @Override
  public String toString() {
    return String.format("(%s, %s, %s)", first, second, third);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Triple)) {
      return false;
    } else if (object == this) {
      return true;
    }
    Triple<U, T, R> other = (Triple<U, T, R>) object;
    return first.equals(other.first) && second.equals(other.second) && third.equals(other.third);
  }

  @Override
  public int hashCode() {
    return first.hashCode() + second.hashCode() + third.hashCode();
  }
}
