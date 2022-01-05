public class person {
     String name;
     int age;
     String  gender;

    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public  static void main(String [] args){
        person boy=new person("rajesh",25,"male");
        person girl=new person("ashwini",23,"female");
        System.out.println("boys name is:" + boy.getName());
        System.out.println("boys age is:" + boy.getAge());
        System.out.println("boys gender is:" + boy.getGender());
        System.out.println("girl name is:" + girl.getName());
        System.out.println("girl  age is:" + girl.getAge());
        System.out.println("girl gender is:" + girl.getGender());


    }
}
