public class Spik2 {
    public static void main(String[] args) {
        int[] chashka =  {14, 16, 28, 34, 25, 23, 17, 18, 22};
        int povnolitnixStydentiv = 0;

        for (int i = 0; i< chashka.length; i++){
            int b = chashka[i];
            if (b >= 18){ povnolitnixStydentiv++;

                System.out.println("stydent moze putu. jomy " + b + " rokiv");
            } else {
                System.out.println("stydent ne moze putu");
            }
        }
        System.out.println("kilkist povnolitnix stydentiv " + povnolitnixStydentiv );

    }
}
