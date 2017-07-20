//to represent candy can
class Candy {
  String color;
  int pieces;

  Candy(String color, int pieces) {
    this.color = color;
    this.pieces = pieces;
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Candy other = (Candy) obj;
    if (color == null) {
      if (other.color != null)
        return false;
    } else if (!color.equals(other.color))
      return false;
    if (pieces != other.pieces)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Candy [color=" + color + ", pieces=" + pieces + "]";
  }
}
