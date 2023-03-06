public class Cube { 
    static void show(String[][][] Cube) {
        for(int i = 0; i<6; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    System.out.print(Cube[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static String[][][] Cube = {
        {
            {"1r","2r","3r"},
            {"4r","5r","6r"},
            {"7r","8r","9r"}
        },
        {
            {"1b","2b","3b"},
            {"4b","5b","6b"},
            {"7b","8b","9b"}
        },
        {
            {"1o","2o","3o"},
            {"4o","5o","6o"},
            {"7o","8o","9o"}
        },
        {
            {"1g","2g","3g"},
            {"4g","5g","6g"},
            {"7g","8g","9g"}
        },
        {
            {"1y","2y","3y"},
            {"4y","5y","6y"},
            {"7y","8y","9y"}
        },
        {
            {"1w","2w","3w"},
            {"4w","5w","6w"},
            {"7w","8w","9w"}
        },
    };

    // the 6 sides of the cube:
    /*
     * 0 - r
     * 1 - b
     * 2 - o
     * 3 - g
     * 4 - y
     * 5 - w
     */
    
    static void move(String[][][] Cube, String input, int face){
        String[][][] tempCube = new String[6][3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                for(int k=0; k<3;k++)
                    tempCube[i][j][k] = Cube[i][j][k];
        
        switch(input){
            case "u":
                Cube[face][0][0] = tempCube[face+1][0][0];
                Cube[face][0][1] = tempCube[1][0][1];
                Cube[face][0][2] = tempCube[1][0][2];
                break;
            case "d":

            case "r":

            case "l":

            case "f":

            case "b":

            case "u'":
            
            case "d'":

            case "r'":

            case "l'":

            case "f'":

            case "b'":


            default:
                //Code Block 
        }
    }

    static void rotateFace(String[][][] Cube, boolean clockwise, boolean display, String face){
        String[][][] tempCube = new String[6][3][3];

        for(int i = 0; i<6; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                tempCube[i][j][k] = Cube[i][j][k];
            }
        }


        if (clockwise) {
            // loop for rotation of the face
            int k = 2;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Cube[0][i][j] = tempCube[0][k][i];
                    k--;
                }
                k = 2;
            }

            // rotating other faces accordingly

        } else {
            // loop for rotation
            int k = 2;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Cube[0][i][j] = tempCube[0][j][k];
                }
                k--;
            }
        }
            
        // displaying the cube
        if (display == true) {
            show(Cube);
        }
    };

    public static void main(String[] args){
        show(Cube);
        System.out.println();
        rotateFace(Face, false, true);
        System.out.println();

       // show(Face);

        //move(Cube, "u", 0);
    }
}