package day34_CustomClass;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;


    public double calcCost(){
        double total = (width + length) * unitPrice;
        if(isPersian){
            return total+200;
        }else{
            return total;
        }

        //return  (isPersian) ?  total+200 : total;
    }

    public void customOrder(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian ){
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;
    }


    // (w+l)*unitPrice

    public String toString(){
        return "width: "+width+
                "\nlength: "+length+
                "\nunit price $"+unitPrice+
                "\nTotal costs $"+calcCost();
    }

}
