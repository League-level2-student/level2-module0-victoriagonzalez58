/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] Irray;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
size(500,500);
  //3. initialize your array with the built in width variable
  Irray = new int [500];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  

for(int i=0; i<Irray.length;i++){
Irray[i] = (int) random(0,500);

}
  //5. call the noStroke() method
noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(59, 17, 50);
  //7. set the color for your graph
fill(300, 107, 206);
  //8. draw a rectangle for each int in your array.
  for(int i=0; i<Irray.length;i++){
    rect(i, height, 1, -Irray[i]);}
  
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array


  //9. call the stepSort method
  stepSort(Irray);

  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed
if (mousePressed){
randomize(Irray);
}
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void randomize(int[] Irray) {

for(int i=0; i<Irray.length;i++){
Irray[i] = (int) random(0,500);

}

}