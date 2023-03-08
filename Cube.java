package com.example.project;

public class Cube{ 

    static void show(String[][][] Cube){
        for (int k = 0; k<6; k++) {
            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    System.out.print(Cube[k][i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static String[][][] Cube = {
        {
            {"0r","1r","2r"},
            {"3r","4r","5r"},
            {"6r","7r","8r"}
        },
        {
            {"0b","1b","2b"},
            {"3b","4b","5b"},
            {"6b","7b","8b"}
        },
        {
            {"0o","1o","2o"},
            {"3o","4o","5o"},
            {"6o","7o","8o"}
        },
        {
            {"0g","1g","2g"},
            {"3g","4g","5g"},
            {"6g","7g","8g"}
        },
        {
            {"0w","1w","2w"},
            {"3w","4w","5w"},
            {"6w","7w","8w"}
        },
        {
            {"0y","1y","2y"},
            {"3y","4y","5y"},
            {"6y","7y","8y"}
            
        },
    };
    
    static void move(String[][][] Cube, String input){
        String[][][] tempCube = new String[6][3][3];

        // copying the cube onto a temporary variable
        for(int i=0; i<3;i++) {
            for(int j=0; j<3;j++) {
                for(int k=0; k<3;k++) {
                    tempCube[i][j][k] = Cube[i][j][k];
                }
            }
        }
        //
        switch(input){
            case "u":
                // rotating the sides and then the face
                Cube[0][0][0] = tempCube[1][0][0];
                Cube[0][0][1] = tempCube[1][0][1];
                Cube[0][0][2] = tempCube[1][0][2];

                Cube[1][0][1] = tempCube[2][0][0]
                Cube[1][0][2] = tempCube[2][0][1]
                Cube[1][0][0] = tempCube[2][0][2]

                Cube[2][0][1] = tempCube[3][0][0]
                Cube[2][0][2] = tempCube[3][0][1]
                Cube[2][0][0] = tempCube[3][0][2]

                Cube[3][0][1] = tempCube[0][0][0]
                Cube[3][0][2] = tempCube[0][0][1]
                Cube[3][0][0] = tempCube[0][0][2]

                rotateFace(Cube, true, "white")
                break;
            case "d":
                Cube[0][2][0] = tempCube[1][2][0];
                Cube[0][2][1] = tempCube[1][2][1];
                Cube[0][2][2] = tempCube[1][2][2];

                Cube[1][2][1] = tempCube[2][2][0]
                Cube[1][2][2] = tempCube[2][2][1]
                Cube[1][2][0] = tempCube[2][2][2]

                Cube[2][2][1] = tempCube[3][2][0]
                Cube[2][2][2] = tempCube[3][2][1]
                Cube[2][2][0] = tempCube[3][2][2]

                Cube[3][2][1] = tempCube[0][2][0]
                Cube[3][2][2] = tempCube[0][2][1]
                Cube[3][2][0] = tempCube[0][2][2]

                rotateFace(Cube, true, "yellow")
                break;
            case "r":
                Cube[0][0][2] = tempCube[5][0][2]
                Cube[0][1][2] = tempCube[5][1][2]
                Cube[0][2][2] = tempCube[5][2][2]

                Cube[5][0][2] = tempCube[2][0][2]
                Cube[5][1][2] = tempCube[2][1][2]
                Cube[5][2][2] = tempCube[2][2][2]

                Cube[2][0][2] = tempCube[4][0][2]
                Cube[2][1][2] = tempCube[4][1][2]
                Cube[2][2][2] = tempCube[4][2][2]

                Cube[4][0][2] = tempCube[0][0][2]
                Cube[4][1][2] = tempCube[0][1][2]
                Cube[4][2][2] = tempCube[0][2][2]

                rotateFace(Cube, true, "blue")
                break;
            case "l":
                Cube[0][0][0] = tempCube[4][0][0]
                Cube[0][1][0] = tempCube[4][1][0]
                Cube[0][2][0] = tempCube[4][2][0]

                Cube[4][0][0] = tempCube[2][0][0]
                Cube[4][1][0] = tempCube[2][1][0]
                Cube[4][2][0] = tempCube[2][2][0]

                Cube[2][0][0] = tempCube[5][0][0]
                Cube[2][1][0] = tempCube[5][1][0]
                Cube[2][2][0] = tempCube[5][2][0]

                Cube[5][0][0] = tempCube[0][0][0]
                Cube[5][1][0] = tempCube[0][1][0]
                Cube[5][2][0] = tempCube[0][2][0]

                rotateFace(Cube, true, "green")
                break;
            case "f":
                rotateFace(Cube, true, "red")
                break;
            case "b":
                Cube[1][0][2] = tempCube[5][0][2]
                Cube[1][1][2] = tempCube[5][1][2]
                Cube[1][2][2] = tempCube[5][2][2]

                Cube[5][0][2] = tempCube[3][0][2]
                Cube[5][1][2] = tempCube[3][1][2]
                Cube[5][2][2] = tempCube[3][2][2]

                Cube[3][0][2] = tempCube[4][0][2]
                Cube[3][1][2] = tempCube[4][1][2]
                Cube[3][2][2] = tempCube[4][2][2]

                Cube[4][0][2] = tempCube[1][0][2]
                Cube[4][1][2] = tempCube[1][1][2]
                Cube[4][2][2] = tempCube[1][2][2]

                rotateFace(Cube, true, "orange")
                break;
            case "u'":
                Cube[0][0][0] = tempCube[3][0][0];
                Cube[0][0][1] = tempCube[3][0][1];
                Cube[0][0][2] = tempCube[3][0][2];

                Cube[3][0][1] = tempCube[2][0][0]
                Cube[3][0][2] = tempCube[2][0][1]
                Cube[3][0][0] = tempCube[2][0][2]

                Cube[2][0][1] = tempCube[1][0][0]
                Cube[2][0][2] = tempCube[1][0][1]
                Cube[2][0][0] = tempCube[1][0][2]

                Cube[1][0][1] = tempCube[0][0][0]
                Cube[1][0][2] = tempCube[0][0][1]
                Cube[1][0][0] = tempCube[0][0][2]

                rotateFace(Cube, false, "white")
                break;
            case "d'":
                Cube[0][2][0] = tempCube[3][2][0];
                Cube[0][2][1] = tempCube[3][2][1];
                Cube[0][2][2] = tempCube[3][2][2];

                Cube[3][2][1] = tempCube[2][2][0]
                Cube[3][2][2] = tempCube[2][2][1]
                Cube[3][2][0] = tempCube[2][2][2]

                Cube[2][2][1] = tempCube[1][2][0]
                Cube[2][2][2] = tempCube[1][2][1]
                Cube[2][2][0] = tempCube[1][2][2]

                Cube[1][2][1] = tempCube[0][2][0]
                Cube[1][2][2] = tempCube[0][2][1]
                Cube[1][2][0] = tempCube[0][2][2]

                rotateFace(Cube, false, "yellow")
                break;
            case "r'":
                Cube[0][0][2] = tempCube[4][0][2]
                Cube[0][1][2] = tempCube[4][1][2]
                Cube[0][2][2] = tempCube[4][2][2]

                Cube[4][0][2] = tempCube[2][0][2]
                Cube[4][1][2] = tempCube[2][1][2]
                Cube[4][2][2] = tempCube[2][2][2]

                Cube[2][0][2] = tempCube[5][0][2]
                Cube[2][1][2] = tempCube[5][1][2]
                Cube[2][2][2] = tempCube[5][2][2]

                Cube[5][0][2] = tempCube[0][0][2]
                Cube[5][1][2] = tempCube[0][1][2]
                Cube[5][2][2] = tempCube[0][2][2]

                rotateFace(Cube, false, "blue")
                break;
            case "l'":
                Cube[0][0][0] = tempCube[5][0][0]
                Cube[0][1][0] = tempCube[5][1][0]
                Cube[0][2][0] = tempCube[5][2][0]

                Cube[5][0][0] = tempCube[2][0][0]
                Cube[5][1][0] = tempCube[2][1][0]
                Cube[5][2][0] = tempCube[2][2][0]

                Cube[2][0][0] = tempCube[4][0][0]
                Cube[2][1][0] = tempCube[4][1][0]
                Cube[2][2][0] = tempCube[4][2][0]

                Cube[4][0][0] = tempCube[0][0][0]
                Cube[4][1][0] = tempCube[0][1][0]
                Cube[4][2][0] = tempCube[0][2][0]

                rotateFace(Cube, false, "green")
                break;
            case "f'":
                rotateFace(Cube, false, "red")
                break;
            case "b'":
                Cube[1][0][2] = tempCube[4][0][2]
                Cube[1][1][2] = tempCube[4][1][2]
                Cube[1][2][2] = tempCube[4][2][2]

                Cube[4][0][2] = tempCube[3][0][2]
                Cube[4][1][2] = tempCube[3][1][2]
                Cube[4][2][2] = tempCube[3][2][2]

                Cube[3][0][2] = tempCube[5][0][2]
                Cube[3][1][2] = tempCube[5][1][2]
                Cube[3][2][2] = tempCube[5][2][2]

                Cube[5][0][2] = tempCube[1][0][2]
                Cube[5][1][2] = tempCube[1][1][2]
                Cube[5][2][2] = tempCube[1][2][2]

                rotateFace(Cube, false, "orange")
                break;
            default:
                //Code Block 
                System.out.println("Unknown input!")
        }
    };

    static void rotateFace(String[][][] Cube, boolean clockwise, String color){
        String[][][] tempCube = new String[6][3][3];
        boolean rotateAdjacentSides = false;
        if (color == "red") {
            // rotate sides manually only for color red, others are done before
            rotateAdjacentSides = true
        }
        int color_num = 0;
        if (color == "yellow") {
            color_num = 5
        } else if (color == "white") {
            color_num = 4
        } else if (color == "green") {
            color_num = 3
        } else if (color == "orange") {
            color_num = 2
        } else if (color == "blue") {
            color_num = 1
        } else {
            color_num = 0
        }

        // temporary variable creation
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    tempCube[i][j][k] = Cube[i][j][k];
                }
            }
        }



    // the 6 sides of the cube:
    /*
     * 0 - r
     * 1 - b
     * 2 - o
     * 3 - g
     * 4 - w
     * 5 - y
     *   w
     * g r b o
     *   y
     */

        if (clockwise) {
            // rotating the face based on inputted color
            int k = 2;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Cube[color_num][i][j] = tempCube[color_num][k][i];
                    k--;
                }
                k = 2;
            }

            // rotating the adjacent sides
            if (rotateAdjacentSides == true) {
                Cube[5][2][0] = tempCube[3][0][2];
                Cube[5][2][1] = tempCube[3][1][2];
                Cube[5][2][2] = tempCube[3][2][2];

                Cube[3][0][2] = tempCube[4][0][0];
                Cube[3][1][2] = tempCube[4][0][1];
                Cube[3][2][2] = tempCube[4][0][2];

                Cube[4][0][0] = tempCube[1][0][0];
                Cube[4][0][1] = tempCube[1][1][0];
                Cube[4][0][2] = tempCube[1][2][0];

                Cube[1][0][0] = tempCube[5][2][0];
                Cube[1][1][0] = tempCube[5][2][1];
                Cube[1][2][0] = tempCube[5][2][2];
            }

        } else {
            // rotating the face
            int k = 2;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Cube[color_num][i][j] = tempCube[color_num][j][k];
                }
                k--;
            }
        }
    }

    public static void main(String[] args){
        // loop over input
        int i = 0;
        while (i < args.length) {
            move(Cube, args[i]);
            i++;
        }
        // show the Cube
        show(Cube);
    }
}
