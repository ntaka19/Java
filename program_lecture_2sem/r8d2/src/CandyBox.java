class CandyBox extends ABox {

  CandyBox(Candy content) {
    super(content);
  }
  //to take content out
  Candy get() {
    return (Candy) content;
  }
 
}
