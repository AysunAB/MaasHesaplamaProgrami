package maasHesaplama;

public class C02_Runner {


    public static void main(String[] args) {


        C01_Employee employee = new C01_Employee("Aysun Berkil", 10000, 45, 2005);// Runner class inda
        // C01_Employee class indaki variable ve methodlara ulasmak icin obje olustururuz ve bu objeye calisan bilgilerini parametre olarak atariz

        String s = employee.toString();
        System.out.println(s);

    }
}