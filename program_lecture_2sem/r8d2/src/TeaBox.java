//a box containing a tea
class TeaBox extends ABox{
 
  TeaBox(Tea content) {
    super(content);
  }
  //to take the content out from this box
  Tea get() {
    return (Tea) content;
  }
  //to swap the content in this box with the one in that box
  /*void swap(TeaBox that) {
    Tea c = (Tea) this.content;
    this.content = that.content;
    that.content = c;
  }*/
}
