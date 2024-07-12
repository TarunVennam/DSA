package Data_Structure.Maths;

public class FlippImage {
    // Questin No 17 and leetcode 832
    public int[][] flipAndInvertImage(int[][] image) {
        for (int [] row : image){
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                // Swap
                int temp = row[i]^1;
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1]= temp;
            }
        }
        return image;

    }
}
