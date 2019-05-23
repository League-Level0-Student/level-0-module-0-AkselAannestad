void setup(){
  size(800,800);
  PImage face =loadImage("thanos.jpeg");
  face.resize(800,800);
  image (face, 0,0);
}
void draw(){
  System.out.println(mouseX+"   "+mouseY);
 fill(255,mouseY,mouseX);
 ellipse (274,280,35,35);
ellipse (361,271,35,35);
 fill(0,0,0);
 ellipse (274, 280, 10,10);
ellipse (361, 271, 10,10);


}
