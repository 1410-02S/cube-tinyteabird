public class Cube { 
    static void show(String[][] Cube){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(Face[i][j]);
            }
            System.out.println();
        }
    }

    static String[][] Face = {
        {"0","1","2"},
        {"3","4","5"},
        {"6","7","8"}
    };

    static String[][][] Cube = {
        {
            {"r","r","r"},
            {"r","r","r"},
            {"r","r","r"}
        },
        {
            {"b","b","b"},
            {"b","b","b"},
            {"b","b","b"}
        },
        {
            {"o","o","o"},
            {"o","o","o"},
            {"o","o","o"}
        },
        {
            {"g","g","g"},
            {"g","g","g"},
            {"g","g","g"}
        },
        {
            {"y","y","y"},
            {"y","y","y"},
            {"y","y","y"}
        },
        {
            {"w","w","w"},
            {"w","w","w"},
            {"w","w","w"}
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
    };

    static void rotateFace(String[][] Face, boolean clockwise, boolean display){
        String[][] tempFace = new String[3][3];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                tempFace[i][j] = Face[i][j];
            }
        }


        if (clockwise) {
            /* hard-coding the clockwise rotation
            Face[0][0] = tempFace[2][0];
            Face[0][1] = tempFace[1][0];
            Face[0][2] = tempFace[0][0];
            Face[1][0] = tempFace[2][1];
            Face[1][1] = tempFace[1][1];
            Face[1][2] = tempFace[0][1];
            Face[2][0] = tempFace[2][2];
            Face[2][1] = tempFace[1][2];
            Face[2][2] = tempFace[0][2];*/
            
            // loop for rotation
            int k = 2;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Face[i][j] = tempFace[k][i];
                    k--;
                }
                k = 2;
            }
        } else {
            /* hard-coding the counter-clockwise rotation
            Face[0][0] = tempFace[0][2];
            Face[0][1] = tempFace[1][2];
            Face[0][2] = tempFace[2][2];
            Face[1][0] = tempFace[0][1];
            Face[1][1] = tempFace[1][1];
            Face[1][2] = tempFace[2][1];
            Face[2][0] = tempFace[0][0];
            Face[2][1] = tempFace[1][0];
            Face[2][2] = tempFace[2][0];*/

            // loop for rotation
            int k = 2;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Face[i][j] = tempFace[j][k];
                }
                k--;
            }
        }
            
        // displaying the cube
        if (display == true) {
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    System.out.print(Face[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        show(Face);
        System.out.println();
        rotateFace(Face, false, true);
        System.out.println();

        show(Face);

        move(Cube, "u", 0);

    }
}