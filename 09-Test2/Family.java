public class Family {
    Person[] allPersons;

    public Family(Person[] allPersons) {
        this.allPersons = allPersons;
    }

    public int adults(){
        int count=0;

        for (int i = 0; i < allPersons.length; i++) {
            if (allPersons[i].getAge()>=18){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Person p1=new Person("Ana", 12);
        Person p2=new Person("Maria", 22);
        Person p3=new Person("Max", 32);

        Person[] allPersons={p1,p2,p3};


        Family f1=new Family(allPersons);
        System.out.println("The number of adults: "+f1.adults());
    }}