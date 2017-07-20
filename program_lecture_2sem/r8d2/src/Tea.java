//to represent a tea pack
class Tea {
  String kind;
  int weight; //pound
  
  Tea(String kind, int weight) {
    this.kind = kind;
    this.weight = weight;
 } 

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Tea other = (Tea) obj;
    if (kind == null) {
      if (other.kind != null)
        return false;
    } else if (!kind.equals(other.kind))
      return false;
    if (weight != other.weight)
      return false;
    return true;
  }

  public String toString() {
    return "Tea [kind=" + kind + ", weight=" + weight + "]";
  }
}