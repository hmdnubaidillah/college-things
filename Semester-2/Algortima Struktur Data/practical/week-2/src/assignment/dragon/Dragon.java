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

        boolean isCollided = detectCollision(this.x, this.y);

        if (!isCollided) {
            return;
        }

        System.out.println("Collided : " + isCollided);
        this.x--;
    }

    void moveLeft() {
        this.x--;
        System.out.println("Dragon moved to left");

        boolean isCollided = detectCollision(this.x, this.y);

        if (!isCollided) {
            return;
        }

        System.out.println("Collided : " + isCollided);
        this.x++;
    }

    void moveUp() {
        this.y++;
        System.out.println("Dragon moved to up");

        boolean isCollided = detectCollision(this.x, this.y);

        if (!isCollided) {
            return;
        }

        System.out.println("Collided : " + isCollided);
        this.y--;
    }

    void moveBottom() {
        this.y--;
        System.out.println("Dragon moved to bottom");

        boolean isCollided = detectCollision(this.x, this.y);

        if (!isCollided) {
            return;
        }
        System.out.println("Collided : " + isCollided);
        this.y++;
    }

    void printPosition() {
        System.out.printf("position\nx : %d\ny : %d\n", this.x, this.y);
    }

    boolean detectCollision(int x, int y) {
        return x < 0 || x > this.width || y < 0 || y > this.height;
    }
}
