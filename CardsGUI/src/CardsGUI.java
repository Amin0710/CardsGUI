//CardsGUI.java
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CardsGUI extends Application {
  
  Image images[]; //declaring an array of images

  @Override
    public void start(Stage primaryStage) 
  {
    images = new Image[55];//initializing array    
    for (int i = 0; i < images.length; i++)    //loading images
    {      
      /** ' This is file path ----G:\\Study\\Masters\\Java 1\\Assingment 3 11660851\\cards_png\\' with your image*/ 
      images[i] = new Image("file:D:\\0. HARD DRIVE\\Study\\Masters\\OLD\\Java 1\\Assingment 3 11660851\\cards_png" + (i + 1) + ".png", true);      
    }
    Random random = new Random();//defining a random number generator     
    HBox row1 = new HBox();//defining an hbox to arrange row1 elements
    row1.setAlignment(Pos.CENTER);//aligning center
    HBox row2 = new HBox();//defining an hbox to arrange row2 elements
    row2.setAlignment(Pos.CENTER);//aligning center
    HBox row3 = new HBox();//defining an hbox to arrange row3 elements
    row3.setAlignment(Pos.CENTER);//aligning center
    /**
     * defining a random index between 0 and 52, creating an imageview with
     * the image at this index and adding to the hbox, repeating this 3
     * times to add three images in row1
     */
    
    int randomIndex = random.nextInt(images.length - 3);    
    ImageView im1 = new ImageView(images[randomIndex]);    
    row1.getChildren().add(im1);  
    randomIndex = random.nextInt(images.length - 3);    
    ImageView im2 = new ImageView(images[randomIndex]);   
    row1.getChildren().add(im2);    
    randomIndex = random.nextInt(images.length - 3);   
    ImageView im3 = new ImageView(images[randomIndex]);    
    row1.getChildren().add(im3);
    
    /**   * creating imageviews with extra images (last two row) */
    randomIndex = random.nextInt(images.length - 3);
    ImageView im7 = new ImageView(images[randomIndex]);
    im7.setRotate(135);//rotation set to 135 degrees  
    row3.getChildren().add(im7);     
    ImageView im8 = new ImageView(images[randomIndex-1]);
    im8.setRotate(90);//rotation set to 90 degrees
    row3.getChildren().add(im8);      
    ImageView im9 = new ImageView(images[randomIndex-2]);
    im9.setRotate(45);//rotation set to 45 degrees 
    row3.getChildren().add(im9);
    
    ImageView im4 = new ImageView(images[52]);
    im4.setRotate(45);//rotation set to 45 degrees  
    row2.getChildren().add(im4);     
    ImageView im5 = new ImageView(images[53]);
    im5.setRotate(90);//rotation set to 90 degrees
    row2.getChildren().add(im5);      
    ImageView im6 = new ImageView(images[54]);
    im6.setRotate(135);//rotation set to 135 degrees 
    row2.getChildren().add(im6);
   
    //defining a VBox and adding all rows
    VBox container = new VBox(row1, row2, row3);   
    container.setAlignment(Pos.CENTER);
    Scene scene = new Scene(container, 400, 650);  
    primaryStage.setScene(scene);  
    primaryStage.show();  
  }
  
  public static void main(String[] args) 
  {
    launch(args);
  }
  
}