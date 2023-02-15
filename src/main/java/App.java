public class App {

    public static void main(String[] args) {
        Double r = (double)10 / 0;
        GeoDistance d = new GeoDistance();
        System.out.println(d.distance(new Double[]{10.0, 0.0}, new Double[]{0.0, 10.0}));
        System.out.println(r);
        /*
        24.74;
        50.85606, 4.35391;
        50.70584, 4.61347;

        41.67;
        51.21403, 4.40275;
        50.84189, 4.35920;

        6.225
        -4.37032, 15.21149
        50.82604, 4.35056
         */

    }
}
