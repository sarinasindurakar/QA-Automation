package oop_practise;
class employee{
    int salary;
    String name;
    public int  getsalary(){
        return salary;

    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }


}

public class emp {
    public static void main(String[] args){
        employee obj=new employee();
        obj.salary=124;
        obj.setname("Sarina Sindurakar");
        System.out.println(obj.getname());
        System.out.println(obj.getsalary());
    }

    }
