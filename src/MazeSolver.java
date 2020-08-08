import java.util.LinkedList;

public class MazeSolver {

    static int [][] maze = {
            {2, 1, 1, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 1},
            {1, 1, 1, 0}
    };
    //0 = wall
    //1 = path
    //2 = cheese

    static LinkedList<PositionYX> path = new LinkedList<PositionYX>();
    public static void main(String[] args) {
        PositionYX p1 = new PositionYX(0, 3);
        path.push(p1);

        while (true){
            int y = path.peek().y;
            int x = path.peek().x;
            //maze[path.peek().y][path.peek().x] = 0;// Y = row , X = column
            maze[y][x] = 0;

            //down
            if (isValid(y +1,x)){
                if (maze[y +1][x] == 2){
                    System.out.println("Moved down. You won!");
                    return;
                }else if (maze[y +1][x] == 1){
                    System.out.println("Moved down");
                    path.push(new PositionYX(y +1, x));
                    continue;
                }
            }

            //left
            if (isValid(y, x -1)) {
                if (maze[y][x - 1] == 2) {
                    System.out.println("Moved left. You won!");
                    return;
                } else if (maze[y][x - 1] == 1) {
                    System.out.println("Moved left");
                    path.push(new PositionYX(y, x - 1));
                    continue;
                }
            }

            //up
            if (isValid(y -1,x)) {
                if (maze[y - 1][x] == 2) {
                    System.out.println("Moved up. You won!");
                    return;
                } else if (maze[y - 1][x] == 1) {
                    System.out.println("Moved up");
                    path.push(new PositionYX(y - 1, x));
                    continue;
                }
            }

            //right
            if (isValid(y,x +1)) {
                if (maze[y][x + 1] == 2) {
                    System.out.println("Move right. You won!");
                    return;
                } else if (maze[y][x + 1] == 1) {
                    System.out.println("Moved right");
                    path.push(new PositionYX(y, x + 1));
                    continue;
                }
            }

            path.pop();
            System.out.println("Moved back!");
            if (path.size() <= 0) {
                System.out.println("No path!");
                return;
            }
        }
    }

    public static boolean isValid(int y, int x){
        if (y < 0 ||
                y >= maze.length ||
                x < 0 ||
                x >= maze[y].length
        ){
            return false;
        }
        return true;
    }


}
