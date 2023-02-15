public class GeoDistance {
    public double distance(Double[] coordsFrom, Double[] coordsTo) {

        double theta = coordsFrom[1] - coordsTo[1];
        double dist = Math.sin(deg2rad(coordsFrom[0])) * Math.sin(deg2rad(coordsTo[0])) +
                Math.cos(deg2rad(coordsFrom[0])) * Math.cos(deg2rad(coordsTo[0])) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 1.609344 * 1000;
        return (dist);
    }

    /* The function to convert decimal into radians */
    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    /* The function to convert radians into decimal */
    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }
}
