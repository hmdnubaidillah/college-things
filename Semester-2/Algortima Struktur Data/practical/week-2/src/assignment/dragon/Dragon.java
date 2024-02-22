package dragon;

public class Dragon {
    int x = 0;
    int y = 0;
    int width;
    int height;

    public Dragon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void moveRight() {
        this.x++;
        System.out.println("Dragon moved to right");
        detectCollision(this.x, this.y);
    }

    void moveLeft() {
        this.x--;
        System.out.println("Dragon moved to left");
        detectCollision(this.x, this.y);
    }

    void moveUp() {
        this.y++;
        System.out.println("Dragon moved to up");
        detectCollision(this.x, this.y);
    }

    void moveBottom() {
        this.y--;
        System.out.println("Dragon moved to bottom");
        detectCollision(this.x, this.y);
    }

    void printPosition() {
        System.out.printf("position\nx : %d\ny : %d\n", this.x, this.y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || x > this.width || y < 0 || y > this.height) {
            System.out.println("Collided, game over");
        }
    }
}
