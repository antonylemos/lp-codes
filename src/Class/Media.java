package Class;

public class Media {
  public int [] array;

  public Media() {
    // TODO Auto-generated constructor stub
  }

  public Media(int size){
    this.array = new int[size];
  }

  public void addValue(int value, int position){
    this.array[position] = value;
  }

  public int getMedia(int array[],int position) {
    if(position == 0) {
      return 0;
    } else if(position == array.length) {
      return (array[position - 1] + getMedia(array,position - 1)) / array.length;
    } else {
      return array[position - 1] + getMedia(array,position - 1);
    }
  }
}
