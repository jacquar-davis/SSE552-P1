
class Utilities
{
    public static String toFormat(double amount)
    {
        long roundedAmt = Math.round(amount * 100);
        long dollar = roundedAmt / 100;
        long cent = roundedAmt % 100;

        if (cent > 9)
        {return dollar + ".0" + cent;}
        else {return dollar + "." + cent;}
    }
}