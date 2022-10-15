package maasHesaplama;

public class C01_Employee {



        private String name;  //Once classta kullanacagimiz variablellari olustururuz
        private double salary;
        private int workHours;
        private int hireYear;


        public C01_Employee(String adSoyad, double maas, int calismaSaatleri, int baslamaYili) { //sonra runner classtaki datalari bize
          //  getirecek parametreli constructar'i mizi olustururuz

            this.name = adSoyad;
            this.salary = maas;
            this.workHours = calismaSaatleri;
            this.hireYear = baslamaYili;
        }


        public double tax() {          // Vergiyi hesaplamak icin tax() methodu olustururuz.Bu methoda gore maas 1000 TL'den az ise vergi uygulanmaz
                                      //maas 1000 TL'den fazla ise maasin %3'ü kadar vergi uygulanir.

            int tax = 0;
            if (salary > 1000) {
                tax = (int) (salary * 0.03);
            }
            return tax;
        }

        public int bonus() {      //  Bonus u hesaplamak icin bonus() methodu olustururuz.Haftada 40 saatten fazla calisanlar,
                                  // fazladan çalistigi saat başına 30 TL olacak şekilde bonus ücretleri hesaplanir.

            int bonus = 0;
            if (workHours > 40) {
                bonus = (workHours - 40) * 30;
            }
            return bonus;
        }


        public double raiseSalary() {     // Maas artisini hesaplamak icin raiseSalary() methodunu olustururuz.Buna gore su an ki yil 2021 baz alinarak
                                          // Eger calisan 10 yildan az bir suredir calisiyorsa maasina %5 zam yapilir
                                          // Eger calisan 9 yildan fazla ve 20 yildan az calisiyorsa maasina %10 zam yapilir
                                          // Eger calisan 19 yildan fazla çalisiyorsa %15 zam yapilir
                                          //raiseSalary() hesaplanirken vergi ve bonuslar dikkate alinir

            int calismaYilToplam = (2021 - hireYear);
            double maasArtis = 0;
            double lastSalary = 0;
            lastSalary = salary + bonus() - tax();
            if (calismaYilToplam < 10) {
                maasArtis = lastSalary * 0.05;
            } else if (calismaYilToplam < 20) {
                maasArtis = (lastSalary* 0.10);
            } else
                maasArtis = (lastSalary * 0.15);
            return maasArtis;
        }


        @Override
        public String toString() {          // calisan bilgilerini konsola yazdirmak icin toString() methodu olusturduk
            return
                    "Calisan Ad Soyad    = " + name +
                            "\nSalary              = " + salary +
                            "\nWorkHours           = " + workHours +
                            "\nHireYear            = " + hireYear +
                            "\nTax                 = " + tax() +
                            "\nBonus               = " + bonus() +
                            "\nRaiseSalary         = " + raiseSalary() +
                            "\nNet Maaş            = " + (salary - tax() + bonus() + raiseSalary());
        }
    }
