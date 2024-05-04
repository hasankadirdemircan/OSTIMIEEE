public class AlgorithmExample17 {

    public static void main(String[] args) {
        int keyboards[] = {40, 50, 60};
        int drives[] = {5, 8, 12};
        int b = 60;
        int maxPrice = 0;
        /*System.out.println(keyboards[2]);
        System.out.println(drives[1]); */
        for(int i=0; i<keyboards.length; i++) {
            //System.out.println(keyboards[i]);
            for(int j=0; j<drives.length; j++) {
                int price = keyboards[i] + drives[j];
               // System.out.println(drives[j]);
                if (price <=b && price > maxPrice) {
                    System.out.println("şuan harcayabileceğim en yüksek para : " + price);
                    maxPrice = price;
                }
            }
        }

        System.out.println("tüm mağazayı gezdim ve hesabıma uygun en pahalı ürün : " + maxPrice);
    }
}
