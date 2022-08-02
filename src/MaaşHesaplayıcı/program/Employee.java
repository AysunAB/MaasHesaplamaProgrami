package MaaşHesaplayıcı.program;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name,int salary,int workHours,int hireYear) {
        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public int tax(){
        if(this.salary<1000){
            return 0;
        }else{
            return (int)(this.salary*0.03);
        }
    }

    public int bonus(){
        if(this.workHours<40){
            return 0;
        }else{
            return (this.workHours-40)*30;
        }
    }

    public int raiseSalary(){
        if(2021-this.hireYear<10){
            return (int)(this.salary*0.05);
        }else if(2021-this.hireYear<20){
            return (int)(this.salary*0.10);
        }else{
            return (int)(this.salary*0.15);
        }
    }

    public String toString(){
        String info="ADI:"+this.name+"\nMAAŞ:"+this.salary+"\nÇALIŞMA SAATİ:"+this.workHours+"\nBAŞLANGIÇ YILI:"+this.hireYear
                +"\nVERGİ:"+tax()+"\nBONUS:"+bonus()+"\nMAAŞ ARTIŞI:"+raiseSalary()+"\nNET MAAŞ:"
                +(this.salary+bonus()+raiseSalary()-tax());
    return info;
    }


}
