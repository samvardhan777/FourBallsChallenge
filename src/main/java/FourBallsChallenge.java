import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {


    public static final int WIDTH = 600;
    public static final int HEIGHT = 520;
    public static final int DIAMETER = 10;
    int count=0;
    int y=100;
    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int i=1;i<=4;i++)
        {
//            getFill(i);
            getEllipse(getSpeed(i),getY(i));
        }
    }

    private int getY(int increment)
    {
        int posY=increment*y;
        return posY;
    }

//    private void getFill(int colourcode)
//    {
//        if(colourcode==1) {
//            fill(0, 0, 0);
//        }
//        else if(colourcode==2)
//        {
//            fill(128,128,128);
//        }
//        else if(colourcode==3)
//        {
//            fill(255,255,255);
//        }
//        else if(colourcode==4)
//        {
//            fill(255,255,255);
//        }
//    }

    private void getEllipse(int positionX,int positionY)
    {
        ellipse(positionX,positionY,DIAMETER,DIAMETER);
    }

    private int getSpeed(int positionX) {
        int speed= (positionX *count)/2;
        count=count+1;
        return speed;
    }
}

