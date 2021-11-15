public class UnitCircle
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");

        double angle =0;
        double cos = Math.cos(angle);
        cos = Math.round(cos *100) / 100;

        double sin = Math.sin(angle);
        sin = Math.round(sin *100) / 100;

        System.out.println(angle + ": " + cos+ ", " + sin);

        angle =Math.PI/2;
        cos = Math.cos(angle);
        cos = Math.round(cos *100) / 100;

        sin = Math.sin(angle);
        sin = Math.round(sin *100) / 100;

        System.out.println(angle + ": " + cos+ ", " + sin);

        angle =Math.PI;
        cos = Math.cos(angle);
        cos = Math.round(cos *100) / 100;

        sin = Math.sin(angle);
        sin = Math.round(sin *100) / 100;

        System.out.println(angle + ": " + cos+ ", " + sin);
    }
}
